package ds;

import ds.*;
import junit.framework.TestCase;

public class Marllos extends TestCase {

	FPHeapMax heap;
	int n;
	
	
	/*public void test1_1() {
		heap = new FPHeapMax();
		assertEquals(heap != null,true);
	}*/
	
	public void test2_1() {
		n=7;
		heap = new FPHeapMax(n);
		
		MeuItem V[] = new MeuItem[n+1];		 
		V[1] = new MeuItem (new Integer(37));
		V[2] = new MeuItem (new Integer(4));
		V[3] = new MeuItem (new Integer(34));
		V[4] = new MeuItem (new Integer(435));
		V[5] = new MeuItem (new Integer(23));
		V[6] = new MeuItem (new Integer(3456));
		V[7] = new MeuItem (new Integer(2347));
		
		heap.copia(V);
		heap.constroi();
		
		heap.imprime();
		// verifica se heap foi construido corretamente.
		//3456 435 2347 4 23 34 37 
	}

	public void test2_2() {
		n=0;
		heap = new FPHeapMax(n);
		
		MeuItem V[] = new MeuItem[n+1];
			
		heap.copia(V);
		heap.constroi();
		
		heap.imprime();
		// verifica se heap foi construido corretamente.
	}
	
	public void test3_1() {
		n=9;
		heap = new FPHeapMax(n);
		Item it;
		
		try {
			heap.insere(new MeuItem (new Integer(37)));
			heap.insere(new MeuItem (new Integer(4)));
			heap.insere(new MeuItem (new Integer(34)));
			heap.insere(new MeuItem (new Integer(435)));
			heap.insere(new MeuItem (new Integer(23)));
			heap.insere(new MeuItem (new Integer(3456)));
			heap.insere(new MeuItem (new Integer(2347)));
			
			it = heap.retiraMax();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			it = null;
		}
		assertEquals(it.recuperaChave(),new Integer(3456));
	}
	
	public void test3_2() {
		n=0;
		heap = new FPHeapMax(n);
		
		Item it ;
		MeuItem V[] = new MeuItem[n+1];
		 
		heap.copia(V);
		heap.constroi();
		
		try {
			it = heap.retiraMax();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			it= null;
		}
		
		// na verdade ele gera uma excess�o e n�o retorna nada, o null testado � em rela��o a excess�o
		assertEquals(it,null);
		
	}
	
	public void test4_1() {
		n=7;
		heap = new FPHeapMax(n);
		
		Item it ;
		MeuItem V[] = new MeuItem[n+1];
		V[1] = new MeuItem (new Integer(37));
		V[2] = new MeuItem (new Integer(4));
		V[3] = new MeuItem (new Integer(34));
		V[4] = new MeuItem (new Integer(435));
		V[5] = new MeuItem (new Integer(23));
		V[6] = new MeuItem (new Integer(3456));
		V[7] = new MeuItem (new Integer(2347));
		
		heap.copia(V);
		heap.constroi();
		
		try {
			it = heap.max();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			it=null;
		}
		
		assertEquals(it.recuperaChave(),new Integer(3456));
		
	}
	
	public void test4_2() {
		n=0;
		heap = new FPHeapMax(n);
		
		Item it ;
		MeuItem V[] = new MeuItem[n+1];
		 
		heap.copia(V);
		heap.constroi();
		
		try {
			it = heap.max();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			it= null;
		}
		
		// na verdade ele gera uma excess�o e n�o retorna nada, o null testado � em rela��o a excess�o
		assertEquals(it,null);
		
	}
	
