package terceiraLista;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNumberRecived = sc.nextInt();
        int secondNumberRecived = sc.nextInt();
        int index = 0;

        System.out.println("Please enter 2 numbers!");

        if (firstNumberRecived > secondNumberRecived){
            index = secondNumberRecived;
            for (int i = index + 1; i < firstNumberRecived; i++){
                System.out.println(i);
            }
        }else{
            index = firstNumberRecived;
            for (int i = index + 1; i < secondNumberRecived; i++){
                System.out.println(i);
            }
        }




    }
}
