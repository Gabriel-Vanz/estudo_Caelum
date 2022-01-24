package Capitulo02;

import java.util.Scanner;

/* Na empresa em que trabalhamos, há tabelas com o gasto de cada mês. Para fechar o balanço do
primeiro trimestre, precisamos somar o gasto total. Sabendo que, em janeiro, foram gastos 15 mil
reais, em fevereiro, 23 mil reais e, em março, 17 mil reais, faça um programa que calcule e imprima
a despesa total no trimestre e a média mensal de gastos. 
Obs: Exercício feito com o scanner, para termos uma interação com o usuário */

public class monthlyAverage {
    public static void main(String[] args) {
        float jan;
        float feb;
        float mar;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the monthly average calculation\n"+"Please, type in order of monthly expenses: ");
        System.out.println("January: ");
        jan = scanner.nextFloat();
        System.out.println("February: ");
        feb = scanner.nextFloat();
        System.out.println("March: ");
        mar = scanner.nextFloat();
        scanner.close();
        /* Math.round() limita as casas pós , */
        float average = (Math.round(jan + feb + mar)/3);
        System.out.println("Your monthly average in US$ is: US$ "+ average);

    }
    
}
