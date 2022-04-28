package primeiraLista;

import java.util.Scanner;

public class Questao3 {
    public static final double INTEREST_PER_MONTH = 0.02;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the value of the loan needed");
        double moneyNeeded = sc.nextDouble();

        System.out.println("Insert the number of installments ");
        int amountOfIsntallments = sc.nextInt();

        double loanTotalValue = moneyNeeded * Math.pow(1 + INTEREST_PER_MONTH,amountOfIsntallments);

        System.out.printf("The final value of the loan with the interest applied to it is %4.2f in %d months" ,loanTotalValue, amountOfIsntallments);


    }
}
