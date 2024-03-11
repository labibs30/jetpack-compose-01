package com.example.myapplication

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),color=MaterialTheme.colors.background) {
                    Greeting("World","M Labib Alfaraby", 10, "5025201083", "PPB I" )
                }
            }
        }
    }
}

@Composable
fun Greeting(salutation:String, name: String, age:Int, nrp:String, kelas:String) {
   Column(
       modifier = Modifier.fillMaxSize(),
       horizontalAlignment = Alignment.CenterHorizontally
   ){

       Text(
           color = Color.Blue,
           fontSize = 20.sp,
           style = MaterialTheme.typography.h4,
           text = "Hello $salutation"
       )
       Text(text = "My Name is $name")
       Text(text = "I am $age years old")
       Text(text = "My Student Registration Number is $nrp")
       Text(text = "Now, i take $kelas course")
   }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        Greeting("World", "M Labib Alfaraby", 10, "5025201083", "PPB I")
    }
}