package ds;

//import ds.Fila;
import junit.framework.TestCase;

public class Marllos extends TestCase {

	public void test1_1() {
		//setup
		Fila fila = new Fila();
		//setup
		
		assertEquals(fila.frente, fila.tras);
		
	}

	public void test1_2() {
		//setup
		Fila fila = new Fila();
		//setup
		
		Fila fila2 = new Fila();
		assertTrue(fila2.frente == fila2.tras);
		assertEquals(0, fila2.frente);
	}
	


	public void test3_1() {
		//setup
		Fila fila = new Fila();
		Integer item = null;
		try{
			for(int i=0; i<=10; i++){
				item = new Integer(i); 
				fila.enfileira(item);
			}
		}catch(Exception e){
			fail();
			
		}
		//setup

		item = new Integer(20);
		try {
			fila.enfileira(item);
		} catch(Exception e){
			fail();
		}		
		
		assertEquals(20,((Integer)fila.item[fila.tras-1]).intValue());
	}

	public void test3_2() {
		//setup
		Fila fila = new Fila();
		Integer item = null;
		try{
			for(int i=0; i<997; i++){
				item = new Integer(i); 
				fila.enfileira(item);
			}
		}catch(Exception e){
			fail();
			
		}
		//setup

		item = new Integer(1200);
		try {
			fila.enfileira(item);
		} catch(Exception e){
			fail();
		}		
		
		assertEquals(1200, ((Integer)fila.item[fila.tras-1]).intValue());
	}
	
	public void test4_1() {
		//setup
		Integer desenfileirado = null;
		Fila fila = new Fila();
		Integer item = null;
		try{
			for(int i=0; i<=10; i++){
				item = new Integer(i); 
				fila.enfileira(item);
			}
		}catch(Exception e){
			fail();
			
		}
		//setup

		try{
			desenfileirado = (Integer) fila.desenfileira();
		}catch(Exception e){
			fail();
		}
		
		assertEquals(1, ((Integer)fila.item[fila.frente]).intValue());
		
	}

	public void test4_2() {
		//setup
		Integer desenfileirado = null;
		Fila fila = new Fila();
		Integer item = null;
		//setup

		try{
			desenfileirado = (Integer) fila.desenfileira();
		}catch(Exception e){
			assertTrue(true);
		}
		
		assertNull(desenfileirado);
	}	

	public void test6_1() {
		//setup
		Fila fila = new Fila();
		Integer item = null;
		//setup
		
		assertTrue(fila.vazia());
	}

	public void test6_2() {
		//setup
		Fila fila = new Fila();
		Integer item = null;
		try{
			for(int i=0; i<=10; i++){
				item = new Integer(i); 
				fila.enfileira(item);
			}
		}catch(Exception e){
			fail();
			
		}
		//setup

		
		assertFalse(fila.vazia());
		
	}
	
/*AVL************************************************AVL***************************************************AVL*/

	/*public void test1_1_IS() {
		//setup
		Fila fila = new Fila();
		//setup
		
		assertEquals(fila.frente, fila.tras);
		
	}*/

	/*
	public void test1_2IS() {
		//setup
		Fila fila = new Fila();
		//setup
		
		Fila fila2 = new Fila();
		assert(fila2.frente == fila2.tras && fila2.frente == 1);
	}*/
	


	public void test3_1_I() {
		//setup
		Fila fila = new Fila();
		Integer item = null;
		//setup

		item = new Integer(20);
		try {
			fila.enfileira(item);
		} catch(Exception e){
			fail();
		}		
		
		assertEquals(20, ((Integer)fila.item[fila.tras-1]).intValue());
		
	}
	
	public void test3_1_S() {
		//setup
		Fila fila = new Fila();
		Integer item = null;
		try{
			for(int i=0; i<998; i++){
				item = new Integer(i); 
				fila.enfileira(item);
			}
		}catch(Exception e){
			fail();
			
		}
		//setup

		item = new Integer(20);
		try {
			fila.enfileira(item);
		} catch(Exception e){
			fail();
		}		
		
		assertEquals(20, ((Integer)fila.item[fila.tras-1]).intValue());
		
	}

	/*public void test3_2_IS() {
		//setup
		Fila fila = new Fila();
		Integer item = null;
		try{
			for(int i=0; i<1000; i++){
				item = new Integer(i); 
				fila.enfileira(item);
			}
		}catch(Exception e){
			assert(false);
			
		}
		//setup

		item = new Integer(1200);
		try {
			fila.enfileira(item);
		} catch(Exception e){
			assert(false);
		}		
		
		assert(((Integer)fila.item[fila.tras]).intValue() == 1000);
		
	}*/
	
	
	public void test4_1_I() {
		//setup
		Integer desenfileirado = null;
		Fila fila = new Fila();
		Integer item = null;
		try{
			item = new Integer(1); 
			fila.enfileira(item);
		}catch(Exception e){
			fail();
			
		}
		//setup

		try{
			desenfileirado = (Integer) fila.desenfileira();
		}catch(Exception e){
			fail();
			
		}
		
		assertEquals(1,desenfileirado.intValue());
		
	}
	
	public void test4_1_S() {
		//setup
		Integer desenfileirado = null;
		Fila fila = new Fila();
		Integer item = null;
		try{
			for(int i=0; i<998; i++){
				item = new Integer(i); 
				fila.enfileira(item);
			}
		}catch(Exception e){
			fail();
			
		}
		//setup

		try{
			desenfileirado = (Integer) fila.desenfileira();
		}catch(Exception e){
			fail();
			
		}
		
		assertEquals(1,((Integer)fila.item[fila.frente]).intValue());
		
	}

/*	public void test4_2IS() {
		//setup
		Integer desenfileirado = null;
		Fila fila = new Fila();
		Integer item = null;
		//setup

		try{
			desenfileirado = (Integer) fila.desenfileira();
		}catch(Exception e){
			assert(true);
			
		}
		
		assert(false);
		
	}	

	public void test6_1_IS() {
		//setup
		Fila fila = new Fila();
		Integer item = null;
		//setup
		
		assert(fila.vazia());

	}*/

	public void test6_2_I() {
		//setup
		Fila fila = new Fila();
		Integer item = null;
		try{
			item = new Integer(1); 
			fila.enfileira(item);
		}catch(Exception e){
			fail();
			
		}
		//setup

		
		assertFalse(fila.vazia());
		
	}
	
	public void test6_2_S() {
		//setup
		Fila fila = new Fila();
		Integer item = null;
		try{
			for(int i=0; i<998; i++){
				item = new Integer(i); 
				fila.enfileira(item);
			}
		}catch(Exception e){
			fail();
			
		}
		//setup

		
		assertFalse(fila.vazia());
	}
}
