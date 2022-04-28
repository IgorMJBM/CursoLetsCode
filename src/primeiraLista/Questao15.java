package primeiraLista;

import java.util.Scanner;

public class Questao15 {
    public static final int HORSESHOE_FOR_EVERY_HORSE = 4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of horses for your stud");

        int numberOfHorses = sc.nextInt();
        int amountOfHoeseshoesForEachHorse = numberOfHorses * HORSESHOE_FOR_EVERY_HORSE;

        System.out.printf("The amount of horseshoes needed for the horses are %d", amountOfHoeseshoesForEachHorse);
    }
}
