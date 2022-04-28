package terceiraLista;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        int q, a, factorial = 1;
        System.out.println("Please Enter a number greater than 0!");
        Scanner in = new Scanner(System.in);
        q = in.nextInt();
        if (q < 0){
            System.out.println("Sorry the number must be greater than 0!");
        }else {
            for (a = 1; a <= q; a++)
                factorial = factorial * a;
            System.out.println(factorial);
        }
    }
}
