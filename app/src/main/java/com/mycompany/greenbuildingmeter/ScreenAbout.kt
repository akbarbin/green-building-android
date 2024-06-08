package com.mycompany.greenbuildingmeter

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenAbout(navController: NavHostController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                title = {
                    Text(
                        text = "About",
                        style = MaterialTheme.typography.headlineSmall
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate("Main") }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Localized description"
                        )
                    }
                }
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
                modifier = Modifier.fillMaxSize()
            ) {
                val text = """
                    Selamat datang di Aplikasi Green Building Meter. Aplikasi ini memiliki kemampuan untuk mengukur tingkat hijau dari suatu gedung dengan mengisi beberapa pertanyaan terkait kebijakan, retrofit, konstruksi dan pemanfaatan gedung. Setelah data tersebut diisi maka aplikasi akan menghitung nilai hijau gedung. Segala pertanyaan yang ada pada aplikasi ini mengacu pada dokumen Peraturan Menteri Pekerjaan Umum Dan Perumahan Rakyat tentang Penilaian Kinerja Bangunan Gedung Hijau Nomor 21 Tahun 2021 khusus untuk Bangunan Yang Sudah Ada atau Berjalan.

                    Kami bersyukur atas kesempatan dan dukungan yang diberikan oleh Universitas Bina Nusantara. Selain itu, kami berterima kasih atas pendanaan yang diberikan oleh Kementerian Riset, Teknologi, dan Pendidikan Tinggi (Kemenristekdikti) Republik Indonesia, yang memungkinkan kami untuk melaksanakan penelitian ini melalui program penelitian untuk tesis magister (Anggaran Kemenristekdikti 2023 No: 149/VR.RTT/VII/2023).
                """.trimIndent()

                Text(
                    text = text,
                    style = TextStyle(fontSize = 16.sp),
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}