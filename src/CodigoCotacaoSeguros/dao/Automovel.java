package CodigoCotacaoSeguros.dao;

import CodigoCotacaoSeguros.enums.TipoAutomovel;

public class Automovel {

    private Double valorBase;

    private TipoAutomovel tipo;

    public Automovel(Double valorBase, TipoAutomovel tipo) {
        this.valorBase = valorBase;
        this.tipo = tipo;
    }

    public Automovel() {
    }

    public Double getValorBase() {
        return valorBase;
    }

    public TipoAutomovel getTipo() {
        return tipo;
    }
}
