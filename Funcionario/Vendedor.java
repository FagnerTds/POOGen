package Funcionario;

public class Vendedor extends Funcionario{

	private int vendasMes;

	public Vendedor(String nome, int id, String setor, String funcao, double salario, int vendasMes) {
		super(nome, id, setor, funcao, salario);
		this.vendasMes = vendasMes;
	}

	public int getVendasMes() {
		return vendasMes;
	}

	public void setVendasMes(int vendasMes) {
		this.vendasMes = vendasMes;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("Ele vendeu "+vendasMes+" produtos");
	}
}
