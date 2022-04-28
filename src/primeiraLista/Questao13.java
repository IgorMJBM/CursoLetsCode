package primeiraLista;

import java.util.Scanner;

public class Questao13 {
    public static final double distributorPercentage = 0.28;
    public static final double taxPercentage = 0.45;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the car´s initial value!");

        double carInitialValue = sc.nextDouble();
        double carFinalValue = carInitialValue + (carInitialValue * distributorPercentage) + (carInitialValue * taxPercentage);

        System.out.printf("The car final value is %5.2f",carFinalValue);
    }
}
