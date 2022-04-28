package primeiraLista;

import java.util.Scanner;

public class Questao5 {
    public static final double PERCENTAGE_OF_SALARY_READJUSTMENT = 0.07;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the total value of your salary!");
        double salaryRecived = sc.nextDouble();

        double salaryReajustement = salaryRecived * PERCENTAGE_OF_SALARY_READJUSTMENT;
        double salaryReajusted = salaryRecived + salaryReajustement;

        System.out.printf("Your salary before reajustment is %5.2f and after reajustment is %5.2f",salaryRecived , salaryReajusted);

    }
}
