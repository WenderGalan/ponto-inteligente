package com.wendergalan.pontointeligente.dtos

import javax.validation.constraints.NotEmpty

/**
 * Ponto Inteligente
 * TDR Informática Ltda
 * Todos os direitos reservados ©
 **********************************************
 * Nome do arquivo: LancamentoDto.java
 * Criado por : Wender Galan
 * Data da criação : 05/10/2018
 * Observação :
 **********************************************
 */
data class LancamentoDto(

        @get:NotEmpty(message = "Data não pode ser vazia.")
        val data: String? = null,

        @get:NotEmpty(message = "Tipo não pode ser vazio.")
        val tipo: String? = null,

        val descricao: String? = null,
        val localizacao: String? = null,
        val funcionarioId: String? = null,
        var id: String? = null
)