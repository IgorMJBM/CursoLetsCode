package segundaLista;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert 4 numbers!");
        double[] numbersInserted = new double[4];
        double sum = 0;


        for (int i = 0; i < numbersInserted.length; i++) {
             numbersInserted[i] = sc.nextDouble();
             sum += Math.pow(numbersInserted[i],2);
        }

        System.out.printf("The result is %4.2f", sum);
    }
}
