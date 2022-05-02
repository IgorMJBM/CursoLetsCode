package quintaLista;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double average = 0;
        int weightOver90 = 0;

        for (int i = 0; i < 7; i++) {
            System.out.println("Please enter an age!");
            int age = sc.nextInt();
            System.out.println("Please enter a weight");
            double weight = sc.nextDouble();
            if (weight > 90){
                weightOver90++;
            }
            average += age;
        }

        System.out.println("The total quantity of people over 90 Kg is " + weightOver90);
        System.out.printf("The average of all ages is %2f" + (average / 7));

    }
}
