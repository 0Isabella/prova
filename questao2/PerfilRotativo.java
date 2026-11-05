package questao2;

public class PerfilRotativo implements IPerfilCobranca {

    private static final double valorHora = 8.00;

    @Override
    public double calcular(int tempoMinutos) {
        int horasIniciadas = (tempoMinutos + 59) / 60;
        return horasIniciadas * valorHora;
    }
}
