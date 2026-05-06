package Heranca.Exercise3;

public class TestEmpresa {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Carlos", 5000, "TI");
        Desenvolvedor dev = new Desenvolvedor("Ana", 4000, "Java");

        System.out.println("GERENTE ");
        gerente.exibirDados();
        System.out.println("Bônus: " + gerente.calcularBonus());
        System.out.println("Salário com bônus: " + gerente.calcularSalarioComBonus());

        System.out.println("\nDESENVOLVEDOR ");
        dev.exibirDados();
        System.out.println("Bônus: " + dev.calcularBonus());
        System.out.println("Salário com bônus: " + dev.calcularSalarioComBonus());
    }
}