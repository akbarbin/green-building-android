/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mycompany.greenbuildingmeter.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mycompany.greenbuildingmeter.model.Building
import com.mycompany.greenbuildingmeter.network.BuildingsApi
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException

/**
 * UI state for the Home screen
 */
sealed interface BuildingsUiState {
    data class Success(val buildings: List<Building>) : BuildingsUiState
    object Error : BuildingsUiState
    object Loading : BuildingsUiState
}

class MarsViewModel : ViewModel() {
    /** The mutable State that stores the status of the most recent request */
    var buildingsUiState: BuildingsUiState by mutableStateOf(BuildingsUiState.Loading)
        private set

    /**
     * Call getMarsPhotos() on init so we can display status immediately.
     */
    init {
        getBuildings()
    }

    /**
     * Gets Mars photos information from the Mars API Retrofit service and updates the
     * [Building] [List] [MutableList].
     */
    private fun getBuildings() {
        viewModelScope.launch {
            buildingsUiState = BuildingsUiState.Loading
            buildingsUiState = try {
                val listResult = BuildingsApi.retrofitService.getBuildings()
                BuildingsUiState.Success(
                    listResult
                )
            } catch (e: IOException) {
                BuildingsUiState.Error
            } catch (e: HttpException) {
                BuildingsUiState.Error
            }
        }
    }
}
