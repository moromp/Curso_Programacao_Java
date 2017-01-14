package garagem;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class garagem {
	Map<String, carro> novocarro = new HashMap<String, carro>();
	
	public void Adicionar(carro carro){
		
		boolean containsKey = novocarro.containsKey(carro.getPlaca());
		
		if(containsKey)
			System.out.println("veiculos ja cadastrado");
		else
			novocarro.put(carro.getPlaca(), carro);
	}

	public void Vender(String placa){
		novocarro.remove(placa);
	}
	
	public carro Buscar(String placa){
		return novocarro.get(placa);
	}
	
	public void Listar(){
		Set<Entry<String, carro>> entrySet = novocarro.entrySet();
		System.out.println("\n");
		for (Entry<String, carro> entry : entrySet) {
			System.out.println(entry.getKey() + " - " + 
					entry.getValue());//pra funcionar o println tenho q substituir o metodo toString na classe carro
		}
		System.out.println("\n");
	}
}
