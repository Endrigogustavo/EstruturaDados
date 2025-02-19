package itens;

public class pizza {
    private String nome;
    private double preco;

    public pizza(String nome, double preco){
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
