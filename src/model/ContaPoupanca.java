package model;

public class ContaPoupanca extends ContaBancaria {
  
    private int diaRendimento;


    public ContaPoupanca(String cliente, int num_conta, int diaRendimento) {
        super(cliente, num_conta);
        this.diaRendimento = diaRendimento;
    }


    public int getDiaRendimento() {
        return diaRendimento;
    }
    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

 
    public void calcularNovoSaldo(float taxaRendimento) {
        float novoSaldo = getSaldo() * (1 + taxaRendimento / 100);
        depositar(novoSaldo - getSaldo());
    }
}
