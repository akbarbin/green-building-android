
import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.marsphotos.model.MarsPhoto
import com.example.marsphotos.network.MarsApi
import kotlinx.coroutines.launch

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
        CustomerDetail(customer = viewModel.customerData.value)
    }
}

@Composable
fun CustomerDetail(customer: MarsPhoto?) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(text = "Nama: ${customer?.name}", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Kota: ${customer?.city}", style = MaterialTheme.typography.bodyMedium)
        }
    }
}
