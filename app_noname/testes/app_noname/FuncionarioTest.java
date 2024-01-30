package app_noname;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FuncionarioTest {

	@Test
	void testGeral() {
		Funcionario f1;
		f1 = new Funcionario();
		
		f1.setNome("david");
		f1.setSexo('m');
		f1.setIdade(19);
		f1.setId(1);

		System.out.println(f1.getNome());
		System.out.println(f1.getSexo());
		System.out.println(f1.getIdade());
		System.out.println(f1.getId());
	}

}
