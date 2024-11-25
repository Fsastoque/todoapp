package com.juandgaines.todoapp.data

import com.juandgaines.todoapp.domain.Task
import kotlinx.coroutines.flow.MutableStateFlow

//Listas base de datos provisonal

object FakeTaskLocalDatasource {
    private val taskFlow = MutableStateFlow<List<Task>>(emptyList())//Lista de tareas y se quiere ver la forma de como cambia las tareas
}
