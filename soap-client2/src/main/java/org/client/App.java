package org.client;

import org.soap.cli.Pessoa;
import org.soap.cli.PessoaService;
import org.soap.cli.PessoaServiceImplService;

public class App {
	public static void main(String[] args) {
		PessoaServiceImplService psi = new PessoaServiceImplService();
		PessoaService ps = psi.getPessoaServiceImplPort();

		Pessoa p1 = new Pessoa();
		p1.setId(1);
		p1.setAge(32);
		p1.setName("Rodrigo");

		Pessoa p2 = new Pessoa();
		p2.setId(2);
		p2.setAge(32);
		p2.setName("Teste");

		ps.addPessoa(p1);
		ps.addPessoa(p2);

		System.out.println(ps.getPessoa(1).getName());
	}
}
