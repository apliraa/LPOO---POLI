package AtividadeTres;

public class Cliente {
    public String cpf;
    public String nome;
    public Endereço endereco;
    public double salario;

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public double calcularRendimento(int meses){
        double rendimento = salario * meses;
        return rendimento;
    }
}
