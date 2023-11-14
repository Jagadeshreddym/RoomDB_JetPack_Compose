package com.example.room.views

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.room.utils.CustomToolbar
import com.example.room.viewmodels.HomeViewModel

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun AccountScreen(
    navController: NavHostController,
    homeViewModel: HomeViewModel,
    openDrawer: () -> Unit
) {
    Scaffold(
        topBar = {
            CustomToolbar(title = "Account", openDrawer)
        }
    ) {

    }
}