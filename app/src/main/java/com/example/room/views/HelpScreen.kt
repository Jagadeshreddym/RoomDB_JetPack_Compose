package com.example.room.views

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.room.utils.CustomToolbar
import com.example.room.viewmodels.HomeViewModel

@Composable
fun HelpScreen(
    navController: NavHostController,
    homeViewModel: HomeViewModel,
    openDrawer: () -> Unit
) {
    Scaffold(
        topBar = {
            CustomToolbar(title = "Help", openDrawer)
        }
    ) {

    }
}