package aula02;

public class Aula02 {
    public static void main(String[] args) {
        System.out.println("c1: ");
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5;
        //        c1.tampar();
        c1.tampar();
        c1.status();
        c1.rabiscar();

        System.out.println("\nc2: ");
        Caneta c2 = new Caneta();
        c2.modelo = "BIC";
        c2.cor = "Preta";
        c2.destampar();
        c2.rabiscar();
    }
}