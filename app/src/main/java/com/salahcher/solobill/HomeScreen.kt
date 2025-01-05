package com.salahcher.solobill

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("SoloBill") }
            )
        }
    ) { innerPadding ->
        HomeScreenContent(innerPadding)
    }
}

@Composable
fun HomeScreenContent(innerPadding: PaddingValues) {
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
            modifier = Modifier
                .size(120.dp) // Adjust size as needed
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Welcome Text
        Text(
            text = "Welcome to SoloBill",
            style = MaterialTheme.typography.h5
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Button to Navigate to Create Invoice Screen
        Button(
            onClick = {
                // TODO: Add navigation to Create Invoice Screen
            },
            modifier = Modifier.fillMaxWidth(0.8f)
        ) {
            Text(text = "Create Invoice")
        }
    }
}