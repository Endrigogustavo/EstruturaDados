public class MinhaSegundaED {
    String[] nomes = new String[26];
    int totalNomes = 0;

    public void adicionar(String nome) {
        char primeiraLetra = nome.charAt(0);
        int posicao = getIndice(primeiraLetra);
        if(posicaoOcupada(posicao)){
            System.out.println("Letra já cadastrada");
        }else{
            nomes[posicao] = nome;
            totalNomes++;
        }

    }

    public int getIndice(char nome) {
        switch (nome) {
            case 'A':
                return 0;
            case 'B':
                return 1;
            case 'C':
                return 2;
            case 'D':
                return 3;
            case 'E':
                return 4;
            case 'F':
                return 5;
            case 'G':
                return 6;
            case 'H':
                return 7;
            case 'I':
                return 8;
            case 'J':
                return 9;
            case 'K':
                return 10;
            case 'L':
                return 11;
            case 'M':
                return 12;
            case 'N':
                return 13;
            case 'O':
                return 14;
            case 'P':
                return 15;
            case 'Q':
                return 16;
            case 'R':
                return 17;
            case 'S':
                return 18;
            case 'T':
                return 19;
            case 'U':
                return 20;
            case 'V':
                return 21;
            case 'W':
                return 22;
            case 'X':
                return 23;
            case 'Y':
                return 24;
            case 'Z':
                return 25;
            default:
                return -1;

        }
    }

    private boolean posicaoOcupada(int posicao){
        return nomes[posicao] != null;
    }

    private boolean posicaoValida(int posicao){
        return posicao >= 0 && posicao <= totalNomes;
    }

    public void remove(String nome){
        char primeiraLetra = nome.charAt(0);
        int indice = getIndice(primeiraLetra);
        nomes[indice] = null;
        totalNomes--;
    }

    public boolean contem(String nome){
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i] == nome) return true;
          }
          return false;
    }

    public String getNome(int posicao){
        return this.nomes[posicao];
    }
  
    public int totalNomes(){
        return this.totalNomes;
    }



    public void listVetor() {
        for (int i = 0; i <= nomes.length - 1; i++) {
            System.out.println("Posição " + i + ": " + nomes[i]);
        }
    }

    public static void main(String[] args) {
        MinhaSegundaED nome = new MinhaSegundaED();
        
        nome.adicionar("Beatriz");
        nome.listVetor();
        System.out.println("\n");
        nome.adicionar("Beta");
        System.out.println("\n");
        nome.remove("Beatriz");
        nome.listVetor();
        System.out.println("\n");
        nome.adicionar("Beatriz");
        System.out.println(nome.getNome(1));
        System.out.println("\n");
        System.out.println(nome.posicaoOcupada(1));
        System.out.println("\n");
        System.out.println(nome.posicaoValida(1));
        System.out.println("\n");
        System.out.println(nome.totalNomes());
    }
}
