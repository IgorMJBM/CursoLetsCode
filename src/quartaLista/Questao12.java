package quartaLista;

import java.util.Scanner;

public class Questao12 {

    public static final double THREE_PERCENT= 0.03;
    public static final double FIVE_PERCENT= 0.05;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter the total of your sales!");
        int salesTotal = sc.nextInt();

        System.out.println("Please enter your salary!");
        int salary = sc.nextInt();

        double comissionLessThan1500 = 0;
        if (salesTotal <= 1500) {
            comissionLessThan1500 = salesTotal * THREE_PERCENT;
            System.out.println("You comission is " + comissionLessThan1500);
            System.out.println("You total value is  " + (salary + comissionLessThan1500));
        } else if (salesTotal > 1500) {
            double comissionMoreThan1500 = salesTotal * FIVE_PERCENT;
            System.out.println("You comission is " + comissionMoreThan1500);
            System.out.println("You total value is  " + (salary + comissionMoreThan1500));
        }

    }
}
