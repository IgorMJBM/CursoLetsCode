package primeiraLista;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the cost price and the sale value");

        double costPrice = sc.nextDouble();
        double valueOfAddition = sc.nextDouble();
        double  finalSalePrice = costPrice + valueOfAddition;

        System.out.printf("The cost price is %4.2f the value of addition is %4.2f and the final value is %4.2f" , costPrice, valueOfAddition, finalSalePrice);
    }
}
