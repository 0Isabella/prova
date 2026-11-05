package questao3;

public class Main {
    public static void main(String[] args) {

        IBebida pedido1 = new Espresso();
        IBebida pedido2 = new Calda(new Leite(new Cha()));
        IBebida pedido3 = new Chantilly(new Leite(new Leite(new Espresso())));
        IBebida pedido4 = new Calda(new Calda(new Chantilly(new Leite(new Cha()))));

        System.out.printf("%s = R$ %.2f%n", pedido1.getDescricao(), pedido1.getPreco());
        System.out.printf("%s = R$ %.2f%n", pedido2.getDescricao(), pedido2.getPreco());
        System.out.printf("%s = R$ %.2f%n", pedido3.getDescricao(), pedido3.getPreco());
        System.out.printf("%s = R$ %.2f%n", pedido4.getDescricao(), pedido4.getPreco());
    }
}
