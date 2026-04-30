package Heranca.Exercicio2;

public class Contapoupanca extends ContaCorrente{

    public void aplicarRendimento(double percentual){
        double saldo = retornarSaldoAtual();
        double rendimento = saldo * (percentual / 100);
        depositar(rendimento);
    }
}
