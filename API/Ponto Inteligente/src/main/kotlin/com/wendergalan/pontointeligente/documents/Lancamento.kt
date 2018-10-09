package com.wendergalan.pontointeligente.documents

import com.wendergalan.pontointeligente.enums.TipoEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

/**
 * Ponto Inteligente
 * Wender Galan
 * Todos os direitos reservados ©
 **********************************************
 * Nome do arquivo: Lancamento.java
 * Criado por : Wender Galan
 * Data da criação : 05/10/2018
 * Observação :
 **********************************************5bbcb580597d4eb2117323c5
 */
@Document
data class Lancamento(
        val data: Date,
        val tipo: TipoEnum,
        val funcionarioId: String,
        val descricao: String? = "",
        val localizacao: String? = "",
        @Id val id: String? = null
)

