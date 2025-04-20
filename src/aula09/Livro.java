package aula09;

public class Livro implements Publicacao {
    private String titulo, autor;
    private Integer totalDePaginas, paginaAtual;
    private Boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, Integer totalDePaginas, Integer paginaAtual, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalDePaginas = totalDePaginas;
        this.paginaAtual = paginaAtual;
        this.leitor = leitor;
        setAberto(false);
    }

    public Boolean getAberto() {
        return aberto;
    }

    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public Integer getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(Integer paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getTotalDePaginas() {
        return totalDePaginas;
    }

    public void setTotalDePaginas(Integer totalDePaginas) {
        this.totalDePaginas = totalDePaginas;
    }

    public String detalhes() {
        return "Livro: "
                + getTitulo() + "\n"
                + "Autor: "
                + getAutor() + "\n"
                + "Número de páginas: "
                + getTotalDePaginas();
    }

    @Override
    public void abrir() {
        setAberto(true);
    }

    @Override
    public void fechar() {
        setAberto(false);
    }

    @Override
    public void folhear(int paginaFolheada) {
        if (paginaFolheada > getTotalDePaginas()) {
            System.out.println
                    ("A página informada é maior do que a quantidade total de páginas do livro.");
            return;
        }
        if (!aberto) {
            System.out.println("Abrindo o livro para folhear...");
            setAberto(true);
        }
        System.out.println("Folheando...");
        setPaginaAtual(paginaFolheada);
        System.out.println
                ("O livro agora está aberto na página: " + getPaginaAtual() + ".");
    }

    @Override
    public void avancarPagina() {
        setPaginaAtual(getPaginaAtual() + 1);
    }

    @Override
    public void voltarPagina() {
        setPaginaAtual(getPaginaAtual() - 1);
    }
}
