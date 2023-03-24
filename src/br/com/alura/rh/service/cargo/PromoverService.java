package src.br.com.alura.rh.service.cargo;

import src.br.com.alura.ValidacaoException;
import src.br.com.alura.rh.model.Cargo;
import src.br.com.alura.rh.model.Funcionario;

public class PromoverService {

    public void promover(Funcionario funcionario, boolean metaCumprida) {
        Cargo cargoAtual = funcionario.getDadosPessoais().getCargo();
        if(cargoAtual == Cargo.GERENTE) {
            throw new ValidacaoException("Não é possivel promover!");
        }

        if(!metaCumprida) {
            throw new ValidacaoException("Meta não alcançada!");
        }
        Cargo novoCargo = cargoAtual.getProximoCargo();
        funcionario.promover(novoCargo);

    }

}
