package terceiraLista;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your height and weight!");

        double height = sc.nextDouble();
        double weight = sc.nextDouble();

        double imc = weight /Math.pow(height,2);

        if (imc < 18.5){
            System.out.println("Your IMC is " + imc);
            System.out.println("You are under your ideal weight");
        } else if(imc < 24.9){
            System.out.println("Your IMC is " + imc);
            System.out.println("You are on your ideal weight");
        } else if(imc < 29.9){
            System.out.println("Your IMC is " + imc);
            System.out.println("You have weight excess");
        }else if(imc > 30){
            System.out.println("Your IMC is " + imc);
            System.out.println("You are obese");
        }


    }
}
