package primeiraLista;

import java.util.Scanner;

public class Questao11 {
    private static final int NUMBER_OF_INSTALLMENTS = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the total amount of your purchase");

        double purchaseValue = sc.nextDouble();
        double installmentsValue  = purchaseValue/NUMBER_OF_INSTALLMENTS;

        System.out.printf("The value of each installment is %3.2f" , installmentsValue);
    }
}
