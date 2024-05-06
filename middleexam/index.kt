package com.example.middleexam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.middleexam.ui.theme.Bpage
import com.example.middleexam.ui.theme.Cpage
import com.example.middleexam.ui.theme.MiddleExamTheme
import com.example.navhost.Apage
import androidx.compose.material3.Button as Button1


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiddleExamTheme {
            }
        }
    }
}

@Composable
fun Navigator(){
    val navController = rememberNavController()
    NavHost(navController = navController,startDestination = "Home"){
        composable("Home"){Homepage(navController)}
        composable("A"){Apage(navController)}
        composable("B"){Bpage(navController)}
        composable("C"){Cpage(navController)}
    }
}

@Composable
fun Homepage(navController: NavController){
    Column {
        Button1(onClick = {
            navController.navigate("A")
        }) {
            Text(text="A")
        }
        Button1(onClick = {
            navController.navigate("B")
        }) {
            Text(text="B")
        }
        Button1(onClick = {
            navController.navigate("C")
        }) {
            Text(text="C")
        }
    }
}




@Composable
@Preview(showSystemUi = true)
fun PrevieHost(){
    Navigator()
}


