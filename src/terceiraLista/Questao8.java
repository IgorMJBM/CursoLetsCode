package terceiraLista;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valuesRecived = new int[10];
        int sumValues = 0;
        int biggestValor = Integer.MIN_VALUE;
        int lowestValor = Integer.MAX_VALUE;


        System.out.println("Enter 10 values please!");
        int valuesToCompare = 0;
        for (int index = 0; index < valuesRecived.length; index++) {
            valuesToCompare = scanner.nextInt();
            valuesRecived[index] = valuesToCompare;
            sumValues += valuesToCompare;
            if (valuesRecived[index] > biggestValor) {
                biggestValor = valuesRecived[index];
            }
            if (valuesRecived[index] < lowestValor) {
                lowestValor = valuesRecived[index];
            }
        }

        int valuesAverage = sumValues / 10;

        System.out.println("O maior valor é: " + biggestValor);
        System.out.println("O menor valor é: " + lowestValor);
        System.out.println("A média deles é: " + valuesAverage);

    }
}
