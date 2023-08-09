package LojaGames;

public class Produtos {
	
	private String classe;
	private String nome;
	private int id;
	private int quantidade;
	private double preco;
	
	
	public Produtos(String classe, String nome, int id, int quantidade, double preco) {
		super();
		this.classe = classe;
		this.nome = nome;
		this.id = id;
		this.quantidade = quantidade;
		this.preco = preco;
	}


	public String getClasse() {
		return classe;
	}


	public void setClasse(String classe) {
		this.classe = classe;
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


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void visualizar() {
		System.out.println("Produtos [classe=" + classe + ", nome=" + nome + ", id=" + id + ", quantidade=" + quantidade
				+ ", preco= R$" + preco + "]");
	}


	
	}

	
	
	
	
	
	


