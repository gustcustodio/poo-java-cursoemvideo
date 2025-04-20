package aula10.entities;

public class Aluno extends Pessoa {
    private String curso;
    private Integer matricula;

    public Aluno(Integer idade, String nome, String sexo, String curso, Integer matricula) {
        super(idade, nome, sexo);
        this.curso = curso;
        this.matricula = matricula;
    }

    public void cancelarMatricula() {
        System.out.println("Matrícula cancelada");
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
}
