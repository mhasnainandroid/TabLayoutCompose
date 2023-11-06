package com.elexoft.tablayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.elexoft.tablayout.genericLayouts.CollapsingLayout

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainContent() {
    Scaffold(
        topBar = {
            TopBar(
                name = "mhasnain", modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Green)
                    .padding(vertical = 16.dp)
            )
        },
        content = {
            CollapsingLayout(modifier = Modifier
                .fillMaxWidth()
                .padding(it),
                collapsingTop = {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "Collpasing Header")
                    }
                }, bodyContent = { TabContent() })
        }
    )
}