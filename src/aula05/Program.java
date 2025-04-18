package aula05;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        ContaBanco conta01 = new ContaBanco(1111, "Jubileu");
        conta01.abrirConta("CC");

        System.out.println(conta01);

        ContaBanco conta02 = new ContaBanco(2222, "Creuza");
        conta02.abrirConta("CP");

        System.out.println(conta02);

    }
}
