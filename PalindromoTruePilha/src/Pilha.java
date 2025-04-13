public class Pilha {

    int topo = -1;
    int tamanho;
    int qtdeElementos;
    char PalindroArray[];

    int inicio = -1;

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        qtdeElementos = 0;
        PalindroArray = new char[tamanho];
    }

    public void createArrayWithString(String palindromo){
        for(int i = 0; i < palindromo.length(); i++){
            push(palindromo.charAt(i));
        }
    }

    public boolean isVoid(){
        return qtdeElementos == 0;
    }

    public boolean isFull(){
        return qtdeElementos == tamanho;
    }

    public void push(char e){
        if(!isFull()){
            if(inicio == -1){
                inicio = 0;
            }
            topo++;
            PalindroArray[topo] = e;
            qtdeElementos++;
        }
    }

    public char pop(){
        char ReturnCharValue = 0;
        if(!isVoid()){
            char ArrayValue = PalindroArray[topo];
            topo--;
            qtdeElementos--;
            return ArrayValue;
        }
        return ReturnCharValue;
    }


    public void show() {
        String elementos = "";
        for (int i = topo; i >= 0; i--) {
            elementos += "" + PalindroArray[i];
        }
        System.out.println(elementos + " ");
    }

}
