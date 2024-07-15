package com.mycompany.greenbuildingmeter

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
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
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
import com.mycompany.greenbuildingmeter.model.Building
import com.mycompany.greenbuildingmeter.network.BuildingsApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenC(
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
    p39: String,
    p40: String,
    p41: String,
    p42: String,
    p43: String,
    p44: String,
    p45: String,
    p46: String,
    p47: String,
    p48: String,
    p49: String,
    p50: String,
    p511: Float,
    p512: Float,
    p513: Float,
    p514: Float,
    p515: Float,
    p516: Float,
    p53: String,
    p54: String,
    p52: String,
    p55: String,
    p56: String,
    p57: String,
    p58: String,
    p59: String
) {
    val options = listOf("Yes", "No")
    var p60 by remember { mutableStateOf(options[1]) }
    var p611 by remember { mutableStateOf("") }
    var isp611Error by remember { mutableStateOf(false) }
    var p612 by remember { mutableStateOf("") }
    var isp612Error by remember { mutableStateOf(false) }
    var p613 by remember { mutableStateOf("") }
    var isp613Error by remember { mutableStateOf(false) }
    var p614 by remember { mutableStateOf("") }
    var isp614Error by remember { mutableStateOf(false) }
    var p615 by remember { mutableStateOf("") }
    var isp615Error by remember { mutableStateOf(false) }
    var p616 by remember { mutableStateOf("") }
    var isp616Error by remember { mutableStateOf(false) }
    var p62 by remember { mutableStateOf(options[1]) }
    var p63 by remember { mutableStateOf("") }
    var isp63Error by remember { mutableStateOf(false) }
    var p64 by remember { mutableStateOf(options[1]) }
    var p65 by remember { mutableStateOf(options[1]) }
    var p66 by remember { mutableStateOf(options[1]) }
    var p671 by remember { mutableStateOf("") }
    var isp671Error by remember { mutableStateOf(false) }
    var p672 by remember { mutableStateOf("") }
    var isp672Error by remember { mutableStateOf(false) }
    var p681 by remember { mutableStateOf("") }
    var isp681Error by remember { mutableStateOf(false) }
    var p682 by remember { mutableStateOf("") }
    var isp682Error by remember { mutableStateOf(false) }
    var p683 by remember { mutableStateOf("") }
    var isp683Error by remember { mutableStateOf(false) }
    var p684 by remember { mutableStateOf("") }
    var isp684Error by remember { mutableStateOf(false) }
    var p685 by remember { mutableStateOf("") }
    var isp685Error by remember { mutableStateOf(false) }
    var p686 by remember { mutableStateOf("") }
    var isp686Error by remember { mutableStateOf(false) }
    var p69 by remember { mutableStateOf("") }
    var isp69Error by remember { mutableStateOf(false) }
    var p70 by remember { mutableStateOf(options[1]) }
    var p71 by remember { mutableStateOf("2022-12-30") }
    var isp71Error by remember { mutableStateOf(false) }
    var p72 by remember { mutableStateOf("") }
    var isp72Error by remember { mutableStateOf(false) }
    var p73 by remember { mutableStateOf("") }
    var isp73Error by remember { mutableStateOf(false) }
    var p74 by remember { mutableStateOf(options[1]) }
    var p75 by remember { mutableStateOf(options[1]) }
    var p76 by remember { mutableStateOf(options[1]) }
    var p77 by remember { mutableStateOf(options[1]) }
    var p78 by remember { mutableStateOf(options[1]) }
    var p791 by remember { mutableStateOf("") }
    var isp791Error by remember { mutableStateOf(false) }
    var p792 by remember { mutableStateOf("") }
    var isp792Error by remember { mutableStateOf(false) }
    var p793 by remember { mutableStateOf("") }
    var isp793Error by remember { mutableStateOf(false) }
    var p794 by remember { mutableStateOf("") }
    var isp794Error by remember { mutableStateOf(false) }
    var p795 by remember { mutableStateOf("") }
    var isp795Error by remember { mutableStateOf(false) }
    var p796 by remember { mutableStateOf("") }
    var isp796Error by remember { mutableStateOf(false) }
    var p80 by remember { mutableStateOf(options[1]) }
    var p81 by remember { mutableStateOf(options[1]) }
    var p82 by remember { mutableStateOf(options[1]) }
    var p83 by remember { mutableStateOf(options[1]) }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                title = {
                    Text(
                        text = "Add building - Step 3",
                        style = MaterialTheme.typography.headlineSmall
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate("B") }) {
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
                    text = "Utilization",
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.bodyLarge
                )

                Text(
                    text = "P60 - Friendly Pest Material:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p60 == option,
                                onClick = { p60 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P61_1 - Energy Consumption of Last Month 1:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p611,
                    onValueChange = {
                        p611 = it
                        isp611Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp611Error
                )

                if (p611.isEmpty()) {
                    isp611Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P61_2 - Energy Consumption of Last Month 2:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p612,
                    onValueChange = {
                        p612 = it
                        isp612Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp612Error
                )

                if (p612.isEmpty()) {
                    isp612Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P61_3 - Energy Consumption of Last Month 3:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p613,
                    onValueChange = {
                        p613 = it
                        isp613Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp613Error
                )

                if (p613.isEmpty()) {
                    isp613Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P61_4 - Energy Consumption of Last Month 4:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p614,
                    onValueChange = {
                        p614 = it
                        isp614Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp614Error
                )

                if (p614.isEmpty()) {
                    isp614Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P61_5 - Energy Consumption of Last Month 5:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p615,
                    onValueChange = {
                        p615 = it
                        isp615Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp615Error
                )

                if (p615.isEmpty()) {
                    isp615Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P61_6 - Energy Consumption of Last Month 6:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p616,
                    onValueChange = {
                        p616 = it
                        isp616Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp616Error
                )

                if (p616.isEmpty()) {
                    isp616Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P62 - Lift Maintenance Scheduling:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p62 == option,
                                onClick = { p62 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P63 - Energy Usage Reference:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p63,
                    onValueChange = {
                        p63 = it
                        isp63Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp63Error
                )

                if (p63.isEmpty()) {
                    isp63Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P64 - Recommissioning:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p64 == option,
                                onClick = { p64 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P65 - No Addition Ground Water Volume:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p65 == option,
                                onClick = { p65 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P66 - Friendly Pest Material:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p66 == option,
                                onClick = { p66 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "p67_1 - Water Fixture Reference:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p671,
                    onValueChange = {
                        p671 = it
                        isp671Error = false
                    },
                    placeholder = { Text(text = "e.g 100") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp671Error
                )

                if (p671.isEmpty()) {
                    isp671Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P67_2 - Product Fixture Reality:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p672,
                    onValueChange = {
                        p672 = it
                        isp672Error = false
                    },
                    placeholder = { Text(text = "e.g 100") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp672Error
                )

                if (p672.isEmpty()) {
                    isp672Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P68_1 - Water Consumption of Last Month 1:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p681,
                    onValueChange = {
                        p681 = it
                        isp681Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp681Error
                )

                if (p681.isEmpty()) {
                    isp681Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P68_2 - Water Consumption of Last Month 2:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p682,
                    onValueChange = {
                        p682 = it
                        isp682Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp682Error
                )

                if (p682.isEmpty()) {
                    isp682Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P68_3 - Water Consumption of Last Month 3:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p683,
                    onValueChange = {
                        p683 = it
                        isp683Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp683Error
                )

                if (p683.isEmpty()) {
                    isp683Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P68_4 - Water Consumption of Last Month 4:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p684,
                    onValueChange = {
                        p684 = it
                        isp684Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp684Error
                )

                if (p684.isEmpty()) {
                    isp684Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P68_5 - Water Consumption of Last Month 5:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p685,
                    onValueChange = {
                        p685 = it
                        isp685Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp685Error
                )

                if (p685.isEmpty()) {
                    isp685Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P68_6 - Water Consumption of Last Month 6:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p686,
                    onValueChange = {
                        p686 = it
                        isp686Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp686Error
                )

                if (p686.isEmpty()) {
                    isp686Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P69 - Water Consumption Reference:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p69,
                    onValueChange = {
                        p69 = it
                        isp69Error = false
                    },
                    placeholder = { Text(text = "e.g 1000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp69Error
                )

                if (p69.isEmpty()) {
                    isp69Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P70 - Ground Water Percentage:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p70 == option,
                                onClick = { p70 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P71 - Last Water Lab Month:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p71,
                    onValueChange = {
                        p71 = it
                        isp71Error = false
                    },
                    placeholder = { Text(text = "e.g 2022-12-31") },
                    isError = isp71Error
                )

                if (p71.isEmpty()) {
                    isp71Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P72 - Temperature:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p72,
                    onValueChange = {
                        p72 = it
                        isp72Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    isError = isp72Error,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )

                if (p72.isEmpty()) {
                    isp72Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P73 - Humidity:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p73,
                    onValueChange = {
                        p73 = it
                        isp73Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp73Error
                )

                if (p73.isEmpty()) {
                    isp73Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P74 - No Smoking Warning:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p74 == option,
                                onClick = { p74 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P75 - Waste Sorting:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p75 == option,
                                onClick = { p75 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P76 - Rubbish Bin Provision:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p76 == option,
                                onClick = { p76 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P77 - Temporary Garbage Dump:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p77 == option,
                                onClick = { p77 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P78 - Full Waste Dump Checking:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p78 == option,
                                onClick = { p78 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P79_1 - Waste Consumption of Last Month 1:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p791,
                    onValueChange = {
                        p791 = it
                        isp791Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp791Error
                )

                if (p791.isEmpty()) {
                    isp791Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P79_2 - Waste Consumption of Last Month 2:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p792,
                    onValueChange = {
                        p792 = it
                        isp792Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp792Error
                )

                if (p792.isEmpty()) {
                    isp792Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P79_3 - Waste Consumption of Last Month 3:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p793,
                    onValueChange = {
                        p793 = it
                        isp793Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp793Error
                )

                if (p793.isEmpty()) {
                    isp793Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P79_4 - Waste Consumption of Last Month 4:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p794,
                    onValueChange = {
                        p794 = it
                        isp794Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp794Error
                )

                if (p794.isEmpty()) {
                    isp794Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P79_5 - Waste Consumption of Last Month 5:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p795,
                    onValueChange = {
                        p795 = it
                        isp795Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp795Error
                )

                if (p795.isEmpty()) {
                    isp795Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P79_6 - Waste Consumption of Last Month 6:",
                    style = MaterialTheme.typography.bodyLarge
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = p796,
                    onValueChange = {
                        p796 = it
                        isp796Error = false
                    },
                    placeholder = { Text(text = "e.g 10000") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    isError = isp796Error
                )

                if (p796.isEmpty()) {
                    isp796Error = true
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P80 - Recycled Water Lab:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p80 == option,
                                onClick = { p80 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P81 - Green Building Socialization:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p81 == option,
                                onClick = { p81 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P82 - Green Achievement Publication:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p82 == option,
                                onClick = { p82 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "P83 - Customer Satisfaction Survey:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    options.forEach { option ->
                        Row {
                            RadioButton(
                                selected = p83 == option,
                                onClick = { p83 = option }
                            )
                            Text(text = option)
                        }
                    }
                }

                if (!isEnabledUtilizationNextButton(isp611Error, isp612Error, isp613Error, isp614Error, isp615Error, isp616Error, isp671Error, isp672Error, isp681Error, isp682Error, isp683Error, isp684Error, isp685Error, isp686Error, isp69Error, isp71Error, isp72Error, isp73Error, isp791Error, isp792Error, isp793Error, isp794Error, isp795Error, isp796Error)) {
                    Text(text = "Please fill all required fields")
                }

                Spacer(modifier = Modifier.width(8.dp))

//        Text(text = "p61=$isp611Error p61=$isp612Error p61=$isp613Error p61=$isp614Error p61=$isp615Error p61=$isp616Error p67=$isp671Error p67=$isp672Error p68=$isp681Error p68=$isp682Error p68=$isp683Error p68=$isp684Error p68=$isp685Error p68=$isp686Error p69=$isp69Error p71=$isp71Error p72=$isp72Error p73=$isp73Error p79=$isp791Error p79=$isp792Error p79=$isp793Error p79=$isp794Error p79=$isp795Error p79=$isp796Error")
//        Text(text = "name=$name, city=$city, p01=$p01, p02=$p02, p03=$p03, p04=$p04, p05=$p05, p06=$p06, p07=$p07, p08=$p08, p09=$p09, p10=$p10, p11=$p11, p12=$p12, p13=$p13, p14=$p14, p15=$p15, p16=$p16, p17=$p17, p18=$p18, p19=$p19, p20=$p20, p21=$p21, p22=$p22, p23=$p23, p24=$p24, p25=$p25, p26=$p26, p27=$p27, p28=$p28, p29=$p29, p30=$p30, p31=$p31, p32=$p32, p33=$p33, p34=$p34, p35=$p35, p36=$p36, p37=$p37, p38=$p38, p39=$p39, p40=$p40, p41=$p41, p42=$p42, p43=$p43, p44=$p44, p45=$p45, p46=$p46, p47=$p47, p48=$p48, p49=$p49, p50=$p50, p51=$p511, p51=$p512, p51=$p513, p51=$p514, p51=$p515, p51=$p516, p52=$p52, p53=$p53, p54=$p54, p55=$p55, p56=$p56, p57=$p57, p58=$p58, p59=$p59, p60=$p60, p61=$p611.toFloat(), p61=$p612.toFloat(), p61=$p613.toFloat(), p61=$p614.toFloat(), p61=$p615.toFloat(), p61=$p616.toFloat(), p62=$p62, p63=$p63.toFloat(), p64=$p64, p65=$p65, p66=$p66, p67=$p671.toFloat(), p67=$p672.toFloat(), p68=$p681.toFloat(), p68=$p682.toFloat(), p68=$p683.toFloat(), p68=$p684.toFloat(), p68=$p685.toFloat(), p68=$p686.toFloat(), p69=$p69.toFloat(), p70=$p70, p71=$p71, p72=$p72.toFloat(), p73=$p73.toFloat(), p74=$p74, p75=$p75, p76=$p76, p77=$p77, p78=$p78, p79=$p791.toFloat(), p79=$p792.toFloat(), p79=$p793.toFloat(), p79=$p794.toFloat(), p79=$p795.toFloat(), p79=$p796.toFloat(), p80=$p80, p81=$p81, p82=$p82, p83=$p83")

                Button(
                    onClick = {
                        val building = Building(name, city, p01, p02, p03, p04, p05, p06, p07, p08, p09, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50, p511, p512, p513, p514, p515, p516, p52, p53, p54, p55, p56, p57, p58, p59, p60, p611.toFloat(), p612.toFloat(), p613.toFloat(), p614.toFloat(), p615.toFloat(), p616.toFloat(), p62, p63.toFloat(), p64, p65, p66, p671.toFloat(), p672.toFloat(), p681.toFloat(), p682.toFloat(), p683.toFloat(), p684.toFloat(), p685.toFloat(), p686.toFloat(), p69.toFloat(), p70, p71, p72.toFloat(), p73.toFloat(), p74, p75, p76, p77, p78, p791.toFloat(), p792.toFloat(), p793.toFloat(), p794.toFloat(), p795.toFloat(), p796.toFloat(), p80, p81, p82, p83, null, null, null, null, null, null, null, null, null, null, null)
                        //            val marsPhoto = MarsPhoto(name, city, "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", 0.0, 634, "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", 3000.0, 4000.0, 5000.0, 4000.0, 7000.0, 1500.0, "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", 4000000.0, 5000000.0, 4000000.0, 4000000.0, 5000000.0, 4400000.0, "Yes",500000000.0, "Yes", "Yes", "Yes", 5.0, 5.0, 4000000.0, 4000000.0, 4000000.0, 4000000.0, 4000000.0, 4200000.0, 10000000.0, "Yes", "2022-12-09", 23.0, 36.0, "Yes", "Yes", "Yes", "Yes", "Yes", 33.48, 32.40, 34.56, 29.64, 16.44, 35.76, "Yes", "Yes", "Yes", "Yes", null, null, null, null, null, null, null, null, null, null, null)
                        createMarsPhoto(building)
                        navController.navigate("D")
                    },
                    enabled = isEnabledUtilizationNextButton(isp611Error, isp612Error, isp613Error, isp614Error, isp615Error, isp616Error, isp671Error, isp672Error, isp681Error, isp682Error, isp683Error, isp684Error, isp685Error, isp686Error, isp69Error, isp71Error, isp72Error, isp73Error, isp791Error, isp792Error, isp793Error, isp794Error, isp795Error, isp796Error)
                ) {
                    Text(text = "Submit")
                }

                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}

fun createMarsPhoto(building: Building) {
    GlobalScope.launch(Dispatchers.IO) {
        try {
            BuildingsApi.retrofitService.createBuilding(building)
        } catch (e: IOException) {
        } catch (e: HttpException) {
        }
    }
}

fun isEnabledUtilizationNextButton(
    isp611Error: Boolean,
    isp612Error: Boolean,
    isp613Error: Boolean,
    isp614Error: Boolean,
    isp615Error: Boolean,
    isp616Error: Boolean,
    isp671Error: Boolean,
    isp672Error: Boolean,
    isp681Error: Boolean,
    isp682Error: Boolean,
    isp683Error: Boolean,
    isp684Error: Boolean,
    isp685Error: Boolean,
    isp686Error: Boolean,
    isp69Error: Boolean,
    isp71Error: Boolean,
    isp72Error: Boolean,
    isp73Error: Boolean,
    isp791Error: Boolean,
    isp792Error: Boolean,
    isp793Error: Boolean,
    isp794Error: Boolean,
    isp795Error: Boolean,
    isp796Error: Boolean
): Boolean {
    return !isp611Error && !isp612Error && !isp613Error && !isp614Error && !isp615Error && !isp616Error && !isp671Error && !isp672Error && !isp681Error && !isp682Error && !isp683Error && !isp684Error && !isp685Error && !isp686Error && !isp69Error && !isp71Error && !isp72Error && !isp73Error && !isp791Error && !isp792Error && !isp793Error && !isp794Error && !isp795Error && !isp796Error
}