
import javax.swing.JOptionPane;

public class Pilha {
    int inicio;
    int topo = -1;
    int fim;
    int tamanho;
    int qtdeElementos;
    int p[];

    public Pilha(){
        inicio = fim -1;
        tamanho = 10;
        p = new int[tamanho];
        qtdeElementos = 0;
    }

    public boolean estaVazia(){
        return qtdeElementos == 0;
    }

    public boolean estaCheia(){
        return qtdeElementos == tamanho;
    }

    public void empilha(int e){
        if(!estaCheia()){
            if(inicio == -1){
                inicio = 0;
            }
            topo++;
            p[topo] = e;
            qtdeElementos++;
        }
    }

    public int desemplinha(){
        if(!estaVazia()){
            int x = p[topo];
            topo--;
            qtdeElementos--;
            return x;
        }
        return -1;
    }

    public void mostrar(){
        String elementos =  "";
        for(int i = topo; i >= 0; i--){
            elementos += " - " + p[i] ;
        }
        JOptionPane.showMessageDialog(null, elementos);
    }

    public static void main(String[] args) {
        Pilha p1 = new Pilha();
        p1.empilha(1);
        p1.mostrar();
        p1.empilha(2);
        p1.mostrar();
        p1.empilha(3);
        p1.mostrar();
        p1.empilha(4);
        p1.mostrar();

        p1.desemplinha();
        p1.mostrar();
        p1.desemplinha();
        p1.mostrar();

        JOptionPane.showMessageDialog(null, "É cheio: " + p1.estaCheia());
        JOptionPane.showMessageDialog(null, "É vazio: " + p1.estaVazia());


    }
    
}
