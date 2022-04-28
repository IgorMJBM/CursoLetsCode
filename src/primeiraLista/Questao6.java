package primeiraLista;

import java.util.Scanner;

public class Questao6 {

    public static final double DOLAR_VALUE_TODAY = 4.70;
    public static final double EURO_VALUE_TODAY = 5.11;
    public static final double POUND_CURRENCY_TODAY = 6.12;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the value in reais to be converted");
        double reaisToBeConverted = sc.nextDouble();

        double convertReaisToDolars =  reaisToBeConverted / DOLAR_VALUE_TODAY;
        double convertReaisToEuro = reaisToBeConverted / EURO_VALUE_TODAY;
        double convertReaisToPound = reaisToBeConverted /POUND_CURRENCY_TODAY;

        System.out.printf("%5.2f in Reais are %5.2f in Dolars and %5.2f in Euro and %5.2f in Pounds", reaisToBeConverted, convertReaisToDolars, convertReaisToEuro, convertReaisToPound);
    }
}
