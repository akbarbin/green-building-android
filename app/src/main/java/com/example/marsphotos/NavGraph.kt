package com.example.marsphotos

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
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

        composable(
            route = "B/{name}/{city}/{p01}/{p02}/{p03}/{p04}/{p05}/{p06}/{p07}/{p08}/{p09}/{p10}/{p11}/{p12}/{p13}/{p14}/{p15}/{p16}/{p17}/{p18}/{p19}/{p20}/{p21}/{p22}/{p23}/{p24}/{p25}/{p26}/{p27}/{p28}/{p29}/{p30}/{p31}/{p32}/{p33}/{p34}/{p35}/{p36}/{p37}/{p38}/{p39}",
            arguments = listOf(
                navArgument(name = "name") {
                    type = NavType.StringType
                },
                navArgument(name = "city") {
                    type = NavType.StringType
                },
                navArgument(name = "p01") {
                    type = NavType.StringType
                },
                navArgument(name = "p02") {
                    type = NavType.StringType
                },
                navArgument(name = "p03") {
                    type = NavType.StringType
                },
                navArgument(name = "p04") {
                    type = NavType.StringType
                },
                navArgument(name = "p05") {
                    type = NavType.StringType
                },
                navArgument(name = "p06") {
                    type = NavType.StringType
                },
                navArgument(name = "p07") {
                    type = NavType.StringType
                },
                navArgument(name = "p08") {
                    type = NavType.StringType
                },
                navArgument(name = "p09") {
                    type = NavType.StringType
                },
                navArgument(name = "p10") {
                    type = NavType.StringType
                },
                navArgument(name = "p11") {
                    type = NavType.StringType
                },
                navArgument(name = "p12") {
                    type = NavType.StringType
                },
                navArgument(name = "p13") {
                    type = NavType.StringType
                },
                navArgument(name = "p14") {
                    type = NavType.StringType
                },
                navArgument(name = "p15") {
                    type = NavType.StringType
                },
                navArgument(name = "p16") {
                    type = NavType.StringType
                },
                navArgument(name = "p17") {
                    type = NavType.StringType
                },
                navArgument(name = "p18") {
                    type = NavType.StringType
                },
                navArgument(name = "p19") {
                    type = NavType.StringType
                },
                navArgument(name = "p20") {
                    type = NavType.StringType
                },
                navArgument(name = "p21") {
                    type = NavType.StringType
                },
                navArgument(name = "p22") {
                    type = NavType.StringType
                },
                navArgument(name = "p23") {
                    type = NavType.StringType
                },
                navArgument(name = "p24") {
                    type = NavType.StringType
                },
                navArgument(name = "p25") {
                    type = NavType.StringType
                },
                navArgument(name = "p26") {
                    type = NavType.StringType
                },
                navArgument(name = "p27") {
                    type = NavType.StringType
                },
                navArgument(name = "p28") {
                    type = NavType.StringType
                },
                navArgument(name = "p29") {
                    type = NavType.StringType
                },
                navArgument(name = "p30") {
                    type = NavType.StringType
                },
                navArgument(name = "p31") {
                    type = NavType.StringType
                },
                navArgument(name = "p32") {
                    type = NavType.StringType
                },
                navArgument(name = "p33") {
                    type = NavType.FloatType
                },
                navArgument(name = "p34") {
                    type = NavType.IntType
                },
                navArgument(name = "p35") {
                    type = NavType.StringType
                },
                navArgument(name = "p36") {
                    type = NavType.StringType
                },
                navArgument(name = "p37") {
                    type = NavType.StringType
                },
                navArgument(name = "p38") {
                    type = NavType.StringType
                },
                navArgument(name = "p39") {
                    type = NavType.StringType
                }
            )
        ) { blackstackEntry ->
            ScreenB(
                navController,
                name = blackstackEntry.arguments?.getString("name")!!,
                city = blackstackEntry.arguments?.getString("city")!!,
                p01 = blackstackEntry.arguments?.getString("p01")!!,
                p02 = blackstackEntry.arguments?.getString("p02")!!,
                p03 = blackstackEntry.arguments?.getString("p03")!!,
                p04 = blackstackEntry.arguments?.getString("p04")!!,
                p05 = blackstackEntry.arguments?.getString("p05")!!,
                p06 = blackstackEntry.arguments?.getString("p06")!!,
                p07 = blackstackEntry.arguments?.getString("p07")!!,
                p08 = blackstackEntry.arguments?.getString("p08")!!,
                p09 = blackstackEntry.arguments?.getString("p09")!!,
                p10 = blackstackEntry.arguments?.getString("p10")!!,
                p11 = blackstackEntry.arguments?.getString("p11")!!,
                p12 = blackstackEntry.arguments?.getString("p12")!!,
                p13 = blackstackEntry.arguments?.getString("p13")!!,
                p14 = blackstackEntry.arguments?.getString("p14")!!,
                p15 = blackstackEntry.arguments?.getString("p15")!!,
                p16 = blackstackEntry.arguments?.getString("p16")!!,
                p17 = blackstackEntry.arguments?.getString("p17")!!,
                p18 = blackstackEntry.arguments?.getString("p18")!!,
                p19 = blackstackEntry.arguments?.getString("p19")!!,
                p20 = blackstackEntry.arguments?.getString("p20")!!,
                p21 = blackstackEntry.arguments?.getString("p21")!!,
                p22 = blackstackEntry.arguments?.getString("p22")!!,
                p23 = blackstackEntry.arguments?.getString("p23")!!,
                p24 = blackstackEntry.arguments?.getString("p24")!!,
                p25 = blackstackEntry.arguments?.getString("p25")!!,
                p26 = blackstackEntry.arguments?.getString("p26")!!,
                p27 = blackstackEntry.arguments?.getString("p27")!!,
                p28 = blackstackEntry.arguments?.getString("p28")!!,
                p29 = blackstackEntry.arguments?.getString("p29")!!,
                p30 = blackstackEntry.arguments?.getString("p30")!!,
                p31 = blackstackEntry.arguments?.getString("p31")!!,
                p32 = blackstackEntry.arguments?.getString("p32")!!,
                p33 = blackstackEntry.arguments?.getFloat("p33")!!,
                p34 = blackstackEntry.arguments?.getInt("p34")!!,
                p35 = blackstackEntry.arguments?.getString("p35")!!,
                p36 = blackstackEntry.arguments?.getString("p36")!!,
                p37 = blackstackEntry.arguments?.getString("p37")!!,
                p38 = blackstackEntry.arguments?.getString("p38")!!,
                p39 = blackstackEntry.arguments?.getString("p39")!!
            )
        }

        composable(route = "C") {
            ScreenC(navController)
        }
    }
}
