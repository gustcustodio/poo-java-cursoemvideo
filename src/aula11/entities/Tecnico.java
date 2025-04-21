package aula11.entities;

public class Tecnico extends Aluno {
    private Integer registroProfissional;

    public Tecnico(Integer idade, String nome, String sexo,
                   Integer matricula, String curso, Integer registroProfissional) {
        super(idade, nome, sexo, matricula, curso);
        this.registroProfissional = registroProfissional;
    }

    public void praticar() {
        System.out.println("Praticando");
    }

    public Integer getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(Integer registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", curso='" + curso + '\'' +
                ", matricula='" + matricula + '\'' +
                ", registroProfissional= '" + registroProfissional + '\'' +
                '}';
    }
}
