public class Principal {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Caneta Azul";
        p1.preco = 2.50;

        Produto p2 = new Produto("Caderno Universitário", 15.90);
        Produto p3 = new Produto("Mochila Escolar", 89.99);

        System.out.println("=== Cadastro de Produtos ===");
        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();
        System.out.println("----------------------------");
        Produto.exibirQuantidadeTotal();
    }
}