package NotasAluno;

public class Aluno {

	String nome;
	double notas[];
	
	public Aluno(){
		this.notas = new double[3];
	}
	
	public double getMedia(){
		
		double soma=0;
		
		for(double nota: notas){
			soma += nota;
		}
		
		return soma;
	}
}
