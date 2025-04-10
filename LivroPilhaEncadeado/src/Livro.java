public class Livro {
    private String nome;
    private int ano;
    private double preco;
    private Livro anterior;

    public Livro(String nome, int ano, double preco) {
        this.nome = nome;
        this.ano = ano;
        this.preco = preco;
    }

    public Livro getAnterior() {
        return anterior;
    }
    public void setAnterior(Livro anterior) {
        this.anterior = anterior;
    } 

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Livro{");
        sb.append("nome=").append(nome);
        sb.append(", ano=").append(ano);
        sb.append(", preco=").append(preco);
        sb.append(", anterior=").append(anterior);
        sb.append('}');
        return sb.toString();
    }


}
