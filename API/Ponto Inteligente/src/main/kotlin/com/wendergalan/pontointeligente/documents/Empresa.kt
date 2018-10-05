package com.wendergalan.pontointeligente.documents

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Ponto Inteligente
 * Wender Galan
 * Todos os direitos reservados ©
 **********************************************
 * Nome do arquivo: Empresa.java
 * Criado por : Wender Galan
 * Data da criação : 05/10/2018
 * Observação :
 **********************************************
 */
@Document
data class Empresa( //operador data representa os "getters e setters"
        val razaoSocial: String, //var é variavel, já val é constante imutavel
        val cnpj: String,
        @Id val id: String? = null
)

