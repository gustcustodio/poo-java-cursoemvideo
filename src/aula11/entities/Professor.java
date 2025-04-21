package aula11.entities;

public class Professor extends Pessoa {
    private String especialidade;
    private Double salario;

    public Professor(Integer idade, String nome, String sexo,
                     String especialidade, Double salario) {
        super(idade, nome, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAumento(Double aumento) {
        System.out.println("Salário atual: R$" + getSalario());
        setSalario(getSalario() + aumento);
        System.out.println("Novo salário: R$" + getSalario());
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

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", salario='" + salario + '\'' +
                '}';
    }
}
