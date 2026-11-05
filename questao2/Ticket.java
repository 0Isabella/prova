package questao2;

public class Ticket {

    private String placa;
    private int tempoMinutos;
    private IPerfilCobranca perfil;

    public Ticket(String placa, int tempoMinutos, IPerfilCobranca perfil) {
        this.placa = placa;
        this.tempoMinutos = tempoMinutos;
        this.perfil = perfil;
    }

    public void setPerfil(IPerfilCobranca perfil) {
        this.perfil = perfil;
    }

    public double calcularValor() {
        return perfil.calcular(tempoMinutos);
    }

    public String getPlaca() {
        return placa;
    }

    public int getTempoMinutos() {
        return tempoMinutos;
    }
}
