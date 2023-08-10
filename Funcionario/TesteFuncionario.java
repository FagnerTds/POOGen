package Funcionario;

public class TesteFuncionario {
	public static void main(String[] args) {
	
	Funcionario f1 = new Funcionario("Fagner",68554, "Desenvolvimento de softwares", "Dev", 8580.00 );
	Funcionario f2 = new Funcionario("Severino",63689, "Ferramentaria", "Ferramenteiro", 12080.00 );
	
	Gerente g1 = new Gerente("Fagner",68554, "Desenvolvimento de softwares", "Gerente", 32000.00,102);
	
	Vendedor v1= new Vendedor("Claudio",68784, "vendas", "vendedor", 8580.00,12);
	
	
	
	f1.visualizar();
	f2.visualizar();
	System.out.println();
	g1.visualizar();
	System.out.println();
	v1.visualizar();
	


	}
}
