package aula14e15.model.entities;

import aula14e15.model.interfaces.AcoesVideo;

public class Video implements AcoesVideo {
    private String titulo;
    private Boolean reproduzindo;
    private Integer avaliacao, views, curtidas;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.reproduzindo = false;
        this.views = 0;
        this.curtidas = 0;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }

    protected void setAvaliacao(Integer avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    protected void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public Boolean getReproduzindo() {
        return reproduzindo;
    }

    private void setReproduzindo(Boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getViews() {
        return views;
    }

    private void setViews(Integer views) {
        this.views = views;
    }

    @Override
    public void play() {
        setReproduzindo(true);
    }

    @Override
    public void pause() {
        setReproduzindo(false);
    }

    @Override
    public void like() {
        setCurtidas(getCurtidas() + 1);
    }

    @Override
    public String toString() {
        return "Video{" +
                "avaliacao=" + avaliacao +
                ", titulo='" + titulo + '\'' +
                ", reproduzindo=" + reproduzindo +
                ", views=" + views +
                ", curtidas=" + curtidas +
                '}';
    }
}
