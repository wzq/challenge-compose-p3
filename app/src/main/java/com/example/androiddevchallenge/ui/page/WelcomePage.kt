package com.example.androiddevchallenge.ui.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.androiddevchallenge.R

/**
 * create by wzq on 2021/3/15
 *
 */
@Composable
fun WelcomePage() {
    Surface(color = MaterialTheme.colors.primary, modifier = Modifier.fillMaxSize()) {
        Image(
            contentScale = ContentScale.FillBounds,
            painter = painterResource(id = R.drawable.ic_light_welcome_bg),
            contentDescription = null
        )
        Image(
            contentScale = ContentScale.Fit,
            painter = painterResource(id = R.drawable.ic_light_welcome_illos),
            contentDescription = null,
            alignment = Alignment.CenterEnd,
        )
    }
}