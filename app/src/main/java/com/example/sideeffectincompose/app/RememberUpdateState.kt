package com.example.sideeffectincompose.app

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RememberUpdateState_(modifier: Modifier = Modifier) {
    var input by remember { mutableIntStateOf(0) }
    Button({ input++ }) {
        Text("click Me $input")
    }
    PrintNumber(input)
}

@Composable
fun PrintNumber(input: Int) {
//    val updateNumber: Int by remember { mutableIntStateOf(input) }
    val updateNumber: Int by rememberUpdatedState(input)


    Text(
        "number Is $updateNumber", modifier = Modifier.padding(top = 10.dp)
    )

}
//https://youtu.be/F7xPhGK1B4Q?list=PLXjbGq0ERjFoFX-RB84oghA3S0X3QkBu2