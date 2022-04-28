package segundaLista;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter time spent in hours and the average speed of the trip");
        double timeSpent = sc.nextDouble();
        double averageSpeed = sc.nextDouble();

        double distanceCalculation = timeSpent * averageSpeed;
        double litersUsed = distanceCalculation / 12;

        System.out.printf("The amount of liters used is %3.2f", litersUsed);


    }
}
