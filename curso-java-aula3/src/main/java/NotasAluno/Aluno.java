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
	
	//comando para retornar variaveis private
	public String getNome(){
		return nome;
	}
	
	//comando para setar o valor na variaveis
	public void setNome(String nome){
		this.nome = nome;
	}
	
	//comando para retornar variaveis private
	public double[] getNotas(){
		return notas;
	}
	
	//comando para setar o valor na variaveis
	public void setNotas(double[] notas){
		if(notas.length != 3){
			System.out.println("Numero de notas errado!");
		}
		this.notas = notas;
	}
}
