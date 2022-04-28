package primeiraLista;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter mass height and time values in seconds");

        double mass = sc.nextDouble();
        double height = sc.nextDouble();
        double timeInSeconds = sc.nextDouble();
        double horsePowerNeeded = ((mass * height) / timeInSeconds ) /745.69;

        System.out.printf("The amount of horsepowe needed is %3.2f" , horsePowerNeeded);


    }

}
