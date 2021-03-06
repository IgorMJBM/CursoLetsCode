package quartaLista;

import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int habitantes = 0;
            int totalFilhos = 0;
            double salarioTotal = 0;
            double maiorSalario = -1;
            int salarioMenor = 0;

            while(true) {
                System.out.println("Digite o salário: ");
                double salario = scanner.nextDouble();

                if (salario < 0) {
                    break;
                }

                System.out.println("Digite o número de filhos: ");
                int numeroFilhos = scanner.nextInt();

                habitantes = habitantes + 1;
                totalFilhos += numeroFilhos;
                salarioTotal += salario;

                if (salario > maiorSalario) {
                    maiorSalario = salario;
                }

                if (salario < 150) {
                    salarioMenor++;
                }

            }

            System.out.println("Média do salário da população: " + (salarioTotal / habitantes));
            System.out.println("Média do número de filhos: " + (totalFilhos / habitantes));
            System.out.println("Maior salário: " + maiorSalario);
            System.out.println("Percentual de salário inferior a 150,00: " + ((salarioMenor / habitantes) * 100));
    }
}
