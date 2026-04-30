package Heranca.Exercicio2;

public class Conta {
    private int numeroConta;
    private String nomeCliente;
    private double SaldoAtual;

    public void informarNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void informarNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void depositar(double valorDeposito) {
        this.SaldoAtual += valorDeposito;
    }

    public void sacar(double valorSacar) {
        if(  this.SaldoAtual - valorSacar <= 0 ){
            System.out.println("Saldo baixo !");
            return;
        }
        this.SaldoAtual -= valorSacar;

    }

    public double retornarSaldoAtual() {
        return this.SaldoAtual;
    }

}
