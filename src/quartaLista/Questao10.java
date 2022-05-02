package quartaLista;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int banknotes[] = {100, 50, 20, 10, 5, 2 ,1};
        int quantityOfBankNotes = 0;

        System.out.println("Please enter a value!");
        int value = sc.nextInt();

        for (int i = 0; i < banknotes.length; i++) {
            if (value >= banknotes[i]){
                quantityOfBankNotes = value / banknotes[i];
                value = value%banknotes[i];
                System.out.printf("%d bank notes of $%d\n", quantityOfBankNotes, banknotes[i]);
            }
        }


    }
}
