public class Produto {

    String nome;
    double preco;
    static int quantidadeTotal = 0;

    public Produto() {
        quantidadeTotal++;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        quantidadeTotal++;
    }

    public void exibirDados() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + String.format("%.2f", preco));
    }

    public static void exibirQuantidadeTotal() {
        System.out.println("Total de produtos cadastrados: " + quantidadeTotal);
    }
}