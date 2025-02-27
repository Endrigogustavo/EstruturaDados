package UseCase;

import Entity.Pessoa;

public class ListaEncadeada {
    //Primeiro item guardado na lista encadeada
    private Celula primeiro;
    //Ultimo item guardado na lista escadeada
    private Celula ultimo;
    //Atributo para gerenciar a posição atual da lista 
    private Celula posicaoAtual;

    //Metodo add
    public void adicionar(Pessoa valor) {
        //Instancia da classe Celula para colocar um registro na lista
        Celula celula = new Celula();
        //Add os dados do objeto "Pessoa" no atributo valor da Celula
        celula.setValor(valor);
        //verifica se não existe nada na primeira posição para add
        if (primeiro == null && ultimo == null) {
            primeiro = celula;
            ultimo = celula;
        } else {
            //caso exita algo na primeira posição, ele vai add no ultimo registro 
            ultimo.setProximo(celula);
            ultimo = celula;
        }
    }

    public void remover() {
        // Verifica se há mais de um elemento na lista
        if (primeiro.getProximo() != null) {
            // Recupera o penúltimo elemento da lista
            Celula celula = this.recuperarPenultimo(this.primeiro);
            // Define o último elemento como o penúltimo
            ultimo = celula;
            // Remove a referência ao último elemento
            celula.setProximo(null);
        } else {
            // Se houver apenas um elemento, a lista se torna vazia
            primeiro = ultimo = null;
        }
    }

    private Celula recuperarPenultimo(Celula celula) {
        // Se o próximo elemento for o último, retorna a célula atual
        if (celula.getProximo().equals(ultimo)) {
            return celula;
        }
        // Continua a busca recursivamente
        return recuperarPenultimo(celula.getProximo());
    }

    public boolean temProximo() {
        //Se não existir nenhum registro
        if (primeiro == null) {
            return false;
        } else if (posicaoAtual == null) {
            posicaoAtual = primeiro;
            return true;
        } else {
            // Verifica se há próximo elemento e avança a posição atual
            boolean temProximo = posicaoAtual.getProximo() != null ? true : false;
            posicaoAtual = posicaoAtual.getProximo();
            return temProximo;
        }
    }

    public Celula getPosicaoAtual() {
        return this.posicaoAtual;
    }
}
