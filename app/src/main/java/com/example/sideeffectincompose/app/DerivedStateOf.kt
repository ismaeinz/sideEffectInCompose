package com.example.sideeffectincompose.app

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DerivedStateOf() {
    var firstState by remember {
        mutableIntStateOf(0)
    }
//    يتم حساب secondState عند التغير في الـfirstState.

    val secondState by remember {
        derivedStateOf { firstState % 2 == 0 }
    }
//    يتم حساب secondState عند كل recompilation

//    val secondState= firstState % 2 == 0

    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Counter: $firstState")
        Text("Is Even: $secondState")
        Button(onClick = { firstState++ }) {
            Text("Increase")
        }
    }
}
