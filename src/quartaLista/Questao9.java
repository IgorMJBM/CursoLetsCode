package quartaLista;

import java.util.Random;

public class Questao9 {
    public static void main(String[] args) {
        Random random = new Random();
        int numbers[][] = new int[3][5];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(100);
                System.out.println(numbers[i][j]);
            }
        }


        int sumOfRows[] = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sumOfRows[i] += numbers[i][j];
            }
            System.out.println("The sum of the rows of " + i + " is " + sumOfRows[i]);
        }


        int sumOfColumns[] = new int[numbers[0].length];
        for (int j = 0; j < numbers[0].length; j++) {
            for (int i = 0; i < numbers.length; i++) {
                sumOfColumns[j] += numbers[i][j];
            }
            System.out.println("The sum of the columns is " + sumOfColumns[j]);
        }




    }
}
