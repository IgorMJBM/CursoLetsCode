package quartaLista;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int matriz[][] = new int[1][2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
                sum += matriz[i][j];
            }
        }
        System.out.printf("the sum of the numbers is %d", sum);
    }
}
