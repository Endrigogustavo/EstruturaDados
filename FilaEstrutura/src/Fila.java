public class Fila {

    private No inicio;
    private No fim;

    public Fila(){
        this.inicio = new No();
        this.fim = this.inicio;
        this.inicio.proximo = null;
    }

    public void Enfileirar(Object item) throws Exception{
        this.fim.proximo = new No();
        this.fim = this.fim.proximo;
        this.fim.item = item;
        this.fim.proximo = null;
    }

    public No Desenfileirar() throws Exception{
        if(vazio()){
            throw new Exception("A fila esta vazia");
        }
        inicio = inicio.getProximo();
        return inicio.getProximo();
    }

    public boolean vazio(){
        return (inicio.getProximo() == null);
    }

    public void imprime(){
        No auxiliar = inicio.proximo;

        while (auxiliar != null) {
            System.out.println(auxiliar.getItem());
            auxiliar = auxiliar.getProximo();
        }
    }
}
