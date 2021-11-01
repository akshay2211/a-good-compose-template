package io.ak1.template.ui.components

import android.view.Window
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.ak1.template.ui.theme.TemplateTheme
import io.ak1.template.ui.theme.isSystemInDarkThemeCustom
import io.ak1.template.ui.theme.statusBarConfig

/**
 * Created by akshay on 01/11/21
 * https://ak1.io
 */

@Composable
fun RootComponent(window : Window){
    val isDark = isSystemInDarkThemeCustom()
    TemplateTheme {
        window.statusBarConfig(isDark)
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
            Greeting("Android")
        }
    }
}
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TemplateTheme {
        Greeting("Android")
    }
}