package Bonificacao;

public class Funcionario {
	
	private String nome;
	private double salario;
	private String cargo;
	private double porcentagemBonificacao;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		if(!ValidaFuncionario.ValidaSalario(this.salario, salario)){
			throw new IllegalArgumentException("Salario Invalido");
		}
		this.salario = salario;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public double getPorcentagemBonificacao() {
		return porcentagemBonificacao;
	}
	
	public void setPorcentagemBonificacao(double porcentagemBonificacao) {
		double novosalario = (this.salario + (this.salario * porcentagemBonificacao/100));
		if(!ValidaFuncionario.ValidaSalario(this.salario, novosalario)){
			throw new IllegalArgumentException("Bonificacao Invalida");
		}
		this.porcentagemBonificacao = porcentagemBonificacao;
		
	}
	
	public double getSalarioComBonificacao(){
		return this.salario + (this.salario * porcentagemBonificacao/100);
	}
}
