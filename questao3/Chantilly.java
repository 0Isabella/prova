package questao3;

public class Chantilly extends Complemento {

    public Chantilly(IBebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Chantilly";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 3.00;
    }
}
