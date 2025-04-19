package aula07e08;

public class Luta {
    private Lutador desafiado, desafiante;
    private Integer rounds;
    private Boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Integer getRounds() {
        return rounds;
    }

    public void setRounds(Integer rounds) {
        this.rounds = rounds;
    }

    public Boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        if (desafiado.getCategoria().equals(desafiante.getCategoria()) && desafiado != desafiante) {
            this.aprovada = true;
            this.desafiado = desafiado;
            this.desafiante = desafiante;
        } else {
            System.out.println("Lutadores de categorias diferente!");
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("## DESAFIADO ##");
            System.out.println(desafiado.apresentar());
            System.out.println("## DESAFIANTE ##");
            System.out.println(desafiante.apresentar());
            int vencedor = (int) (Math.random() * 3);

            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(desafiado.getNome() + " venceu a luta!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(desafiante.getNome() + " venceu a luta!");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }
        } else {
            System.out.println("Luta não pode acontecer!");
        }
    }
}
