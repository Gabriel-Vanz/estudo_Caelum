package Capitulo03;

public class loopFor {

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            // Não irá dar o print de 51 a 59 devido a condição
            if(i > 50 && i < 60){
                continue;
            }
            System.out.println(i);
        }
    }
    
}
