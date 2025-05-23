package com.duckers.aurora.Model

class ClienteModel {
    private var id:Int?=null;
    private var nomeCompleto:String="";
    private var email:String="";
    private var senha:String="";
    private var telefone:String="";

    public constructor( nomeCompleto: String, email: String, senha: String, telefone: String) {

        this.nomeCompleto = nomeCompleto
        this.email = email
        this.senha = senha
        this.telefone = telefone
    }

}