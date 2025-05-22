package com.togb.togbshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.togb.togbshop.ui.theme.TOGBSHOPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TOGBSHOPTheme {
                Calculator()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun CalPreview() {
    TOGBSHOPTheme {
        Calculator()
    }
}
