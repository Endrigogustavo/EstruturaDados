

public class Pilha {

    int topo = -1;
    int tamanho;
    int qtdeElementos;
    char firstPalindro[];
    char secondPalindro[];

    public Pilha(int tamanho) {
        firstPalindro = new char[tamanho];
        secondPalindro = new char[tamanho];
    }

    public void createArrayWithString(String palindromo){
        for(int i = 0; i < palindromo.length(); i++){
            push(palindromo.charAt(i));
        }
        show(firstPalindro);
        createReverseArrayWithString(palindromo);
    }

    public void createReverseArrayWithString(String palindromo){
        int j =0;
        for(int i = palindromo.length() - 1; i >= 0; i--){             
            secondPalindro[j] = firstPalindro[i];
            j++; 
        }      
        show(secondPalindro);
        System.out.println("\n");
        compareArray(firstPalindro, secondPalindro);
    }

    public void compareArray(char[] p, char[] secondPalindro){
        int j = p.length;
        boolean trueOrFalse = true;
        for (int i = 0; i < p.length; i++) {
            if (p[i] == secondPalindro[i]){
                trueOrFalse = true;
            }else{
                trueOrFalse = false;
                break;
            }
            j--;
        }

        if(trueOrFalse == true){
            System.out.println("É palindromo");
        }else{
            System.out.println("É diferente");
        }
    }

    public void push(char NewCharByString) {
        topo++;
        firstPalindro[topo] = NewCharByString;
        qtdeElementos++;
    }

    public int pop() {
        int x = firstPalindro[topo];
        topo--;
        qtdeElementos--;
        return x;
    }

    public void show(char[] p) {
        String elementos = "";
        for (int i = topo; i >= 0; i--) {
            elementos += "" + p[i];
            
        }
        System.out.println(elementos + " ");
    }

}
