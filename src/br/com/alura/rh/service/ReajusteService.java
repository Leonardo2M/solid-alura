package src.br.com.alura.rh.service;

import src.br.com.alura.ValidacaoException;
import src.br.com.alura.rh.model.Funcionario;
import src.br.com.alura.rh.service.validacoesAumento.Validacao;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReajusteService {

    private List<Validacao> validador = new ArrayList<>();

    public ReajusteService(List<Validacao> validador) {
        this.validador = validador;
    }

    public void reajustar(Funcionario funcionario, BigDecimal aumento) {

        this.validador.forEach(v -> v.validar(funcionario, aumento));

        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