	public void test5_1e2() {
		n=7;
		heap = new FPHeapMax(n);
		
		MeuItem V[] = new MeuItem[n+1];
		V[1] = new MeuItem (new Integer(37));
		V[2] = new MeuItem (new Integer(4));
		V[3] = new MeuItem (new Integer(34));
		V[4] = new MeuItem (new Integer(435));
		V[5] = new MeuItem (new Integer(23));
		V[6] = new MeuItem (new Integer(3456));
		V[7] = new MeuItem (new Integer(2347));
		
		heap.copia(V);
		heap.constroi();
		
		//3456 435 2347 4 23 34 37 
		try {
			heap.aumentaChave(4,555);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//verifica se a chave de valor 4 virou 35 ou seja, se a heap ficou
		//3456 555 2347 435 23 34 37 		 
	}
	

	public void test6_1e3() {
		n=10;
		heap = new FPHeapMax(n);
		Item it;
		
		try {
			heap.insere(new MeuItem (new Integer(37)));
			heap.insere(new MeuItem (new Integer(4)));
			heap.insere(new MeuItem (new Integer(34)));
			heap.insere(new MeuItem (new Integer(435)));
			heap.insere(new MeuItem (new Integer(23)));
			heap.insere(new MeuItem (new Integer(3456)));
			heap.insere(new MeuItem (new Integer(2347)));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		it = new MeuItem(new Integer(44)) ;
		
		try {
			heap.insere(it);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//heap.imprime();
		// verificar se imprime  corretamente
		//3456 44 2347 37 23 34 435 4 
	}
	
	public void test6_2() {
		n=7;
		heap = new FPHeapMax(n);
		Item it;
		
		try {
			heap.insere(new MeuItem (new Integer(37)));
			heap.insere(new MeuItem (new Integer(4)));
			heap.insere(new MeuItem (new Integer(34)));
			heap.insere(new MeuItem (new Integer(435)));
			heap.insere(new MeuItem (new Integer(23)));
			heap.insere(new MeuItem (new Integer(3456)));
			heap.insere(new MeuItem (new Integer(2347)));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		it = new MeuItem(new Integer(44)) ;
		
		try {
			heap.insere(it);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			// verifica se lan�ou a excess�o
			assertEquals(true,true);
		}
	
	}

	
	
	public void test7_1() {
		n=10;
		heap = new FPHeapMax(n);
			
		try {
			heap.insere(new MeuItem (new Integer(37)));
			heap.insere(new MeuItem (new Integer(4)));
			heap.insere(new MeuItem (new Integer(34)));
			heap.insere(new MeuItem (new Integer(435)));
			heap.insere(new MeuItem (new Integer(23)));
			heap.insere(new MeuItem (new Integer(3456)));
			heap.insere(new MeuItem (new Integer(2347)));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		heap.imprime();
		// verifica se est� imprimindo certo
		//3456 37 2347 4 23 34 435 
	}
	
	public void test7_2() {
		n=10;
		heap = new FPHeapMax(n);
			
	
		heap.imprime();
		// verifica se est� imprimindo certo
		 
	}
	
	
	
	
	/*AVL************************************************AVL***************************************************AVL*/ 
	
	public void test2_1_I() {
		n=1;
		heap = new FPHeapMax(n);
		
		MeuItem V[] = new MeuItem[n+1];		 
		V[1] = new MeuItem (new Integer(37));
		
		heap.copia(V);
		heap.constroi();
		
		heap.imprime();
		// verifica se heap foi construido corretamente.
		//37 
	}
	
	public void test2_1_S() {
		n=20;
		heap = new FPHeapMax(n);
		
		MeuItem V[] = new MeuItem[n+1];		 
		V[1] = new MeuItem (new Integer(37));
		V[2] = new MeuItem (new Integer(4));
		V[3] = new MeuItem (new Integer(34));
		V[4] = new MeuItem (new Integer(435));
		V[5] = new MeuItem (new Integer(23));
		V[6] = new MeuItem (new Integer(3456));
		V[7] = new MeuItem (new Integer(2347));
		V[8] = new MeuItem (new Integer(38));
		V[9] = new MeuItem (new Integer(5));
		V[10] = new MeuItem (new Integer(35));
		V[11] = new MeuItem (new Integer(436));
		V[12] = new MeuItem (new Integer(24));
		V[13] = new MeuItem (new Integer(3457));
		V[14] = new MeuItem (new Integer(2348));
		V[15] = new MeuItem (new Integer(36));
		V[16] = new MeuItem (new Integer(3));
		V[17] = new MeuItem (new Integer(33));
		V[18] = new MeuItem (new Integer(434));
		V[19] = new MeuItem (new Integer(22));
		V[20] = new MeuItem (new Integer(3455));
				
		heap.copia(V);
		heap.constroi();
		
		heap.imprime();
		// verifica se heap foi construido corretamente.
		//3457 3455 3456 435 436 37 2348 38 434 35 4 24 34 2347 36 3 33 5 22 23
	}
	
	public void test3_1_I() {
		n=7;
		heap = new FPHeapMax(n);
		Item it ;
				
		try {
			heap.insere(new MeuItem (new Integer(37)));
			
			it = heap.retiraMax();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			it=null;
		}
		
		assertEquals(it.recuperaChave(),new Integer(37));
		 
	}
	
	public void test3_1_S() {
		n=7;
		heap = new FPHeapMax(n);
		Item it;
		
		try {
			heap.insere(new MeuItem (new Integer(37)));
			heap.insere(new MeuItem (new Integer(4)));
			heap.insere(new MeuItem (new Integer(34)));
			heap.insere(new MeuItem (new Integer(435)));
			heap.insere(new MeuItem (new Integer(23)));
			heap.insere(new MeuItem (new Integer(3456)));
			heap.insere(new MeuItem (new Integer(2347)));
			
			it = heap.retiraMax();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			it = null;
		}
		assertEquals(it.recuperaChave(),new Integer(3456));
		
	}
	
	public void test5_2_S() {
		n=7;
		heap = new FPHeapMax(n);
		
		MeuItem V[] = new MeuItem[n+1];
		V[1] = new MeuItem (new Integer(37));
		V[2] = new MeuItem (new Integer(4));
		V[3] = new MeuItem (new Integer(34));
		V[4] = new MeuItem (new Integer(435));
		V[5] = new MeuItem (new Integer(23));
		V[6] = new MeuItem (new Integer(3456));
		V[7] = new MeuItem (new Integer(2347));
		
		heap.copia(V);
		heap.constroi();
		
		//3456 435 2347 4 23 34 37 
		try {
			heap.aumentaChave(4,5555);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//heap.imprime();
		//verifica se a chave de valor 4 virou 35 ou seja, se a heap ficou
		//5555 3456 2347 435 23 34 37 	 
	}
	
	public void test6_1_I(){
		n=10;
		heap = new FPHeapMax(n);
		
		try {
			heap.insere(new MeuItem (new Integer(37)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		heap.imprime();
		// verificar se imprime  corretamente
		//37
		
	}
	public void test6_3_I_1() {
		n=10;
		heap = new FPHeapMax(n);
		Item it;
		
		try {
			heap.insere(new MeuItem (new Integer(37)));
			heap.insere(new MeuItem (new Integer(4)));
			heap.insere(new MeuItem (new Integer(34)));
			heap.insere(new MeuItem (new Integer(435)));
			heap.insere(new MeuItem (new Integer(23)));
			heap.insere(new MeuItem (new Integer(3456)));
			heap.insere(new MeuItem (new Integer(2347)));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		it = new MeuItem(new Integer(3)) ;
		
		try {
			heap.insere(it);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//heap.imprime();
		// verificar se imprime  corretamente
		//3456 37 2347 4 23 34 435 3 
	}
	
	public void test6_3_I_2() {
		n=10;
		heap = new FPHeapMax(n);
		Item it;
		
		try {
			heap.insere(new MeuItem (new Integer(37)));
			heap.insere(new MeuItem (new Integer(4)));
			heap.insere(new MeuItem (new Integer(34)));
			heap.insere(new MeuItem (new Integer(435)));
			heap.insere(new MeuItem (new Integer(23)));
			heap.insere(new MeuItem (new Integer(3456)));
			heap.insere(new MeuItem (new Integer(2347)));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		it = new MeuItem(new Integer(4)) ;
		
		try {
			heap.insere(it);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		heap.imprime();
		// verificar se imprime  corretamente
		//3456 37 2347 4 23 34 435 4 
	}
	
	public void test6_3_S_1() {
		n=10;
		heap = new FPHeapMax(n);
		Item it;
		
		try {
			heap.insere(new MeuItem (new Integer(37)));
			heap.insere(new MeuItem (new Integer(4)));
			heap.insere(new MeuItem (new Integer(34)));
			heap.insere(new MeuItem (new Integer(435)));
			heap.insere(new MeuItem (new Integer(23)));
			heap.insere(new MeuItem (new Integer(3456)));
			heap.insere(new MeuItem (new Integer(2347)));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		it = new MeuItem(new Integer(4444)) ;
		
		try {
			heap.insere(it);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//heap.imprime();
		// verificar se imprime  corretamente
		//4444 3456 2347 37 23 34 435 4
	}
	
	public void test6_3_S_2() {
		n=10;
		heap = new FPHeapMax(n);
		Item it;
		
		try {
			heap.insere(new MeuItem (new Integer(37)));
			heap.insere(new MeuItem (new Integer(4)));
			heap.insere(new MeuItem (new Integer(34)));
			heap.insere(new MeuItem (new Integer(435)));
			heap.insere(new MeuItem (new Integer(23)));
			heap.insere(new MeuItem (new Integer(3456)));
			heap.insere(new MeuItem (new Integer(2347)));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		it = new MeuItem(new Integer(3456)) ;
		
		try {
			heap.insere(it);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		heap.imprime();
		// verificar se imprime  corretamente
		//3456 3456 2347 37 23 34 435 4 
	}
}
