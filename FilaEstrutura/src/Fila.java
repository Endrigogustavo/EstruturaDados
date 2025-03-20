public class Fila {
    private Object vetor[];
    private int inicio, fim;

    public Fila(){
        this.inicio = 0;
        this.fim = this.inicio;
    }

    public void Enfileirar(Object item) throws Exception{
        if((fim + 1) > vetor.length){
            throw new Exception("A fila esta cheia");
        }
        vetor[fim] = item;
        fim = fim + 1;
    }

    public Object Desenfileirar() throws Exception{
        if(vazio()){
            throw new Exception("A fila esta vazia");
        }
        Object valor = vetor[inicio];
        inicio = (inicio + 1) % vetor.length;
        return valor;
    }

    public boolean vazio(){
        return (inicio == fim);
    }

    public void imprime(){
        for(int i = inicio; i != fim; i++){
            System.out.println(vetor[i].toString() + " | ");
        }
    }
}
