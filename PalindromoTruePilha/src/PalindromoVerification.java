public class PalindromoVerification {
    public void compareArray(char[] firstPalindromo, char[] secondPalindro){
        int j = firstPalindromo.length;
        boolean trueOrFalse = true;
        for (int i = 0; i < firstPalindromo.length; i++) {
            if (firstPalindromo[i] == secondPalindro[i]){
                trueOrFalse = true;
            }else{
                trueOrFalse = false;
                break;
            }
            j--;
        }
        showResult(trueOrFalse);
    }

    public void showResult(boolean trueOrFalse){
        if (trueOrFalse == true){
            System.out.println("É um palíndromo!");
        }else{
            System.out.println("Não é um palíndromo!");
        }
    }
}
