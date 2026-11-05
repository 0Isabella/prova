package questao1;
import java.util.ArrayList;
import java.util.List;

public class AreaAuditoria implements IObserver {

    private List<String> registros = new ArrayList<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        String linha = "produto=" + nomeProduto + " quantidade = " + novaQuantidade;
        registros.add(linha);
        System.out.println("Registro auditoria: " + linha);
    }

    public List<String> getRegistros() {
    return registros;
    }
}
