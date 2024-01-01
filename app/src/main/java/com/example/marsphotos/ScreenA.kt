package com.example.marsphotos

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.marsphotos.model.MarsPhoto
import com.example.marsphotos.network.MarsApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException

@Composable
fun ScreenA(navController: NavHostController) {
    var name by rememberSaveable { mutableStateOf("") }
    var city by rememberSaveable { mutableStateOf("") }
    val options = listOf("Yes", "No")
    var p01 by remember { mutableStateOf(options[1]) }
    var p02 by remember { mutableStateOf(options[1]) }

    Column(
        modifier = Modifier
            .padding(16.dp, 16.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "Add building",
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "Name",
            style = MaterialTheme.typography.bodyLarge
        )
        
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = name,
            onValueChange = { name = it },
            placeholder = { Text(text = "e.g Green Tower") }
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "City",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = city,
            onValueChange = { city = it },
            placeholder = { Text(text = "e.g Jakarta") }
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Policy",
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P01 - Public transportation",
            style = MaterialTheme.typography.bodyLarge
        )

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center
        ) {
            options.forEach { option ->
                Row {
                    RadioButton(
                        selected = p01 == option,
                        onClick = { p01 = option }
                    )
                    Text(text = option)
                }
            }
        }

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P02 - Energy management",
            style = MaterialTheme.typography.bodyLarge
        )

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center
        ) {
            options.forEach { option ->
                Row {
                    RadioButton(
                        selected = p02 == option,
                        onClick = { p02 = option }
                    )
                    Text(text = option)
                }
            }
        }

        Button(onClick = {
            val marsPhoto = MarsPhoto(name, city, p01, p02, "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", 0.0, 675, "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", 3000.0, 4000.0, 5000.0, 4000.0, 7000.0, 1500.0, "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", 4000000.0, 5000000.0, 4000000.0, 4000000.0, 5000000.0, 4400000.0, "Yes",500000000.0, "Yes", "Yes", "Yes", 5.0, 5.0, 4000000.0, 4000000.0, 4000000.0, 4000000.0, 4000000.0, 4200000.0, 10000000.0, "Yes", "2022-12-09", 23.0, 36.0, "Yes", "Yes", "Yes", "Yes", "Yes", 33.48, 32.40, 34.56, 29.64, 16.44, 35.76, "Yes", "Yes", "Yes", "Yes", null, null, null, null, null, null, null, null, null, null, null)
            createMarsPhoto(marsPhoto)
            navController.navigate("B")
        }) {
            Text(text = "Submit")
        }
    }
}

fun createMarsPhoto(marsPhoto: MarsPhoto) {
    GlobalScope.launch(Dispatchers.IO) {
        try {
            MarsApi.retrofitService.createPhoto(marsPhoto)
        } catch (e: IOException) {
        } catch (e: HttpException) {
        }
    }
}

