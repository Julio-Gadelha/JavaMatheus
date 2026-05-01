package Heranca.Exercise3;

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Bônus padrão (10%)
    public double calcularBonus() {
        return getSalario() * 0.10;
    }

    // 🔥 Salário + bônus
    public double calcularSalarioComBonus() {
        return getSalario() + calcularBonus();
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }
}