package com.wendergalan.pontointeligente.utils

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

/**
 * Ponto Inteligente
 * Wender Galan LTDA
 * Todos os direitos reservados ©
 **********************************************
 * Nome do arquivo: SenhaUtils.java
 * Criado por : Wender Galan
 * Data da criação : 05/10/2018
 * Observação :
 **********************************************
 */
class SenhaUtils {

    //gera uma senha com o Bcrypt
    fun gerarBcrypt(senha: String): String = BCryptPasswordEncoder().encode(senha)

}