public class Deque {

    private No inicio;
    private No fim;

    public Deque() {
        this.inicio = null;
        this.fim = null;
    }

    public void EnqueueL(Object item) {
        No novoNo = new No();
        novoNo.item = item;
        novoNo.proximo = null;
        if (inicio == null) { 
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
        }
    }

    public void EnqueueR(Object item) {
        No novoNo = new No();
        novoNo.item = item;
        novoNo.proximo = inicio;
        if (inicio == null) { 
            fim = novoNo;
        }
        inicio = novoNo;
    }


    public Object DequeueL() throws Exception{
        if(vazio()){
            throw new Exception("A fila esta vazia");
        }
        Object InicioItem = inicio.item;
        inicio = inicio.getProximo();
        return InicioItem;
    }

    public Object DequeueR() throws Exception{
        return null;
    }

    public boolean vazio(){
        return (inicio.getProximo() == null);
    }

    public void imprime(){
        No auxiliar = inicio;

        while (auxiliar != null) {
            System.out.println(auxiliar.getItem());
            auxiliar = auxiliar.getProximo();
        }
    }
}
