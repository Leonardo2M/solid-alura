package src.br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

    private DadosPessoais dadosPessoais;
    private LocalDate dataUltimoReajuste;

    public Funcionario(DadosPessoais dadosPessoais, LocalDate dataUltimoReajuste) {
        this.dadosPessoais = dadosPessoais;
        this.dataUltimoReajuste = dataUltimoReajuste;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public LocalDate getDataUltimoReajuste() {
        return dataUltimoReajuste;
    }

    public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
        this.dataUltimoReajuste = dataUltimoReajuste;
    }

    public void atualizarSalario(BigDecimal salarioReajustado) {
        this.dadosPessoais.setSalario(salarioReajustado);
        this.dataUltimoReajuste = LocalDate.now();
    }

    public void promover(Cargo novoCargo) {
        this.dadosPessoais.setCargo(novoCargo);
    }
}
