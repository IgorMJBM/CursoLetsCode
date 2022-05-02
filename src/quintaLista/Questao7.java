package quintaLista;

import java.util.Locale;
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCashShopping = 0;
        int totalTermPurchases = 0;
        int totalOfPurchases = 0;

        for (int i = 0; i < 1; i++) {
            System.out.println("Please enter the code V(In cash purchases) or P(On term purchases)");
            String code = sc.nextLine().toUpperCase();
            System.out.println("Enter the total value of the transaction!");
            double value = sc.nextDouble();
            sc.nextLine();

            switch (code){
                case "V" -> {
                    totalCashShopping += value;
                    totalOfPurchases += value;
                }
                case "P" ->{
                    totalTermPurchases += value;
                    totalOfPurchases += value;
                }
            }
        }
        System.out.println("The total amount of cash purchases is " + totalCashShopping);
        System.out.println("The total amount on term purchases is " + totalTermPurchases);
        System.out.println("The total value of purchases made is " + totalOfPurchases);
        System.out.println("The value of the first installment of installment purchases is " + totalTermPurchases / 3);
    }
}
