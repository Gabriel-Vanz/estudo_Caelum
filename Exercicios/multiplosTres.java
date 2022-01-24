package Exercicios;

public class multiplosTres{

    public static void main(String[] args) {
        int multiplicador = 3;
        for(int i = 1; i < 100; i++){
            int multiplo = multiplicador * i;
            if(multiplo > 100){
                break;
            } else {
                System.out.println(multiplo);
            }
        }
    }
}