public class App {
    public static void main(String[] args) throws Exception {
        Fila fila1 = new Fila();
        fila1.Enfileirar("A");
        fila1.Enfileirar("B");
        fila1.Enfileirar("C");
        fila1.imprime();
        System.out.println("\n");
        System.out.println("Tirando item");
        fila1.Desenfileirar();
        fila1.imprime();
    }
}
