package Capitulo02;

import java.util.Scanner;

public class idadeScanner {
    //Utilização de Scanner para captar a idade + calculo de idade próximo ano
    public static void main(String[] args) {
        int idade;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua Idade: \n");
        idade = leitor.nextInt();
        leitor.close();
        System.out.println("Sua idade é: "+idade+" anos");
        int idadeAnoQueVem = idade + 1;
        System.out.println("Sua idade no próximo ano será: "+ idadeAnoQueVem + " anos");
    }
}
