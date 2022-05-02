package quartaLista;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Please enter the numbers of rows and columns!");
        int rows = sc.nextInt();
        int colunms = sc.nextInt();
        int matriz[][] = new int[rows][colunms];

        System.out.println("Enter the values of your matriz!");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the row that you want to sum");
        int row = sc.nextInt();
        for (int i = row; i <= row; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sum += matriz[i][j];
            }
        }


        System.out.printf("the sum of the numbers of the row selected is %d", sum);
    }
}
