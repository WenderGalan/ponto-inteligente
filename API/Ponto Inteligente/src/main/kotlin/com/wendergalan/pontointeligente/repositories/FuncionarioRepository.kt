package com.wendergalan.pontointeligente.repositories

import com.wendergalan.pontointeligente.documents.Funcionario
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query

/**
 * Ponto Inteligente
 * Wender Galan
 * Todos os direitos reservados ©
 **********************************************
 * Nome do arquivo: FuncionarioRepository.java
 * Criado por : Wender Galan
 * Data da criação : 05/10/2018
 * Observação :
 **********************************************
 */
interface FuncionarioRepository : MongoRepository<Funcionario, String> {

    fun findByEmail(email: String): Funcionario

    fun findByCpf(cpf: String): Funcionario

    @Query(value = "{id : ?0}")
    fun findOne(id: String): Funcionario

}