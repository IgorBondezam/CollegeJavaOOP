package atividade_02.transportadora;

public class TransporteNautico extends Transportadora{
    @Override
    public Double calculaFrete(Double altura, Double largura) {
        return (altura + largura) * 0.1;
    }
}
