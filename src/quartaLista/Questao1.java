package quartaLista;

import java.util.Random;

public class Questao1 {
    public static void main(String[] args) {
        Random random = new Random();
        double randomValues[] = new double[10];


        for (int i = 0; i < randomValues.length; i++) {

            randomValues[i] = random.nextDouble(100);
            System.out.println(randomValues[i]);
        }
    }
}
