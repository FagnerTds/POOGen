package Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente c1 = new Cliente("Fagner", 256535, 28, "Maculino", "brasileira");
		Cliente c2 = new Cliente("Raquel", 223565, 28, "Feminino", "brasileira");
		
		c1.visualizar();
		c2.visualizar();
	}

}
