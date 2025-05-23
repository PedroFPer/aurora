package com.duckers.aurora.Model

class SimulacaoCompraModel {
    private var simulacaoId: Int? = null
    private var clienteId: Int? = null
    private var dataSimulacao: String = ""
    private var valorTotal: Double = 0.0
    private var itens: List<Any> = ArrayList()

    constructor(clienteId: Int, dataSimulacao: String, valorTotal: Double, itens: List<Any>) {
        this.clienteId = clienteId
        this.dataSimulacao = dataSimulacao
        this.valorTotal = valorTotal
        this.itens = itens
    }
}