package questao3;

public class Calda extends Complemento {

    public Calda(IBebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Calda";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 2.50;
    }
}
