package UseCase;

import Entity.Pessoa;

//Classe para "Gerenciar" a lista encadeada
public class Celula {
    // Referência para a próxima célula na lista encadeada.
    // Ponteiro onde vai referenciar o local de memoria de cada item
    private Celula proximo;
    // Valor armazenado na célula, que no caso é um objeto do tipo Pessoa.
    private Pessoa valor;

    // Metodos get e set da classe
    public Celula getProximo() {
        return proximo;
    }
    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }
    public Pessoa getValor() {
        return valor;
    }
    public void setValor(Pessoa valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Celula[valor=" + valor.getNome() + ", Posição=" + proximo +"]";
    }
}
