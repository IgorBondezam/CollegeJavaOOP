package atividade_01;

import java.util.Date;

public class Pessoa {
    private String name;
    private Date dataNascimento;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Pessoa(String name, Date dataNascimento) {
        this.name = name;
        this.dataNascimento = dataNascimento;
    }

    public Pessoa(String name) {
        this.name = name;
    }

    public Pessoa(String name, Date dataNascimento, int idade) {
        this.name = name;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }

    public Pessoa(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public Pessoa() {
    }
}
