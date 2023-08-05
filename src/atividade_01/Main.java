package atividade_01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        Pessoa joao = new Pessoa();

        joao.setName("João");
        joao.setIdade(14);
        joao.setDataNascimento(sdf.parse("05-07-2009"));

        Pessoa maria = new Pessoa("Maria",
                sdf.parse("18-07-2003"), 18);

        System.out.println(joao.getName() + " " + joao.getIdade() + " " + joao.getDataNascimento());
        System.out.println(maria.getName() + " " + maria.getIdade() + " " + maria.getDataNascimento());
    }
}
