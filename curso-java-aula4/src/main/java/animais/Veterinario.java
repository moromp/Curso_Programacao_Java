package animais;

public class Veterinario extends Humano{

	/*public void examinar(Animal animal){
		animal.emitirSom();
	}*/
	
	public void examinar(AnimalExaminavel animal){
		animal.examinar();
	}
}
