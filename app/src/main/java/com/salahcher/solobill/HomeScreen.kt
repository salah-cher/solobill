package com.salahcher.solobill

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("SoloBill") },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color.Red,
                    titleContentColor = Color.White
                )
            )
        },
        content = { innerPadding ->
            HomeScreenContent(innerPadding = innerPadding, navController = navController)
        }
    )
}

@Composable
fun HomeScreenContent(innerPadding: PaddingValues, navController: NavController) {
    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Logo Section
        Image(
            painter = painterResource(R.drawable.solobill_logo),
            contentDescription = "SoloBill Logo",
            modifier = Modifier.size(120.dp) // Adjust size as needed
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Welcome Text
        Text(
            text = "Welcome to SoloBill",
            style = MaterialTheme.typography.titleMedium // Replace with a valid TextStyle
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Button to Navigate to Create Invoice Screen
        Button(
            onClick = {
                navController.navigate("createInvoice")
            },
            modifier = Modifier.fillMaxWidth(0.8f)
        ) {
            Text(text = "Create Invoice")
        }
    }
}