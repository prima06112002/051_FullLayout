package com.example.weatherpam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherpam.ui.theme.WeatherpamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherpamTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen(name = "Prima Ramadhan", From ="Jogja")
                }
            }
        }
    }
}
@Composable
fun HomeScreen(name: String, From: String,modifier: Modifier=Modifier){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)

    ) {
        Text(text = "Prima Ramadhan",
        fontSize = 30.sp,
        color = Color.Black,
        fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center

        )
        Spacer(modifier = Modifier
            .padding(13.dp))
            Box1()
            Spacer(modifier = Modifier
                .padding(13.dp))
            LocnTemp()
            Spacer(modifier = Modifier
                .padding(13.dp))
            BoxBawah()
    }

}
@Composable
fun Box1(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(25.dp))
        .background(color = Color.Cyan)){
        Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally)
        {
            Image(painter = painterResource(id = R.drawable.weather), contentDescription = null,
            modifier = Modifier.size(200.dp))
            Text(text = "Rain")
            
        }
    }
}
@Composable
fun LocnTemp(){
    Text(text = "21 C",
         fontWeight = FontWeight.Bold,
         fontSize = 64.sp)
    Row() {
        Image(painter = painterResource(id = R.drawable.ic_baseline_location_on_24),
            contentDescription =null,
            modifier = Modifier.size(40.dp)
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Text(text = "Yogyakarta",
        fontSize = 30.sp)
    }
    Text(
        text = "Kasihan, Kabupaten Bantul, Daerah Istimewa Yogyakarta",
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold,
        color = Color.Gray
        )
}

@Composable
fun BoxBawah(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(Color.Cyan)
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()

        ) {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                    ){
                        Text(text = "Humidity",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(10.dp)
                        )
                Text(text = "UV Index",
                fontSize = 18.sp,
                modifier = Modifier.padding(10.dp))

            }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
            ){
                Text(text = "98%",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
                )
                Text(text = "9 / 10",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
                )

            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically

                    ){
                Text(text = "Sunrise",
                fontSize = 18.sp,
                modifier = Modifier.padding(5.dp))
                Text(text = "Sunset",
                fontSize = 18.sp,
                modifier = Modifier.padding(5.dp)
                )

            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
                    ){
                Text(text = "9 / 10",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(5.dp)
                )
                Text(text = "05.40 PM",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(5.dp))

            }

        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WeatherpamTheme {
        HomeScreen(name = "Prima Ramadhan", From ="Jogja" )
    }
}