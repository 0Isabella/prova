package questao2;

public class PerfilMensalista implements IPerfilCobranca {

    private static final double valorFixo = 150.00;

    @Override
    public double calcular(int tempoMinutos) {
        return valorFixo;
    }
}
