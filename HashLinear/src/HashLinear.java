public class HashLinear {
	private Hash[] tab;
	private int TAM_MAX;

	public HashLinear(int tam) {
		tab = new Hash[tam];
		TAM_MAX = tam;
		for (int i = 0; i < tam; i++)
			tab[i] = new Hash();
	}

	private int funcaohash(double chave) {
		int v = (int) chave;
		return (Math.abs(v) % TAM_MAX);
	}

	public void insere(double item) {
		if (cheia()) {
			System.out.println("\n-> ATENÇÃO: Tabela cheia");
			return;
		}

		int pos = funcaohash(item);
		int inicio = pos;
		int posRemovido = -1;

		while (tab[pos].estado != Estado.LIVRE) {
			if (tab[pos].estado == Estado.OCUPADO && tab[pos].item == item) {
				System.out.println("\n-> ATENÇÃO: Esse item já foi cadastrado");
				return;
			}

			if (tab[pos].estado == Estado.REMOVIDO && posRemovido == -1)
				posRemovido = pos;

			pos = (pos + 1) % TAM_MAX;
			if (pos == inicio)
				break;
		}

		if (posRemovido != -1)
			pos = posRemovido;

		tab[pos].item = item;
		tab[pos].estado = Estado.OCUPADO;
		System.out.println("-> Inserido HASH[" + pos + "]");
	}

	public int busca(double chave) {
		int pos = funcaohash(chave);
		int inicio = pos;

		while (tab[pos].estado != Estado.LIVRE) {
			if (tab[pos].estado == Estado.OCUPADO && tab[pos].item == chave)
				return pos;

			pos = (pos + 1) % TAM_MAX;
			if (pos == inicio)
				break;
		}
		return -1;
	}

	public void apaga(double chave) {
		int pos = busca(chave);
		if (pos != -1) {
			tab[pos].estado = Estado.REMOVIDO;
			System.out.println("-> Dado HASH[" + pos + "] marcado como REMOVIDO");
		} else {
			System.out.println("Item não encontrado");
		}
	}

	public void imprime() {
		for (int i = 0; i < TAM_MAX; i++)
			if (tab[i].estado == Estado.OCUPADO)
				System.out.print("\nHash[" + i + "] = " + tab[i].item);
	}

	public boolean cheia() {
		for (int i = 0; i < TAM_MAX; i++) {
			if (tab[i].estado != Estado.OCUPADO)
				return false;
		}
		return true;
	}

}
