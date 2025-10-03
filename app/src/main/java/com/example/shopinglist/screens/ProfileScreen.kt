package com.example.shopinglist.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.shopinglist.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(WindowInsets.safeDrawing.asPaddingValues())
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // 🔹 Card utama
        Card(
            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(6.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surface
            ),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(20.dp)
            ) {
                // Foto profil bulat
                Image(
                    painter = painterResource(id = R.drawable.profile_foto),
                    contentDescription = "Foto Profil",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(120.dp)
                        .clip(CircleShape)
                )

                Spacer(modifier = Modifier.height(12.dp))

                // Nama & NIM
                Text(
                    text = "Ridho Dwi Syahputra",
                    style = MaterialTheme.typography.titleLarge
                )
                Text(
                    text = "NIM: 2311522033",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                Spacer(modifier = Modifier.height(20.dp))

                // 🔹 Petak info (Card kecil rounded)
                InfoCard(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = null) },
                    title = "Hobi",
                    value = "Ngoding, Nge Gym"
                )
                Spacer(modifier = Modifier.height(12.dp))
                InfoCard(
                    icon = { Icon(Icons.Default.CalendarMonth, contentDescription = null) },
                    title = "Tempat/Tanggal Lahir",
                    value = "Melbourne, 9 Desember 2010"
                )
                Spacer(modifier = Modifier.height(12.dp))
                InfoCard(
                    icon = { Icon(Icons.Default.Star, contentDescription = null) },
                    title = "Peminatan",
                    value = "Web Programming"
                )
            }
        }
    }
}

@Composable
fun InfoCard(
    icon: @Composable () -> Unit,
    title: String,
    value: String
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        ),
        modifier = Modifier.fillMaxWidth()
    ) {
        ListItem(
            leadingContent = icon,
            headlineContent = { Text(title) },
            supportingContent = { Text(value) }
        )
    }
}
