public class App {

    public static void main(String[] args) {
        Livro l1 = new Livro("Livro 1", 2019, 29.99);
        Livro l2 = new Livro("Livro 2", 2017, 15.99);
        Livro l3 = new Livro("Livro 3", 2015, 27.99);
        Livro l4 = new Livro("Livro 4", 2014, 17.99);

        Lista lista = new Lista();

        lista.adiciona(l1);  //adicionar o livro 1
        lista.adiciona(l2);  //adicionar o livro 2
        lista.adiciona(l3);  //adicionar o livro 3
        lista.adiciona(l4);  //adicionar o livro 4

        System.out.println("===================");
        System.out.println("Topo: \n" + lista.topo());
        System.out.println("===================");
        System.out.println("Todos Elementos:");
        lista.mostraLivros();

        System.out.println("===================");
        System.out.println("Removendo livro:");

        lista.remove();

        lista.mostraLivros();

        System.out.println("===================");
        System.out.println("Topo: \n" + lista.topo());

    
    
        }
}