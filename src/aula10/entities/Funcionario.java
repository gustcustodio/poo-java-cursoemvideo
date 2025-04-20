package aula10.entities;

public class Funcionario extends Pessoa{
    private String setor;
    private Boolean trabalhando;

    public Funcionario(Integer idade, String nome, String sexo, String setor, Boolean trabalhando) {
        super(idade, nome, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalhando() {
        setTrabalhando(!getTrabalhando());
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Boolean getTrabalhando() {
        return trabalhando;
    }

    private void setTrabalhando(Boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
