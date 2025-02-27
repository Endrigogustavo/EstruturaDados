import Entity.Pessoa;
import UseCase.ListaEncadeada;

public class Main {

    private void adicionarPessoa(ListaEncadeada listaEncadeada, Pessoa pessoa) {
        listaEncadeada.adicionar(pessoa);
    }

    private void listarPessoas(ListaEncadeada listaEncadeada) {
        System.out.print("\n");
        System.out.println("Lista de Pessoas:");
        while (listaEncadeada.temProximo()) {
            System.out.println(listaEncadeada.getPosicaoAtual().getValor());
        }
        System.out.println();
    }

    private void removerPessoa(ListaEncadeada listaEncadeada) {
        listaEncadeada.remover();
    }

    public static void main(String[] args) {
        ListaEncadeada listaEncadeada = new ListaEncadeada();
        Main principal = new Main();

        // Adicionar elementos individualmente
        Pessoa p1 = new Pessoa(1, "João", "jp@gmail.com");
        Pessoa p2 = new Pessoa(2, "Maria", "maria@gmail.com");
        Pessoa p3 = new Pessoa(3, "Bruno", "bruno@gmail.com");
        Pessoa p4 = new Pessoa(4, "José", "jose@gmail.com");
        Pessoa p5 = new Pessoa(5, "Mário", "mario@gmail.com");
        Pessoa p6 = new Pessoa(6, "Eduardo", "dudu@gmail.com");

        principal.adicionarPessoa(listaEncadeada, p1);
        principal.listarPessoas(listaEncadeada);
        principal.adicionarPessoa(listaEncadeada, p2);
        principal.listarPessoas(listaEncadeada);
        principal.adicionarPessoa(listaEncadeada, p3);
        principal.adicionarPessoa(listaEncadeada, p4);
        principal.adicionarPessoa(listaEncadeada, p5);
        principal.adicionarPessoa(listaEncadeada, p6);

        // Listar elementos antes da remoção
        principal.listarPessoas(listaEncadeada);

        // Remover um elemento
        System.out.println("Removendo o primeiro elemento...\n");
        principal.removerPessoa(listaEncadeada);

        // Listar elementos após a remoção
        principal.listarPessoas(listaEncadeada);
    }
}
