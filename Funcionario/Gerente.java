package Funcionario;

public class Gerente extends Funcionario {
	private int numeroDeGerenciados;

	public Gerente(String nome, int id, String setor, String funcao, double salario, int numeroDeGerenciados) {
		super(nome, id, setor, funcao, salario);
		this.numeroDeGerenciados = numeroDeGerenciados;
	}

	public int getNumeroDeGerenciados() {
		return numeroDeGerenciados;
	}

	public void setNumeroDeGerenciados(int numeroDeGerenciados) {
		this.numeroDeGerenciados = numeroDeGerenciados;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("o numero de pessoas gerenciadas é :"+numeroDeGerenciados );
	}
	
	

}
