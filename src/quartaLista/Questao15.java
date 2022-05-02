package quartaLista;

import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de produtos: ");
        int quantidadeDeProdutos = scanner.nextInt();

        int numeroDeMercadoriasEstoque = 0;
        double valorTotalEstoque = 0;
        double valorTotalMercadorias = 0;
        for(int i = 0; i < quantidadeDeProdutos; i++) {
            scanner.nextLine();
            System.out.println("Digite o nome do produto: ");
            String nomeProduto = scanner.nextLine();

            System.out.println("Digite a quantidade de mercarias no estoque");
            int mercadoriasEmEstoque = scanner.nextInt();

            System.out.println("Digite o valor unitário do produto " + nomeProduto);
            double valorUnitario = scanner.nextDouble();

            valorTotalEstoque += valorUnitario * mercadoriasEmEstoque;
            valorTotalMercadorias += valorUnitario;
            numeroDeMercadoriasEstoque += mercadoriasEmEstoque;
        }

        System.out.println("VALOR TOTAL DO ESTOQUE: " + valorTotalEstoque);
        System.out.println("MEDIA DO VALOR DAS MERCADORIAS: " + (valorTotalMercadorias / quantidadeDeProdutos));
    }
}
