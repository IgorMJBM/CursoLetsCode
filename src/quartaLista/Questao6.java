package quartaLista;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result[] = {1, 3, 2, 1, 2, 3, 1, 2, 1, 3, 1, 2 ,3};
        int guess[] = new int[13];
        int correctGuesses = 0;


        System.out.println("Please enter you guess on the result!");
        for (int i = 0; i < result.length; i++) {
            guess[i] = sc.nextInt();
            if (guess[i] == result[i]){
                correctGuesses++;
            }

        }

        if (correctGuesses == 13){
            System.out.println("You won!");
        }else{
            System.out.printf("You guessed right %d numbers!", correctGuesses);
        }

    }
}
