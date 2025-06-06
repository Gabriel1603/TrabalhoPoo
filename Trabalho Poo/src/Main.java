public class Main {
    public static void main(String[] args) {
        Produto livro = new Livro("Java para Iniciantes", 89.90, "João Silva", 320, true);
        Produto camisa = new Camisa("Camisa Polo", 59.99, "Azul", "M", "Algodão");

        System.out.println("Informações do Livro:");
        livro.exibirInfo();

        System.out.println("\nInformações da Camisa:");
        camisa.exibirInfo();
    }
}