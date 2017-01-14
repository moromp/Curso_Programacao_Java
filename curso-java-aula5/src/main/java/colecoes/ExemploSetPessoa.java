package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ExemploSetPessoa {

	public static void main(String[] args) {
		Set<Pessoa> pessoas = new HashSet<Pessoa>();
		pessoas.add(new Pessoa("Juquinha", "033007025455"));
		pessoas.add(new Pessoa("Diego", "033007025454"));
		pessoas.add(new Pessoa("Juquinha", "033007025454"));
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}
}