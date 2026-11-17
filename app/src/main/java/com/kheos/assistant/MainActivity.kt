
package com.kheos.assistant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            KheosScreen()
        }
    }
}

@Composable
fun KheosScreen() {
    var mode by remember { mutableStateOf("AUTO") }
    var active by remember { mutableStateOf(false) }

    val neon = when (mode) {
        "ULTRA" -> Color(0xFF00FFFF)
        "STANDARD" -> Color(0xFF3388FF)
        else -> Color(0xFF00FFAA)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF050A12))
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = "KHEOS",
            color = neon,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )

        Box(
            modifier = Modifier
                .size(210.dp)
                .background(neon.copy(alpha = 0.12f), CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = if (active) "ACTIVE" else "STANDBY",
                color = neon,
                fontSize = 22.sp
            )
        }

        Text(
            text = "MODE: $mode",
            color = Color.White
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            listOf("STANDARD", "AUTO", "ULTRA").forEach {
                Button(
                    onClick = { mode = it },
                    contentPadding = PaddingValues(8.dp)
                ) {
                    Text(it, fontSize = 10.sp)
                }
            }
        }

        Button(onClick = { active = !active }) {
            Text(if (active) "STOP" else "ACTIVATE KHEOS")
        }

        Text(
            text = "KHEOS SYSTEM v1.0",
            color = Color.Gray,
            fontSize = 12.sp
        )
    }
}
