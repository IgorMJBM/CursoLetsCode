package quintaLista;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your age to verify if you can donate blood!");
        int age = sc.nextInt();
        if (age >= 18 && age <= 61){
            System.out.println("You can donate!");
        }else {
            System.out.println("You can´t donate!");
        }
    }
}
