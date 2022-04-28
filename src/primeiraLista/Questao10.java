package primeiraLista;

import java.util.Scanner;

public class Questao10 {

    public static final double  INCOME_PER_MONTH = 0.007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the amount you want to deposit");
        double depositedAmount = sc.nextDouble();

        double amountAferterIncomePerMonthApplied = depositedAmount * INCOME_PER_MONTH;
        double finalValue = depositedAmount + amountAferterIncomePerMonthApplied;

        System.out.printf("The total of your amount after the aplication of the income in 1 month is %5.2f", finalValue);
    }
}
