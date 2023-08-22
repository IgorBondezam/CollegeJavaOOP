package CodigoCotacaoSeguros.enums;

public enum TipoAutomovel {

    PASSEIO(0.12),
    PASSEIO_PROFISSIONAL(0.143),
    TRANSPORTE(0.135),
    CARGA(0.08);

    private Double porcentagemTabelaFipe;

    TipoAutomovel(Double porcentagemTabelaFipe){
        this.porcentagemTabelaFipe = porcentagemTabelaFipe;
    }

    public  Double getPorcentagemTabelaFipe(){
        return porcentagemTabelaFipe;
    }
}
