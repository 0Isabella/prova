package questao1;

public class Main {
    public static void main(String[] args) {

        Produto notebook = new Produto("Notebook", 10);

        AreaCompras compras = new AreaCompras();
        AreaVendas vendas = new AreaVendas();
        AreaAuditoria auditoria = new AreaAuditoria();

        notebook.adicionarArea(compras);
        notebook.adicionarArea(vendas);
        notebook.adicionarArea(auditoria);

        System.out.println("10 para 7 (só a auditoria reage)");
        notebook.setQuantidade(7);

        System.out.println("\n7 para 7 (nada mudou, ninguém é avisado)");
        notebook.setQuantidade(7);

        System.out.println("\n7 para 3 (abaixo de 5: Compras alerta)");
        notebook.setQuantidade(3);

        System.out.println("\n3 para 0 (zerou: Compras alerta, Vendas anota)");
        notebook.setQuantidade(0);

        System.out.println("\n0 para8 (voltou: Vendas alerta)");
        notebook.setQuantidade(8);

        System.out.println("\nCompras sai da lista");
        notebook.removerArea(compras);

        System.out.println("\n8 para 2 (Compras não é mais avisada)");
        notebook.setQuantidade(2);

        System.out.println("\nTudo o que a Auditoria registrou");
        for (String registro : auditoria.getRegistros()) {
            System.out.println(registro);
        }
    }
}
