package ds;

import ds.Grafo;
//import ds.Grafo.Aresta;
import junit.framework.TestCase;

public class Marllos extends TestCase {

	 Grafo grafo;
	
	 protected void setUp() throws Exception {
		super.setUp();
		grafo = new Grafo ();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		grafo = null;
	}

	
	//Teste utilizando classe de equivalencia
	public void test1_1() {
		boolean vazio = true;
		for (int i = 0; i<100;i++)
			for (int j = 0; j<100;j++)
			   if (grafo.existeAresta(i,j))
				 vazio = false;
			
		assertEquals(vazio, true);
	}

	public void test2_1() {
		//setup//
		grafo.insereAresta(3, 4, 10) ;
		//setup//
		
		Aresta primeiro = grafo.retiraAresta(3,4);
		
		assertEquals(primeiro.v1(), 3);
		assertEquals(primeiro.v2(), 4);
		assertEquals(primeiro.peso(), 10);
	}
	
	public void test2_2() {
		//setup//
		grafo.insereAresta(3, 4, 5) ;
		grafo.insereAresta(3, 4, 10) ;
		//setup//
		
		Aresta primeiro = grafo.retiraAresta(3,4);
		
		assertEquals(primeiro.v1(), 3);
		assertEquals(primeiro.v2(), 4);
		assertEquals(primeiro.peso(), 10);
	}

	public void test3_1() {
		//setup//
		grafo.insereAresta(3, 4, 5) ;
		//setup//
		
		assertEquals(grafo.existeAresta(3, 4),true);
	}
	
	public void test3_2() {
		assertEquals(grafo.existeAresta(3, 4),false);
	}

	public void test4_1() {
		assertEquals(grafo.listaAdjVazia(2),true);
	}

	public void test4_2() {
		//setup//
		grafo.insereAresta(2, 4, 5) ;
		grafo.insereAresta(2, 6, 5) ;
		//setup//
		
		assertEquals(grafo.listaAdjVazia(2),false);
	}
	
	public void test5_1() {
		//setup//
		grafo.insereAresta(2, 4, 5) ;
		grafo.insereAresta(2, 6, 5) ;
		//setup//
		
		Aresta primeiro = grafo.primeiroListaAdj(2);
		
		assertEquals(primeiro.v1(), 2);
		assertEquals(primeiro.v2(), 4);
		assertEquals(primeiro.peso(), 5);
	}
	
	public void test5_2() {
		Aresta primeiro = grafo.primeiroListaAdj(2);
		assertEquals(primeiro, null);
	}
	

	public void test6_1e3() {
		//setup//
		grafo.insereAresta(2, 4, 5) ;
		grafo.insereAresta(2, 5, 5) ;
		grafo.insereAresta(2, 6, 5) ;
		
		Aresta proximo = grafo.proxAdj(2);
		//setup//
		
		proximo = grafo.proxAdj(2);
		
		assertEquals(proximo.v1(), 2);
		assertEquals(proximo.v2(), 5);
		assertEquals(proximo.peso(), 5);
	}

	public void test6_2() {
		
		Aresta proximo = grafo.proxAdj(2);

		assertEquals(proximo, null);
	}
	
	public void test6_4() {
		//setup//
		grafo.insereAresta(2, 4, 5) ;
		grafo.insereAresta(2, 5, 5) ;
		grafo.insereAresta(2, 6, 5) ;
		
		Aresta proximo = grafo.proxAdj(2);
		proximo = grafo.proxAdj(2);
		proximo = grafo.proxAdj(2);
		//setup//
		
		proximo = grafo.proxAdj(2);
		
		assertEquals(proximo, null);
	}
	public void test7_1() {
		//setup//
		grafo.insereAresta(2, 5, 10) ;
		//setup//
		
		Aresta e = grafo.retiraAresta(2,5);
		
		assertEquals(e.v1(), 2);
		assertEquals(e.v2(), 5);
		assertEquals(e.peso(), 10);
		assertEquals(grafo.existeAresta(2, 5),false);
	}

	public void test7_2() {
		Aresta e = grafo.retiraAresta(2,5);
		
		assertEquals(e, null);
		
		assertEquals(grafo.existeAresta(2, 5),false);
	}
	
	public void test8_1() {
		//setup//
		grafo.insereAresta(2, 5, 5) ;
		grafo.insereAresta(3, 4, 7) ;
		grafo.insereAresta(1, 4, 34) ;
		//setup//
		
		grafo.imprime();
	}

	public void test9_1() {
		//setup//
		grafo.insereAresta(2, 5, 5) ;
		grafo.insereAresta(3, 4, 7) ;
		grafo.insereAresta(1, 4, 34) ;
		//setup//
		
		Grafo novografo = grafo.grafoTransposto();
		
		assertEquals(novografo.existeAresta(5, 2),true);
		assertEquals(novografo.existeAresta(4, 3),true);
		assertEquals(novografo.existeAresta(4, 1),true);
	}

	public void test9_2() {
		
		Grafo novografo = grafo.grafoTransposto();
		
		assertEquals(novografo.existeAresta(5, 2),false);
		assertEquals(novografo.existeAresta(4, 3),false);
		assertEquals(novografo.existeAresta(4, 1),false);
	}
	
	//Teste utilizando analise de valor limite
	public void test4_2_I() {
		grafo.insereAresta(2, 3, 34) ;
		assertEquals(grafo.listaAdjVazia(2),false);
	}
	
	public void test4_2_S() {
		for (int i=0;i<100;i++)
			grafo.insereAresta(2, i, i) ;
		assertEquals(grafo.listaAdjVazia(2),false);
	}
}
