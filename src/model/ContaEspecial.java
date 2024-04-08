package model;

public class ContaEspecial extends ContaBancaria {
  
    private float limite;

 
    public ContaEspecial(String cliente, int num_conta, float limite) {
        super(cliente, num_conta);
        this.limite = limite;
    }

  
    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }


    @Override
    public void sacar(float valor) {
        if (getSaldo() - valor >= -limite) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
}
