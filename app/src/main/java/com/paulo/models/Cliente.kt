package com.paulo.models

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class Cliente (
    val id: Int,
    val nome: String,
    val saldo: Double
){
    @Composable
    fun AdicionarSaldo(valor: Double){
        Text(
            text = "$id\t$nome\t$saldo"
        )
    }
}