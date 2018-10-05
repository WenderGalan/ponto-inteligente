package com.wendergalan.pontointeligente.services

import com.wendergalan.pontointeligente.documents.Empresa

/**
 * Ponto Inteligente
 * Wender Galan LTDA
 * Todos os direitos reservados ©
 **********************************************
 * Nome do arquivo: EmpresaService.java
 * Criado por : Wender Galan
 * Data da criação : 05/10/2018
 * Observação :
 **********************************************
 */
interface EmpresaService {

    fun buscarPorCnpj(cnpj: String) : Empresa?

    fun persistir(empresa: Empresa): Empresa

}