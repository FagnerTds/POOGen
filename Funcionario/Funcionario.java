package Funcionario;

public class Funcionario {

	private String nome;
	private int id;
	private String setor;
	private String funcao;
	private double salario;
	
	public Funcionario(String nome, int id, String setor, String funcao, double salario) {
		super();
		this.nome = nome;
		this.id = id;
		this.setor = setor;
		this.funcao = funcao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", id=" + id + ", setor=" + setor + ", funcao=" + funcao + ", salario= R$"
				+ salario + "]";
	}
	
	
}
