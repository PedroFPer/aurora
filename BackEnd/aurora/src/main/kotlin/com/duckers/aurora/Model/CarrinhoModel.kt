package com.duckers.aurora.Model

class CarrinhoModel {
    private var carrinhoId: Int? = null
    private var clienteId: Int? = null
    private var dataCriacao: String = ""
    private var status: String = ""
    private var valorTotal: Double = 0.0


    constructor(clienteId: Int, dataCriacao: String, status: String, valorTotal: Double) {
        this.clienteId = clienteId
        this.dataCriacao = dataCriacao
        this.status = status
        this.valorTotal = valorTotal
    }
}