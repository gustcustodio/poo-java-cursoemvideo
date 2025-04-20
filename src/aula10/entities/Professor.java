package aula10.entities;

public class Professor extends Pessoa {
    private String especialidade;
    private Double salario;

    public Professor(Integer idade, String nome, String sexo, String especialidade, Double salario) {
        super(idade, nome, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAumento(Double aumento) {
        setSalario(getSalario() + aumento);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Double getSalario() {
        return salario;
    }

    private void setSalario(Double salario) {
        this.salario = salario;
    }
}
