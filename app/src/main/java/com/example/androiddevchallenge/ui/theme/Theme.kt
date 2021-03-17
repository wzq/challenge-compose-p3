/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import com.example.androiddevchallenge.R

private val DarkColorPalette = darkColors(
    primary = green900,
    primaryVariant = green900,
    secondary = green300,
    background = gray,
    surface = whiteP15,
    onPrimary = Color.White,
    onSecondary = gray,
    onBackground = Color.White,
    onSurface = whiteP85,
)

private val LightColorPalette = lightColors(
    primary = pink100,
    primaryVariant = pink100,
    secondary = pink900,
    background = Color.White,
    surface = whiteP85,
    onPrimary = Color.Gray,
    onSecondary = Color.White,
    onBackground = Color.Gray,
    onSurface = Color.Gray,
)

val elevations = Elevations()

val DarkImages = Images(
    logo = R.drawable.ic_dark_logo,
    welcomeBg = R.drawable.ic_dark_welcome_bg,
    welcomeImg = R.drawable.ic_dark_welcome_illos
)

val LightImages = Images(
    logo = R.drawable.ic_light_logo,
    welcomeBg = R.drawable.ic_light_welcome_bg,
    welcomeImg = R.drawable.ic_light_welcome_illos
)

@Composable
fun BloomTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    val images = if (darkTheme) DarkImages else LightImages
    CompositionLocalProvider(
        LocalElevations provides elevations,
        LocalImages provides images
    ) {
        MaterialTheme(
            colors = colors,
            typography = typography,
            shapes = shapes,
            content = content
        )
    }

}

object BloomTheme {

    /**
     * Proxy to [MaterialTheme]
     */
    val colors: Colors
        @Composable
        get() = MaterialTheme.colors

    /**
     * Proxy to [MaterialTheme]
     */
    val typography: Typography
        @Composable
        get() = MaterialTheme.typography

    /**
     * Proxy to [MaterialTheme]
     */
    val shapes: Shapes
        @Composable
        get() = MaterialTheme.shapes

    /**
     * Retrieves the current [Elevations] at the call site's position in the hierarchy.
     */
    val elevations: Elevations
        @Composable
        get() = LocalElevations.current

    /**
     * Retrieves the current [Images] at the call site's position in the hierarchy.
     */
    val images: Images
        @Composable
        get() = LocalImages.current
}
