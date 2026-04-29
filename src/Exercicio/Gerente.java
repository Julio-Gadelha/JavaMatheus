package Exercicio;

public class Gerente extends Funcionario {


    public Gerente(String nome, int codigo) {
        super(nome, codigo);
    }

    @Override
    public double getSalario() {
        double salarioAtual = super.getSalario();
        double SalarioAtual = salarioAtual + (salarioAtual * 0.45);
        return salarioAtual;
    }
}
