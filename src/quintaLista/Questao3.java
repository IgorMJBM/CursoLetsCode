package quintaLista;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yesCounter = 0;

        System.out.println("Please answer the following questions with only SIM or NÃO!");

        System.out.println("Telefonou para a vítima?");
        String firstAnswer = sc.nextLine();
        if (firstAnswer.equals("SIM")){
            yesCounter++;
        }

        System.out.println("Esteve no local do crime?");
        String secondAnswer = sc.nextLine();
        if (secondAnswer.equals("SIM")){
            yesCounter++;
        }

        System.out.println("Mora perto da vítima");
        String thirdAnswer = sc.nextLine();
        if (thirdAnswer.equals("SIM")){
            yesCounter++;
        }

        System.out.println("Devia para a vítima?");
        String fourthAnswer = sc.nextLine();
        if (fourthAnswer.equals("SIM")){
            yesCounter++;
        }

        System.out.println("Já trabalhou com a vítima?");
        String fifthAnswer = sc.nextLine();
        if (fifthAnswer.equals("SIM")){
            yesCounter++;
        }

        switch (yesCounter){
            case 2-> System.out.println("Suspect");
            case 3, 4-> System.out.println("Accomplice");
            case 5-> System.out.println("Assassin");
            default -> System.out.println("Innocent");
        }




    }
}
