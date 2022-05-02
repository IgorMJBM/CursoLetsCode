package quartaLista;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char testFeedback[] = {'a','b','c','b','c','c','a','b','a','c'};
        char studentsTests[][] = new char[10][10];
        int rightAnswers = 0;

        System.out.println("Please enter the students name and tests answers!");
        for (int i = 0; i < studentsTests.length; i++) {
            String name = sc.nextLine();
            for (int j = 0; j < studentsTests[i].length; j++) {
                String average = sc.nextLine();
                studentsTests[i][j] = average.charAt(0);

                if (studentsTests[i][j] == testFeedback[j]){
                    rightAnswers++;

                }


            }
            if (rightAnswers > 6){
                System.out.println(name + " you passed with " + rightAnswers + " of average!");
            }else {
                System.out.println(name + " you have to do summer school because you had an average of " + rightAnswers);
            }
        }


    }
}
