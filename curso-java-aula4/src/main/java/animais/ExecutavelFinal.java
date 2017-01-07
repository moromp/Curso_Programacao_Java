package animais;

public class ExecutavelFinal {

	public static void main(String[] args) {
		
		Baleia baleia = new Baleia();
		Humano humano = new Humano();
		Jacare jacare = new Jacare();
		Veterinario  veterinario = new Veterinario();
		
		
		veterinario.examinar(humano);
		veterinario.examinar(baleia);
		veterinario.examinar(jacare);
		veterinario.examinar(veterinario);

	}
}
