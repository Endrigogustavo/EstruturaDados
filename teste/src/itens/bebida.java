package itens;

public class bebida {
    private String nome;
    private double preco;

    public bebida(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

   public double getPreco(){
    return preco;
   }

   public void setPreco(double preco){
    this.preco = preco;
   }
}