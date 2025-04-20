package aula09;

public class Program {
    public static void main(String[] args) {
        Pessoa gustavo = new Pessoa(27, "Gustavo", "Masculino");
        System.out.println(gustavo);
        // gustavo.fazerAniversario();
        // System.out.println(gustavo);

        Livro livroAlgoritmos = new Livro(
                "Algoritmos",
                "Manzano",
                368,
                310,
                gustavo);

        System.out.println(livroAlgoritmos.detalhes() + "\n");

        // System.out.println("\n" + livroAlgoritmos.getAberto());
        // livroAlgoritmos.abrir();
        // System.out.println("\n" + livroAlgoritmos.getAberto());
        // livroAlgoritmos.fechar();
        // System.out.println("\n" + livroAlgoritmos.getAberto());
        // livroAlgoritmos.folhear(150);
        // System.out.println(livroAlgoritmos.getPaginaAtual());
        // livroAlgoritmos.avancarPagina();
        // System.out.println(livroAlgoritmos.getPaginaAtual());
        // livroAlgoritmos.voltarPagina();
        // System.out.println(livroAlgoritmos.getPaginaAtual());
        // System.out.println(livroAlgoritmos.getTitulo());
        // System.out.println(livroAlgoritmos.getAutor());
        // System.out.println(livroAlgoritmos.getTotalDePaginas());
        // System.out.println(livroAlgoritmos.getLeitor());
        // livroAlgoritmos.folhear(370);
        // System.out.println(livroAlgoritmos.getAberto());
        // livroAlgoritmos.abrir();
        // livroAlgoritmos.folhear(200);
    }
}
