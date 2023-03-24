package src.br.com.alura.rh.service.validacoesAumento;

import src.br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;

public interface Validacao {

    void validar(Funcionario funcionario, BigDecimal aumento);

}
