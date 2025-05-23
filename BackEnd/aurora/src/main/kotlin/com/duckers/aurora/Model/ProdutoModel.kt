package com.duckers.aurora.Model

import java.math.BigDecimal
import java.time.LocalDate

class ProdutoModel {
    private var id:Int=0;
    private var nome: String="";
    private var descricao: String="";
    private var precoUnitario: BigDecimal= BigDecimal.ZERO;
    private var quantidadeEstoque:Int=0;
    private var categoria:String="";
    private var imagem:String="";
    private var dataCriacao: LocalDate?=null;
    private var dataAtualizacao: LocalDate?=null;

    constructor(
        nome: String,
        descricao: String,
        precoUnitario: BigDecimal,
        quantidadeEstoque: Int,
        categoria: String,
        imagem: String,
        dataCriacao: LocalDate?,
        dataAtualizacao: LocalDate?
    ) {
        this.nome = nome
        this.descricao = descricao
        this.precoUnitario = precoUnitario
        this.quantidadeEstoque = quantidadeEstoque
        this.categoria = categoria
        this.imagem = imagem
        this.dataCriacao = dataCriacao
        this.dataAtualizacao = dataAtualizacao
    }
}