import carrinho.carrinhoCompra;
import itens.bebida;
import itens.pizza;

public class main {
    public static void main(String[] args) {
        pizza p1 = new pizza("Mussarela", 10);
        pizza p2 = new pizza("Queijo", 30);
        pizza p3 = new pizza("Calabreza", 50);
  
        bebida b1 = new bebida("Agua", 10);
        bebida b2 = new bebida("Suco", 10);
        bebida b3 = new bebida("Coca", 10);
        bebida b4 = new bebida("Coco", 10);

        carrinhoCompra c1 = new carrinhoCompra();
        c1.adicionaPizza(p1);
        c1.adicionaPizza(p2);
        c1.adicionaPizza(p3);
        c1.adicionaBebida(b1);
        c1.adicionaBebida(b2);
        c1.adicionaBebida(b3);
        c1.adicionaBebida(b4);

        System.out.println("Preço a pagar = " + c1.getTotal());
    }
}
