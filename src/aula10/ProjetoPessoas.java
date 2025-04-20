package aula10;

import aula10.entities.Aluno;
import aula10.entities.Funcionario;
import aula10.entities.Pessoa;
import aula10.entities.Professor;

public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(
                20,
                "Pedro",
                "Masculino"
        );

        Aluno p2 = new Aluno(
                15,
                "Maria",
                "Feminino",
                "ADS",
                157893
        );

        Professor p3 = new Professor(
                43,
                "Guanabara",
                "Masculino",
                "Computação",
                7000.00
        );

        Funcionario p4 = new Funcionario(
                77,
                "Valdir",
                "Masculino",
                "Cafézinho",
                true
        );

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        p2.cancelarMatricula();

        p3.receberAumento(1000.00);
        System.out.println(p3.getSalario());

        p4.mudarTrabalhando();
        System.out.println(p4.getTrabalhando());
    }
}
