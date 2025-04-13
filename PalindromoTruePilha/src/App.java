
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String palindromo = scanner.nextLine();
        System.out.println("\n");

        Pilha firstWord = new Pilha(palindromo.length());
        firstWord.createArrayWithString(palindromo);
        Pilha auxPilha = new Pilha(palindromo.length());
        Pilha secondWord = new Pilha(palindromo.length());
        auxPilha.createArrayWithString(palindromo);

        for(int i = 0; i < palindromo.length(); i++){
            secondWord.push(auxPilha.pop());
        }

        firstWord.show();
        secondWord.show();

        PalindromoVerification palindromoVerification = new PalindromoVerification();
        palindromoVerification.compareArray(firstWord.PalindroArray, secondWord.PalindroArray);
    }
}
