public class Lista {

    private Livro topo, anterior;

    public void adiciona(Livro livro) { 
        if (anterior == null) {
            anterior = livro;
        } else {
            topo = livro;
            topo.setAnterior(anterior);
            anterior = topo;
        }
    }

    public void remove() {
        topo = topo.getAnterior();
        anterior = topo;
    }

    public Livro topo() {
        return topo;
    }

    public void mostraLivros() {
        Livro aux = topo;

        while (aux != null) {
            System.out.println(aux.toString());
            aux = aux.getAnterior();
        }
    }
}