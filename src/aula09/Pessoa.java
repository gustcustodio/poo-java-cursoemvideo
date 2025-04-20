package aula09;

public class Pessoa {
    private String nome, sexo;
    private Integer idade;

    public Pessoa(Integer idade, String nome, String sexo) {
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void fazerAniversario() {
        setIdade(getIdade() + 1);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" +
               "Idade: " + getIdade() + "\n" +
               "Sexo: " + getSexo() + "\n";
    }
}
