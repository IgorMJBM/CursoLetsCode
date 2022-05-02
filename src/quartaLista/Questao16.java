package quartaLista;

import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names  = new String[10];

        System.out.println("Please enter ten names!");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }

        System.out.println("Please enter another name!");
        String nameToCompare = sc.nextLine();


        for (int i = 0; i < names.length; i++) {
            if (nameToCompare.equals(names[i])){
                System.out.println("FOUND!");
                break;
            }else {
                System.out.println("NOT FOUND!");
            }
        }
    }
}
