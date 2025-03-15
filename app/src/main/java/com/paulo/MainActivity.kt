package com.paulo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import com.paulo.models.Produto

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val p = Produto(1, "Bruuno", 24.5, 100)
        setContent {
            Column {
                p.ExibirDetalhes()
            }
        }
    }
}
