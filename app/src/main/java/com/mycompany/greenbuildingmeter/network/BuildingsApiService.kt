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

package com.mycompany.greenbuildingmeter.network

import com.mycompany.greenbuildingmeter.model.Building
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

private const val BASE_URL =
        "https://akbarbin.pythonanywhere.com"

//private const val BASE_URL = "https://00f7-36-70-39-162.ngrok-free.app"

/**
 * Use the Retrofit builder to build a retrofit object using a kotlinx.serialization converter
 */
private val retrofit = Retrofit.Builder()
    .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
    .baseUrl(BASE_URL)
    .build()

/**
 * Retrofit service object for creating api calls
 */
interface BuildingsApiService {
    @GET("api/buildings")
    suspend fun getBuildings(): List<Building>

    @GET("api/buildings/{id}")
    suspend fun getBuilding(
        @Path("id") id: String
    ): Building

    @POST("api/buildings")
    suspend fun createBuilding(
        @Body marsPhoto: Building
    ): Response<Building>
}

/**
 * A public Api object that exposes the lazy-initialized Retrofit service
 */
object BuildingsApi {
    val retrofitService: BuildingsApiService by lazy {
        retrofit.create(BuildingsApiService::class.java)
    }
}
