package com.juandgaines.todoapp.domain

interface TaskLocalDataSource {
    val taskFlow: List<Task>
    fun addTask(task: Task)
    fun updateTask(task: Task)
    fun removeTask(task: Task)
    fun deleteAllTasks()
    fun getTaskById(id: Int):Task

}