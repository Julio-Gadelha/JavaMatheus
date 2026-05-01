package Heranca.Exercise3;

public class Desenvolvedor extends Funcionario {

    private String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.15;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Linguagem: " + linguagem);
    }
}
