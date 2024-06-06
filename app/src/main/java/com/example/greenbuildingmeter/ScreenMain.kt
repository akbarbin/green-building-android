package com.example.greenbuildingmeter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Icon
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBarDefaults

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenMain(navController: NavHostController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                title = {
                    Text(
                        text = "Green Building Meter",
                        style = MaterialTheme.typography.headlineSmall
                    )
                },
            )
        }
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(onClick = { navController.navigate("Home") }) {
                    Icon(Icons.Default.Home, contentDescription = "Reports")
                    Text(text = "Reports")
                }

                Spacer(modifier = Modifier.height(50.dp))

                Button(onClick = { navController.navigate("A") }) {
                    Icon(Icons.Default.Add, contentDescription = "Evaluate")
                    Text(text = "Evaluate")
                }

                Spacer(modifier = Modifier.height(50.dp))

                Button(onClick = { navController.navigate("Guide") }) {
                    Icon(Icons.Default.Info, contentDescription = "Guide")
                    Text(text = "User Guide")
                }

                Spacer(modifier = Modifier.height(50.dp))

                Button(onClick = { navController.navigate("About") }) {
                    Icon(Icons.Default.Favorite, contentDescription = "About Apps")
                    Text(text = "About Apps")
                }
            }
        }
    }
}