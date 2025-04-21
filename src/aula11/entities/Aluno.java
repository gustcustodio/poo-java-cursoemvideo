package aula11.entities;

public class Aluno extends Pessoa {
    protected Integer matricula;
    protected String curso;

    public Aluno(Integer idade, String nome, String sexo, Integer matricula, String curso) {
        super(idade, nome, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do aluno " + this.getNome() + ".");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", curso='" + curso + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
