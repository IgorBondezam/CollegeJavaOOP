package CodigoCotacaoSeguros.enums;

public enum TipoPortaoEstacionamento {

    SEM_ESTACIONAMENTO(1D),
    PORTAO_AUTOMATICO(0.045),
    PORTAO_MANUAL(0.02);

    private Double porcentagemPorPortao;

    TipoPortaoEstacionamento(Double porcentagemPorPortao){
        this.porcentagemPorPortao = porcentagemPorPortao;
    }

    public  Double getPorcentagemPorPortao(){
        return porcentagemPorPortao;
    }
}
