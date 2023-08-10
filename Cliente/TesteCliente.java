package Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente c1 = new Cliente("Fagner", 256535, 28, "Maculino", "brasileira");
		Cliente c2 = new Cliente("Raquel", 223565, 28, "Feminino", "brasileira");
		
		PessoaFisica pf1 = new PessoaFisica("Ruth", 263782, 20,"Feminino", "brasileira", "45398562516", "11957874623");
		PessoaFisica pf2 = new PessoaFisica("Reginaldo", 265582, 57,"Masculino", "brasileira", "38439018875", "11957874623");
		
		PessoaJuridica pj1 = new PessoaJuridica("Lorenzetti", 265582, 100,"Masculino", "brasileira", "61.413.282/0001-43");
		PessoaJuridica pj2 = new PessoaJuridica("Acessórios", 265582, 22,"Masculino", "brasileira", "61.713.2828/0001-72");


		
		c1.visualizar();
		c2.visualizar();
		System.out.println();
		
		pf1.visualizar();
		System.out.println();
		pf2.visualizar();
		System.out.println();
		pj1.visualizar();
		System.out.println();
		pj2.visualizar();

	}

}
