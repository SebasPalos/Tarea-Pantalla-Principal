package com.example.trabajopantallaprincipal.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.trabajopantallaprincipal.screens.LoginScreen
import com.example.trabajopantallaprincipal.screens.MainScreen
import com.example.trabajopantallaprincipal.screens.SignUpScreen
import com.example.trabajopantallaprincipal.screens.WelcomeScreen

@Composable
fun AppNavigation(){

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "welcome"
    ){
        composable( route = "welcome"){
            WelcomeScreen(navController)
        }
        composable( route = "login") {
            LoginScreen(navController)
        }
        composable( route = "signup"){
            SignUpScreen(navController)
        }
        composable( route = "main"){
            MainScreen(navController)
        }
    }
}