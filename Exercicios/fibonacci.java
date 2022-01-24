package Exercicios;

public class fibonacci {
    
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;

        while(num2 < 100){
            System.out.println("Número Fibonacci: "+ num2);
            num2 = num2 + num1;
            num1 = num2 - num1;
        }

    }
    
}
