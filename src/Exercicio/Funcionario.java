package Exercicio;

public class Funcionario extends Pessoa {
    ;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, int codigo) {
        super(nome, codigo);

    }

    public double getSalario() {
        return 2000.00;
    }

    public String imprimirFolhaPagamamento() {
        return "Codigo: " + getCodigo() + " Nome: " + getNome() + "Salario : " + getSalario();
    }


}
