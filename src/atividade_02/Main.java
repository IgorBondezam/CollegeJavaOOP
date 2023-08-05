package atividade_02;

import atividade_02.transportadora.Transportadora;
import atividade_02.transportadora.TransporteNautico;
import atividade_02.transportadora.TransporteTerrestre;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {

        TransporteNautico  barco = new TransporteNautico();
        TransporteTerrestre carro = new TransporteTerrestre();
        Transportadora bicicleta = new TransporteTerrestre();


        System.out.printf("Frete barco: "+ barco.calculaFrete(10D, 5D) +
                         "\nFrete carro: " + carro.calculaFrete(10D, 5D) +
                         "\nFrete bicicleta: " + bicicleta.calculaFrete(10D, 5D));
    }
}
