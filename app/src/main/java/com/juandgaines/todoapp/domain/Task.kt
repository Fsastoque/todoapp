package com.juandgaines.todoapp.domain

data class Task(
    val id:String,
    val title:String.Companion,
    val description:String?,
    val isCompleted:Boolean = false,
    val category:Category? = null
)

