
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String palindromo = scanner.nextLine();
        System.out.println("\n");
        Pilha p1 = new Pilha(palindromo.length());
        p1.createArrayWithString(palindromo);
    }
}
