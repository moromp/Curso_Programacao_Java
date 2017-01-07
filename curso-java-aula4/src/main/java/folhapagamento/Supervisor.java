package folhapagamento;

public class Supervisor extends Funcionario{

	public Supervisor(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	double getPorcentagemAdicional() {
		return 0.10;
	}

}
