package carrinho;


public class MinhaPrimeiraED {
    public int vetorInicial;

    public Object[] objetos;

    public int totalDeObjetos;

    public MinhaPrimeiraED(int vetorInicial) {
        this.objetos = new Object[vetorInicial];
        this.totalDeObjetos = 0;
    }

    private void garantaEspaco() {
        int vetorNovo = objetos.length * 2;
        Object[] objetosNovo = new Object[vetorNovo];

        // Copia os elementos do vetor original para o novo vetor
        for (int i = 0; i < objetos.length; i++) {
            objetosNovo[i] = objetos[i];
        }
        objetos = objetosNovo;
        System.out.println("Vetor com o dobro do tamanho.");
    }

    public void listVetor() {
        for (int i = 0; i <= objetos.length - 1; i++) {
            System.out.println("Posição " + i + ": " + objetos[i]);
        }
    }

    public void adicionar(int posicao, Object objeto) {
        if (cheio()) {
            System.out.println("Capacidade cheia. Redimensionando...");
        }
        if (!posicaoOcupado(posicao) && posicaoValida(posicao)) {
            objetos[posicao] = objeto;
            System.out.println("Posição válida, Registro cadastrado: " + objetos[posicao]);
            totalDeObjetos++;
        }
        
        for (int i = totalDeObjetos; i > posicao; i--) {
            objetos[i] = objetos[i - 1];
        }
        objetos[posicao] = objeto;
        System.out.println(
                "Registro adicionado com sucesso, registros movidos para a direita " + objetos[posicao]);
        totalDeObjetos++;
    }

    public void adicionar(Object objeto) {
        try {
            if (cheio()) {
                System.out.println("Capacidade cheia. Redimensionando...");
            }
            if (totalDeObjetos != objetos.length) {
                objetos[totalDeObjetos] = objeto;
                totalDeObjetos++;
                System.out.println("Registro adicionado com sucesso");
            } else {
                System.out.println("Vetor cheio, erro ao add");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private boolean posicaoOcupado(int posicao) {
        return objetos[posicao] != null;
    }

    private boolean posicaoValida(int posicao) {
        if (posicao >= 0 && posicao <= totalDeObjetos)
            return true;
        return false;
    }

    public void remove(int posicao) {
        if (posicaoValida(posicao)) {
            for (int i = posicao; i < totalDeObjetos - 1; i++) {
                objetos[i] = objetos[i + 1];
            }
            objetos[totalDeObjetos - 1] = null;
            totalDeObjetos--;
            System.out.println("indice removido com sucesso, novo indice: " + objetos[posicao]);
        }
    }

    public boolean contem(Object objeto) {
        for (int i = 0; i < objetos.length; i++) {
            if (objetos[i] == objeto)
                return true;
        }
        return false;
    }

    public int tamanho() {
        return totalDeObjetos;
    }

    public Object getObjetos(int posicao) {
        return this.objetos[posicao];
    }

    public boolean cheio() {
        if (totalDeObjetos == objetos.length) {
            garantaEspaco();
            return true;
        }
        return false;
    }

    public boolean vazio() {
        return totalDeObjetos == 0;
    }
}
