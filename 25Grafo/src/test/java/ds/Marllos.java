package ds;

import ds.Grafo;
import junit.framework.TestCase;

public class Marllos extends TestCase {

	 Grafo grafo;
	 
	 public void setUp()
	 {		 
		grafo = new Grafo ();
	 }
	 
	public void test1_1() {
		grafo = new Grafo ();
		assertEquals(grafo != null,true);
	}
	
	public void test2_1() {
		Grafo.Aresta a;

		a = new Grafo.Aresta (3, 5, 7);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); 

		assertEquals(grafo.existeAresta(3, 5),true);
	}
	
	public void test2_2() {
		Grafo.Aresta a;

		a = new Grafo.Aresta (3, 5, 7);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); 
		
		a = new Grafo.Aresta (3, 5, 9);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@

		assertEquals(grafo.existeAresta(3, 5),true);
	}
	
	public void test3_1() {
		Grafo.Aresta a;

		a = new Grafo.Aresta (3, 5, 7);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@    

		assertEquals(grafo.existeAresta(3, 5),true);
	}
	
	public void test3_2() {
		Grafo.Aresta a;

		a = new Grafo.Aresta (3, 5, 7);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@    

		assertEquals(grafo.existeAresta(3, 6),false);
	}
	
	public void test4_1() {
		Grafo.Aresta a;

		a = new Grafo.Aresta (3, 5, 7);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@    

		assertEquals(grafo.listaAdjVazia(4),true);
	}
	public void test4_2() {
		Grafo.Aresta a;

		a = new Grafo.Aresta (3, 5, 7);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@    

		assertEquals(grafo.listaAdjVazia(3),false);
	}
	

	public void test5_1() {
		Grafo.Aresta a,b;

		a = new Grafo.Aresta (3, 5, 7);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@    
		a = new Grafo.Aresta (3, 2, 1);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@
		a = new Grafo.Aresta (3, 7, 3);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@
		
		
		a = new Grafo.Aresta (3, 5, 7);
		
		b= grafo.primeiroListaAdj(3);
		
		assertEquals(a.v1()==b.v1()&& a.v2()==b.v2() && a.peso()==b.peso(),true);
	}
	
	public void test5_2() {
		Grafo.Aresta b;
		
		b= grafo.primeiroListaAdj(3);
		
		assertEquals(b,null);
	}
	
	public void test6_1e3() {
		Grafo.Aresta a,b;

		a = new Grafo.Aresta (3, 5, 7);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@    
		a = new Grafo.Aresta (3, 2, 1);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@
		a = new Grafo.Aresta (3, 7, 3);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@
		
		a = new Grafo.Aresta (3, 5, 7);
		
		b= grafo.proxAdj(3);
		
		assertEquals(a.v1()==b.v1()&& a.v2()==b.v2() && a.peso()==b.peso(),true);
	}
	
	public void test6_2() {
		Grafo.Aresta b;
		
		b= grafo.proxAdj(3);
		
		assertEquals(b,null);
	}
	
	public void test6_4() {
		Grafo.Aresta a,b;

		a = new Grafo.Aresta (3, 5, 7);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@    
		a = new Grafo.Aresta (3, 2, 1);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@
		a = new Grafo.Aresta (3, 7, 3);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@
		
		grafo.proxAdj(3);
		grafo.proxAdj(3);
		grafo.proxAdj(3);
		
		a = new Grafo.Aresta (3, 5, 7);
		
		
		b= grafo.proxAdj(3);
		
		assertEquals(b,null);
	}
	
	public void test7_1() {
		Grafo.Aresta a,b;

		a = new Grafo.Aresta (3, 5, 7);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@    
		a = new Grafo.Aresta (3, 2, 1);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@
		a = new Grafo.Aresta (3, 7, 3);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@
		
		a = new Grafo.Aresta (3, 2, 1);
		
		try {
			b = grafo.retiraAresta(3,2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			b=null;
		}
		
		assertEquals(a.v1()==b.v1()&& a.v2()==b.v2() && a.peso()==b.peso(),true);
		
	}

	
	public void test7_2() {
		Grafo.Aresta a,b;

		a = new Grafo.Aresta (3, 5, 7);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@    
		a = new Grafo.Aresta (3, 2, 1);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@
		a = new Grafo.Aresta (3, 7, 3);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@
		
		a = new Grafo.Aresta (3, 2, 1);
		
		try {
			b = grafo.retiraAresta(3,3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			b=null;
		}
		assertEquals(b,null);
	}

	public void test8_1() {
		Grafo.Aresta a;

		a = new Grafo.Aresta (3, 5, 7);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@    
		a = new Grafo.Aresta (3, 2, 1);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@
		a = new Grafo.Aresta (3, 7, 3);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@
		
		grafo.imprime();
		// verifica se grafo foi impresso corretamente
	}

	public void test8_2() {
		grafo.imprime();
		// verifica se grafo foi impresso corretamente
	}

	public void test10_1() {
		Grafo.Aresta a;

		a = new Grafo.Aresta (3, 5, 7);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@    
		a = new Grafo.Aresta (3, 2, 1);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@
		a = new Grafo.Aresta (3, 7, 3);
		grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@
		
		Grafo grafoT = grafo.grafoTransposto();
		
		grafoT.imprime();		
		// verifica se grafo foi impresso corretamente
		
	}
	public void test10_2() {
				Grafo grafoT = grafo.grafoTransposto();
		
		grafoT.imprime();
		
		// verifica se grafo foi impresso corretamente
		
	}
	

	/*AVL************************************************AVL***************************************************AVL*/ 
	
}
