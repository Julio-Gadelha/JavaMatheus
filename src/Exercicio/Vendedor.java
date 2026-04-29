package Exercicio;

public class Vendedor  extends Funcionario{
    public Vendedor(String nome, int codigo) {
        super(nome, codigo);
    }

    @Override
    public double getSalario() {
      double SalarioAtual = super.getSalario();
      SalarioAtual = SalarioAtual + (SalarioAtual * 0.20);
      return SalarioAtual;
    }
}
