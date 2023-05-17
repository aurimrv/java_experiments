package ds;
import junit.framework.TestCase;

public class Marllos extends TestCase {
	
	
	public void test1_1() throws Exception {
		Grafo grafo;
		int Raiz;
		int raizAGM;
		int Peso;
		int V1;
		int V2;
		AgmPrim algPrim;
		grafo = new Grafo(6);
		
		

		V1 = 0;
		V2 = 1;
		Peso = 6;
		grafo.insereAresta(V1, V2, Peso);   /*1 chamada : G direcionado*/
		grafo.insereAresta(V2, V1, Peso);   /*2 chamadas: G nao-direcionado*/
		
		
		V1 = 2;
		V2 = 0;
		Peso = 1;
		grafo.insereAresta(V1, V2, Peso);   /*1 chamada : G direcionado*/
		grafo.insereAresta(V2, V1, Peso);   /*2 chamadas: G nao-direcionado*/

		V1 = 3;
		V2 = 0;
		Peso = 5;
		grafo.insereAresta(V1, V2, Peso);   /*1 chamada : G direcionado*/
		grafo.insereAresta(V2, V1, Peso);   /*2 chamadas: G nao-direcionado*/

		V1 = 2;
		V2 = 1;
		Peso = 2;
		grafo.insereAresta(V1, V2, Peso);   /*1 chamada : G direcionado*/
		grafo.insereAresta(V2, V1, Peso);   /*2 chamadas: G nao-direcionado*/

		V1 = 4;
		V2 = 1;
		Peso = 5;
		grafo.insereAresta(V1, V2, Peso);   /*1 chamada : G direcionado*/
		grafo.insereAresta(V2, V1, Peso);   /*2 chamadas: G nao-direcionado*/
		
		
		V1 = 3;
		V2 = 2;
		Peso = 2;
		grafo.insereAresta(V1, V2, Peso);   /*1 chamada : G direcionado*/
		grafo.insereAresta(V2, V1, Peso);   /*2 chamadas: G nao-direcionado*/

		V1 = 4;
		V2 = 2;
		Peso = 6;
		grafo.insereAresta(V1, V2, Peso);   /*1 chamada : G direcionado*/
		grafo.insereAresta(V2, V1, Peso);   /*2 chamadas: G nao-direcionado*/
		
		
		V1 = 5;
		V2 = 2;
		Peso = 4;
		grafo.insereAresta(V1, V2, Peso);   /*1 chamada : G direcionado*/
		grafo.insereAresta(V2, V1, Peso);   /*2 chamadas: G nao-direcionado*/

		V1 = 3;
		V2 = 5;
		Peso = 3;
		grafo.insereAresta(V1, V2, Peso);   /*1 chamada : G direcionado*/
		grafo.insereAresta(V2, V1, Peso);   /*2 chamadas: G nao-direcionado*/

		V1 = 5;
		V2 = 4;
		Peso = 5;
		grafo.insereAresta(V1, V2, Peso);   /*1 chamada : G direcionado*/
		grafo.insereAresta(V2, V1, Peso);   /*2 chamadas: G nao-direcionado*/
		grafo.imprime();

		
		algPrim = new AgmPrim(grafo);
		algPrim.obterAgm(1);
		algPrim.imprime();
		assertTrue(true);

	}

}
