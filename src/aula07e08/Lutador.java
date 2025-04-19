package aula07e08;

public class Lutador {
    private Double altura, peso;
    private String nome, nacionalidade, categoria;
    private Integer idade, vitorias, derrotas, empates;

    public Lutador() {
    }

    public Lutador(
            String nome, String nacionalidade, Integer idade, Double altura, Double peso,
            Integer vitorias, Integer derrotas, Integer empates
    ) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
        String categoria;
        if (peso < 52.2) {
            categoria = "Inválido";
        } else if (peso <= 70.3) {
            categoria = "Leve";
        } else if (peso <= 83.9) {
            categoria = "Médio";
        } else if (peso <= 120.2) {
            categoria = "Pesado";
        } else {
            categoria = "Inválido";
        }
        setCategoria(categoria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }

    public String apresentar() {
        return "Lutador: " + getNome() + "\n" +
                "Origem: " + getNacionalidade() + "\n" +
                getIdade() + " anos" + "\n" +
                getAltura() + "m de altura" + "\n" +
                "Pesando: " + getPeso() + "Kg" + "\n" +
                "Vitória(s): " + getVitorias() + "\n" +
                "Derrota(s): " + getDerrotas() + "\n" +
                "Empate(s): " + getEmpates() + "\n";
    }

    public String status() {
        return getNome()
                + " é um peso " + getCategoria()
                + " com "
                + getVitorias() + " vitória(s) "
                + getDerrotas() + " derrota(s) "
                + getEmpates() + " empate(s)";
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
}
