package quartaLista;

import java.util.Scanner;

public class Questao13 {

    public static final double LITRE_OF_GASOLINE_PRICE = 7.59;
    public static final double LITRE_OF_ALCOHOL_PRICE = 5.20;
    public static final double THREE_PERCENT_OF_DISCOUNT= 0.03;
    public static final double FIVE_PERCENT_OF_DISCOUNT= 0.05;
    public static final double FOUR_PERCENT_OF_DISCOUNT= 0.04;
    public static final double SIX_PERCENT_OF_DISCOUNT= 0.06;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantityOfGas = 0;

        System.out.println("Please enter the type of gas A-ALCOHOL and G-GASOLINE!");
        String typeOfGas = sc.nextLine();
        typeOfGas = typeOfGas.toUpperCase();

        switch (typeOfGas){
            case "A":
                System.out.println("Please enter the quantity of alcohol!");
                quantityOfGas = sc.nextInt();
                if (quantityOfGas < 20){
                    double totalToBePaid = quantityOfGas * (LITRE_OF_ALCOHOL_PRICE - (LITRE_OF_ALCOHOL_PRICE * THREE_PERCENT_OF_DISCOUNT));
                    System.out.println("The total you have to pay is " + totalToBePaid);
                }else if (quantityOfGas >= 20){
                    double totalToBePaid = quantityOfGas * (LITRE_OF_ALCOHOL_PRICE - (LITRE_OF_ALCOHOL_PRICE * FIVE_PERCENT_OF_DISCOUNT));
                    System.out.println("The total you have to pay is " + totalToBePaid);
                }
                break;
            case "G":
                System.out.println("Please enter the quantity of gasoline!");
                quantityOfGas = sc.nextInt();
                if (quantityOfGas < 20){
                    double totalToBePaid = quantityOfGas * (LITRE_OF_GASOLINE_PRICE - (LITRE_OF_GASOLINE_PRICE * FOUR_PERCENT_OF_DISCOUNT));
                    System.out.println("The total you have to pay is " + totalToBePaid);
                }else if (quantityOfGas >= 20){
                    double totalToBePaid = quantityOfGas * (LITRE_OF_GASOLINE_PRICE - (LITRE_OF_GASOLINE_PRICE * SIX_PERCENT_OF_DISCOUNT));
                    System.out.println("The total you have to pay is " + totalToBePaid);
                }
                break;
            default:
                System.out.println("Please enter the type of gas A-ALCOHOL and G-GASOLINE!");
                typeOfGas = sc.nextLine();
                typeOfGas = typeOfGas.toUpperCase();

        }


    }
}
