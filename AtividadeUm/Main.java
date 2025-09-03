package AtividadeUm;

public class Main {
    public static void main (String[] args){

        Livro livro1 = new Livro("O Corvo", "Edgar Allan Poe ", 47);
        Livro livro2 = new Livro("A Redoma de Vidro", "Sylvia Plath", 70);

        livro1.exibirInformacoes();
        livro2.exibirInformacoes();

    }
}
