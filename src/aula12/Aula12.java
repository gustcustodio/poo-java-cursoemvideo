package aula12;

import aula12.entities.aves.Ave;
import aula12.entities.mamiferos.Cachorro;
import aula12.entities.mamiferos.Canguru;
import aula12.entities.mamiferos.Mamifero;
import aula12.entities.peixes.Peixe;
import aula12.entities.repteis.Cobra;
import aula12.entities.repteis.Reptil;

public class Aula12 {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();
        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();


        //        mamifero.setPeso(35.3);
        //        mamifero.setCorPelo("Marrom");
        //        mamifero.alimentar();
        //        mamifero.emitirSom();

        /*
        System.out.print("Mamífero: ");
        mamifero.locomover();
        System.out.print("Ave: ");
        ave.locomover();
        System.out.print("Peixe: ");
        peixe.locomover();
        System.out.print("Réptil: ");
        reptil.locomover();
        */

        System.out.print("Canguru: ");
        canguru.locomover();
        System.out.print("Cachorro: ");
        cachorro.locomover();

        System.out.print("Canguru: ");
        canguru.emitirSom();
        System.out.print("Cachorro: ");
        cachorro.emitirSom();
    }
}
