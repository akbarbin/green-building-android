package com.example.marsphotos

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenGuide(navController: NavHostController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                title = {
                    Text(
                        text = "User Guide",
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
            Spacer(modifier = Modifier.height(16.dp))
            // Tampilkan detail pelanggan dari ViewModel
            LazyColumn {
                items(1) {
                    Column(
                        modifier = Modifier.fillMaxSize()
                    ) {

                        Text(
                            text = "Instalasi",
                            style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold),
                            modifier = Modifier.padding(8.dp)
                        )

                        val textInstallation = """
                            Untuk menginstal aplikasi, ikuti langkah-langkah berikut yaitu (1) Mengunduh file instalasi pada Android Play Store dengan nama Green Building Meter (2) Unduh file instalasi dan ikuti petunjuk yang muncul di layar telepon Anda, (3) Tunggu sampai proses instalasi selesai.
                        """.trimIndent()

                        Text(
                            text = textInstallation,
                            style = TextStyle(fontSize = 16.sp),
                            modifier = Modifier.padding(8.dp)
                        )

                        Text(
                            text = "Fitur Aplikasi",
                            style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold),
                            modifier = Modifier.padding(8.dp)
                        )

                        val textFeatures = """
                            Aplikasi Green Building Meter memiliki tiga fitur utama yaitu menampilkan data semua gedung (1) lihat detail gedung (2) dan tambah gedung (3) yang ditunjukkan pada Gambar 1, Gambar 2 dan Gambar 3 secara berturut-turut. Dalam menggunakan aplikasi ini membutuhkan koneksi internet agar dapat fitur tersebut berjalan normal.
                        """.trimIndent()

                        Text(
                            text = textFeatures,
                            style = TextStyle(fontSize = 16.sp),
                            modifier = Modifier.padding(8.dp)
                        )

                        Text(
                            text = "Fitur 1: Lihat Data Semua Gedung",
                            style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold),
                            modifier = Modifier.padding(8.dp)
                        )

                        val textFirstFeatures = """
                            Pada fitur ini dapat menampilkan data semua gedung yang pernah dihitung sebelumnya yang dapat dilihat pada Gambar 1. Langkah-langkah menggunakan fitur ini yaitu (1) Membuka aplikasi GreenBuildingMeter, (2) Menekan tombol "Reports", (3) Menunggu beberapa saat hingga data gedung muncul semua.
                        """.trimIndent()

                        Text(
                            text = textFirstFeatures,
                            style = TextStyle(fontSize = 16.sp),
                            modifier = Modifier.padding(8.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.reports),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 16.dp)
                        )

                        Text(
                            text = "Gambar 1: Daftar Penilaian Gedung",
                            style = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.SemiBold),
                            modifier = Modifier.fillMaxWidth().padding(8.dp),
                            textAlign = TextAlign.Center
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        Text(
                            text = "Fitur 2: Lihat Detail Gedung",
                            style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold),
                            modifier = Modifier.padding(8.dp)
                        )

                        val textSecondFeatures = """
                            Pada fitur ini memaparkan hasil detail data gedung yang telah dilakukan perhitungan yang ditampilkan pada Gambar 2. Langkah-langkah menggunakan fitur ini yaitu (1) Membuka aplikasi dengan menekan tombol "Reports" sampai muncul halaman beranda seperti pada Gambar 1, (2) Menekan tombol "Show detail" pada gedung yang ingin Anda pilih, (3) Menunggu beberapa saat hingga Anda mendapati halaman detail gedung.
                        """.trimIndent()

                        Text(
                            text = textSecondFeatures,
                            style = TextStyle(fontSize = 16.sp),
                            modifier = Modifier.padding(8.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.detail),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 16.dp)
                        )

                        Text(
                            text = "Gambar 2: Lihat Data Gedung",
                            style = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.SemiBold),
                            modifier = Modifier.fillMaxWidth().padding(8.dp),
                            textAlign = TextAlign.Center
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        Text(
                            text = "Fitur 3: Tambah Gedung",
                            style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold),
                            modifier = Modifier.padding(8.dp)
                        )

                        val textThirdFeatures = """
                            Fitur ini digunakan untuk menghitung nilai hijau gedung dengan mengisi 83 pertanyaan terkait dengan gedung yang terlihat pada Gambar 3. Pada fitur ini disarankan untuk tidak menekan tombol arah panah "kiri" ataupun keluar aplikasi karena data Anda akan hilang. Langkah-langkah menggunakan fitur ini yaitu (1) Membuka aplikasi Green Building Meter, (2) Menekan tombol "Evaluate" pada halaman beranda, (3) Isi keseluruan pertanyaan, (4) Kemudian menekan tombol "Submit", (5) Lalu akan muncul halaman sukses menyimpan data, (6) Kemudian klik tombol "Check result", (7) Setelah itu pilih salah satu gedung Anda untuk melihat nilainya.
                        """.trimIndent()

                        Text(
                            text = textThirdFeatures,
                            style = TextStyle(fontSize = 16.sp),
                            modifier = Modifier.padding(8.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.add),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 16.dp)
                        )

                        Text(
                            text = "Gambar 3: Tambah Data Gedung Baru",
                            style = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.SemiBold),
                            modifier = Modifier.fillMaxWidth().padding(8.dp),
                            textAlign = TextAlign.Center
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        Text(
                            text = "Terima kasih telah menggunakan Aplikasi Green Building Meter.",
                            style = TextStyle(fontSize = 16.sp),
                            modifier = Modifier.padding(8.dp)
                        )
                    }
                }
            }
        }
    }
}