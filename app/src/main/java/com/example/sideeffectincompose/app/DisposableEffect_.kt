package com.example.sideeffectincompose.app

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import kotlinx.coroutines.delay

@Composable
fun DisposableEffect_() {
    var number by remember { mutableIntStateOf(0) }
    LaunchedEffect(number) {
        delay(1000)
        number++
    }
    DisposableEffect(number) {
        number
        onDispose {
//            number--
        }
    }

    Column {
        Text(number.toString())
        Button({}) {
            Text("reset")

        }
    }

}