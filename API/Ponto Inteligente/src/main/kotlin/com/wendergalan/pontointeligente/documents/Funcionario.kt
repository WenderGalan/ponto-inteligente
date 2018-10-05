package com.wendergalan.pontointeligente.documents

import com.wendergalan.pontointeligente.enums.PerfilEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Ponto Inteligente
 * Wender Galan
 * Todos os direitos reservados ©
 **********************************************
 * Nome do arquivo: Funcionario.java
 * Criado por : Wender Galan
 * Data da criação : 05/10/2018
 * Observação :
 **********************************************
 */
@Document
data class Funcionario(
        val nome: String,
        val email: String,
        val senha: String,
        val cpf: String,
        val perfil: PerfilEnum,
        val empresaId: String,
        val valorHora: Double? = 0.0,
        val qtdHorasTrabalhoDia: Float? = 0.0f,
        val qtdHorasAlmoco: Float? = 0.0f,
        @Id val id: String? = null
)