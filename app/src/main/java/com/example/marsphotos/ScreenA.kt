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
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.compose.material3.AlertDialog

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenA(navController: NavHostController) {
    var name by rememberSaveable { mutableStateOf("") }
    var isNameError by remember { mutableStateOf(false) }
    var city by rememberSaveable { mutableStateOf("") }
    var isCityError by remember { mutableStateOf(false) }
    val options = listOf("Yes", "No")
    var p01 by remember { mutableStateOf(options[1]) }
    var p02 by remember { mutableStateOf(options[1]) }
    var p03 by remember { mutableStateOf(options[1]) }
    var p04 by remember { mutableStateOf(options[1]) }
    var p05 by remember { mutableStateOf(options[1]) }
    var p06 by remember { mutableStateOf(options[1]) }
    var p07 by remember { mutableStateOf(options[1]) }
    var p08 by remember { mutableStateOf(options[1]) }
    var p09 by remember { mutableStateOf(options[1]) }
    var p10 by remember { mutableStateOf(options[1]) }
    var p11 by remember { mutableStateOf(options[1]) }
    var p12 by remember { mutableStateOf(options[1]) }
    var p13 by remember { mutableStateOf(options[1]) }
    var p14 by remember { mutableStateOf(options[1]) }
    var p15 by remember { mutableStateOf(options[1]) }
    var p16 by remember { mutableStateOf(options[1]) }
    var p17 by remember { mutableStateOf(options[1]) }
    var p18 by remember { mutableStateOf(options[1]) }
    var p19 by remember { mutableStateOf(options[1]) }
    var p20 by remember { mutableStateOf(options[1]) }
    var p21 by remember { mutableStateOf(options[1]) }
    var p22 by remember { mutableStateOf(options[1]) }
    var p23 by remember { mutableStateOf(options[1]) }
    var p24 by remember { mutableStateOf(options[1]) }
    var p25 by remember { mutableStateOf(options[1]) }
    var p26 by remember { mutableStateOf(options[1]) }
    var p27 by remember { mutableStateOf(options[1]) }
    var p28 by remember { mutableStateOf(options[1]) }
    var p29 by remember { mutableStateOf(options[1]) }
    var p30 by remember { mutableStateOf(options[1]) }
    var p31 by remember { mutableStateOf(options[1]) }
    var p32 by remember { mutableStateOf(options[1]) }
    var p33 by remember { mutableStateOf("") }
    var isp33Error by remember { mutableStateOf(false) }
    var p34 by remember { mutableStateOf("") }
    var isp34Error by remember { mutableStateOf(false) }
    var p35 by remember { mutableStateOf(options[1]) }
    var p36 by remember { mutableStateOf(options[1]) }
    var p37 by remember { mutableStateOf(options[1]) }
    var p38 by remember { mutableStateOf(options[1]) }
    var p39 by remember { mutableStateOf(options[1]) }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                title = {
                    Text(
                        text = "Add building - Step 1",
                        style = MaterialTheme.typography.headlineSmall
                    )
                },
                navigationIcon = {
                    IconButton(
                        onClick = {
                            navController.navigate("Main")
                        }
                    ) {
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
                    text = "Name",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = name,
                    onValueChange = {
                        name = it
                        isNameError = false
                    },
                    placeholder = { Text(text = "e.g Green Tower") },
                    isError = isNameError
                )

                if (name.isEmpty()) {
                    isNameError = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "City",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = city,
                    onValueChange = {
                        city = it
                        isCityError = false
                    },
                    placeholder = { Text(text = "e.g Jakarta") },
                    isError = isCityError
                )

                if (city.isEmpty()) {
                    isCityError = true
                }

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
                    text = "P01 - Public Transportation",
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

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P03 - Paint Material",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p03 == option,
                                onClick = { p03 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P04 - Paper Material",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p04 == option,
                                onClick = { p04 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P05 - Reusable Goods",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p05 == option,
                                onClick = { p05 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P06 - Cleaning Material",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p06 == option,
                                onClick = { p06 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P07 - Plastic Restriction",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p07 == option,
                                onClick = { p07 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P08 - Water Saving",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p08 == option,
                                onClick = { p08 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P09 - No Smoking Commitment",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p09 == option,
                                onClick = { p09 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P10 - Waste Management",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p10 == option,
                                onClick = { p10 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P11 - Water Waste Management",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p11 == option,
                                onClick = { p11 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P12 - Expert Management",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p12 == option,
                                onClick = { p12 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P13 - Retrofit Expert Certified",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p13 == option,
                                onClick = { p13 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P14 - Maintenance Operation",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p14 == option,
                                onClick = { p14 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P15 - As Built Drawing",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p15 == option,
                                onClick = { p15 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P16 - Building Management Performance",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p16 == option,
                                onClick = { p16 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P17 - Operational Log Book",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p17 == option,
                                onClick = { p17 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P18 - Periodic Maintenance",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p18 == option,
                                onClick = { p18 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P19 - Emergency Procedure",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p19 == option,
                                onClick = { p19 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P20 - Maintenance Training",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p20 == option,
                                onClick = { p20 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P21 - Excellent Service Training",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p21 == option,
                                onClick = { p21 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Retrofit",
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.bodyLarge
                )

                Text(
                    text = "P22 - AC Arrangement:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p22 == option,
                                onClick = { p22 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P23 - AC Standard:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p23 == option,
                                onClick = { p23 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P24 - Switch Area Coverage:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p24 == option,
                                onClick = { p24 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P25 - Electrical Load Grouping:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p25 == option,
                                onClick = { p25 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P26 - Building Management System:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p26 == option,
                                onClick = { p26 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P27 - Renewable Energy Source:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p27 == option,
                                onClick = { p27 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P28 - Ground Water Meter:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p28 == option,
                                onClick = { p28 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P29 - Saving Water Consumption:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p29 == option,
                                onClick = { p29 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P30 - Water Fixture Planning:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p30 == option,
                                onClick = { p30 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P31 - Free Smoke Commitment:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p31 == option,
                                onClick = { p31 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P32 - Separated Smoking Area:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p32 == option,
                                onClick = { p32 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P33 - Ozone Depletion Potential:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p33,
                    onValueChange = {
                        p33 = it
                        isp33Error = false
                    },
                    placeholder = { Text(text = "e.g 0.4") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
                    isError = isp33Error
                )

                if (p33.isEmpty()) {
                    isp33Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P34 - Global Warming Potential:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p34,
                    onValueChange = {
                        p34 = it
                        isp34Error = false
                    },
                    placeholder = { Text(text = "e.g 675") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp34Error
                )

                if (p34.isEmpty()) {
                    isp34Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P35 - Reduce Reuse Recycle Commitment:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p35 == option,
                                onClick = { p35 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P36 - Rubbish Bin Provision:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p36 == option,
                                onClick = { p36 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P37 - Temporary Garbage Place:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p37 == option,
                                onClick = { p37 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P38 - Independent Waste Management:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p38 == option,
                                onClick = { p38 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P39 - Waste Volume Recording: </p",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p39 == option,
                                onClick = { p39 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                if (!isEnabledNextButton(isNameError, isCityError, isp33Error, isp34Error)) {
                    Text(text = "Please fill all required fields")
                }

                Button(
                    onClick = {
                        navController.navigate("B/$name/$city/$p01/$p02/$p03/$p04/$p05/$p06/$p07/$p08/$p09/$p10/$p11/$p12/$p13/$p14/$p15/$p16/$p17/$p18/$p19/$p20/$p21/$p22/$p23/$p24/$p25/$p26/$p27/$p28/$p29/$p30/$p31/$p32/$p33/$p34/$p35/$p36/$p37/$p38/$p39")
                    },
                    enabled = isEnabledNextButton(isNameError, isCityError, isp33Error, isp34Error)
                ) {
                    Text(text = "Next")
                }

                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}

fun isEnabledNextButton(
    isNameError: Boolean,
    isCityError: Boolean,
    isp33Error: Boolean,
    isp34Error: Boolean
): Boolean {
    return !isNameError && !isCityError && !isp33Error && !isp34Error
}