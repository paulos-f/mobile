package com.paulo.models

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class Produto (
    val id: Int,
    val nome: String,
    var preco: Double,
    var estoque: Int
){
    @Composable
    fun ExibirDetalhes(){
        Text(
            text = "$id\t$nome\t$preco\t$estoque"
        )
    }
}
