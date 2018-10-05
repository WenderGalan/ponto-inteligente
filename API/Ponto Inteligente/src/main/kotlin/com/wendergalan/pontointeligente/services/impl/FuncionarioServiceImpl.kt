package com.wendergalan.pontointeligente.services.impl

import com.wendergalan.pontointeligente.documents.Funcionario
import com.wendergalan.pontointeligente.repositories.FuncionarioRepository
import com.wendergalan.pontointeligente.services.FuncionarioService
import org.springframework.stereotype.Service

/**
 * Ponto Inteligente
 * Wender Galan LTDA
 * Todos os direitos reservados ©
 **********************************************
 * Nome do arquivo: FuncionarioServiceImpl.java
 * Criado por : Wender Galan
 * Data da criação : 05/10/2018
 * Observação :
 **********************************************
 */
@Service
class FuncionarioServiceImpl(val funcionarioRepository: FuncionarioRepository) : FuncionarioService {

    override fun persistir(funcionario: Funcionario): Funcionario = funcionarioRepository.save(funcionario)

    override fun buscarPorCpf(cpf: String): Funcionario? = funcionarioRepository.findByCpf(cpf)

    override fun buscarPorEmail(email: String): Funcionario? = funcionarioRepository.findByEmail(email)

    override fun buscarPorId(id: String): Funcionario? = funcionarioRepository.findOne(id)
}