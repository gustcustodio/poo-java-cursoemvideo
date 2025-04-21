package aula14e15.model.entities;

public class Gafanhoto extends Pessoa {
    private String login;
    private Integer totalAssistido;

    public void viuMaisUm () {
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

    public void setTotalAssistido(Integer totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public void ganharExp() {
        setExperiencia(getExperiencia() + 1);
    }
}
