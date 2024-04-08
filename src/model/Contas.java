package model;

public class Contas {
    public static void main(String[] args) {

        ContaPoupanca contaPoupanca = new ContaPoupanca("João", 1234, 1000);
        contaPoupanca.depositar(1000);
        contaPoupanca.calcularNovoSaldo(0.5f);
        contaPoupanca.mostrarDados();
        System.out.println();

  
        ContaEspecial contaEspecial = new ContaEspecial("João", 5678, 5000);
        contaEspecial.depositar(2000);
        contaEspecial.sacar(2500);
        contaEspecial.sacar(3000);
        contaEspecial.mostrarDados();
    }
}
