package aula07e08;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador[] lutadores = new Lutador[6];

        lutadores[0] = new Lutador(
                "Pretty Boy",
                "França",
                31,
                1.75,
                68.9,
                11,
                3,
                1
        );

        lutadores[1] = new Lutador(
                "Putscript",
                "Brasil",
                29,
                1.68,
                57.8,
                14,
                2,
                3
        );

        lutadores[2] = new Lutador(
                "Snapshadow",
                "EUA",
                35,
                1.65,
                80.9,
                12,
                2,
                1
        );

        lutadores[3] = new Lutador(
                "Dead Code",
                "Austrália",
                28,
                1.93,
                81.6,
                13,
                0,
                2
        );

        lutadores[4] = new Lutador(
                "UFOCobol",
                "Brasil",
                37,
                1.70,
                119.3,
                5,
                4,
                3
        );

        lutadores[5] = new Lutador(
                "Nerdaart",
                "EUA",
                30,
                1.81,
                105.7,
                12,
                2,
                4
        );

        /*
        System.out.println("\nAPRESENTAÇÃO: ");
        System.out.println(lutadores[0].apresentar());
        System.out.println("\nSTATUS:");
        System.out.println(lutadores[0].status());

        lutadores[0].ganharLuta();
        lutadores[0].perderLuta();
        lutadores[0].empatarLuta();

        System.out.println("\nNOVO STATUS:");
        System.out.println(lutadores[0].status());
         */

        /*
        System.out.println("\nSTATUS ANTES DA LUTA:");
        System.out.println(lutadores[0].status());
        System.out.println(lutadores[1].status() + "\n");

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(lutadores[0], lutadores[1]);
        UEC01.lutar();

        System.out.println("\nSTATUS DEPOIS DA LUTA:");
        System.out.println(lutadores[0].status());
        System.out.println(lutadores[1].status());
        */

        Luta UEC02 = new Luta();
        UEC02.marcarLuta(lutadores[1], lutadores[4]);
        UEC02.lutar();

    }
}
