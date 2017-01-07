package animais;

public class Baleia extends Mamifero implements AnimalExaminavel{

	public void emitirSom(){
		System.out.println("Som Baleia");
	}
	
	public void examinar() {
		emitirSom();
	}
}
