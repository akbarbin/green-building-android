package com.example.marsphotos

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.marsphotos.ui.MarsPhotosApp

@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home") {
        composable(route = "Home") {
            MarsPhotosApp(navController)
        }

        composable(route = "A") {
            ScreenA(navController)
        }

        composable(route = "B") {
            ScreenB(navController)
        }
    }
}
