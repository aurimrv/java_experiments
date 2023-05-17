package ds;

import ds.Grafo;
import junit.framework.TestCase;

public class Marllos extends TestCase {


	public void test1_1()
	{
		Grafo Grafo;
		
		//setup//
		Grafo = new Grafo(100);
		
		assertNotNull(Grafo);
	}

	public void test2_1() {

		Grafo Grafo;
		boolean antes, depois;
		int Vert1;
		int Vert2;
		int PesoVert;

		PesoVert=10;
		Vert1=3;
		Vert2=4 ;
		Grafo = new Grafo(100);
		
		//setup//


		antes = Grafo.existeAresta(Vert1, Vert2);

		Grafo.insereAresta(Vert1, Vert2, PesoVert);

		depois = Grafo.existeAresta(Vert1, Vert2);

		assertTrue(antes==false && depois == true);
	}

	public void test2_2() {

		Grafo Grafo;
		boolean antes, depois, meio;
		int Vert1;
		int Vert2;
		int PesoVert;

		PesoVert=10;
		Vert1=3;
		Vert2=4 ;
		Grafo = new Grafo(100);
		
		//setup//


		antes = Grafo.existeAresta(Vert1, Vert2);

		Grafo.insereAresta(Vert1, Vert2, PesoVert);
		
		meio = Grafo.existeAresta(Vert1, Vert2);
		PesoVert=20;

		Grafo.insereAresta(Vert1, Vert2, PesoVert);
		
		depois = Grafo.existeAresta(Vert1, Vert2);

		assertTrue(antes==false && meio == true && depois == true);
	}



	public void test3_1() {

		int Vert1=3, Vert2=4 ;
		int PesoVert=10;
		Grafo Grafo;
		//setup//
		Grafo = new Grafo(100);
		//setup//

		Grafo.insereAresta(Vert1, Vert2, PesoVert);

		assertTrue(Grafo.existeAresta(Vert1, Vert2));
	}

	public void test3_2() {

		int Vert1=3, Vert2=4 ;
		int PesoVert=10;
		Grafo Grafo;
		//setup//
		Grafo = new Grafo(100);
		//setup//

		assertFalse(Grafo.existeAresta(Vert1, Vert2));
	}


	public void test4_1() {

		//setup//
		Grafo Grafo;
		int Vert1=3;
		int PesoVert=10;
		int primeiro = 0;

		Grafo = new Grafo(100);
		

		assertTrue(Grafo.listaAdjVazia(Vert1));
	}


	public void test4_2() {

		//setup//
		Grafo Grafo;
		int Vert1=3;
		int Vert2=4; 
		int PesoVert=10;
		int primeiro = 0;

		Grafo = new Grafo(100);
		
		Grafo.insereAresta(Vert1, Vert2, PesoVert);
		Vert2=6 ;PesoVert=40;
		Grafo.insereAresta(Vert1, Vert2, PesoVert);

		assertFalse(Grafo.listaAdjVazia(Vert1));
	}
	
	public void test5_1() {
		//setup//
		Grafo Grafo;
		int Vert1=3, Vert2=4 ;
		int PesoVert=10;
		Grafo.Aresta primeiro;

		Grafo = new Grafo(100);
		


		Grafo.insereAresta(Vert1, Vert2, PesoVert);
		Vert2=6 ;PesoVert=40;
		Grafo.insereAresta(Vert1, Vert2, PesoVert);
		//setup//

		primeiro = Grafo.primeiroListaAdj(Vert1);


		assertTrue(primeiro.v2() == 4);
		//(*Grafo).Cab[primeiro]
	}


	public void test5_2() {
		//setup//
		Grafo Grafo;
		int Vert1=3;
		Grafo.Aresta primeiro;
		Grafo.Aresta adjacente;

		Grafo = new Grafo(100);
		

		primeiro = Grafo.primeiroListaAdj(Vert1);

		assertNull(primeiro);
	}


	public void test6_1() {
		//setup//
		Grafo Grafo;
		int Vert1=2, Vert2=4 ;
		int PesoVert=5, Pesoadj=0;
		
		Grafo.Aresta proximo;
		Grafo.Aresta adjacente;
		int fimlista=0;

		Grafo = new Grafo(100);
		
		Grafo.insereAresta(Vert1, Vert2, PesoVert);
		Vert2=5 ;PesoVert=30;
		Grafo.insereAresta(Vert1, Vert2, PesoVert);
		Vert2=6 ;PesoVert=60;
		Grafo.insereAresta(Vert1, Vert2, PesoVert);

		proximo = Grafo.primeiroListaAdj(Vert1);
		//setup//


		Grafo.proxAdj(Vert1);

		adjacente = Grafo.proxAdj(Vert1);
		


		assertEquals(6,adjacente.v2());
	}

	public void test6_2() {
		//setup//
		Grafo Grafo;
		int Vert1=2;
		int Pesoadj=0;
		Grafo.Aresta adjacente = null;
		Grafo.Aresta proximo;
		short fimlista=0;

		Grafo = new Grafo(100);
		//setup//


		adjacente = Grafo.proxAdj(Vert1);

		assertNull(adjacente);
	}




	public void test7_1() {
		Grafo Grafo;
		//setup//
		int Vert1=2, Vert2=4 ;
		int PesoVert=5;

		Grafo = new Grafo(100);
		

		Grafo.insereAresta(Vert1, Vert2, PesoVert);
		PesoVert=0;
		//setup//

		Grafo.retiraAresta(Vert1, Vert2);

		assertTrue(Grafo.existeAresta(Vert1, Vert2) == false);
	}

