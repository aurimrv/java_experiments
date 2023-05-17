package ds;
import junit.framework.TestCase;

public class Marllos extends TestCase {

	public void constroiGrafo(Grafo grafo)throws Exception{
		
		grafo.insereAresta(0, 1, 1);
		grafo.insereAresta(1, 0, 1);

		grafo.insereAresta(1, 2, 1);
		grafo.insereAresta(2, 1, 1);
		 
		grafo.insereAresta(1, 3, 1);
		grafo.insereAresta(3, 1, 1);
		 
		grafo.insereAresta(2, 6, 1);
		grafo.insereAresta(6, 2, 1);
		 
		grafo.insereAresta(4, 7, 1);
		grafo.insereAresta(7, 4, 1);
		 
		grafo.insereAresta(5, 7, 1);
		grafo.insereAresta(7, 5, 1);
		
		grafo.insereAresta(6, 7, 1);
		grafo.insereAresta(7, 6, 1);
	}
	
	public void constroiGrafo2I(Grafo grafo)throws Exception{
		grafo.insereAresta(0, 0, 1);
	}
	
	public void constroiGrafo2S(Grafo grafo)throws Exception{
		
		grafo.insereAresta(0, 1, 1);
		grafo.insereAresta(1, 0, 1);

		grafo.insereAresta(1, 2, 1);
		grafo.insereAresta(2, 1, 1);
		 
		grafo.insereAresta(1, 3, 1);
		grafo.insereAresta(3, 1, 1);
		 
		grafo.insereAresta(2, 6, 1);
		grafo.insereAresta(6, 2, 1);
		 
		grafo.insereAresta(4, 7, 1);
		grafo.insereAresta(7, 4, 1);
		 
		grafo.insereAresta(5, 7, 1);
		grafo.insereAresta(7, 5, 1);
		
		grafo.insereAresta(6, 7, 1);
		grafo.insereAresta(7, 6, 1);
	}
	
	public void constroiGrafo3I(Grafo grafo)throws Exception{
		
		grafo.insereAresta(0, 1, 1);

	}
	
	public void constroiGrafo3S(Grafo grafo)throws Exception{
		int cont;
		
		for(cont=0; cont<=98; cont++){
			grafo.insereAresta(cont, cont+1, 1);
		}
		grafo.insereAresta(98, 99, 1);

	}
	
	
	
	

	public void test1_1e2e3() throws Exception {
		Grafo grafo = new Grafo(8);
		BuscaEmLargura busca = null;
		constroiGrafo(grafo);
		
		busca = new BuscaEmLargura(grafo);
		busca.buscaEmLargura();
		
				
		assertTrue(true);
	}
	
	public void test1_2_I() throws Exception {
		Grafo grafo = new Grafo(1);
		BuscaEmLargura busca = null;
		constroiGrafo2I(grafo);
		
		busca = new BuscaEmLargura(grafo);
		busca.buscaEmLargura();
		
				
		assertTrue(true);
	}
	
	public void test1_2_S() throws Exception {
		Grafo grafo = new Grafo(100);
		BuscaEmLargura busca = null;
		constroiGrafo2S(grafo);
		
		busca = new BuscaEmLargura(grafo);
		busca.buscaEmLargura();
		
				
		assertTrue(true);
	}
	
	public void test1_3_I() throws Exception {
		Grafo grafo = new Grafo(2);
		BuscaEmLargura busca = null;
		constroiGrafo3I(grafo);
		
		busca = new BuscaEmLargura(grafo);
		busca.buscaEmLargura();
		
				
		assertTrue(true);
	}
	
	public void test1_3_S() throws Exception {
		Grafo grafo = new Grafo(100);
		BuscaEmLargura busca = null;
		constroiGrafo3S(grafo);
		
		busca = new BuscaEmLargura(grafo);
		busca.buscaEmLargura();
		
				
		assertTrue(true);
	}
	
}
