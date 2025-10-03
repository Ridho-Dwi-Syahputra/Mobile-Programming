package com.example.shopinglist.screens

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Profile : Screen("profile")
    object Setting : Screen("setting")
}
