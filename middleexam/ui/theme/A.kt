package com.example.navhost

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import java.security.AccessController

@Composable
fun Apage(navController: NavHostController){
    Text(text = "我是A")

    Button(onClick ={
        navController.navigate("教师信息")
    }){
        Text(text = "zzz")
    }
}

