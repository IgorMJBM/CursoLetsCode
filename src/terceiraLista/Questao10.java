package terceiraLista;

import java.util.Random;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNumber = random.nextInt(10);
        int maximumAtenpts = 3;


        System.out.println("Guess a number up to 10!");
        for (int i = 0; i < maximumAtenpts; i++) {
            int guessedNumber = sc.nextInt();
            if (guessedNumber == randomNumber){
                System.out.println("You won!");
                break;
            }else if (guessedNumber < randomNumber){
                System.out.println("You guess must be higher!");
            }else if(guessedNumber > randomNumber){
                System.out.println("You guess must be lower!");
            }
        }


    }
}
