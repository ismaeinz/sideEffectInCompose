package com.example.sideeffectincompose.app

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

//لو عايز أعمل كوريوتين مرتبط بالكومبوسايبل
//بدون استخدام لانشيد ايفيكت

@Composable
fun RememberCoroutineScope() {
    val coroutineScope = rememberCoroutineScope()
    var text by remember { mutableStateOf("Click the button") }

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text)
        Button(onClick = {
            coroutineScope.launch {
                delay(2000)
                text = "Hello after delay!"
            }
        }) {
            Text("Click me")
        }
    }
}
