package ds;

import ds.Pilha;
import junit.framework.TestCase;

public class Marllos extends TestCase {

	Pilha pilha;
	
	public void test1_1() {
		pilha = new Pilha();
		assertEquals(pilha != null,true);
	}
	
	public void test2_1() {
		pilha = new Pilha();
		pilha.empilha(4);
		
		assertEquals(pilha.vazia(), false);
	}

	public void test2_2() {
		pilha = new Pilha();
				
		assertEquals(pilha.vazia(), true);
	}
	
	public void test3_1() {
		pilha = new Pilha();
		pilha.empilha(4);
		pilha.empilha(8);
		
		assertEquals(pilha.tamanho(),2);		
	}
	
	public void test3_2() {
		pilha = new Pilha();
		pilha.empilha(8);
		
		assertEquals(pilha.tamanho(),1);
	}
	
	public void test4_1() {
		Object item;
		
		pilha = new Pilha();
		pilha.empilha(4);
		pilha.empilha(8);
		try {
			item = pilha.desempilha();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			item = null;
		}
		
		assertEquals(item.equals(new Integer(8)),true);
		
	}
	
	public void test4_2() {
		pilha = new Pilha();
		Object item;
		
		try {
			item = pilha.desempilha();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			item = null;
		}
		
		assertEquals(pilha.vazia(),true);
		
	}
	
	public void test5_1()
	{
		pilha = new Pilha();
		
		for (int i =0; i<35 ; i++)
			pilha.empilha(i+5);
		
		assertEquals(pilha.tamanho(),35);	
	}
	
	public void test5_2()
	{
		pilha = new Pilha();
		
		assertEquals(pilha.tamanho(),0);	
	}
	/*AVL************************************************AVL***************************************************AVL*/ 
	
	public void test4_1_I() {
		Object item;
		
		pilha = new Pilha();
		pilha.empilha(8);
		try {
			item = pilha.desempilha();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			item = null;
		}
		
		assertEquals(item.equals(new Integer(8)) && pilha.vazia(),true);
		
	}
}
