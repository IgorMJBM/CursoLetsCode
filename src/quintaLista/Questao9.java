package quintaLista;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please select OPTION - 1 to calculate arithmetic average and OPTION - 2 to calculate weighted average!");
        int option = sc.nextInt();

        switch (option){
            case 1 ->{
                System.out.println("Please enter two grades!");
                double firstGrade = sc.nextDouble();
                double secondGrade = sc.nextDouble();
                double arithmeticAverage = (firstGrade + secondGrade) / 2;
                System.out.printf("The arithmetic average total is %5.2f", arithmeticAverage);
            }
            case 2 ->{
                System.out.println("Please enter three grades!");
                double firstGrade = sc.nextDouble();
                double secondGrade = sc.nextDouble();
                double thirdGrade = sc.nextDouble();
                double gradesSum = firstGrade + secondGrade + thirdGrade;

                System.out.println("Please enter the specific weights for each grade!");
                double firstWeight = sc.nextDouble();
                double secondWeight = sc.nextDouble();
                double thirdWeight = sc.nextDouble();
                double weightSum = firstWeight + secondWeight + thirdWeight;


                double weightedAverage = gradesSum / weightSum;
                System.out.printf("The weighted average total is %5.2f", weightedAverage);
            }

            default -> {
                System.out.println("Please select OPTION - 1 to calculate arithmetic average and OPTION - 2 to calculate weighted average!");
                option = sc.nextInt();
            }
        }


    }
}
