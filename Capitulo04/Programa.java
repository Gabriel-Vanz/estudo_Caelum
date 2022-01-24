package Capitulo04;

public class Programa {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        Cliente n1 = new Cliente();
        Cliente n2 = new Cliente();

        /* Declarações C1 */
        c1.titular = n1;
        c1.titular.nome = "Gabriel";
        c1.numero = "000-1";
        c1.saldo = 0.0;        

        /* Declarações C2 */
        c2.titular = n2;
        c2.titular.nome = "Joao";
        c2.numero = "000-2";
        c2.saldo = 100.0;

        /* Mostra as informações das contas */
        System.out.println("\nDados conta: "+"\nNome: "+c1.titular.nome+
        "\nNúmero: "+c1.numero+
        "\nSaldo: "+c1.saldo);

        System.out.println("===============================");

        System.out.println("Dados conta: "+"\nNome: "+c2.titular.nome+
        "\nNúmero: "+c2.numero+
        "\nSaldo: "+c2.saldo);


        c2.transferir(c1, 50.0);

        /* Faz a confirmação se consigo sacar */
        boolean consegui = c1.sacar(100.0);
        if (consegui){
            System.out.println("\nConsegui sacar!");
        } else {
            System.out.println("\nNão consegui sacar!");
        }
        
        System.out.println("\nNovo saldo da conta "+ c1.titular+": "+c1.saldo);
        System.out.println("\nNovo saldo da conta "+ c2.titular+": "+c2.saldo);
    }
}


        /* Sacar R$500,00 
        c1.sacar(500.0); */
        /* Depositar R$100,0 
        c1.depositar(100.0); */
        
        
        
        