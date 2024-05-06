package com.example.middleexam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.middleexam.ui.theme.MiddleExamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiddleExamTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}


@Composable
fun Navigator(){
        val navController= rememberNavController ()
    NavHost(navController=navController,startDestination="Home"){
        composoble("Home"){HomePage(navController)}
        composoble("Second"){SecondPage(navController)}
        }
    }
@Composable
fun Navigator(){
    val navController= rememberNavController()
    NavHost(navController=navController,startDestination="Home"){
        composoble("Home"){HomePage(navController)}
        composoble("A"){Apage(navController)}
        composoble("B"){Bpage(navController)}
        composoble("C"){Cpage(navController)}
    }
}
    @Composable
    fun HomePage(navController: NavController){
        Column {
            Button(onClick = {
            navController.navigate("A")
            }) {
                Text(text = "A")
            }

            Button(onClick = {
                navController.navigate("B")
            }) {
                Text(text = "B")
            }

            Button(onClick = {
                navController.navigate("C")
            }) {
                Text(text = "C")
            }
        }
    }
    @Composable
    @Preview(showSystemUi=true)
            fun previeHost(){
                Navigator()
            }
    }
