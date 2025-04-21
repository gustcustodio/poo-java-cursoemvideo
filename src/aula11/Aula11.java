package aula11;

import aula11.entities.*;

public class Aula11 {
    public static void main(String[] args) {

        Visitante v1 = new Visitante(22, "Juvenal", "Masculino");
        System.out.println(v1);

        System.out.println("------------------------------------------------------------");

        Aluno a1 = new Aluno(
                25,
                "Jubileu",
                "Masculino",
                1575,
                "ADS"
        );

        System.out.println(a1);
        a1.pagarMensalidade();

        System.out.println("------------------------------------------------------------");

        Bolsista b1 = new Bolsista(
                25,
                "Maria",
                "Masculino",
                1675,
                "ADS",
                12.5
        );

        System.out.println(b1);
        b1.pagarMensalidade();

        System.out.println("------------------------------------------------------------");

        Professor p1 = new Professor(
                38,
                "Raimundo",
                "Masculino",
                "Ciência da Computação",
                10500.00
        );

        System.out.println(p1);
        p1.receberAumento(1500.00);

        System.out.println("------------------------------------------------------------");

        Tecnico t1 = new Tecnico(
                28,
                "Romeu",
                "Masculino",
                1875,
                "ADS",
                55447766
        );

        System.out.println(t1);
        t1.praticar();
    }
}
