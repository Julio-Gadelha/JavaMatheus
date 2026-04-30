package Heranca.Exercicio2.TestConta;

import Heranca.Exercicio2.ContaCorrente;

public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente contacorrente = new ContaCorrente();
        contacorrente.informarNumeroConta(1);
        contacorrente.informarNomeCliente("Gabriel");
        contacorrente.depositar(900);
        System.out.println("Depositado   R$ 500,00 . valor da conta : " + contacorrente.retornarSaldoAtual());
        contacorrente.sacar(100);
        System.out.println("Saque  de R$ 100 . Valor da conta  : " + contacorrente.retornarSaldoAtual());
        contacorrente.sacar(300);
    }
}
