package com.example.sideeffectincompose.app

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier


//    يستخدم لتنفيذ كود بعد الريكومبيستشن
@Composable
fun SideEffect_() {
    var counter by remember { mutableStateOf(0) }

    SideEffect {
        println("🔁 Composed! Counter = $counter")
    }

    Column {
        Text("Counter: $counter")
        Button(onClick = { counter++ }) {
            Text("Increase")
        }
    }
}

@Composable
fun AfterSideEffect(modifier: Modifier = Modifier) {

}


