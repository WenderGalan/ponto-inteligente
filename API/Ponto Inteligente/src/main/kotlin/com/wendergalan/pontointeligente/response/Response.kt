package com.wendergalan.pontointeligente.response

/**
 * Ponto Inteligente
 * Wender Galan LTDA
 * Todos os direitos reservados ©
 **********************************************
 * Nome do arquivo: Response.java
 * Criado por : Wender Galan
 * Data da criação : 05/10/2018
 * Observação :
 **********************************************
 */
class Response<T> (
    val erros: ArrayList<String> = arrayListOf(),
    var data: T? = null
)