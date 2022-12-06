
public class Principal {
	public static void main(String[] args) {
		PessoaFisica pf1 = new PessoaFisica(
			new Pessoa("Pedro", "Henrique Medeiros Ramalho", 18), 
			"000.000.000-00"
		);

		System.out.println(pf1);


		PessoaJuridica pj1 = new PessoaJuridica(
			new Pessoa("Cícero", "Samuel Clemente Rodrigues", 1290), 
			"12.345.678/0001-00", 
			"Samucas"
		);

		System.out.println(pj1);

		Pessoa jeova = new Pessoa("Jeová", "Tavares", 37);
		Conta c = new Conta(jeova);
		c.creditar(2000.0);
		c.debitar(100);
		
		Pessoa samuel = new Pessoa("Samuel", "Rodrigues", 37);
		ContaEspecial c2 =
			new ContaEspecial(samuel, 200);
		c2.debitar(500);
		
		ContaPoupanca c3 = new ContaPoupanca(
				new Pessoa("Agamenon", "Quinderé", 25), 
				10000);
		
		c3.rendeJuros();
				
		System.out.println(c);

		System.out.println(c2);
		
		System.out.println(c3);
	}
}
