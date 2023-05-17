package ds;

import junit.framework.TestCase;

public class Marllos extends TestCase {

	 
	 
	 public void test1_1() {
		 Grafo grafo = new Grafo(100);
		 Grafo.Aresta a;

		 a = new Grafo.Aresta (3, 5, 7);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());     
		 a = new Grafo.Aresta (3, 5, 9);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); 
		 a = new Grafo.Aresta (6, 3, 7);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());     
		 a = new Grafo.Aresta (3, 7, 9);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());
		 a = new Grafo.Aresta (7, 5, 7);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());     
		 a = new Grafo.Aresta (5, 34, 9);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());
		 a = new Grafo.Aresta (34, 3, 7);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());     
		 a = new Grafo.Aresta (7, 6, 9);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());
		 a = new Grafo.Aresta (5, 12, 7);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());     
		 a = new Grafo.Aresta (12, 4, 9);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());

		 grafo.imprime ();
		    BuscaEmProfundidade dfs = new BuscaEmProfundidade (grafo);
		    dfs.buscaEmProfundidade ();
		    for (int v = 0; v < grafo.numVertices(); v++) {
		      System.out.println ("d["+v+"]:" + dfs.d (v) + " -- t["+v+"]:" + dfs.t (v) +
		                          " -- antecessor["+v+"]:" + dfs.antecessor (v));
		    }
	 }

	 /*AVL************************************************AVL***************************************************AVL*/ 
	
}
