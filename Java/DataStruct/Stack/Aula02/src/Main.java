
public class Main {
	public Main() {
		Pilha p1 = new Pilha();

		p1.push(45);
		p1.push(36);
		p1.push(72);

		this.insertElemnent(p1, 55, 1);
		this.print(p1);
	}

	public static void main(String[] args) {
		Main main = new Main();
	}

	// Incluir determinado elemento na minha pilha:
	public void insertElemnent(Pilha p, int element, int pos) {
		Pilha aux = new Pilha();

		// Verificando se a pilha est� cheia
		if (p.full() == true)
			return;

		// Verificar se a posi��o � valida
		if (pos < 0 || pos > p.size())
			return;

		// Desemplihar os elementos at� a posi��o pos
		while (p.size() >= pos) {
			aux.push(p.pop());
		}

		// Empilhar o elemento recebido
		p.push(element);

		// Reempilhando a p a partir da aux
		while (aux.empty() == false) {
			p.push(aux.pop());
		}
	}

	public void print(Pilha p) {
		Pilha aux = new Pilha();

		while (p.empty() == false) {
			aux.push(p.pop());
		}

		while (aux.empty() == false) {
			System.out.print(aux.top() + "-");
			p.push(aux.pop());
		}
	}
}
