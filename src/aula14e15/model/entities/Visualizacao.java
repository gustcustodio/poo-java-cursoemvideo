package aula14e15.model.entities;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
    }

    public void avaliar() {
        filme.setAvaliacao(5);
    }

    public void avaliar(Integer nota) {
        filme.setAvaliacao(nota);
    }

    public void avaliar(Double porcentagem) {
        int nota = 0;
        if (porcentagem <= 20.0) {
            nota = 3;
        } else if (porcentagem <= 50.0) {
            nota = 5;
        } else if (porcentagem <= 90.0) {
            nota = 8;
        } else {
            nota = 10;
        }
        filme.setAvaliacao(nota);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    private void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    private void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return espectador.getNome()
                + " está assistindo "
                + filme.getTitulo()
                + ".";
    }
}
