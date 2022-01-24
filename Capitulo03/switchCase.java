package Capitulo03;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number: ");
        number = scanner.nextInt();
        scanner.close();
        //Passa um valor para o switch e ele vai comparar com os cases, cases = ifs, default = else
        switch(number){
            case 1:
                System.out.println("number 1");
                break;
            case 2:
                System.out.println("number 2");
                break;
            default:
                System.out.println("You have typed a number!");
        }
    }
    
}
