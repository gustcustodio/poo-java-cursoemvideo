package aula11.entities;

public class Bolsista extends Aluno {
    private Double bolsa;

    public Bolsista(Integer idade, String nome, String sexo,
                    Integer matricula, String curso, Double bolsa) {
        super(idade, nome, sexo, matricula, curso);
        this.bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome() + ".");
    }

    public Double getBolsa() {
        return bolsa;
    }

    public void setBolsa(Double bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado.");
    }
}
