package Cliente;

public class PessoaFisica extends Cliente {

	private String cpf;
	private String celular;
	
//	construtor
	public PessoaFisica(String nome, int numeroConta, int idade, String sexo, String nacionalidade, String cpf,
			String celeular) {
		super(nome, numeroConta, idade, sexo, nacionalidade);
		this.cpf = cpf;
		this.celular = celeular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCeleular() {
		return celular;
	}

	public void setCeleular(String celeular) {
		this.celular = celeular;
	}
	
	public void validarCpf() {
		if(getCpf().length() != 11) {
			System.out.println("\n--CPF Inválido!!!");
		} else 
			System.out.println("\n--CPF Válido!!!");
	
	}
	public void visualizar() {
		System.out.println("O nome do cliente é "+ getNome()+", seu número da conta é: "+ getNumeroConta()+ ", tem "+getIdade()+
				" anos de idade sendo do sexo: "+getSexo()+", \nsua nacionalidade é: "+getNacionalidade()+", seu CPf é: "+ cpf+", e seu celular é: "+celular);
	}
	
}
