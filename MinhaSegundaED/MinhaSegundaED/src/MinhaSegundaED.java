public class MinhaSegundaED {
    String[] nomes = new String[26];
    int totalNomes = 0;

    public void adicionar(String nome) {
        if (!validarNome(nome)) {
            System.out.println("Nome inválido. Certifique-se de que ele contém apenas letras e não está vazio.");
            return;
        }

        int posicao = getIndice(nome);
        if (posicao == -1) {
            System.out.println("Posição inválida");
            return;
        }

        if (nomes[posicao] != null && nomes[posicao].equals(nome)) {
            System.out.println("Nome já registrado");
            return;
        }

        if (posicaoOcupada(posicao)) {
            System.out.println("Registro inválido, tente novamente");
        } else {
            nomes[posicao] = nome;
            totalNomes++;
        }
    }

    public boolean validarNome(String nome) {
        return nome != null && !nome.isEmpty() && nome.matches("[A-Za-z]+");
    }

    public int getIndice(String nome) {
        char primeiraLetra = Character.toUpperCase(nome.charAt(0));
        if (primeiraLetra >= 'A' && primeiraLetra <= 'Z') {
            return primeiraLetra - 'A';
        }
        return -1;
    }

    private boolean posicaoOcupada(int posicao) {
        return nomes[posicao] != null;
    }

    public void remove(String nome) {
        int indice = getIndice(nome);
        if (indice != -1 && nomes[indice] != null) {
            nomes[indice] = null;
            totalNomes--;
        }
    }

    public boolean contem(String nome) {
        for (String nomeArmazenado : nomes) {
            if (nome.equals(nomeArmazenado)) return true;
        }
        return false;
    }

    public String getNome(int posicao) {
        return this.nomes[posicao];
    }

    public int totalNomes() {
        return this.totalNomes;
    }

    public void listVetor() {
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Posição " + i + ": " + nomes[i]);
        }
    }

    public static void main(String[] args) {
        MinhaSegundaED nome = new MinhaSegundaED();

        nome.adicionar("Beatriz");
        nome.listVetor();
        System.out.println("\n");
        nome.adicionar("beta");
        System.out.println("\n");
        nome.remove("Beatriz");
        nome.listVetor();
        System.out.println("\n");
        nome.adicionar("Beatriz");
        System.out.println(nome.getNome(1));
        System.out.println("\n");
        System.out.println(nome.posicaoOcupada(1));
        System.out.println("\n");
        System.out.println("\n");
        System.out.println(nome.totalNomes());

        nome.adicionar("");  
        nome.adicionar("1234");  
        nome.adicionar("Ana-Maria");  
    }
}
