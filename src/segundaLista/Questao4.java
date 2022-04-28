package segundaLista;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] beachNames = new String[5];
        double[] beachDistances = new double[5];

        for (int i = 0; i < beachNames.length; i++) {
            System.out.printf("Enter the beach name %d: ", (i+1));
            beachNames[i] = sc.nextLine();
            System.out.printf("Enter the beach distance %d: ",(i+1));
            beachDistances[i] = sc.nextDouble();
            sc.nextLine();
        }

        String bigBeachDistanceName = "";
        double longerDistanceBetweenBeaches = 0;
        double sum = 0;
        for (int i = 0; i < beachNames.length; i++) {
            sum += beachDistances[i];

            if (beachDistances[i] < 10){
                System.out.println("The beach " + beachNames[i] + " is less than 10 kilometers of distance of the hotel");
            } else if (beachDistances[i] > 15){
                System.out.println("The beach " + beachNames[i] + " it's been more than 15 kilometers of distance of the hotel");
            }

            if (beachDistances[i] > longerDistanceBetweenBeaches){
                longerDistanceBetweenBeaches = beachDistances[i];
                bigBeachDistanceName = beachNames[i];
            }
        }

        double average = sum / beachNames.length;

        System.out.printf("The furthest beach is %s\nThe average is %.2f", bigBeachDistanceName, average);
    }
}

