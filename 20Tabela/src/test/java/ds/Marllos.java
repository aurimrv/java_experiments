package ds;

import junit.framework.TestCase;
import ds.*;
import ds.MeuItem;
import ds.Tabela;

public class Marllos extends TestCase {

	public void test1_1() {
		// setup
		Tabela tb = new Tabela();
		// setup

		assertNotNull(tb);
		assertEquals(0, tb.n);

	}

	public void test4_1() {
		// setup
		Tabela tb = new Tabela();
		MeuItem reg = null;
		int cont;
		// setup

		for (cont = 0; cont < 6; cont++) {
			reg = new MeuItem(cont);
			try {
				tb.insere(reg);
			} catch (Exception e) {
				fail();
			}
		}
		// setup

		reg = new MeuItem(90);
		try {
			tb.insere(reg);
		} catch (Exception e) {
			fail();
		}
		assertEquals(5,
				((Integer) (tb.registros[6].recuperaChave())).intValue());
	}

	public void test4_2() {
		// setup
		Tabela tb = new Tabela();
		MeuItem reg = null;
		int cont;
		// setup

		for (cont = 0; cont < 10; cont++) {
			reg = new MeuItem(cont);
			try {
				tb.insere(reg);
			} catch (Exception e) {
				fail();
			}
		}
		// setup

		reg = new MeuItem(78);
		try {
			tb.insere(reg);
		} catch (Exception e) {
			assertEquals(9,
					((Integer) (tb.registros[10].recuperaChave())).intValue());
		}
	}

	public void test2_1() {
		// setup
		Tabela tb = new Tabela();
		MeuItem reg = null;
		int cont;
		// setup

		for (cont = 0; cont < 10; cont++) {
			reg = new MeuItem(cont);
			try {
				tb.insere(reg);
			} catch (Exception e) {
				fail();
			}
		}
		// setup

		reg = new MeuItem(8);
		assertEquals(9, tb.pesquisa(reg));
	}

	public void test2_2() {
		// setup
		Tabela tb = new Tabela();
		MeuItem reg = null;
		int cont;
		// setup

		for (cont = 0; cont < 10; cont++) {
			reg = new MeuItem(cont);
			try {
				tb.insere(reg);
			} catch (Exception e) {
				fail();
			}
		}
		// setup

		reg = new MeuItem(12);
		assertEquals(0, tb.pesquisa(reg));
	}

	public void test3_1() {
		// setup
		Tabela tb = new Tabela();
		MeuItem reg = null;
		int cont;
		// setup

		for (cont = 0; cont < 10; cont++) {
			reg = new MeuItem(cont);
			try {
				tb.insere(reg);
			} catch (Exception e) {
				fail();
			}
		}
		// setup

		reg = new MeuItem(8);
		assertEquals(9, tb.binaria(reg));
	}

	public void test3_2() {
		// setup
		Tabela tb = new Tabela();
		MeuItem reg = null;
		int cont;
		// setup

		for (cont = 0; cont < 10; cont++) {
			reg = new MeuItem(cont);
			try {
				tb.insere(reg);
			} catch (Exception e) {
				fail();
			}
		}
		// setup

		reg = new MeuItem(12);
		assertEquals(0, tb.binaria(reg));
	}

	public void test1_1_L2() {
		// setup
		Tabela tb = new Tabela();
		Tabela tb2;
		// setup
		tb2 = new Tabela();

		assertNotNull(tb2);
		assertEquals(0, tb2.n);
	}

	public void test4_1_I() {
		// setup
		Tabela tb = new Tabela();
		MeuItem reg = null;
		int cont;
		// setup

		// setup

		reg = new MeuItem(90);
		
		assertNotNull(reg);
		
		try {
			tb.insere(reg);
		} catch (Exception e) {
			fail();
		}
		assertEquals(1,tb.pesquisa(reg));

		assertEquals(90,
				((Integer) (tb.registros[1].recuperaChave())).intValue());
	}

	public void test4_1_S() {
		// setup
		Tabela tb = new Tabela();
		MeuItem reg = null;
		int cont;
		// setup

		for (cont = 0; cont < 9; cont++) {
			reg = new MeuItem(cont);
			try {
				tb.insere(reg);
			} catch (Exception e) {
				fail();
			}
		}
		// setup

		reg = new MeuItem(90);
		try {
			tb.insere(reg);
		} catch (Exception e) {
			fail();
		}
		assertEquals(90,
				((Integer) (tb.registros[10].recuperaChave())).intValue());
	}
}
