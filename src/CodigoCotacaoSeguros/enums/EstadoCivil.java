package CodigoCotacaoSeguros.enums;

public enum EstadoCivil {

    SOLTEIRO(1.08),
    DIVORCIADO(1.08),
    CASADO(0.025),
    UNIAO_ESTAVEL(0.025),
    VIUVO(0.05);

    private Double porcentagemTabelaFipe;

    EstadoCivil(Double porcentagemTabelaFipe){
        this.porcentagemTabelaFipe = porcentagemTabelaFipe;
    }

    public  Double getPorcentagemTabelaFipe(){
        return porcentagemTabelaFipe;
    }

}
