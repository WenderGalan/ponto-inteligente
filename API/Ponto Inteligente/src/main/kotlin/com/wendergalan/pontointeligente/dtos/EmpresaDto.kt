package com.wendergalan.pontointeligente.dtos

/**
 * Ponto Inteligente
 * Wender Galan LTDA
 * Todos os direitos reservados ©
 **********************************************
 * Nome do arquivo: EmpresaDto.java
 * Criado por : Wender Galan
 * Data da criação : 05/10/2018
 * Observação :
 **********************************************
 */
data class EmpresaDto(
        val razaoSocial: String,
        val cnpj: String,
        val id: String? = null
)