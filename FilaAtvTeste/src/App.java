public class App {
    public static void main(String[] args) {
        Fila filaTeste = new Fila();
        filaTeste.enfileira("1");  
        filaTeste.enfileira("2"); 
        filaTeste.enfileira("3"); 
        filaTeste.enfileira("4"); 
        filaTeste.imprime();

        System.out.println("-----------------------------------");

        filaTeste.desenfileira();
        filaTeste.desenfileira();
        filaTeste.desenfileira();

        filaTeste.enfileira("1"); 
        filaTeste.enfileira("2"); 
        filaTeste.enfileira("9"); 
        filaTeste.imprime();
        
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
