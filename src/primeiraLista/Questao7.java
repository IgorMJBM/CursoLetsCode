package primeiraLista;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the first please!");
        double firstNumberRecived = sc.nextDouble();
        System.out.println("Insert the second please!");
        double secondNumberRecived = sc.nextDouble();

        double sumOfTheNumbersReciveds = firstNumberRecived + secondNumberRecived;
        double multiplicationOfTheNumbersReciveds = firstNumberRecived * secondNumberRecived;
        double divisionOfTheNumbersReciveds = firstNumberRecived / secondNumberRecived;

        System.out.printf("The sum of the entered numbers is %5.2f the multiplication of the entered numbers is %5.2f the division of the is %5.2f", sumOfTheNumbersReciveds, multiplicationOfTheNumbersReciveds, divisionOfTheNumbersReciveds);
    }
}
