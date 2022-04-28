package segundaLista;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student name!");
        String studentName = sc.nextLine();

        System.out.println("Enter the student class!");
        String studentClass = sc.nextLine();

        System.out.println("Enter the student first grade!");
        double firstGrade = sc.nextDouble();

        System.out.println("Enter the student first grade!");
        double secondGrade = sc.nextDouble();

        System.out.println("Enter the student first grade!");
        double thirdGrade = sc.nextDouble();

        double gradeAverage = (firstGrade + secondGrade + thirdGrade)/3;

        System.out.printf("the grade average is %3.1f" , gradeAverage);

    }
}
