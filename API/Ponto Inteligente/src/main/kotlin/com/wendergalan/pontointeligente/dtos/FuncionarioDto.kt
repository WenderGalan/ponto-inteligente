package com.wendergalan.pontointeligente.dtos

import org.hibernate.validator.constraints.Length
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty

/**
 * Ponto Inteligente
 * Wender Galan LTDA
 * Todos os direitos reservados ©
 **********************************************
 * Nome do arquivo: FuncionarioDto.java
 * Criado por : Wender Galan
 * Data da criação : 05/10/2018
 * Observação :
 **********************************************
 */
data class FuncionarioDto(

        @get:NotEmpty(message = "Nome não pode ser vazio")
        @get:Length(min = 3, max = 200, message = "Nome deve conter entre {min} e {max} caracteres.")
        val nome: String = "",

        @get:NotEmpty(message = "Email não pode ser vazio")
        @get:Length(min = 5, max = 200, message = "Email deve conter entre {min} e {max} caracteres.")
        @get:Email(message = "Email inválido")
        val email: String = "",

        val senha: String? = null,
        val valorHora: String? = null,
        val qtdHorasTrabalhoDia: String? = null,
        val qtdHorasAlmoco: String? = null,
        val id: String? = null

)