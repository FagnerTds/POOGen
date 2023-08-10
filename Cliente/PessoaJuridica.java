package Cliente;

public class PessoaJuridica extends Cliente {

	private String cnpj;
	


	public PessoaJuridica(String nome, int numeroConta, int idade, String sexo, String nacionalidade, String cnpj) {
		super(nome, numeroConta, idade, sexo, nacionalidade);
		this.cnpj = cnpj;
	}
	


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	
	public void validarCnpj() {
		if(getCnpj().length() != 14) {
			System.out.println("\n--CNPJ Inválido!!!");
		} else 
			System.out.println("\n--CNPJ Válido!!!");
	
	}
	public void visualizar() {
		System.out.println("O nome da empresa é "+ getNome()+", tem "+getIdade()+
				" anos de idade, sua nacionalidade é: "+getNacionalidade()+" seu Cnpj é: "+cnpj);
	}
	
	
	
	
	
	
	
	
}
