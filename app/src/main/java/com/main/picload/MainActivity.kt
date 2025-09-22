package com.main.picload

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.main.picload.ui.ImageViewModel
import com.main.picload.ui.screens.ImageListScreen
import com.main.picload.ui.theme.PicLoadTheme

class MainActivity : ComponentActivity() {

    private val viewModel: ImageViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PicLoadTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    ImageListScreen(
                        viewModel = viewModel,
                        paddingValues = innerPadding
                    )
                }
            }
        }
    }
}
