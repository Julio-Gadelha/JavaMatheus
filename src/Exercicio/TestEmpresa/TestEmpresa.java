package Exercicio.TestEmpresa;

import Exercicio.Gerente;

public class TestEmpresa {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gabriel ",4);
        System.out.println(gerente.imprimirFolhaPagamamento());
    }
}
