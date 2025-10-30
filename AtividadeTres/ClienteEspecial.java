package AtividadeTres;

public class ClienteEspecial extends Cliente {
    double percentualBonus;

    public ClienteEspecial(String nome, String cpf, Endereço endereco, double percentualBonus) {
        super (nome, cpf);
        this.endereco = endereco;
        this.percentualBonus = percentualBonus;
    }

    public double calcularComBonus(int meses){
        double salarioMensalComBonus = this.salario * (1 + (this.percentualBonus / 100.0));
        double rendimentoTotal = salarioMensalComBonus * meses;
        return rendimentoTotal;
    }
}
