package quartaLista;

import java.util.Random;
import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numbers[][] = new int[1][10];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Please enter a number!");
        int guess = sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                 if (numbers[i][j] == guess){
                     System.out.println("the number is here!");
                     break;
                 }else {
                     System.out.println("==");
                 }
            }
        }


    }
}
