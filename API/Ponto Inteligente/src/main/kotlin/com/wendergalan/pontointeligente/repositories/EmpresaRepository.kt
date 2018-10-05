package com.wendergalan.pontointeligente.repositories

import com.wendergalan.pontointeligente.documents.Empresa
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Ponto Inteligente
 * Wender Galan
 * Todos os direitos reservados ©
 **********************************************
 * Nome do arquivo: EmpresaRepository.java
 * Criado por : Wender Galan
 * Data da criação : 05/10/2018
 * Observação :
 **********************************************
 */
interface EmpresaRepository : MongoRepository<Empresa, String>{

    fun findByCnpj(cnpj: String) : Empresa

}