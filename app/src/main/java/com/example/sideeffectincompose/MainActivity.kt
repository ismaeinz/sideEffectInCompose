package com.example.sideeffectincompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.sideeffectincompose.app.ProduceState_
import com.example.sideeffectincompose.ui.theme.SideEffectInComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SideEffectInComposeTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
//                    DerivedStateOf()
//                    RememberCoroutineScope()
//                    LaunchedEffect_()
//                    DisposableEffect_()
                    ProduceState_(userId = "Id is :")
//                    SideEffect_()
//                    RememberUpdateState_()
//                    ProduceState_()
                }
            }
        }
    }
}


