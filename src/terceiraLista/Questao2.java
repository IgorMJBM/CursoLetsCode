package terceiraLista;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number, if you enter 0 the program will stop!");
        int condition = 1;


        while (condition != 0){
            condition = sc.nextInt();
            if (condition > 0){
                System.out.println("Your number is positive!");
            }else if(condition < 0){
                System.out.println("Your number is negative!");
            }
        }


    }
}
