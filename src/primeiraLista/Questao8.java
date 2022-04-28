package primeiraLista;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total distance and the total fuel consumption");

        double  distance = sc.nextDouble();
        double  fuelConsumption = sc.nextDouble();

        double  kmPerL = distance/fuelConsumption;
        System.out.printf("Each Km you use %3.2f L of fuel", kmPerL);


    }
}
