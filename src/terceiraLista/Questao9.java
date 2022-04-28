package terceiraLista;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peopleOlderThaneighteen = 0;

        System.out.println("Please enter 10 ages!");

        for (int i = 0; i < 10; i++) {
            int agesRecived = sc.nextInt();
            if (agesRecived > 18){
                peopleOlderThaneighteen++;
            }
        }


        System.out.printf("You have %d people older than eighteen",peopleOlderThaneighteen);

    }
}
