package com.example.marsphotos

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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

@Composable
fun ScreenB(
    navController: NavHostController,
    name: String,
    city: String,
    p01: String?,
    p02: String?,
    p03: String?,
    p04: String?,
    p05: String?,
    p06: String?,
    p07: String?,
    p08: String?,
    p09: String?,
    p10: String?,
    p11: String?,
    p12: String?,
    p13: String?,
    p14: String?,
    p15: String?,
    p16: String?,
    p17: String?,
    p18: String?,
    p19: String?,
    p20: String?,
    p21: String?,
    p22: String?,
    p23: String?,
    p24: String?,
    p25: String?,
    p26: String?,
    p27: String?,
    p28: String?,
    p29: String?,
    p30: String?,
    p31: String?,
    p32: String?,
    p33: Float?,
    p34: Int?,
    p35: String?,
    p36: String?,
    p37: String?,
    p38: String?,
    p39: String?
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
    var p512 by remember { mutableStateOf("") }
    var p513 by remember { mutableStateOf("") }
    var p514 by remember { mutableStateOf("") }
    var p515 by remember { mutableStateOf("") }
    var p516 by remember { mutableStateOf("") }
    var p52 by remember { mutableStateOf(options[1]) }
    var p53 by remember { mutableStateOf(options[1]) }
    var p54 by remember { mutableStateOf(options[1]) }
    var p55 by remember { mutableStateOf(options[1]) }
    var p56 by remember { mutableStateOf(options[1]) }
    var p57 by remember { mutableStateOf(options[1]) }
    var p58 by remember { mutableStateOf(options[1]) }
    var p59 by remember { mutableStateOf(options[1]) }
    var p60 by remember { mutableStateOf(options[1]) }
    var p611 by remember { mutableStateOf("") }
    var p612 by remember { mutableStateOf("") }
    var p613 by remember { mutableStateOf("") }
    var p614 by remember { mutableStateOf("") }
    var p615 by remember { mutableStateOf("") }
    var p616 by remember { mutableStateOf("") }
    var p62 by remember { mutableStateOf(options[1]) }
    var p63 by remember { mutableStateOf(options[1]) }
    var p64 by remember { mutableStateOf(options[1]) }
    var p65 by remember { mutableStateOf(options[1]) }
    var p66 by remember { mutableStateOf(options[1]) }
    var p671 by remember { mutableStateOf("") }
    var p672 by remember { mutableStateOf("") }
    var p681 by remember { mutableStateOf("") }
    var p682 by remember { mutableStateOf("") }
    var p683 by remember { mutableStateOf("") }
    var p684 by remember { mutableStateOf("") }
    var p685 by remember { mutableStateOf("") }
    var p686 by remember { mutableStateOf("") }
    var p69 by remember { mutableStateOf("") }
    var p70 by remember { mutableStateOf(options[1]) }
    var p71 by remember { mutableStateOf("2022-12-30") }
    var p72 by remember { mutableStateOf("") }
    var p73 by remember { mutableStateOf("") }
    var p74 by remember { mutableStateOf(options[1]) }
    var p75 by remember { mutableStateOf(options[1]) }
    var p76 by remember { mutableStateOf(options[1]) }
    var p77 by remember { mutableStateOf(options[1]) }
    var p78 by remember { mutableStateOf(options[1]) }
    var p791 by remember { mutableStateOf("") }
    var p792 by remember { mutableStateOf("") }
    var p793 by remember { mutableStateOf("") }
    var p794 by remember { mutableStateOf("") }
    var p795 by remember { mutableStateOf("") }
    var p796 by remember { mutableStateOf("") }
    var p80 by remember { mutableStateOf(options[1]) }
    var p81 by remember { mutableStateOf(options[1]) }
    var p82 by remember { mutableStateOf(options[1]) }
    var p83 by remember { mutableStateOf(options[1]) }

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
            onValueChange = { p511 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P51_2 - Waste Consumption of Last Month 2:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p512,
            onValueChange = { p512 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P51_3 - Waste Consumption of Last Month 3:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p513,
            onValueChange = { p513 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P51_4 - Waste Consumption of Last Month 4:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p514,
            onValueChange = { p514 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P51_5 - Waste Consumption of Last Month 5:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p515,
            onValueChange = { p515 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P51_6 - Waste Consumption of Last Month 6:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p516,
            onValueChange = { p516 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

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
            text = "P59 - Valid As Build Drawing Report: </p",
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
            onValueChange = { p611 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P61_2 - Energy Consumption of Last Month 2:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p612,
            onValueChange = { p612 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P61_3 - Energy Consumption of Last Month 3:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p613,
            onValueChange = { p613 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P61_4 - Energy Consumption of Last Month 4:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p614,
            onValueChange = { p614 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P61_5 - Energy Consumption of Last Month 5:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p615,
            onValueChange = { p615 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P61_6 - Energy Consumption of Last Month 6:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p616,
            onValueChange = { p616 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

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

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center
        ) {
            options.forEach { option ->
                Row {
                    RadioButton(
                        selected = p63 == option,
                        onClick = { p63 = option }
                    )
                    Text(text = option)
                }
            }
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
            onValueChange = { p671 = it },
            placeholder = { Text(text = "e.g 100") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P67_2 - Product Fixture Reality:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p672,
            onValueChange = { p672 = it },
            placeholder = { Text(text = "e.g 100") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P68_1 - Water Consumption of Last Month 1:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p681,
            onValueChange = { p681 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P68_2 - Water Consumption of Last Month 2:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p682,
            onValueChange = { p682 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P68_3 - Water Consumption of Last Month 3:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p683,
            onValueChange = { p683 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P68_4 - Water Consumption of Last Month 4:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p684,
            onValueChange = { p684 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P68_5 - Water Consumption of Last Month 5:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p685,
            onValueChange = { p685 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P68_6 - Water Consumption of Last Month 6:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p686,
            onValueChange = { p686 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P69 - Water Consumption Reference:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p69,
            onValueChange = { p69 = it },
            placeholder = { Text(text = "e.g Green Tower") }
        )

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
            onValueChange = { p71 = it },
            placeholder = { Text(text = "e.g 2022-12-31") }
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P72 - Temperature:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p72,
            onValueChange = { p72 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P73 - Humidity:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p73,
            onValueChange = { p73 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

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
            onValueChange = { p791 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P79_2 - Waste Consumption of Last Month 2:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p792,
            onValueChange = { p792 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P79_3 - Waste Consumption of Last Month 3:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p793,
            onValueChange = { p793 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P79_4 - Waste Consumption of Last Month 4:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p794,
            onValueChange = { p794 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P79_5 - Waste Consumption of Last Month 5:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p795,
            onValueChange = { p795 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "P79_6 - Waste Consumption of Last Month 6:",
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = p796,
            onValueChange = { p796 = it },
            placeholder = { Text(text = "e.g 10000") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

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

        Spacer(modifier = Modifier.width(8.dp))

        Button(onClick = {
            val marsPhoto = MarsPhoto(name, city, p01, p02, p03, p04, p05, p06, p07, p08, p09, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50, p511.toFloat(), p512.toFloat(), p513.toFloat(), p514.toFloat(), p515.toFloat(), p516.toFloat(), p52, p53, p54, p55, p57, p57, p58, p59, p60, p611.toFloat(), p612.toFloat(), p613.toFloat(), p614.toFloat(), p615.toFloat(), p616.toFloat(), p62,p63.toFloat(), p64, p65, p66, p671.toFloat(), p672.toFloat(), p681.toFloat(), p682.toFloat(), p683.toFloat(), p684.toFloat(), p685.toFloat(), p686.toFloat(), p69.toFloat(), p70, p71, p72.toFloat(),p73.toFloat(), p74, p75, p76, p77, p78, p791.toFloat(), p792.toFloat(), p793.toFloat(), p794.toFloat(), p795.toFloat(), p796.toFloat(), p80, p81, p82, p83, null, null, null, null, null, null, null, null, null, null, null)
//            val marsPhoto = MarsPhoto(name, city, "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", 0.0, 634, "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", 3000.0, 4000.0, 5000.0, 4000.0, 7000.0, 1500.0, "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", 4000000.0, 5000000.0, 4000000.0, 4000000.0, 5000000.0, 4400000.0, "Yes",500000000.0, "Yes", "Yes", "Yes", 5.0, 5.0, 4000000.0, 4000000.0, 4000000.0, 4000000.0, 4000000.0, 4200000.0, 10000000.0, "Yes", "2022-12-09", 23.0, 36.0, "Yes", "Yes", "Yes", "Yes", "Yes", 33.48, 32.40, 34.56, 29.64, 16.44, 35.76, "Yes", "Yes", "Yes", "Yes", null, null, null, null, null, null, null, null, null, null, null)
            createMarsPhoto(marsPhoto)
            navController.navigate("C")
        }) {
            Text(text = "Submit")
        }

        Spacer(modifier = Modifier.height(20.dp))
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
