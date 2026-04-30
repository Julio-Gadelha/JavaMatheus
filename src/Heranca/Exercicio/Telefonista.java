package Heranca.Exercicio;

public class Telefonista extends Funcionario {

    public Telefonista(String nome, int codigo) {
        super(nome, codigo);
    }

    @Override
    public double getSalario() {
    double SalarioAtual = super.getSalario();
    SalarioAtual = SalarioAtual + (SalarioAtual * 0.10);
    return SalarioAtual;
    }
}
