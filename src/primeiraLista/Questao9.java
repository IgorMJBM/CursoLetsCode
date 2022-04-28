package primeiraLista;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the name and all the 3 grades of the student semester");

        String studentName = sc.nextLine();
        double fisrtGrade = sc.nextDouble();
        double secondGrade = sc.nextDouble();
        double thirdrade = sc.nextDouble();

        double gradesAverage = (fisrtGrade + secondGrade + thirdrade)/3;
        System.out.printf("The grades average of the studente %s is %2.1f" ,studentName,gradesAverage);

    }
}
