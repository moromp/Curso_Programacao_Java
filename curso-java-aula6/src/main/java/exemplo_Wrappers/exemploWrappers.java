package exemplo_Wrappers;

import java.util.ArrayList;
import java.util.List;

public class exemploWrappers {

	public static void main(String[] args) {
		
		Character character = new Character('a');
		
		Character outraCharacter = 'a';
		Integer valorInteiro = 10;

		int valorInteiroPrimitivo = valorInteiro;
		
		List<Character> chars = new ArrayList<Character>();
		chars.add(character);

		List<Integer> inteiros = new ArrayList<Integer>();
		inteiros.add(valorInteiro);
	}

}
