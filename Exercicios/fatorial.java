package Exercicios;

public class fatorial{
    
    public static void main(String[] args) {
        int fatorado = 1;
        for(int n = 1; n <= 10; n++){
            //Cada vez no loop ele vai pegar o n+1, multiplicar ao fatorado e setar o novo fatorado.
            fatorado = n * fatorado;
            System.out.println(fatorado);
        }
    }
}
