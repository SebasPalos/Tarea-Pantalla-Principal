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
            LittleDropWelcomeScreen()
        }
    }
}

@Composable
fun LittleDropWelcomeScreen() {
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