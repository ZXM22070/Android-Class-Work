package com.example.middleexam

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable

@Immutable
data class Teacher(
    var tid: Int,
    var tname:String,
    var tage:Int,
    var temail: String,
    var tclass: String
)
@Immutable
data class Student (
    var sid: Int,
    var sname:String,
    var sage:Int,
    var semail: String,
    var sclass: String

)
val teachers = listOf(
    Teacher(1,"张三",21,"1234@qq.com","计算机225班"),
    Teacher(1,"李四",21,"5678@qq.com","计算机225班"),
    Teacher(1,"王五",21,"7890@qq.com","计算机225班")
)
val students = listOf(
    Student(7,"一",21,"09876576@qq.com","计算机225班"),
    Student(7,"二",21,"09876576@qq.com","计算机225班"),
    Student(7,"三",21,"09876576@qq.com","计算机225班"),
    Student(7,"四",21,"09876576@qq.com","计算机225班"),
    Student(7,"五",21,"09876576@qq.com","计算机225班")
)
