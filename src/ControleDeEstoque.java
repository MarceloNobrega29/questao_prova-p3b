import java.util.Scanner;

public class ControleDeEstoque {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto");
        String nome = scanner.nextLine();

        System.out.println("Digite o preço do produto");
        double preco = scanner.nextDouble();

        System.out.println("Digite a quantidade no estoque");
        int estoque = scanner.nextInt();

        System.out.println("Digite o número de produtos vendidos");
        int vendida = scanner.nextInt();


        System.out.println();
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("Estoque antes da venda: " + estoque + " unidades");
        System.out.println("Venda realizada: " + vendida + " unidades");

        if (vendida > estoque) {
            System.out.println("Estoque insuficiente para realizar a venda.");
        } else {
            estoque -= vendida;
            System.out.println("Estoque atualizado: " + estoque + " unidades");
        }

        scanner.close();
    }
}