public class App {
    public static void main(String[] args) {
        Fila filaTeste = new Fila();
        System.out.println("Add dados");
        System.out.println("-----------------------------------");
        filaTeste.enfileira("1");  
        filaTeste.imprime();
        System.out.println("-----------------------------------");
        filaTeste.enfileira("2"); 
        filaTeste.imprime();
        System.out.println("-----------------------------------");
        filaTeste.enfileira("3"); 
        filaTeste.imprime();
        System.out.println("-----------------------------------");
        filaTeste.enfileira("4"); 
        filaTeste.imprime();
        System.out.println("-----------------------------------");

       
        System.out.println("\nRemove dados");
        System.out.println("-----------------------------------");
        System.out.println("Dados removidos: " + filaTeste.desenfileira() + "," + filaTeste.desenfileira() + "," + filaTeste.desenfileira());
        

        System.out.println("\nAdd new dados com a fila cheia:");
        filaTeste.enfileira("1"); 
        filaTeste.imprime();
        System.out.println("-----------------------------------");
        filaTeste.enfileira("2"); 
        filaTeste.imprime();
        System.out.println("-----------------------------------");
        filaTeste.enfileira("9"); 
        filaTeste.imprime();
        System.out.println("-----------------------------------");
        
        System.out.println("\nDados Vetor");
        System.out.println("-----------------------------------");
        System.out.println("Primeiro valor: " + filaTeste.primeiro());
        System.out.println("-----------------------------------");
        System.out.println("Ultimo valor: " + filaTeste.ultimo());
        System.out.println("-----------------------------------");
        System.out.println("Vetor vazio: " + filaTeste.vazio());
        System.out.println("-----------------------------------");
        System.out.println("Tamanho vetor: " + filaTeste.tamanho());
    }
}
