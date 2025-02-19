public class MinhaPrimeiraED {

    public int vetorInicial;

    public Object[] objetos;

    public int totalDeObjetos;

    public MinhaPrimeiraED(int vetorInicial) {
        this.objetos = new Object[vetorInicial];
        this.totalDeObjetos = 0;
    }

    private void mudarTamanhoVetor() {
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
        try {
            if (cheio()) {
                System.out.println("Capacidade cheia. Redimensionando...");
            }
            if (!posicaoOcupado(posicao) && posicaoValida(posicao)) {
                objetos[posicao] = objeto;
                System.out.println("Posição válida, Registro cadastrado: " + objetos[posicao]);
                totalDeObjetos++;
            } else {
                for (int i = totalDeObjetos; i > posicao; i--) {
                    objetos[i] = objetos[i - 1];
                }
                objetos[posicao] = objeto;
                System.out.println(
                        "Registro adicionado com sucesso, registros movidos para a direita " + objetos[posicao]);
                totalDeObjetos++;
            }
        } catch (Exception e) {
            System.err.println("Erro ao criar novo registro: " + e.getMessage());
        }
    }

    public void adicionar(Object objeto) {
        try {
            if(totalDeObjetos != objetos.length){
                objetos[totalDeObjetos] = objeto;
                totalDeObjetos++;
                System.out.println("Registro adicionado com sucesso");
            }else{
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
            mudarTamanhoVetor();
            return true;
        }
        return false;
    }
    

    public boolean vazio() {
        return totalDeObjetos == 0;
    }

    public static void main(String[] args) throws Exception {
        MinhaPrimeiraED obj = new MinhaPrimeiraED(10);
        // Resposta prevista: "Registro adicionado com sucesso"
        obj.adicionar(10);
        obj.listVetor();
        System.out.println("\n");
        // Resposta prevista: "Posição valida, Registro cadastrado: Object"
        obj.adicionar(1, 40);
        obj.listVetor();
        System.out.println("\n");

        // Resposta prevista: "Registro adicionado com sucesso, resgistros movidos para
        // a direita: Object"
        obj.adicionar(1, 50);
        obj.listVetor();
        System.out.println("\n");

        System.out.println("Exemplo metodo posicaoValida");
        // Resposta prevista: false
        System.out.println(obj.posicaoValida(30));
        // Resposta prevista: true
        System.out.println(obj.posicaoValida(0));
        System.out.println("\n");

        System.out.println("Exemplo metodo contem");
        // Resposta prevista: false
        System.out.println(obj.contem(5));
        // Resposta prevista: true
        System.out.println(obj.contem(50));
        System.out.println("\n");

        // Resposta prevista: Existem 3 de tamanho
        System.out.println("Existem " + obj.tamanho() + " de tamanho no vetor");
        System.out.println("\n");

        // Resposta prevista: indice removido com sucesso, novo indice: Objeto
        obj.remove(0);
        obj.listVetor();
        System.out.println("\n");

        // Resposta prevista: O registro no indice pesquisado foi: Objeto
        System.out.println("O registro no indice pesquisado foi: " + obj.getObjetos(0));
        // Resposta prevista: O registro no indice pesquisado foi: Objeto
        System.out.println("O registro no indice pesquisado foi: " + obj.getObjetos(1));
        System.out.println("\n");

        System.out.println("Teste de redimencionar vetor");
        obj.adicionar(1);
        obj.adicionar(2);
        obj.adicionar(3);
        obj.adicionar(4);
        obj.adicionar(4);
        obj.adicionar(5);
        obj.adicionar(6);
        obj.adicionar(7);
        obj.adicionar(1,70);
        // registro com a nova cap do vetor
        obj.listVetor();
        System.out.println("\n");

        // Verificar se o vetor é vazio
        System.out.println("O vetor é vazio: " + obj.vazio());
    }
}
