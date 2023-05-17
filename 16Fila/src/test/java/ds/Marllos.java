package ds;

import ds.Fila;
import junit.framework.TestCase;

public class Marllos extends TestCase {

	Fila fila;
	
	public void test1_1() {
		fila = new Fila();
		assertEquals(fila != null,true);
	}
	
	public void test2_1() {
		fila = new Fila();
		fila.enfileira(4);
		
		assertEquals(fila.vazia(), false);
	}

	public void test2_2() {
		fila = new Fila();
				
		assertEquals(fila.vazia(), true);
	}
	
	public void test3_1() {
		fila = new Fila();
		fila.enfileira(4);
		fila.enfileira(8);
		
		//verifica se fila contem 2 elementos
		fila.imprime();
	}
	
	public void test3_2() {
		fila = new Fila();
		fila.enfileira(4);
		
		//verifica se fila contem 2 elementos
		fila.imprime();
	}
	
	public void test4_1() {
		Object item;
		
		fila = new Fila();
		fila.enfileira(4);
		fila.enfileira(8);
		try {
			item = fila.desenfileira();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			item = null;
		}
		
		assertEquals(item.equals(new Integer(4)),true);
		
	}
	
	public void test4_2() {
		fila = new Fila();
		Object item;
		
		try {
			item = fila.desenfileira();
			fail("Exceção Esperada: java.lang.Exception");
		} catch (Exception e) {
			item = null;
			assertNull(item);
		}
	}
	
	public void test5_1()
	{
		fila = new Fila();
		
		for (int i =0; i<35 ; i++)
			fila.enfileira(i+5);
		
		fila.imprime();
		
		//verifica se itens s�o impressos
	}
	
	public void test5_2()
	{
		fila = new Fila();
		
		fila.imprime();
		
		//verifica se nenhum item � impresso
	}
	
	/*AVL************************************************AVL***************************************************AVL*/ 
	public void test4_1_I() {
		Object item;
		
		fila = new Fila();
		fila.enfileira(8);
		
		try {
			item = fila.desenfileira();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			item = null;
		}
		
		assertEquals(item.equals(new Integer(8)),true);
		
	}
	
}
