package Exercicios;

import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um Número para se tornar x: ");
        x = scanner.nextInt();
        scanner.close();
        if(x % 2 == 0){
            while(x > 1){
                x = x / 2;
                System.out.println(x);
            }
        } else {
            while(x > 1){
                x = 3 * x + 1;
                System.out.println("O novo valor de x considerando o número como ímpar é: "+ x);
            }
            
        }
    }
}
