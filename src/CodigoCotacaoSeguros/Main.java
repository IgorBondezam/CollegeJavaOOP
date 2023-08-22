package CodigoCotacaoSeguros;

import CodigoCotacaoSeguros.dao.Automovel;
import CodigoCotacaoSeguros.dao.Casa;
import CodigoCotacaoSeguros.dao.Motorista;
import CodigoCotacaoSeguros.enums.EstadoCivil;
import CodigoCotacaoSeguros.enums.TipoAutomovel;
import CodigoCotacaoSeguros.enums.TipoPortaoEstacionamento;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Automovel>  automoveis = adicionarAutomovel();


        Motorista joao = new Motorista(automoveis.get("busao"), "João",
                new Casa(TipoPortaoEstacionamento.PORTAO_AUTOMATICO), EstadoCivil.SOLTEIRO);

        System.out.printf("%.2f", joao.calcularCotacao());

    }

    private static HashMap<String, Automovel>  adicionarAutomovel(){
        HashMap<String, Automovel> automoveis = new HashMap<>();
        automoveis.put("gol", new Automovel(15000D, TipoAutomovel.PASSEIO));
        automoveis.put("uno", new Automovel(12000D, TipoAutomovel.PASSEIO_PROFISSIONAL));
        automoveis.put("caminhao", new Automovel(25000D, TipoAutomovel.CARGA));
        automoveis.put("busao", new Automovel(25000D, TipoAutomovel.TRANSPORTE));
        return automoveis;
    }
}
