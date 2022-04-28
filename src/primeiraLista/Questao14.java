package primeiraLista;

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the value of the Math ray");
        double mathRay = sc.nextDouble();

        double circleArea = Math.PI * Math.pow(mathRay,2);
        System.out.printf("The area of your circle is %3.2f", circleArea);
    }
}
