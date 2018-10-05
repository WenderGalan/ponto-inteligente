package com.wendergalan.pontointeligente.services

import com.wendergalan.pontointeligente.documents.Empresa
import com.wendergalan.pontointeligente.repositories.EmpresaRepository
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.BDDMockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner

/**
 * Ponto Inteligente
 * Wender Galan LTDA
 * Todos os direitos reservados ©
 **********************************************
 * Nome do arquivo: EmpresaServiceTest.java
 * Criado por : Wender Galan
 * Data da criação : 05/10/2018
 * Observação :
 **********************************************
 */
@RunWith(SpringRunner::class)
@SpringBootTest
class EmpresaServiceTest {

    @Autowired
    val empresaService: EmpresaService? = null

    @MockBean
    private val empresaRepository: EmpresaRepository? = null

    private val CNPJ = "51463645000100"

    @Before
    @Throws(Exception::class)
    fun setUp() {
        BDDMockito.given(empresaRepository?.findByCnpj(CNPJ)).willReturn(empresa())
        BDDMockito.given(empresaRepository?.save(empresa())).willReturn(empresa())
    }

    @Test
    fun testBuscarEmpresaPorCnpj() {
        val empresa: Empresa? = empresaService?.buscarPorCnpj(CNPJ)
        Assert.assertNotNull(empresa)
    }

    @Test
    fun testPersistirEmpresa() {
        val empresa: Empresa? = empresaService?.persistir(empresa())
        Assert.assertNotNull(empresa)
    }

    private fun empresa(): Empresa = Empresa("Razão Social", CNPJ, "1")
}