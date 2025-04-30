enum Estado {
    LIVRE, OCUPADO, REMOVIDO
}

public class Hash {
    double item;
    Estado estado;

    public Hash() {
        estado = Estado.LIVRE;
    }
}

