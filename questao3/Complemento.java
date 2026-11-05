package questao3;

public abstract class Complemento implements IBebida {

    protected IBebida bebida;

    public Complemento(IBebida bebida) {
        this.bebida = bebida;
    }
}
