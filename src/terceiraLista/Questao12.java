package terceiraLista;

import java.util.Locale;
import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = sc.nextLine();
        if (name.length() < 3){
            System.out.println("The name must be bigger than 3 letters");
        }

        System.out.println("Please enter an age!");
        int age = sc.nextInt();
        sc.nextLine();
        if (age < 0 || age > 150){

        }


        System.out.println("Enter you sex M for male and F for female!");
        String sex = sc.nextLine();
        sex.toUpperCase();
        if(sex.equals("M") || sex.equals("F")){

        }else{
            System.out.println("Please choose only M for male or F for female");
        }


        System.out.println("Please enter your marital status S for single C for married V for widowed and D for divorced!");
        String maritalStatus = sc.nextLine();
        maritalStatus.toUpperCase();
        if (maritalStatus.equals("S")|| maritalStatus.equals("C") || maritalStatus.equals("V") || maritalStatus.equals("D")){

        }else{
            System.out.println("Please choose only S for single C for married V for widowed and D for divorced!");
        }

    }
}
