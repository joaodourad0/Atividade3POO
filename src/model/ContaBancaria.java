package model;

public class ContaBancaria {
    
    private String cliente;
    private int num_conta;
    private float saldo;

    public ContaBancaria(String cliente, int num_conta) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = 0;
    }

 
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }


    public int getNumConta() {
        return num_conta;
    }
    public void setNumConta(int num_conta) {
        this.num_conta = num_conta;
    }

    
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
  
    public void sacar(float valor) {
        if (saldo - valor >= 0) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    
    public void depositar(float valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }


    public void mostrarDados() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Número da Conta: " + num_conta);
        System.out.println("Saldo: R$" + saldo);
    }
}
