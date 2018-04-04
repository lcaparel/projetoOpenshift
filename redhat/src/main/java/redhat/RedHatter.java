package redhat;

public class RedHatter extends Pessoa {

	private int centroDeCusto;
	private Double salario;
	private String especialidade;
	private String cargo;

	public int getCentroDeCusto() {
		return centroDeCusto;
	}

	public void setCentroDeCusto(int centroDeCusto) {
		this.centroDeCusto = centroDeCusto;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public RedHatter(String nome, Integer idade, String email, Long cpf, int centroDeCusto, Double salario,
			String especialidade, String cargo) {
		super(nome, idade, email, cpf);
		this.centroDeCusto = centroDeCusto;
		this.salario = salario;
		this.especialidade = especialidade;
		this.cargo = cargo;
	}

	public RedHatter(String nome, Integer idade, String email, Long cpf) {
		super(nome, idade, email, cpf);
	}

}
