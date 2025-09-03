package AtividadeUm;

public class Livro {
    String titulo;
    String autor;
    float preco;

    public Livro (String titulo, String autor, float preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public void exibirInformacoes(){
        System.out.println("O título do livro é: "+titulo);
        System.out.println("O autor do livro é: "+autor);
        System.out.println("O preço do livro é: R$ "+preco);
        System.out.println("--------------------------------");

    }
}
