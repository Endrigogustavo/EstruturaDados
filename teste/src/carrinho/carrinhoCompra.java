package carrinho;
import itens.bebida;
import itens.pizza;

public class carrinhoCompra {
  private double frete = 0;
  private double total = 0;
  
    MinhaPrimeiraED carrinho = new MinhaPrimeiraED(5);

    public void adicionaBebida(bebida item){
        carrinho.adicionar(item);
        total += item.getPreco();
    }
    public void adicionaPizza(pizza item){
        carrinho.adicionar(item);
        total += item.getPreco();
    }

    public double getTotal(){
        return total;
    }
}
