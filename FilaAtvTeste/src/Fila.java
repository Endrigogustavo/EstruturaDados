public class Fila {
    private Object[] objetos = new Object[4];
    private int totalDeObjetos = 0;
    private int inicio = 0;
    private int fim = 0;

    public void enfileira(Object objeto) {
        if (inicio + 1 == objetos.length) {
            System.out.println("Fila está cheia.");
            for (int i = 0; i < totalDeObjetos; i++) {
                objetos[i] = objetos[inicio + i];
            }
            inicio = 0;
            fim = totalDeObjetos;
        }
        objetos[fim] = objeto;
        fim = (fim + 1) % objetos.length; 
        totalDeObjetos++;
    }

    public Object desenfileira() {
        if (vazio()) {
            System.out.println("Fila está vazia.");
            return null;
        }

        Object valor = objetos[inicio];
        inicio++;
        totalDeObjetos--;
        return valor;
    }

    public void imprime() {
        for (int i = inicio; i < totalDeObjetos; i++) {
            System.out.print(objetos[i] + " | ");
        }
        System.out.println();
    }

    public Object primeiro() {
        if (vazio()) {
            return null;
        }
        return objetos[inicio];
    }

    public Object ultimo() {
        if (vazio()) {
            return null;
        }
        int index = (fim - 1 + objetos.length) % objetos.length;
        return objetos[index];
    }

    public int tamanho() {
        return totalDeObjetos;
    }

    public boolean vazio() {
        return totalDeObjetos == 0;
    }
}
