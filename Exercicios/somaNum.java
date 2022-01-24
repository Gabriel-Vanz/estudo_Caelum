package Exercicios;

/* 2. Imprima a soma de 1 até 1000. */

public class somaNum{
    
    public static void main(String[] args) {
        /* Método Soma de Gauss */
        int min = 1;
        int max = 1000;

        int soma =  (min + max) * ((max - min + 1) / 2);
        System.out.println(soma);
        /* ---Método usando o loop for---
        int soma = 0;
        for(int i = 0; i < 1001; i++){
            soma += i;
            System.out.println("a soma é: "+ soma);
          */  
        
    }
}