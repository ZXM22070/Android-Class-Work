package com.example.middleexam.ui.theme

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun Bpage(navController: NavHostController){
    Text(text = "我是B")
    Button(onClick ={
        navController.navigate("学生人数信息")
    }){
        Text(text = "张三")
    }
}