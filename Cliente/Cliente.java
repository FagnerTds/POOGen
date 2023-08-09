package Cliente;

public class Cliente {
	
	private String nome;
	private int numeroConta;
	private int idade;
	private String sexo;
	private String nacionalidade; 
	
	public Cliente(String nome, int numeroConta, int idade, String sexo, String nacionalidade) {
		super();
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.idade = idade;
		this.sexo = sexo;
		this.nacionalidade = nacionalidade;
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public void visualizar() {
		System.out.println("O nome do cliente é "+ nome+" seu número da conta é: "+ numeroConta+ " tem "+idade+
				" anos de idade sendo do sexo: "+sexo+" e sua nacionalidade é: "+nacionalidade);
	}
	
	
	

}
