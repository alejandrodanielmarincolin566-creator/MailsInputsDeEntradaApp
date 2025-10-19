package com.example.mailsinputsdeentradaapp.ui.theme.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun EjemploTextField() {
    var nombre by remember { mutableStateOf("") }

    TarjetaEjemplo(
        titulo = "TextField",
        description = "Campo de texto con fondo de relleno",
        contenido = {
            TextField(
                value = nombre,
                onValueChange = { nombre = it },
                label = { Text("Nombre") },
                placeholder = { Text("Escribe aqui") },
                modifier = Modifier.fillMaxWidth()
            )
            if (nombre.isNotEmpty()) {
                Text("Escribiste $nombre", fontSize = 12.sp, color = Color.Gray)
            }
        },
        codigo = {
            CajaCodigo(
                "TextField(\n" +
                        "value\n" +
                        "onValueChange\n" +
                        "label\n" +
                        "placeholder\n" +
                        "modifier\n" +
                        ")"
            )
        }
    )
}
