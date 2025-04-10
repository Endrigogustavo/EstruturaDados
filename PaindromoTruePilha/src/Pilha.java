

public class Pilha {

    int topo = -1;
    int tamanho;
    int qtdeElementos;
    char p[];

    public Pilha(int tamanho) {
        p = new char[tamanho];
    }

    public void createArrayWithString(String palindromo){
        for(int i = 0; i < palindromo.length(); i++){
            push(palindromo.charAt(i));
        }
        show(p);
        createReverseArrayWithString(palindromo);
    }

    public void createReverseArrayWithString(String palindromo){
        char[] p2 = new char[palindromo.length()];
        int j =0;
        for(int i = palindromo.length() - 1; i >= 0; i--){             
            p2[j] = p[i];
            j++; 
        }      
        show(p2);
        System.out.println("\n");
        compareArray(p, p2);
    }

    public void compareArray(char[] p, char[] p2){
        int j = p.length;
        boolean trueOrFalse = true;
        for (int i = 0; i < p.length; i++) {
            if (p[i] == p2[i]){
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
        p[topo] = NewCharByString;
        qtdeElementos++;

    }

    public int pop() {
        int x = p[topo];
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
