package CodigoCotacaoSeguros.dao;

import CodigoCotacaoSeguros.enums.EstadoCivil;
import CodigoCotacaoSeguros.service.Cotacao;

public class Motorista extends Pessoa implements Cotacao {

    private Automovel veiculo;

    public Motorista(Automovel veiculo, String nome, Casa casa, EstadoCivil estadoCivil){
        super(nome, casa, estadoCivil);
        this.veiculo = veiculo;
    }

    public Automovel getVeiculo() {
        return veiculo;
    }

    @Override
    public Double calcularCotacao() {
        return ((veiculo.getTipo().getPorcentagemTabelaFipe() +
                getEstadoCivil().getPorcentagemTabelaFipe()) * veiculo.getValorBase()) /
                getCasa().getEstacionamento().getPorcentagemPorPortao();
    }
}
