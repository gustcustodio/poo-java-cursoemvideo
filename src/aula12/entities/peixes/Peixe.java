package aula12.entities.peixes;

import aula12.entities.Animal;

public class Peixe extends Animal {
    private String corEscama;

    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
