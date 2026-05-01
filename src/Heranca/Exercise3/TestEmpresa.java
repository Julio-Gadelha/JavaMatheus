package Heranca.Exercise3;

public class TestEmpresa {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Carlos", 5000, "TI");
        Desenvolvedor dev = new Desenvolvedor("Ana", 4000, "Java");

        System.out.println("=== GERENTE ===");
        gerente.exibirDados();
        System.out.println("Bônus: " + gerente.calcularBonus());

        System.out.println("\n=== DESENVOLVEDOR ===");
        dev.exibirDados();
        System.out.println("Bônus: " + dev.calcularBonus());
    }
}