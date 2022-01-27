package Exercicio_cap4;

class Conta {
    Cliente titular;
    int numeroConta;
    String agencia;
    double saldo;
    String aberturaConta;

    void sacar(double valorSaque){
        if(valorSaque > this.saldo){
            System.out.println("Você não tem saldo suficiente!");
        } else if(valorSaque < this.saldo){
            this.saldo = this.saldo - valorSaque;
        }
    }

    void depositar(double valorDeposito){
        this.saldo += valorDeposito;
    }

    double rendimentoMensal(){
        double rendimento = this.saldo * 0.1;
        return rendimento;
    }


}

