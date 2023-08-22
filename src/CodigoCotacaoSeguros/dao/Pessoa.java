package CodigoCotacaoSeguros.dao;

import CodigoCotacaoSeguros.enums.EstadoCivil;

public class Pessoa {

    private String nome;
    private Casa casa;
    private EstadoCivil estadoCivil;

    public Pessoa(){}

    public Pessoa(String nome, Casa casa, EstadoCivil estadoCivil){
        this.nome = nome;
        this.casa = casa;
        this.estadoCivil = estadoCivil;
    }

    public String getNome() {
        return nome;
    }

    public Casa getCasa() {
        return casa;
    }

    public EstadoCivil getEstadoCivil(){
        return estadoCivil;
    }
}
