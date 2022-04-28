package primeiraLista;

import java.util.Scanner;

public class Questao1 {
    public static final double FATOR_CONVERSAO_CELSIUS_PARA_FAHRENHEIT = 1.8 + 32;
    public static final double FATOR_CONVERSAO_CELSIUS_PARA_KELVIN = 273.15;
    public static final double FATOR_CONVERSAO_CELSIUS_PARA_RANKINE = 1.8 + 32 + 459.67;
    public static final double FATOR_CONVERSAO_CELSIUS_PARA_REAUMUR = 0.8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor em Celsius para ser convertido!");
        double valorEmCelsius = scanner.nextDouble();

        double converteValoresParaKelvin = valorEmCelsius + FATOR_CONVERSAO_CELSIUS_PARA_KELVIN;
        System.out.printf("Conversão em kelvin: %3.2f \n" ,converteValoresParaKelvin);

        double converteValoresParaFahrenheit = valorEmCelsius * FATOR_CONVERSAO_CELSIUS_PARA_FAHRENHEIT;
        System.out.printf("Conversão em Fahrenheit: %3.2f \n" , converteValoresParaFahrenheit);

        double converteValoresParaRankine = valorEmCelsius * FATOR_CONVERSAO_CELSIUS_PARA_RANKINE;
        System.out.printf("Conversão em Rankine: %3.2f \n" , converteValoresParaRankine);

        double converteValoresParaReaumur = valorEmCelsius * FATOR_CONVERSAO_CELSIUS_PARA_REAUMUR;
        System.out.printf("Conversão em Reaumur: %3.2f \n" , converteValoresParaReaumur);

    }



}
