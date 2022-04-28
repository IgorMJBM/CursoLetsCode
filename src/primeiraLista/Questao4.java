package primeiraLista;

import java.util.Scanner;

public class Questao4 {
    public static final int DAYS_OF_THE_YEAR = 365;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert your age");
        int age = sc.nextInt();

        double convertAgeInDays = age * 365;

        System.out.printf("You lived %5.2f in %d years" ,convertAgeInDays , age);

    }
}
