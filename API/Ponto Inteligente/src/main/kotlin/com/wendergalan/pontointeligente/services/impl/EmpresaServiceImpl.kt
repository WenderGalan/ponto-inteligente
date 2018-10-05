package com.wendergalan.pontointeligente.services.impl

import com.wendergalan.pontointeligente.documents.Empresa
import com.wendergalan.pontointeligente.repositories.EmpresaRepository
import com.wendergalan.pontointeligente.services.EmpresaService
import org.springframework.stereotype.Service

/**
 * Ponto Inteligente
 * Wender Galan LTDA
 * Todos os direitos reservados ©
 **********************************************
 * Nome do arquivo: EmpresaServiceImpl.java
 * Criado por : Wender Galan
 * Data da criação : 05/10/2018
 * Observação : Kotlin recomenda não utilizar o autowired
 * para nao ter que injetar a dependencia via @Autowired
 **********************************************
 */
@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService {

    override fun buscarPorCnpj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)

}