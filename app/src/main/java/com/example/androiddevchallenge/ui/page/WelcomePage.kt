package com.example.androiddevchallenge.ui.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.BloomTheme
import com.example.androiddevchallenge.ui.theme.typography
import com.example.androiddevchallenge.ui.weidget.AccountButton

/**
 * create by wzq on 2021/3/15
 *
 */
@Composable
fun WelcomePage() {
    Surface(color = BloomTheme.colors.primary) {
        Image(
            contentScale = ContentScale.FillBounds,
            painter = painterResource(id = BloomTheme.images.logo),
            contentDescription = null
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 72.dp),
        ) {
            Image(
                painter = painterResource(id = BloomTheme.images.welcomeBg),
                contentDescription = null,
                modifier = Modifier.offset(x = 88.dp)
            )
            Spacer(modifier = Modifier.height(48.dp))
            Image(
                painter = painterResource(id = BloomTheme.images.welcomeImg),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                alignment = Alignment.Center
            )
            Box(
                contentAlignment = Alignment.BottomCenter,
                modifier = Modifier
                    .height(32.dp)
                    .fillMaxWidth()

            ) {
                Text(
                    text = "Beautiful home garden solutions",
                    style = typography.subtitle1,
                )
            }
            Spacer(modifier = Modifier.height(40.dp))
            AccountButton()
            Text(
                text = "Log in",
                Modifier.fillMaxWidth().padding(16.dp),
                textAlign = TextAlign.Center,
                color = BloomTheme.colors.secondary
            )
        }

    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    BloomTheme {
        WelcomePage()
    }
}