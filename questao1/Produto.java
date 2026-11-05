package questao1;

import java.util.ArrayList;
import java.util.List;
public class Produto {

    private String nome;
    private int quantidade;
    private List<IObserver> areas = new ArrayList<>();

    public Produto(String nome, int quantidadeInicial) {
    this.nome = nome;
    this.quantidade = quantidadeInicial;
}

    public void adicionarArea(IObserver area) {
        areas.add(area);
    }

    public void removerArea(IObserver area) {
        areas.remove(area);
    }

    public void setQuantidade(int novaQuantidade) {
        if (novaQuantidade == this.quantidade) {
            return;
        }
        this.quantidade = novaQuantidade;
        avisarAreas();
    }

    private void avisarAreas() {
        for (IObserver area : new ArrayList<>(areas)) {
            area.atualizar(nome, quantidade);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
