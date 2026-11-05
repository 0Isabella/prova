package questao1;

public class AreaCompras implements IObserver {

    private static int limiteEstoqueBaixto = 5;

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade < limiteEstoqueBaixto) {
            System.out.println("AlertaCompras: " + nomeProduto + " tá com estoque baixo (" + novaQuantidade + " unidade)");
        }
    }
}
