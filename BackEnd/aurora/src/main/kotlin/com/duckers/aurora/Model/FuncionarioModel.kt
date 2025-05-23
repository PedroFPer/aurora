package com.duckers.aurora.Model

import com.duckers.aurora.Enum.Cargo
import java.time.LocalDate

class FuncionarioModel {
    private var id:Int=0;
    private var nomeCompleto:String="";
    private var email:String="";
    private var senha:String="";
    private var telefone:String="";
    private var dataContratacao: LocalDate?=null;
    private var cargo: Cargo? =null;
    private var status: String="";

    constructor(
        nomeCompleto: String,
        email: String,
        senha: String,
        telefone: String,
        dataContratacao: LocalDate?,
        cargo: Cargo?,
        status: String
    ) {
        this.nomeCompleto = nomeCompleto
        this.email = email
        this.senha = senha
        this.telefone = telefone
        this.dataContratacao = dataContratacao
        this.cargo = cargo
        this.status = status
    }
}