package folhapagamento;

public class Secretária extends Funcionario{

	public Secretária(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	double getPorcentagemAdicional() {
		return 0;
	}

}
