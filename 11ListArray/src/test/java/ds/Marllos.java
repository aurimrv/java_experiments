package ds;

import ds.Lista;
import junit.framework.TestCase;

public class Marllos extends TestCase {
	
	public void test1_1(){
		//setup//
		Lista lst = null;
		//setup//
		
		lst = new Lista();
		assertEquals(lst.primeiro, lst.ultimo);
		assertEquals(lst.item.length, 1000);
		
	}
	
	public void test3_1(){
		//setup//
		Lista lst = null;
		lst = new Lista();
		
		try{
			for(int i=1; i<=10; i++){
				lst.insere(new Integer(i));
			}
		}catch(Exception e){
			System.out.println("Setup falhou");
			
		}
		//setup//
		try{
			lst.insere(new Integer(20));
		}catch(Exception e){
			assertTrue(false);
		}
		
		assertTrue(((Integer)lst.item[lst.ultimo-1]).intValue() == 20);
				
	}
	
	public void test3_2(){
		//setup//
		Lista lst = null;
		lst = new Lista();
		
		try{
			for(int i=1; i<=1000; i++){
				lst.insere(new Integer(i));
			}
		}catch(Exception e){
			System.out.println("Setup falhou");
			
		}
		//setup//
		try{
			lst.insere(new Integer(20));
			assertTrue(false);
		}catch(Exception e){
			assertTrue(true);
		}
		
		
				
	}
	
	public void test9_1(){
		//setup//
		Lista lst = null;
		lst = new Lista(); 
		//setup//
		
		
		assertTrue(lst.vazia());
		
				
	}
	
	public void test9_2(){
		//setup//
		Lista lst = null;
		lst = new Lista();
		
		try{
			for(int i=1; i<=10; i++){
				lst.insere(new Integer(i));
			}
		}catch(Exception e){
			System.out.println("Setup falhou");
			
		}
		//setup//
		
		
		assertFalse(lst.vazia());
				
	}
	
	public void test10_1(){
		//setup//
		Lista lst = null;
		lst = new Lista();
		
		try{
			for(int i=1; i<=10; i++){
				lst.insere(new Integer(i));
			}
		}catch(Exception e){
			System.out.println("Setup falhou");
			
		}
		//setup//
		
		lst.imprime();
		assertTrue(true);
				
	}
	
	public void test10_2(){
		//setup//
		Lista lst = null;
		lst = new Lista();
		//setup//
		
		lst.imprime();
		assertTrue(true);
				
	}

	/********************************AVL********************************/

	
	public void test1_1_L2(){
		//setup//
		Lista lst = null;
		Lista lst2 = null;
		//setup//
		
		lst = new Lista();
		lst2 = new Lista();
		assertEquals(lst2.primeiro, lst2.ultimo);
		assertEquals(lst2.item.length, 1000);
		
	}
	
	public void test3_1_I(){
		//setup//
		Lista lst = null;
		lst = new Lista();
		//setup//

		try{
			lst.insere(new Integer(20));
		}catch(Exception e){
			assertTrue(false);
		}
		
		assertTrue(((Integer)lst.item[lst.ultimo-1]).intValue() == 20);
				
	}
	
	public void test3_1_S(){
		//setup//
		Lista lst = null;
		lst = new Lista();
		
		try{
			for(int i=1; i<=999; i++){
				lst.insere(new Integer(i));
			}
		}catch(Exception e){
			System.out.println("Setup falhou");
			
		}
		//setup//
		try{
			lst.insere(new Integer(20));
		}catch(Exception e){
			assertTrue(false);
		}
		
		assertTrue(((Integer)lst.item[lst.ultimo-1]).intValue() == 20);
				
	}
	
	public void test9_2_I(){
		//setup//
		Lista lst = null;
		lst = new Lista();
		
		try{
			for(int i=1; i<=1; i++){
				lst.insere(new Integer(i));
			}
		}catch(Exception e){
			System.out.println("Setup falhou");
			
		}
		//setup//
		
		
		assertFalse(lst.vazia());
				
	}
	
	public void test9_2_S(){
		//setup//
		Lista lst = null;
		lst = new Lista();
		
		try{
			for(int i=1; i<=1000; i++){
				lst.insere(new Integer(i));
			}
		}catch(Exception e){
			System.out.println("Setup falhou");
			
		}
		//setup//
		
		
		assertFalse(lst.vazia());
				
	}
	
	public void test10_1_I(){
		//setup//
		Lista lst = null;
		lst = new Lista();
		
		try{
			for(int i=1; i<=1; i++){
				lst.insere(new Integer(i));
			}
		}catch(Exception e){
			System.out.println("Setup falhou");
			
		}
		//setup//
		
		lst.imprime();
		assertTrue(true);
				
	}
	
	public void test10_1_S(){
		//setup//
		Lista lst = null;
		lst = new Lista();
		
		try{
			for(int i=1; i<=1000; i++){
				lst.insere(new Integer(i));
			}
		}catch(Exception e){
			System.out.println("Setup falhou");
			
		}
		//setup//
		
		lst.imprime();
		assertTrue(true);
				
	}
	
	
}