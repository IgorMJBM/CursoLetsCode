package quintaLista;


import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your hourly rate!");
        double hourlyRate = sc.nextDouble();

        System.out.println("Enter the quantity of hours worked this month!");
        double hoursWorked = sc.nextDouble();

        double grossSalary = hourlyRate * hoursWorked;
        double fgts = grossSalary * 0.11;
        double syndicateTax = grossSalary * 0.03;

        if (grossSalary <= 900){
            System.out.println("You are exempt of the IR tax");
            System.out.printf("Your FGTS tax payment is $%3.2f\n ", fgts);
            System.out.printf("Your Syndicate tax payment is $%3.2f\n ", syndicateTax);
            System.out.printf("Your Net Salary is\n ", (grossSalary - syndicateTax));


        } else if (grossSalary <= 1500) {
            double irDiscount = grossSalary * 0.05;
            System.out.printf("Your IR tax is $%3.2f\n ", irDiscount);
            System.out.printf("Your FGTS tax payment is $%3.2f\n ", fgts);
            System.out.printf("Your Syndicate tax payment is $%3.2f\n ", syndicateTax);
            System.out.printf("Your Net Salary is\n ", (grossSalary - syndicateTax - irDiscount));
        } else if (grossSalary <= 2500) {
            double irDiscount = grossSalary * 0.10;
            System.out.printf("Your IR tax is $%3.2f\n ", irDiscount);
            System.out.printf("Your FGTS tax payment is $%3.2f\n ", fgts);
            System.out.printf("Your Syndicate tax payment is $%3.2f\n ", syndicateTax);
            System.out.printf("Your Net Salary is\n ", (grossSalary - syndicateTax - irDiscount));
        } else {
            double irDiscount = grossSalary * 0.20;
            System.out.printf("Your IR tax is $%3.2f\n ", irDiscount);
            System.out.printf("Your FGTS tax payment is $%3.2f\n ", fgts);
            System.out.printf("Your Syndicate tax payment is $%3.2f\n ", syndicateTax);
            System.out.printf("Your Net Salary is\n ", (grossSalary - syndicateTax - irDiscount));

    }

    }
}
