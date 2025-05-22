package com.togb.togbshop

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.togb.togbshop.ui.theme.TOGBSHOPTheme

@Composable
fun Calculator() {
    // Defined variables to store the user data and display the results
    var number1 by remember { mutableStateOf("") }
    var number2 by remember { mutableStateOf("") }


    var result by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize(),
        Alignment.TopCenter
    ){
        // Column for displaying the input fields and result field
        Column() {
            // First Number
            TextField(
                value = number1,
                onValueChange = {
                    number1 = it
                },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                ),
                visualTransformation = VisualTransformation.None,
                label = { Text(text = "Enter the first number") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )

            // Second Number
            TextField(
                value = number2,
                onValueChange = {
                    number2 = it
                },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                ),
                visualTransformation = VisualTransformation.None,
                label = { Text(text = "Enter the second number") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )

            // Results Field
            TextField(
                value = result,
                onValueChange = {

                },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                ),
                visualTransformation = VisualTransformation.None,
                label = { Text(text = "Results") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )

            // Row for displaying the buttons
            Row(
            ) {
                Button(
                    onClick = {
                        result = (number1.toDouble() + number2.toDouble()).toString()
                    },
                    modifier = Modifier
                        .padding(8.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFF4CAF50)),
                ) {
                    Text(text = "+")
                }
                Button(
                    onClick = {
                        result = (number1.toDouble() - number2.toDouble()).toString()
                    },
                    modifier = Modifier
                        .padding(8.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFF03A9F4)),
                ) {
                    Text(text = "-")
                }
                Button(
                    onClick = {
                        result = (number1.toDouble() / number2.toDouble()).toString()
                    },
                    modifier = Modifier
                        .padding(8.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFFFF9800)),
                ) {
                    Text(text = "/")
                }
                Button(
                    onClick = {
                        result = (number1.toDouble() * number2.toDouble()).toString()
                    },
                    modifier = Modifier
                        .padding(8.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFF8F3AE3)),
                ) {
                    Text(text = "*")
                }
                Button(
                    onClick = {
                        number1=""
                        number2=""
                        result=""
                    },
                    modifier = Modifier
                        .padding(8.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFFFD0404)),
                ) {
                    Text(text = "Del")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CalculatorPreview() {
    TOGBSHOPTheme {
        Calculator()
    }
}