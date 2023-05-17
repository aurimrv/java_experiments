package ds;

import ds.Pilha;
import junit.framework.TestCase;

public class Marllos extends TestCase {

	public void test1_1(){
		//setup//
		Pilha stk = null;
		//setup//
		
		stk = new Pilha();
		assertEquals(0,stk.topo);
		assertEquals(stk.item.length, 1000);
		
	}
	
	public void test3_1(){
		//setup//
		Pilha stk = null;
		stk = new Pilha();
		//setup//
		
		assertTrue(stk.vazia());
		
		
	}
	
	public void test3_2(){
		//setup//
		Pilha stk = null;
		stk = new Pilha();
		try{
			for(int i=1; i<=10; i++){
				stk.empilha(new Integer(i));
			}
		}catch(Exception e){
			System.out.println("setup falhou");
		}
		//setup//
		
		assertFalse(stk.vazia());
		
	}
	
	public void test4_1(){
		//setup//
		Pilha stk = null;
		stk = new Pilha();
		try{
			for(int i=1; i<=10; i++){
				stk.empilha(new Integer(i));
			}
		}catch(Exception e){
			System.out.println("setup falhou");
		}
		//setup//
		
		try{
		stk.empilha(new Integer(20));
		
		}catch(Exception e){
			assertTrue(false);
		}
		
		assertTrue(((Integer)(stk.item[stk.topo-1])).intValue() == 20);
	}
	
	public void test4_2(){
		//setup//
		Pilha stk = null;
		stk = new Pilha();
		try{
			for(int i=1; i<=1000; i++){
				stk.empilha(new Integer(i));
			}
		}catch(Exception e){
			System.out.println("setup falhou");
		}
		//setup//
		
		try{
		stk.empilha(new Integer(1000));
		assertTrue(false);
		}catch(Exception e){
			for(int i=0; i<1000; i++){
				if(((Integer)(stk.item[i])).intValue() == -1){
					assertTrue(false);
				}
				assertTrue(true);
			}
		}

	}
	
	public void test5_1(){
		Integer retorno = null;
		//setup//
		Pilha stk = null;
		stk = new Pilha();
		try{
			for(int i=1; i<=10; i++){
				stk.empilha(new Integer(i));
			}
		}catch(Exception e){
			System.out.println("setup falhou");
		}
		//setup//
		
		try{
		retorno = (Integer) stk.desempilha();
		
		}catch(Exception e){
			assertTrue(false);
		}
		
		assertEquals(new Integer(10), retorno);
	}	
	
	public void test5_2(){
		Integer retorno = null;
		//setup//
		Pilha stk = null;
		stk = new Pilha();
		//setup//
		
		try{
		retorno = (Integer) stk.desempilha();
		assertTrue(false);
		}catch(Exception e){
			assertNull(retorno);
		}
		
	}
	
	public void test6_1(){
		int retorno = 0;
		//setup//
		Pilha stk = null;
		stk = new Pilha();
		try{
			for(int i=1; i<=10; i++){
				stk.empilha(new Integer(i));
			}
		}catch(Exception e){
			System.out.println("setup falhou");
		}
		//setup//
		
		
		retorno = stk.tamanho();
		
		assertEquals(retorno, 10);
		
	}	
	
///////////////////////////////////////////////////*An. Valor Limite*
	
	public void test1_1_L2(){
		//setup//
		Pilha stk = null;
		Pilha stk2 = null;
		//setup//
		
		stk = new Pilha();
		stk2 = new Pilha();
		assertEquals(0,stk2.topo);
		assertEquals(stk2.item.length, 1000);
		
	}
	
	public void test3_2_I(){
		//setup//
		Pilha stk = null;
		stk = new Pilha();
		try{
			stk.empilha(new Integer(10));
		}catch(Exception e){
			System.out.println("setup falhou");
		}
		//setup//
		
		assertFalse(stk.vazia());
		
	}
	
	public void test3_2_S(){
		//setup//
		Pilha stk = null;
		stk = new Pilha();
		try{
			for(int i=1; i<=1000; i++){
				stk.empilha(new Integer(i));
			}
		}catch(Exception e){
			System.out.println("setup falhou");
		}
		//setup//
		
		assertFalse(stk.vazia());
		
	}
	
	public void test4_1_I(){
		//setup//
		Pilha stk = null;
		stk = new Pilha();
		try{
			stk.empilha(new Integer(1));
		
		}catch(Exception e){
			System.out.println("setup falhou");
		}
		//setup//
		
		try{
		stk.empilha(new Integer(20));
		
		}catch(Exception e){
			assertTrue(false);
		}
		
		assertTrue(((Integer)(stk.item[stk.topo-1])).intValue() == 20);
	}
	
	public void test4_1_S(){
		//setup//
		Pilha stk = null;
		stk = new Pilha();
		try{
			for(int i=1; i<=999; i++){
				stk.empilha(new Integer(i));
			}
		}catch(Exception e){
			System.out.println("setup falhou");
		}
		//setup//
		
		try{
		stk.empilha(new Integer(20));
		
		}catch(Exception e){
			assertTrue(false);
		}
		
		assertTrue(((Integer)(stk.item[stk.topo-1])).intValue() == 20);
	}
	
		
	public void test5_1_S(){
		Integer retorno = null;
		//setup//
		Pilha stk = null;
		stk = new Pilha();
		try{
			for(int i=1; i<=1000; i++){
				stk.empilha(new Integer(i));
			}
		}catch(Exception e){
			System.out.println("setup falhou");
		}
		//setup//
		
		try{
		retorno = (Integer) stk.desempilha();
		
		}catch(Exception e){
			assertTrue(false);
		}
		
		assertEquals(new Integer(1000), retorno);
	}	
	
	public void test5_1_I(){
		Integer retorno = null;
		//setup//
		Pilha stk = null;
		stk = new Pilha();
		try{
			stk.empilha(new Integer(1));
		}catch(Exception e){
			System.out.println("setup falhou");
		}
		//setup//
		
		try{
		retorno = (Integer) stk.desempilha();
		
		}catch(Exception e){
			assertTrue(false);
		}
		
		assertEquals(new Integer(1), retorno);
	}	

	public void test6_1_I(){
		int retorno = -1;
		//setup//
		Pilha stk = null;
		stk = new Pilha();
		//setup//
		
		
		retorno = stk.tamanho();
		
		assertEquals(retorno, 0);
		
	}	
	
	public void test6_1_S(){
		int retorno = 0;
		//setup//
		Pilha stk = null;
		stk = new Pilha();
		try{
			for(int i=1; i<=1000; i++){
				stk.empilha(new Integer(i));
			}
		}catch(Exception e){
			System.out.println("setup falhou");
		}
		//setup//
		
		
		retorno = stk.tamanho();
		
		assertEquals(retorno, 1000);
		
	}	
}
