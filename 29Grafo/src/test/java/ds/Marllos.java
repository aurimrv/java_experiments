package ds;

import junit.framework.TestCase;

public class Marllos extends TestCase {

	 
	 public void test1_1e2() {
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
		 a = new Grafo.Aresta (4, 12, 7);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());     
		 a = new Grafo.Aresta (12, 4, 9);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());

		 grafo.imprime ();
		 Cfc cfc = new Cfc (grafo);
		 cfc.obterCfc ();
		 
		 // analisar dados da saida padrao
	 }

	 public void test1_3() {
		 Grafo grafo = new Grafo(100);
		 Grafo.Aresta a;

		 a = new Grafo.Aresta (3, 5, 7);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());     
		 a = new Grafo.Aresta (3, 8, 9);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); 
		 a = new Grafo.Aresta (6, 9, 7);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());     
		 a = new Grafo.Aresta (3, 7, 9);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());
		 a = new Grafo.Aresta (7, 23, 7);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());     
		 a = new Grafo.Aresta (5, 34, 9);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());
		 a = new Grafo.Aresta (34, 4, 7);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());     
		 a = new Grafo.Aresta (7, 4, 9);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());
		 a = new Grafo.Aresta (5, 12, 7);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());     
		 a = new Grafo.Aresta (11, 4, 9);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());

		 grafo.imprime ();
		 Cfc cfc = new Cfc (grafo);
		 cfc.obterCfc ();
		 
		 // analisar dados da saida padrao
	 }
	 
	 public void test2_1() {
		 Grafo grafo = new Grafo(100);
		 Grafo.Aresta a;

		 a = new Grafo.Aresta (3, 5, 7);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());     
		 a = new Grafo.Aresta (3, 8, 9);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); 
		 a = new Grafo.Aresta (6, 9, 7);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());     
		 a = new Grafo.Aresta (3, 7, 9);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());
		 a = new Grafo.Aresta (7, 23, 7);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());     
		 a = new Grafo.Aresta (5, 34, 9);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());
		 a = new Grafo.Aresta (34, 4, 7);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());     
		 a = new Grafo.Aresta (7, 4, 9);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());
		 a = new Grafo.Aresta (5, 12, 7);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());     
		 a = new Grafo.Aresta (11, 4, 9);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());

		 grafo.imprime ();
		 Grafo grafoT = grafo.grafoTransposto();

		 grafoT.imprime();
		 
		 // analisar dados da saida padrao
	 }
	 /*AVL************************************************AVL***************************************************AVL*/ 
	 public void test1_2_I() {
		 Grafo grafo = new Grafo(100);
		 Grafo.Aresta a;

		 a = new Grafo.Aresta (3, 5, 7);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());     
		 a = new Grafo.Aresta (3, 8, 9);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ()); 
		 a = new Grafo.Aresta (6, 9, 7);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());     
		 a = new Grafo.Aresta (9, 7, 9);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());
		 a = new Grafo.Aresta (7, 23, 7);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());     
		 a = new Grafo.Aresta (5, 34, 9);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());
		 a = new Grafo.Aresta (34, 4, 7);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());     
		 a = new Grafo.Aresta (7, 6, 9);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());
		 a = new Grafo.Aresta (5, 12, 7);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());     
		 a = new Grafo.Aresta (11, 4, 9);
		 grafo.insereAresta (a.v1 (), a.v2 (), a.peso ());

		 grafo.imprime ();
		 Cfc cfc = new Cfc (grafo);
		 cfc.obterCfc ();
		 
		 // analisar dados da saida padrao
	 }
	 
	 
}
