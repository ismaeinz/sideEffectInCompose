package com.example.sideeffectincompose.app

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun LaunchedEffect_() {
    var number by remember { mutableIntStateOf(0) }
    LaunchedEffect(number) {
        launch {
            delay(1000)
            number++
        }
    }
    Box {
        Text(number.toString())
    }

}
