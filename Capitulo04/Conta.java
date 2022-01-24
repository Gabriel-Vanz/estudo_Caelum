package Capitulo04;

class Conta {
    String numero;
    /* Poderia colocar Cliente titular = new Cliente(); fazendo com que não precisasse instanciar no programa, porém entra o paradigma, para toda conta, preciso de um novo cliente? */
    Cliente titular;
    double saldo;
    
    boolean sacar(double quantidade){
        if(this.saldo < quantidade){
            return false;

        } else {
            this.saldo = this.saldo - quantidade;
            return true;
        }
    }

    void depositar(double quantidade){
        this.saldo += quantidade;
    }

    void transferir(Conta destino, double valor){
        this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;
    }


}


