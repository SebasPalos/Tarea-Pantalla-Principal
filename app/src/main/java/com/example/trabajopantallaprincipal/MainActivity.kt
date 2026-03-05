package com.example.trabajopantallaprincipal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen() //Cambiar la función para ver las otras pantallas (WelcomeScreen(), LoginScreen(), SignUpScreen())
        }
    }
}

@Composable
fun WelcomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 60.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(10.dp))

        Image(
            painter = painterResource(id = R.drawable.welcome_screen_image),
            contentDescription = "Ilustración de bienvenida",
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "Hello",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF333333)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Welcome To Little Drop, where you manage your daily tasks",
            fontSize = 20.sp,
            color = Color.Gray,
            textAlign = TextAlign.Center,
            lineHeight = 22.sp
        )

        Spacer(modifier = Modifier.height(50.dp))

        // Botón Login
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp)
                .clip(RoundedCornerShape(25.dp))
                .background(Color(0xFF4A47A3)),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Login", color = Color.White, fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Botón Sign Up
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp)
                .border(1.dp, Color(0xFF4A47A3), RoundedCornerShape(25.dp)),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Sign Up", color = Color(0xFF4A47A3), fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
        }

        Spacer(modifier = Modifier.height(40.dp))

        Text(text = "Sign up using", fontSize = 12.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(15.dp))

        //Botones de Inicios de Sesión alternos
        Row(
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            SocialIcon(Color(0xFF3B5998), "f")
            SocialIcon(Color(0xFFE15543), "G+")
            SocialIcon(Color(0xFF1F83BE), "in")
        }
    }
}

@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 40.dp), // Un poco más de aire para los inputs
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(100.dp))

        Image(
            painter = painterResource(id = R.drawable.welcome_screen_image),
            contentDescription = "Login Illustration",
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Welcome Back",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF333333)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Login to your account",
            fontSize = 16.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(30.dp))

        // Campo de Email
        InputField(label = "Email Address")

        Spacer(modifier = Modifier.height(16.dp))

        // Campo de Contraseña
        InputField(label = "Password", isPassword = true)

        Spacer(modifier = Modifier.height(12.dp))

        // Olvidé mi contraseña
        Text(
            text = "Forgot Password?",
            modifier = Modifier.align(Alignment.End),
            fontSize = 14.sp,
            color = Color(0xFF4A47A3),
            fontWeight = FontWeight.Medium
        )

        Spacer(modifier = Modifier.height(40.dp))

        // Botón de Login
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp)
                .clip(RoundedCornerShape(25.dp))
                .background(Color(0xFF4A47A3)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Login",
                color = Color.White,
                fontWeight = FontWeight.SemiBold,
                fontSize = 18.sp
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        Text(text = "Or login using", fontSize = 12.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(15.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            SocialIcon(Color(0xFF3B5998), "f")
            SocialIcon(Color(0xFFE15543), "G+")
            SocialIcon(Color(0xFF1F83BE), "in")
        }
    }
}

@Composable
fun SignUpScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(80.dp))

        Image(
            painter = painterResource(id = R.drawable.welcome_screen_image),
            contentDescription = "Sign Up Illustration",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Create Account",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF333333)
        )

        Text(
            text = "Sign up to start managing tasks",
            fontSize = 16.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(30.dp))

        // Campos de Registro
        InputField(label = "Full Name")

        Spacer(modifier = Modifier.height(16.dp))

        InputField(label = "Email Address")

        Spacer(modifier = Modifier.height(16.dp))

        InputField(label = "Create Password", isPassword = true)

        Spacer(modifier = Modifier.height(30.dp))

        // Botón principal de Registro
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp)
                .clip(RoundedCornerShape(25.dp))
                .background(Color(0xFF4A47A3)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Sign Up",
                color = Color.White,
                fontWeight = FontWeight.SemiBold,
                fontSize = 18.sp
            )
        }

        Spacer(modifier = Modifier.height(25.dp))

        Row {
            Text(text = "Already have an account? ", color = Color.Gray, fontSize = 14.sp)
            Text(
                text = "Log In",
                color = Color(0xFF4A47A3),
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        Text(text = "Sign up using", fontSize = 12.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(15.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            SocialIcon(Color(0xFF3B5998), "f")
            SocialIcon(Color(0xFFE15543), "G+")
            SocialIcon(Color(0xFF1F83BE), "in")
        }

        Spacer(modifier = Modifier.height(20.dp))
    }
}

@Composable
fun InputField(label: String, isPassword: Boolean = false) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(55.dp)
            .border(1.dp, Color(0xFFE0E0E0), RoundedCornerShape(25.dp))
            .padding(horizontal = 20.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        Text(
            text = label,
            color = Color.LightGray,
            fontSize = 16.sp
        )
    }
}

@Composable
fun SocialIcon(color: Color, label: String) {
    Box(
        modifier = Modifier
            .size(40.dp)
            .clip(CircleShape)
            .background(color),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = label,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp
        )
    }
}