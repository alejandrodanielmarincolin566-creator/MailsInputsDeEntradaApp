package com.example.mailsinputsdeentradaapp.ui.theme.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun EjemploRadioButton() {
    var genero by remember { mutableStateOf("") }

    TarjetaEjemplo(
        titulo = "RadioButton",
        description = "Permite marcar una única opción",
        contenido = {
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(
                        selected = genero == "Masculino",
                        onClick = { genero = "Masculino" },
                        enabled = true,
                        colors = RadioButtonDefaults.colors(
                            selectedColor = Color(0xFF1976D2),
                            unselectedColor = Color.Gray,
                            disabledSelectedColor = Color.LightGray,
                            disabledUnselectedColor = Color.DarkGray
                        )
                    )
                    Text("Masculino", modifier = Modifier.padding(start = 8.dp))

                    RadioButton(
                        selected = genero == "Femenino",
                        onClick = { genero = "Femenino" },
                        enabled = true,
                        colors = RadioButtonDefaults.colors(
                            selectedColor = Color(0xFF1976D2),
                            unselectedColor = Color.Gray,
                            disabledSelectedColor = Color.LightGray,
                            disabledUnselectedColor = Color.DarkGray
                        )
                    )
                    Text("Femenino", modifier = Modifier.padding(start = 8.dp))
                }
            }
        },
        codigo = {
            CajaCodigo(
                "RadioButton(\n" +
                        "selected\n" +
                        "onClick\n" +
                        "enabled\n" +
                        "colors\n" +
                        ")"
            )
        }
    )
}
