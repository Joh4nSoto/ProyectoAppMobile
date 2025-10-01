package com.example.practica.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun Formulario(){
    var showDialog by remember { mutableStateOf(false) }
    var username by remember { mutableStateOf("") }
    var pass by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Nombre")
        OutlinedTextField(
            value = username, 
            onValueChange = {
                nuevoTexto ->
                username = nuevoTexto
            },
            label = {Text("Introduce tu nombre")}
        )
        Text(text = "Contraseña")
        OutlinedTextField(
            value = pass, 
            onValueChange = { nuevoTexto ->
                pass = nuevoTexto
            },
            label = {Text("Introduce tu contraseña")}
        )
        Button(onClick = {
            showDialog = true
        }) {
            Text(text = "Enviar")
        }
    }
    if (showDialog){
        AlertDialog(
            onDismissRequest = { },
            title = { Text("sadasdas")},
            text = { Text("sadsa")},
            confirmButton = {
                TextButton(onClick = { showDialog = false}) {
                    Text("ok")
                }
            }
        )
    }
}