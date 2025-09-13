package br.com.eteczl.minhalista

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.eteczl.minhalista.ui.theme.MinhaListaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Aqui chamamos o tema e a tela principal
        setContent {
            MinhaListaTheme {
                MinhaListaFavorita()
            }
        }
    }
}

@Composable
fun MinhaListaFavorita() {
    Column(modifier = Modifier.padding(16.dp)) {
        // Título da lista
        Text(
            text = "📝 Minha Lista de Coisas Favoritas",
            fontSize = 22.sp
        )

        // Lista de itens
        val lista = listOf(
            "Café ☕",
            "Programar 💻",
            "Pizza 🍕",
            "Música 🎵",
            "Dormir 😴",
            "Passear 🚶‍♂️",
            "Ler 📚",
            "Viajar 🧳",
            "Cinema 🎞️",
            "Praia 🏖️",
            "Campo 🏡",
            "Pôr-do-sol 🌄"
        )

        // Mostra cada item da lista
        lista.forEach { item ->
            Text(
                text = "• $item",
                fontSize = 18.sp,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }
}
