package terceiraLista;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double grades = 0;

        System.out.println("Please enter all the grades!");

        for (int i = 0; i < 4; i++) {
            double gradesRecived = sc.nextDouble();
            grades = grades + gradesRecived;
        }
        double gradesAverage = grades / 4;
        if (gradesAverage > 7) {
            System.out.println("Congratulations!");
        } else {
            System.out.println("You are going to summer school!");
        }
    }
    }
