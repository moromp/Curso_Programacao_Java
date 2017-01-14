package garagem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
		List<carro> carros = new ArrayList<carro>(novocarro.values());
		Collections.sort(carros);
		
		System.out.println("\n");
		for (carro carro : carros) {
			System.out.println(carro);//pra funcionar o println tenho q substituir o metodo toString na classe carro
		}
		System.out.println("\n");
	}
}
