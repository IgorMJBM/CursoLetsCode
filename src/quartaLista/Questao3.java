package quartaLista;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double biggestValue = Double.MIN_VALUE;
        double matriz[][] = new double[1][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextDouble();
                if (matriz[i][j] > biggestValue){
                    biggestValue = matriz[i][j];
                }
            }
        }
        System.out.printf("%4.2f is the biggest value!", biggestValue);
    }
}
