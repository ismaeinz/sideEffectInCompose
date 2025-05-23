package com.example.sideeffectincompose.app

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState
import kotlinx.coroutines.delay

data class User(val id: String, val name: String)

@Composable
fun ProduceState_(userId: String) {
    val user by produceState<User?>(initialValue = null, userId) {
        val result = fetchUserFromApi(userId)
        value = result
    }

    if (user == null) {
        CircularProgressIndicator()
    } else {
        Text("Username: ${user!!.name}")
    }
}

// API وهمي
suspend fun fetchUserFromApi(userId: String): User {
    delay(2000)
    return User(userId, "Ahmed")
}


