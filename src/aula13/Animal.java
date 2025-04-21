package aula13;

public abstract class Animal {
    protected Double peso;
    protected Integer idade, membros;

    public abstract void emitirSom();

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getMembros() {
        return membros;
    }

    public void setMembros(Integer membros) {
        this.membros = membros;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
