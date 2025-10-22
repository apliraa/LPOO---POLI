package AtividadeQuatro;

public class Animal{
    private String nome;
    private double peso;

    public Animal(String nome, double peso){
        this.nome = nome;
        setPeso(peso);
    }

    public void setPeso(double novoPeso){
        if(novoPeso > 0){
            this.peso = novoPeso;
        }
    }

   public String getNome(){
        return this.nome;
   }

   public double getPeso(){
        return this.peso;
   }

   public void print(){
       System.out.println("Nome: " + this.nome);
       System.out.println("Peso: " + this.peso);
   }

}