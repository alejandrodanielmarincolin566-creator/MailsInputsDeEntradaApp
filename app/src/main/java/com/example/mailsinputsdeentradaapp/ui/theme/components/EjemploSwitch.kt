package com.example.mailsinputsdeentradaapp.ui.theme.components

import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

@Composable
fun EjemploSwitch() {

    var estado by remember { mutableStateOf(false) }

    TarjetaEjemplo(
        titulo = "Switch",
        description = "Permite alternar entre dos estados",
        contenido = {
            Switch(
                checked = estado,
                onCheckedChange = { estado = it },
                enabled = true,
                colors = SwitchDefaults.colors(
                    checkedThumbColor = Color.Green,
                    uncheckedThumbColor = Color.Gray
                )
            )
        },
        codigo = {
            CajaCodigo(
                "Switch(\n" +
                        "checked\n" +
                        "onCheckedChange\n" +
                        "enabled\n" +
                        "colors\n" +
                        ")"
            )
        }
    )
}