	public void test7_2() {
		Grafo Grafo;
		//setup//
		int Vert1=2, Vert2=4 ;
		int PesoVert=0;

		Grafo = new Grafo(100);
		

		//setup//

		Grafo.retiraAresta(Vert1, Vert2);
		assertTrue(Grafo.existeAresta(Vert1, Vert2)==false);
	}

	public void test8_1() {
		Grafo Grafo;
		//setup//
		int Vert1=2, Vert2=4 ;
		int PesoVert=5;

		Grafo = new Grafo(100);
		
		Grafo.insereAresta(Vert1, Vert2, PesoVert);
		Vert2=5 ;PesoVert=30;
		Grafo.insereAresta(Vert1, Vert2, PesoVert);
		Vert2=6 ;PesoVert=60;
		Grafo.insereAresta(Vert1, Vert2, PesoVert);
		//setup//

		Grafo.imprime();
	}

	public void test10_1e2_L1() {
		//setup//
		Grafo grafo;
		int Vert1=5, Vert2=2 ;
		int PesoVert=5;
		Grafo Grafotransp;

		grafo = new Grafo(100);
		
		Grafotransp = new Grafo(100);
		
		grafo.insereAresta(Vert1, Vert2, PesoVert);
		Vert1=4; Vert2=3 ;PesoVert=30;
		grafo.insereAresta(Vert1, Vert2, PesoVert);
		Vert2=1 ;PesoVert=60;
		grafo.insereAresta(Vert1, Vert2, PesoVert);
		//setup//

		Grafotransp = grafo.grafoTransposto();


		assertTrue(Grafotransp.peso[Grafotransp.cab[2]] == 5 &&
				Grafotransp.peso[Grafotransp.cab[3]] == 30 &&
				Grafotransp.peso[Grafotransp.cab[1]] == 60 &&
				Grafotransp.peso[Grafotransp.cab[5]] == 0 &&
				Grafotransp.peso[Grafotransp.prox[4]] == 0 &&
				Grafotransp.peso[Grafotransp.cab[4]] == 0);
	}




	/*
	//Teste utilizando analise de valor limite
	void test4_2_I() {
		//setup//
		TipoValorVertice Vert1=3, Vert2=4 ;
		TipoPeso PesoVert=34;

		Grafo.NumVertices = 100;
		Grafo.NumArestas = 0;
		FGVazio(&Grafo);

		InsereAresta(&Vert1, &Vert2, &PesoVert, &Grafo);
		//setup//

		ASSERTM("-",ListaAdjVazia(&Vert1, &Grafo) == 0);
	}

	void test4_2_S() {
		//setup//
		TipoValorVertice Vert1=3, Vert2=4 ;
		TipoPeso PesoVert=10;

		Grafo.NumVertices = 100;
		Grafo.NumArestas = 0;
		FGVazio(&Grafo);

		for (int i=0;i<100;i++)
		{
			InsereAresta(&Vert1, &Vert2, &PesoVert, &Grafo);
			Vert2=i ;PesoVert=i*2;
		}
		//setup//

		ASSERTM("-",ListaAdjVazia(&Vert1, &Grafo) == 0);
	}

	*/


	/*AVL************************************************AVL***************************************************AVL*/
	/*

	/*void test1_1()
	{
		TipoGrafo* Grafo;
		Grafo = (TipoGrafo*)malloc(sizeof(TipoGrafo));
		//setup//
		(*Grafo).NumVertices = 100;
		(*Grafo).NumArestas = 0;
		//setup//

		FGVazio(Grafo);

		ASSERTM("-",grafovazio(Grafo));
	}*/

	public void test1_1_l2()
	{
		Grafo Grafo;
		Grafo Grafo2;
		Grafo = new Grafo(100);
		//setup//
		

		Grafo2 = new Grafo(100);
		//setup//
		
		assertNotNull(Grafo2 );
	}

	public void test4_2_I() {

		//setup//
		Grafo Grafo;
		int Vert1=3, Vert2=4 ;
		int PesoVert=10;
		Grafo.Aresta primeiro;

		Grafo = new Grafo(100);
	
		Grafo.insereAresta(Vert1, Vert2, PesoVert);
		//setup//

		assertTrue(Grafo.listaAdjVazia(Vert1) == false);
	}

	public void test4_2_S() {

		//setup//
		Grafo Grafo;
		int i;
		int Vert1=3, Vert2=4 ;
		int PesoVert=10;
		Grafo.Aresta primeiro;

		Grafo = new Grafo(100);
		
		Grafo.insereAresta(Vert1, Vert2, PesoVert);
		for (i=1; i<=99; i++){
			Vert2=6 ;PesoVert=40+i;
			Grafo.insereAresta(Vert1, Vert2, PesoVert);
		}
		//setup//

		assertTrue(Grafo.listaAdjVazia(Vert1) == false);
	}

	public void test10_2_L2() {
		//setup//
		Grafo Grafo;
		int Vert1=5, Vert2=2 ;
		int PesoVert=5;
		Grafo GrafoTransp;

		Grafo = new Grafo(100);


		GrafoTransp = new Grafo(100);
		
		//setup//

		GrafoTransp = Grafo.grafoTransposto();


		assertNotNull(GrafoTransp);
	}
	
}
