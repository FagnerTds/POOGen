package Funcionario;

public class TesteFuncionario {
	public static void main(String[] args) {
	
	Funcionario f1 = new Funcionario("Fagner",68554, "Desenvolvimento de softwares", "Dev", 8580.00 );
	Funcionario f2 = new Funcionario("Severino",63689, "Ferramentaria", "Ferramenteiro", 12080.00 );
	
	System.out.println(f1.toString());
	System.out.println(f2.toString());

	}
}
