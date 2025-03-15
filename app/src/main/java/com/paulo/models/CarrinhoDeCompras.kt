package com.paulo.models

class CarrinhoDeCompras {
    var listaProdutos = mutableListOf<Produto>()

    fun adicionarProduto(produto: Produto, quantidade: Int) {
        // Pair(produto,quantidade)
        for (i in 1..quantidade) {
            listaProdutos.add(produto)
        }
    }

    fun removerProduto(produto: Produto) {}
    fun exibirCarrinho() {}
    fun calcularTotal() {}
}
