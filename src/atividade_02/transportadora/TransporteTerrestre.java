package atividade_02.transportadora;

public class TransporteTerrestre extends Transportadora{
    @Override
    public Double calculaFrete(Double altura, Double largura) {
        return (altura / largura) * 0.2;
    }
}
