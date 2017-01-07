package animais;

public class Jacare extends Reptil implements AnimalExaminavel{

	public void emitirSom(){
		System.out.println("Som Jacare");
	}

	public void examinar() {
		emitirSom();
	}
}
