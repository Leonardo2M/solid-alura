package src.br.com.alura.rh.service.validacoesAumento;

import src.br.com.alura.ValidacaoException;
import src.br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPorPeriodo implements Validacao{

    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimo = funcionario.getDataUltimoReajuste();
        LocalDate dataHoje = LocalDate.now();
        long diferenca = ChronoUnit.MONTHS.between(dataUltimo, dataHoje);

        if(diferenca < 6) {
            throw new ValidacaoException("Intervalo de reajuste menor que 6 meses!");
        }

    }
}
