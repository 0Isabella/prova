package questao1;

public class AreaVendas implements IObserver {

    public boolean zerou = false;

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade == 0) {
            zerou = true;
        } else if (zerou) {
                System.out.println("Alerta vendas: " + nomeProduto + " voltou ao estoque (" + novaQuantidade + " unidade)");
            zerou = false;
        }
    }
}
