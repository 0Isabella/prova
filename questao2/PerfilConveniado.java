package questao2;

public class PerfilConveniado implements IPerfilCobranca {

    private final int minutosGratis = 30;
    private final double valorHora = 8.00;
    private final double desconto = 0.25;

    @Override
    public double calcular(int tempoMinutos) {
        if (tempoMinutos <= minutosGratis) {
            return 0;
        }
        int horas = (int) Math.ceil((tempoMinutos - minutosGratis) / 60.0);
        return horas * valorHora * (1 - desconto);
    }
}