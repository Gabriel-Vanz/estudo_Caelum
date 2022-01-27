package Exercicio_cap4;



public class Banco {
    public static void main(String[] args) {
        
        Conta n1 = new Conta();
        Cliente c1 = new Cliente();

        n1.titular = c1;
        n1.titular.nome = "Pedro";
        n1.titular.cpf = "060.890.390-00";
        n1.titular.celular = "(54) 9 99543-3243";
        n1.aberturaConta = "11/10/2001";
        n1.agencia = "São Cristóvao 01";
        n1.numeroConta = 0001;
        n1.saldo = 150.35;
        
        


        System.out.println("Dados do cliente: "+
        "\nNome: "+n1.titular.nome+
        "\nCPF: "+n1.titular.cpf+
        "\nCelular: "+n1.titular.celular);
        
        System.out.println("Dados da conta: "+
        "\nAgência: "+n1.agencia+
        "\nData de abertura da Conta: "+n1.agencia+
        "\nNúmero da Conta: "+n1.numeroConta+
        "\nSaldo: "+n1.saldo);

        // Testes
        n1.sacar(100.0);    
        System.out.println("Saldo pós saque: "+n1.saldo);
        
        n1.depositar(200.0);
        System.out.println("Saldo pós depósito: "+n1.saldo);

        System.out.println("Rendimentos: "+n1.rendimentoMensal());
      
        
    }

}

