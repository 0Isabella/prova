package questao2;

public class Main {
    public static void main(String[] args) {

        Ticket rotativo = new Ticket("ABC-1234", 135, new PerfilRotativo());
        Ticket mensalista = new Ticket("ABC-1234", 135, new PerfilMensalista());
        Ticket conveniado = new Ticket("ABC-1234", 135, new PerfilConveniado());

        System.out.println("135 minutos nos três perfis");
        System.out.printf("Rotativo: R$ %.2f%n", rotativo.calcularValor());
        System.out.printf("Mensalista: R$ %.2f%n", mensalista.calcularValor());
        System.out.printf("Conveniado: R$ %.2f%n", conveniado.calcularValor());

        System.out.println("\nTrocando o perfil do mesmo tíquete");
        Ticket ticket = new Ticket("XYZ-9876", 135, new PerfilRotativo());
        System.out.printf("Rotativo: R$ %.2f%n", ticket.calcularValor());

        ticket.setPerfil(new PerfilConveniado());
        System.out.printf("Passou para Conveniado: R$ %.2f%n", ticket.calcularValor());

        ticket.setPerfil(new PerfilMensalista());
        System.out.printf("Passou para Mensalista: R$ %.2f%n", ticket.calcularValor());
    }
}
