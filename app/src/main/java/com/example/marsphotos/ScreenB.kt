package com.example.marsphotos

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenB(
    navController: NavHostController,
    name: String,
    city: String,
    p01: String,
    p02: String,
    p03: String,
    p04: String,
    p05: String,
    p06: String,
    p07: String,
    p08: String,
    p09: String,
    p10: String,
    p11: String,
    p12: String,
    p13: String,
    p14: String,
    p15: String,
    p16: String,
    p17: String,
    p18: String,
    p19: String,
    p20: String,
    p21: String,
    p22: String,
    p23: String,
    p24: String,
    p25: String,
    p26: String,
    p27: String,
    p28: String,
    p29: String,
    p30: String,
    p31: String,
    p32: String,
    p33: Float,
    p34: Int,
    p35: String,
    p36: String,
    p37: String,
    p38: String,
    p39: String
) {
    val options = listOf("Yes", "No")
    var p40 by remember { mutableStateOf(options[1]) }
    var p41 by remember { mutableStateOf(options[1]) }
    var p42 by remember { mutableStateOf(options[1]) }
    var p43 by remember { mutableStateOf(options[1]) }
    var p44 by remember { mutableStateOf(options[1]) }
    var p45 by remember { mutableStateOf(options[1]) }
    var p46 by remember { mutableStateOf(options[1]) }
    var p47 by remember { mutableStateOf(options[1]) }
    var p48 by remember { mutableStateOf(options[1]) }
    var p49 by remember { mutableStateOf(options[1]) }
    var p50 by remember { mutableStateOf(options[1]) }
    var p511 by remember { mutableStateOf("") }
    var isp511Error by remember { mutableStateOf(false) }
    var p512 by remember { mutableStateOf("") }
    var isp512Error by remember { mutableStateOf(false) }
    var p513 by remember { mutableStateOf("") }
    var isp513Error by remember { mutableStateOf(false) }
    var p514 by remember { mutableStateOf("") }
    var isp514Error by remember { mutableStateOf(false) }
    var p515 by remember { mutableStateOf("") }
    var isp515Error by remember { mutableStateOf(false) }
    var p516 by remember { mutableStateOf("") }
    var isp516Error by remember { mutableStateOf(false) }
    var p52 by remember { mutableStateOf(options[1]) }
    var p53 by remember { mutableStateOf(options[1]) }
    var p54 by remember { mutableStateOf(options[1]) }
    var p55 by remember { mutableStateOf(options[1]) }
    var p56 by remember { mutableStateOf(options[1]) }
    var p57 by remember { mutableStateOf(options[1]) }
    var p58 by remember { mutableStateOf(options[1]) }
    var p59 by remember { mutableStateOf(options[1]) }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                title = {
                    Text(
                        text = "Add building - Step 2",
                        style = MaterialTheme.typography.headlineSmall
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate("A") }) {
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
                modifier = Modifier
                    .padding(16.dp, 16.dp)
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Construction",
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.bodyLarge
                )

                Text(
                    text = "P40 - Initial Working Plan:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p40 == option,
                                onClick = { p40 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P41 - Continuing Project Improvement:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p41 == option,
                                onClick = { p41 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P42 - Data Integration Building:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p42 == option,
                                onClick = { p42 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P43 - Innovate Green Construction:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p43 == option,
                                onClick = { p43 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P44 - Innovate Green Operation:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p44 == option,
                                onClick = { p44 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P45 - Fuel Efficiency:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p45 == option,
                                onClick = { p45 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P46 - Construction Technology:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p46 == option,
                                onClick = { p46 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P47 - Safety Material Construction:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p47 == option,
                                onClick = { p47 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P48 - Initial Working Plan:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p48 == option,
                                onClick = { p48 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P49 - Waste Sorting:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p49 == option,
                                onClick = { p49 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P50 - Initial Working Plan:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p50 == option,
                                onClick = { p50 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P51_1 - Waste Consumption of Last Month 1:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p511,
                    onValueChange = {
                        p511 = it
                        isp511Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp511Error
                )

                if (p511.isEmpty()) {
                    isp511Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P51_2 - Waste Consumption of Last Month 2:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p512,
                    onValueChange = {
                        p512 = it
                        isp512Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp512Error
                )

                if (p512.isEmpty()) {
                    isp512Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P51_3 - Waste Consumption of Last Month 3:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p513,
                    onValueChange = {
                        p513 = it
                        isp513Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp513Error
                )

                if (p513.isEmpty()) {
                    isp513Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P51_4 - Waste Consumption of Last Month 4:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p514,
                    onValueChange = {
                        p514 = it
                        isp514Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp514Error
                )

                if (p514.isEmpty()) {
                    isp514Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P51_5 - Waste Consumption of Last Month 5:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p515,
                    onValueChange = {
                        p515 = it
                        isp515Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp515Error
                )

                if (p515.isEmpty()) {
                    isp515Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P51_6 - Waste Consumption of Last Month 6:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p516,
                    onValueChange = {
                        p516 = it
                        isp516Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp516Error
                )

                if (p516.isEmpty()) {
                    isp516Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P52 - Waste Construction Principle:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p52 == option,
                                onClick = { p52 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P53 - Copy Shop Drawing:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p53 == option,
                                onClick = { p53 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P54 - Copy List Approval Material:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p54 == option,
                                onClick = { p54 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P55 - Testing And Commission Report:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p55 == option,
                                onClick = { p55 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P56 - System Tool Operation Report:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p56 == option,
                                onClick = { p56 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P57 - Main Equipment Warranty:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p57 == option,
                                onClick = { p57 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P58 - Manual Tools Documentation:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p58 == option,
                                onClick = { p58 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P59 - Valid As Build Drawing Report:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p59 == option,
                                onClick = { p59 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                if (!isEnabledNextButton(isp511Error, isp512Error, isp513Error, isp514Error, isp515Error, isp516Error)) {
                    Text(text = "Please fill all required fields")
                }

                Spacer(modifier = Modifier.width(8.dp))

                Button(
                    onClick = {
                        navController.navigate("C/$name/$city/$p01/$p02/$p03/$p04/$p05/$p06/$p07/$p08/$p09/$p10/$p11/$p12/$p13/$p14/$p15/$p16/$p17/$p18/$p19/$p20/$p21/$p22/$p23/$p24/$p25/$p26/$p27/$p28/$p29/$p30/$p31/$p32/$p33/$p34/$p35/$p36/$p37/$p38/$p39/$p40/$p41/$p42/$p43/$p44/$p45/$p46/$p47/$p48/$p49/$p50/$p511/$p512/$p513/$p514/$p515/$p516/$p52/$p53/$p54/$p55/$p56/$p57/$p58/$p59")
                    },
                    enabled = isEnabledNextButton(isp511Error, isp512Error, isp513Error, isp514Error, isp515Error, isp516Error)
                ) {
                    Text(text = "Next")
                }

                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}

fun isEnabledNextButton(
    isp511Error: Boolean,
    isp512Error: Boolean,
    isp513Error: Boolean,
    isp514Error: Boolean,
    isp515Error: Boolean,
    isp516Error: Boolean
): Boolean {
    return !isp511Error && !isp512Error && !isp513Error && !isp514Error && !isp515Error && !isp516Error
}