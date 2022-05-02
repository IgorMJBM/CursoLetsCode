package quintaLista;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double averageAgeForExcellentReviews = 0;
        int excellentQuantityReviews = 0;
        int regularQuantityReviews  = 0;
        int goodQuantityReviews = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your age!");
            int age = sc.nextInt();
            System.out.println("Please choose between the options");
            System.out.println("|| 1 - REGULAR ||");
            System.out.println("|| 2 - GOOD || ");
            System.out.println("|| 3 - EXCELLENT || ");
            int option = sc.nextInt();

            switch (option){
                case 1 ->{
                    regularQuantityReviews++;
                }
                case 2 ->{
                    goodQuantityReviews++;
                }
                case 3 ->{
                    averageAgeForExcellentReviews += age;
                    excellentQuantityReviews++;
                }
                default -> {
                    System.out.println("Please choose between the options");
                    System.out.println("|| 1 - REGULAR ||");
                    System.out.println("|| 2 - GOOD || ");
                    System.out.println("|| 3 - EXCELLENT || ");
                    option = sc.nextInt();
                }
            }

        }
        System.out.println("The average age of the people who responded great " + averageAgeForExcellentReviews / excellentQuantityReviews);
        System.out.println("The number of people who responded regularly " + regularQuantityReviews);
        System.out.printf("The percentage of people who responded “good” among all the viewers analyzed %d%%", (goodQuantityReviews*100/5));
    }
}
