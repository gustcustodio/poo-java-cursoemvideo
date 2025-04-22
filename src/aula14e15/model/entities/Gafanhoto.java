package aula14e15.model.entities;

public class Gafanhoto extends Pessoa {
    private String login;
    private Integer totalAssistido;

    public Gafanhoto(String nome, String sexo, Integer idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.totalAssistido = 0;
    }

    public void viuMaisUm() {
        setTotalAssistido(getTotalAssistido() + 1);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getTotalAssistido() {
        return totalAssistido;
    }

    protected void setTotalAssistido(Integer totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public void ganharExp() {
        setExperiencia(getExperiencia() + 1);
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", experiencia=" + experiencia +
                ", login='" + login + '\'' +
                ", totalAssistido=" + totalAssistido +
                '}';
    }
}
