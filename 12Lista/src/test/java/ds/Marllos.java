package ds;

import ds.Lista;
import junit.framework.TestCase;

public class Marllos extends TestCase {

	Lista lista;

	public void test1_1() {
		lista = new Lista();
		assertEquals(lista != null, true);
	}

	public void test2_1() {
		lista = new Lista();
		lista.insere(4);

		assertEquals(lista.vazia(), false);
	}

	public void test2_2() {
		lista = new Lista();

		assertEquals(lista.vazia(), true);
	}

	public void test4_1() {
		lista = new Lista();
		lista.insere(4);
		lista.insere(8);
		
		lista.imprime();
		//verfica saida padrao
	}

	public void test4_2() {
		lista = new Lista();
		lista.insere(4);

		lista.imprime();
		//verfica saida padrao
	}

	public void test5_1() {
		lista = new Lista();

		for (int i = 0; i < 35; i++)
			lista.insere(i + 5);

		lista.imprime();
		//verfica saida padrao
	}

	public void test5_2() {
		lista = new Lista();

		lista.imprime();
		//verfica saida padrao
	}
	/* AVL********AVL*************AVL */

}
