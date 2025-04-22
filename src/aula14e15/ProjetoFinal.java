package aula14e15;

import aula14e15.model.entities.Gafanhoto;
import aula14e15.model.entities.Video;
import aula14e15.model.entities.Visualizacao;

public class ProjetoFinal {
    public static void main(String[] args) {

        Gafanhoto gafanhoto = new Gafanhoto(
                "Pedro",
                "Masculino",
                22,
                "pedro@email.com"
        );

        System.out.println("\n" + gafanhoto);

        Video video = new Video("Bombardino Crocodillo");

        System.out.println("\n" + video);

        Visualizacao visualizacao = new Visualizacao(gafanhoto, video);

        System.out.println("\n" + visualizacao);

        video.play();
        video.like();
        System.out.println("\n" + video);

        gafanhoto.viuMaisUm();
        gafanhoto.ganharExp();
        System.out.println("\n" + gafanhoto);

        // visualizacao.avaliar();
        // visualizacao.avaliar(8);
        visualizacao.avaliar(50.0);
        System.out.println("\n" + video);

    }
}
