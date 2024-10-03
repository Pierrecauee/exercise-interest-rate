import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nameProduto = scanner.nextLine();

        System.out.print("Valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Frete: ");
        double frete = scanner.nextDouble();


        scanner.nextLine();

        System.out.print("Nome do serviço: ");
        String nameServico = scanner.nextLine();

        System.out.print("Valor do serviço: ");
        double valorServico = scanner.nextDouble();


        double aliquotaICMS = 0.12;

        // Instanciando o produto
        Produto produto = new Produto(nameProduto, valorProduto, frete, aliquotaICMS);
        double precoFinalProduto = produto.calcularPrecoFinal();

        // Instanciando o serviço
        ProdutoServico servico = new ProdutoServico(nameServico, valorServico, aliquotaICMS);
        double precoFinalServico = servico.calcularPrecoFinal();

        // Saída
        System.out.printf("O preço final do produto '%s' é: R$ %.2f\n", nameProduto, precoFinalProduto);
        System.out.printf("O preço final do serviço '%s' é: R$ %.2f\n", nameServico, precoFinalServico);

        scanner.close();
    }
}
