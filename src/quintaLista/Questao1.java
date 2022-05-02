package quintaLista;

import java.util.Scanner;

public class Questao1 {

    public static final double PRICE_OF_A_PACK_OF_CIGARETTES = 7.00;
    public static final double QUANTITY_OF_CIGARETTES_IN_A_PACK = 20;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter how many cigarettes you smoke a day!");
        int quantityOfCigarettesDay = sc.nextInt();

        System.out.println("Please the number of years you have smoked!");
        int quantityOfYearsSmoked = sc.nextInt();

        int totalQuantityOfCigarettes = (quantityOfCigarettesDay * (quantityOfYearsSmoked * 365));

        double totalCigarettesPacksSmoked = totalQuantityOfCigarettes / QUANTITY_OF_CIGARETTES_IN_A_PACK;

        double totalMoneySpentInCigarettes = PRICE_OF_A_PACK_OF_CIGARETTES * (totalCigarettesPacksSmoked * quantityOfYearsSmoked);

        System.out.printf("You´ve spent the total of $%4.2f in cigarettes!" , totalMoneySpentInCigarettes);

    }
}
