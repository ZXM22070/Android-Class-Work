package com.example.middleexam.ui.theme

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController as NavHostController1

@Composable
fun Cpage(navController: NavHostController1){
    Text(text = "我是C")
    Button(onClick ={
        navController.navigate("跳转")
    }){
        Text(text = "")
    }
}