package quartaLista;

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int olderMale = 0;
        int youngerMale = 0;
        int olderFemale = 0;
        int youngerFemale = 0;


        System.out.println("Please enter two different male and women ages!");
        int firstMaleAgeRecived = sc.nextInt();
        int secondMaleAgeRecived = sc.nextInt();
        int firstFemaleAgeRecived = sc.nextInt();
        int secondFemaleAgeRecived = sc.nextInt();

        if (firstMaleAgeRecived > secondMaleAgeRecived){
            olderMale = firstMaleAgeRecived;
            youngerMale = secondMaleAgeRecived;
        }else {
            olderMale = secondMaleAgeRecived;
            youngerMale = firstMaleAgeRecived;
        }


        if (firstFemaleAgeRecived > secondFemaleAgeRecived){
            olderFemale = firstFemaleAgeRecived;
            youngerFemale = secondFemaleAgeRecived;
        }else {
            olderFemale = secondFemaleAgeRecived;
            youngerFemale = firstFemaleAgeRecived;
        }

        System.out.println("The sum of the older male age and the younger female is " + (olderMale + youngerFemale));
        System.out.println("The product of the older female age and the younger male is " + (olderFemale * youngerMale));
        

    }
}
