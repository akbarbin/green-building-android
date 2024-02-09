
import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.marsphotos.model.MarsPhoto
import com.example.marsphotos.network.MarsApi
import kotlinx.coroutines.launch
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Alignment

class MainViewModel : ViewModel() {
    private val _customerData = mutableStateOf<MarsPhoto?>(null)
    val customerData: State<MarsPhoto?> = _customerData
    fun getCustomerDetail(customerId: String) {
        viewModelScope.launch {
            try {
                val response = MarsApi.retrofitService.getPhoto(customerId)
                _customerData.value = response
            } catch (e: Exception) {
                Log.d("MyActivity", "error $e")
            }
        }
    }
}

@Composable
fun BuildingScreen(
    navController: NavHostController,
    id: String
) {
    val viewModel: MainViewModel = viewModel()
    viewModel.getCustomerDetail(id)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        // Tampilkan detail pelanggan dari ViewModel
        LazyColumn {
            items(1) {_ ->
                CustomerDetail(customer = viewModel.customerData.value)
            }
        }
    }
}

@Composable
fun CustomerDetail(customer: MarsPhoto?) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp, 8.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(text = "Detail building", style = MaterialTheme.typography.headlineSmall)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Name: ${customer?.name}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "City: ${customer?.city}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Performance: ${customer?.performance?.times(100)}%", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Level: ${customer?.level}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Policy",
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyLarge
            )

            Text(text = "P01 - Public Transportation: ${customer?.p01}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P02 - Energy Management: ${customer?.p02}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P03 - Paint Material: ${customer?.p03}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P04 - Paper Material: ${customer?.p04}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P05 - Reusable Goods: ${customer?.p05}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P06 - Cleaning Material: ${customer?.p06}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P07 - Plastic Restriction: ${customer?.p07}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P08 - Water Saving: ${customer?.p08}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P09 - No Smoking Commitment: ${customer?.p09}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P10 - Waste Management: ${customer?.p10}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P11 - Water Waste Management: ${customer?.p11}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P12 - Expert Management: ${customer?.p12}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P13 - Retrofit Expert Certified: ${customer?.p13}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P14 - Maintenance Operation: ${customer?.p14}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P15 - As Built Drawing: ${customer?.p15}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P16 - Building Management Performance: ${customer?.p16}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P17 - Operational Log Book: ${customer?.p17}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P18 - Periodic Maintenance: ${customer?.p18}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P19 - Emergency Procedure: ${customer?.p19}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P20 - Maintenance Training: ${customer?.p20}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P21 - Excellent Service Training: ${customer?.p21}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Retrofit",
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyLarge
            )
            Text(text = "P22 - AC Arrangement: ${customer?.p22}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P23 - AC Standard: ${customer?.p23}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P24 - Switch Area Coverage: ${customer?.p24}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P25 - Electrical Load Grouping: ${customer?.p25}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P26 - Building Management System: ${customer?.p26}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P27 - Renewable Energy Source: ${customer?.p27}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P28 - Ground Water Meter: ${customer?.p28}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P29 - Saving Water Consumption: ${customer?.p29}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P30 - Water Fixture Planning: ${customer?.p30}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P31 - Free Smoke Commitment: ${customer?.p31}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P32 - Separated Smoking Area: ${customer?.p32}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P33 - Ozone Depletion Potential: ${customer?.p33}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P34 - Global Warming Potential: ${customer?.p34}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P35 - Reduce Reuse Recycle Commitment: ${customer?.p35}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P36 - Rubbish Bin Provision: ${customer?.p36}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P37 - Temporary Garbage Place: ${customer?.p37}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P38 - Independent Waste Management: ${customer?.p38}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P39 - Waste Volume Recording: ${customer?.p39}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Construction",
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyLarge
            )
            Text(text = "P40 - Initial Working Plan: ${customer?.p40}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P41 - Continuing Project Improvement: ${customer?.p41}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P42 - Data Integration Building: ${customer?.p42}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P43 - Innovate Green Construction: ${customer?.p43}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P44 - Innovate Green Operation: ${customer?.p44}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P45 - Fuel Efficiency: ${customer?.p45}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P46 - Construction Technology: ${customer?.p46}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P47 - Safety Material Construction: ${customer?.p47}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P48 - Initial Working Plan: ${customer?.p48}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P49 - Waste Sorting: ${customer?.p49}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P50 - Initial Working Plan: ${customer?.p50}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P51_1 - Waste Consumption of Last Month 1: ${customer?.p511}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P51_2 - Waste Consumption of Last Month 2: ${customer?.p512}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P51_3 - Waste Consumption of Last Month 3: ${customer?.p513}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P51_4 - Waste Consumption of Last Month 4: ${customer?.p514}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P51_5 - Waste Consumption of Last Month 5: ${customer?.p515}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P51_6 - Waste Consumption of Last Month 6: ${customer?.p516}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P52 - Waste Construction Principle: ${customer?.p52}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P53 - Copy Shop Drawing: ${customer?.p53}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P54 - Copy List Approval Material: ${customer?.p54}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P55 - Testing And Commission Report: ${customer?.p55}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P56 - System Tool Operation Report: ${customer?.p56}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P57 - Main Equipment Warranty: ${customer?.p57}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P58 - Manual Tools Documentation: ${customer?.p58}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P59 - Valid As Build Drawing Report: ${customer?.p59}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Utilization",
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyLarge
            )

            Text(text = "P60 - Friendly Pest Material: ${customer?.p60}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P61_1 - Energy Consumption of Last Month 1: ${customer?.p611}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P61_2 - Energy Consumption of Last Month 2: ${customer?.p612}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P61_3 - Energy Consumption of Last Month 3: ${customer?.p613}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P61_4 - Energy Consumption of Last Month 4: ${customer?.p614}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P61_5 - Energy Consumption of Last Month 5: ${customer?.p615}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P61_6 - Energy Consumption of Last Month 6: ${customer?.p616}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P62 - Lift Maintenance Scheduling: ${customer?.p62}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P63 - Energy Usage Reference: ${customer?.p63}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P64 - Recommissioning: ${customer?.p64}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P65 - No Addition Ground Water Volume: ${customer?.p65}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P66 - Friendly Pest Material: ${customer?.p66}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "p67_1 - Water Fixture Reference: ${customer?.p671}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P67_2 - Product Fixture Reality: ${customer?.p672}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P68_1 - Water Consumption of Last Month 1: ${customer?.p681}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P68_2 - Water Consumption of Last Month 2: ${customer?.p682}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P68_3 - Water Consumption of Last Month 3: ${customer?.p683}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P68_4 - Water Consumption of Last Month 4: ${customer?.p684}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P68_5 - Water Consumption of Last Month 5: ${customer?.p685}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P68_6 - Water Consumption of Last Month 6: ${customer?.p686}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P69 - Water Consumption Reference: ${customer?.p69}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P70 - Ground Water Percentage: ${customer?.p70}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P71 - Last Water Lab Month: ${customer?.p71}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P72 - Temperature: ${customer?.p72}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P73 - Humidity: ${customer?.p73}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P74 - No Smoking Warning: ${customer?.p74}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P75 - Waste Sorting: ${customer?.p75}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P76 - Rubbish Bin Provision: ${customer?.p76}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P77 - Temporary Garbage Dump: ${customer?.p77}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P78 - Full Waste Dump Checking: ${customer?.p78}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P79_1 - Waste Consumption of Last Month 1: ${customer?.p791}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P79_2 - Waste Consumption of Last Month 2: ${customer?.p792}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P79_3 - Waste Consumption of Last Month 3: ${customer?.p793}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P79_4 - Waste Consumption of Last Month 4: ${customer?.p794}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P79_5 - Waste Consumption of Last Month 5: ${customer?.p795}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P79_6 - Waste Consumption of Last Month 6: ${customer?.p796}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P80 - Recycled Water Lab: ${customer?.p80}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P81 - Green Building Socialization: ${customer?.p81}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P82 - Green Achivement Publication: ${customer?.p82}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "P83 - Customer Satisfaction Survey: ${customer?.p83}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}
