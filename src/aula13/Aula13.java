package aula13;

public class Aula13 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        System.out.print("Reação 1: ");
        cachorro.reagir(("Olá"));
        System.out.print("Reação 2: ");
        cachorro.reagir(19);
        System.out.print("Reação 3: ");
        cachorro.reagir(true);
        System.out.print("Reação 4: ");
        cachorro.reagir(10, 7.0);
    }
}
