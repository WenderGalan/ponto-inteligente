package com.wendergalan.pontointeligente.dtos

import org.hibernate.validator.constraints.Length
import org.hibernate.validator.constraints.br.CNPJ
import org.hibernate.validator.constraints.br.CPF
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty

/**
 * Ponto Inteligente
 * Wender Galan LTDA
 * Todos os direitos reservados ©
 **********************************************
 * Nome do arquivo: CadastroPJDto.java
 * Criado por : Wender Galan
 * Data da criação : 05/10/2018
 * Observação :
 **********************************************
 */
data class CadastroPJDto(

        @get:NotEmpty(message = "Nome não pode ser vazio")
        @get:Length(min = 3, max = 200, message = "Nome deve conter entre {min} e {max} caracteres.")
        val nome: String = "",

        @get:NotEmpty(message = "Email não pode ser vazio")
        @get:Length(min = 5, max = 200, message = "Email deve conter entre {min} e {max} caracteres.")
        @get:Email(message = "Email inválido")
        val email: String = "",

        @get:NotEmpty(message = "Senha não pode ser vazia")
        val senha: String = "",

        @get:NotEmpty(message = "CPF não pode ser vazio")
        @get:CPF(message = "CPF inválido")
        val cpf: String = "",

        @get:NotEmpty(message = "CNPJ não pode ser vazio")
        @get:CNPJ(message = "CNPJ inválido")
        val cnpj: String = "",

        @get:NotEmpty(message = "Razão social não pode ser vazio")
        @get:Length(min = 5, max = 200, message = "Razão social deve conter entre {min} e {max} caracteres.")
        val razaoSocial: String = "",

        val id: String? = null

)