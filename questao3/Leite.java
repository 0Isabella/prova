package questao3;

public class Leite extends Complemento {

    public Leite(IBebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Leite";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 2.00;
    }
}
