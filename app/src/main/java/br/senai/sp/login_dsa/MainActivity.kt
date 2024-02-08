package br.senai.sp.login_dsa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.login_dsa.ui.theme.LoginDSATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginDSATheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Teste()
                }
            }
        }
    }
}

@Composable
fun Teste() {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Color(0xFA8A1C1C)
    ) {
        Box (
            modifier = Modifier
                .background(
                    color = Color(0xFF00BCD4),
                )

        ){
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Aulinha de Kotlin com Celso Furtado",)
                Text(text = "Aulinha de Kotlin com Celso Furtado",)
                Text(text = "Aulinha de Kotlin com Celso Furtado",)
                Text(text = "Aulinha de Kotlin com Celso Furtado",)
                Text(text = "Aulinha de Kotlin com Celso Furtado",)
                Row {
                    Button(onClick = { /*TODO*/ }) {
                        
                    }
                    Button(onClick = { /*TODO*/ }) {
                        
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun TestePreview() {
    LoginDSATheme {
        Teste()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LoginDSATheme {
        Greeting("Android")
    }
}