package com.duckers.aurora.Model

class ItemCarrinhoModel {
    private var itemId: Int? = null
    private var carrinhoId: Int? = null
    private var produtoId: Int? = null
    private var quantidade: Int = 0
    private var precoUnitario: Double = 0.0

    constructor(carrinhoId: Int, produtoId: Int, quantidade: Int, precoUnitario: Double) {
        this.carrinhoId = carrinhoId
        this.produtoId = produtoId
        this.quantidade = quantidade
        this.precoUnitario = precoUnitario
    }
}