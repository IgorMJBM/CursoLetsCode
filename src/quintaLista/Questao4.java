package quintaLista;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the speed the driver was driving!");
        int speedOfTheDriver = sc.nextInt();

        System.out.println("Please enter the maximum speed allowed on the avenue!");
        int maxSpeedAllowed = sc.nextInt();

        int speedDiference = maxSpeedAllowed - speedOfTheDriver;


        if (speedDiference <= 10){
            System.out.println("Your fine is in the amount of $50");
        } else if (speedDiference >= 11 || speedDiference <= 30){
            System.out.println("Your fine is in the amount of $100");
        }else if (speedDiference < 31){
            System.out.println("Your fine is in the amount of $200");
        }
    }
}
