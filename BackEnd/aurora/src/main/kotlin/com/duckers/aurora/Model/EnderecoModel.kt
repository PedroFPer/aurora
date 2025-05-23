package com.duckers.aurora.Model

class EnderecoModel {
    private var enderecoId: Int? = null
    private var clienteId: Int? = null
    private var rua: String = ""
    private var numero: String = ""
    private var complemento: String = ""
    private var bairro: String = ""
    private var cidade: String = ""
    private var estado: String = ""
    private var cep: String = ""

    constructor(
        clienteId: Int,
        rua: String,
        numero: String,
        complemento: String,
        bairro: String,
        cidade: String,
        estado: String,
        cep: String
    ) {
        this.clienteId = clienteId
        this.rua = rua
        this.numero = numero
        this.complemento = complemento
        this.bairro = bairro
        this.cidade = cidade
        this.estado = estado
        this.cep = cep
    }
}