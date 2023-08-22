package CodigoCotacaoSeguros.dao;

import CodigoCotacaoSeguros.enums.TipoPortaoEstacionamento;

public class Casa {

    private TipoPortaoEstacionamento estacionamento;

    public Casa(TipoPortaoEstacionamento estacionamento){
        this.estacionamento = estacionamento;
    }

    public TipoPortaoEstacionamento getEstacionamento(){
        return estacionamento;
    }

}
