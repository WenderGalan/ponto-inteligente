package com.wendergalan.pontointeligente.services.impl

import com.wendergalan.pontointeligente.documents.Lancamento
import com.wendergalan.pontointeligente.repositories.LancamentoRepository
import com.wendergalan.pontointeligente.services.LancamentoService
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service

/**
 * Ponto Inteligente
 * Wender Galan LTDA
 * Todos os direitos reservados ©
 **********************************************
 * Nome do arquivo: LancamentoServiceImpl.java
 * Criado por : Wender Galan
 * Data da criação : 05/10/2018
 * Observação :
 **********************************************
 */
@Service
class LancamentoServiceImpl(val lancamentoRepository: LancamentoRepository) : LancamentoService{
    override fun buscarPorFuncionarioId(funcionarioId: String, pageRequest: PageRequest): Page<Lancamento> =
            lancamentoRepository.findByFuncionarioId(funcionarioId, pageRequest)

    override fun buscarPorId(id: String): Lancamento? = lancamentoRepository.findOne(id)

    override fun persistir(lancamento: Lancamento): Lancamento = lancamentoRepository.save(lancamento)

    override fun remover(lancamento: Lancamento) = lancamentoRepository.delete(lancamento)
}