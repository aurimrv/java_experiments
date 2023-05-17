package ds;

import ds.*;
import ds.ArvoreBinaria;
import ds.MeuItem;
import junit.framework.TestCase;

public class Marllos extends TestCase {

	ArvoreBinaria dicionario;
	int max;
	
	public void setUp()
	{
		dicionario = new ArvoreBinaria ();
		max = 10;
	}
	
	public void test1_1() {
		dicionario = new ArvoreBinaria ();
			
		assertEquals(dicionario != null,true);
	}
	
	public void test2_1() {
		dicionario = new ArvoreBinaria ();
		MeuItem x,y;
		
		 int vetor[] = {32,324,54,23,5,2,342,32342,234,7};
		 for (int i = 0; i < max; i++) { 
		      x = new MeuItem (vetor[i]);
		      dicionario.insere (x);
		  }
		 
	     x = new MeuItem (54);
	     y = (MeuItem)dicionario.pesquisa(x);
		 assertEquals(x.recuperaChave(),y.recuperaChave());
	}
	
	public void test2_2() {
		dicionario = new ArvoreBinaria ();
		MeuItem x,y;
		
		 int vetor[] = {32,324,54,23,5,2,342,32342,234,7};
		 for (int i = 0; i < max; i++) { 
		      x = new MeuItem (vetor[i]);
		      dicionario.insere (x);
		  }
		 
	     x = new MeuItem (52);
	     y = (MeuItem)dicionario.pesquisa(x);
		 assertEquals(y,null);
	}

	public void test3_1e3() {
		dicionario = new ArvoreBinaria ();
		MeuItem x,y;
		
		 int vetor[] = {32,324,54,23,5,2,342,32342,234,7};
		 for (int i = 0; i < max; i++) { 
		      x = new MeuItem (vetor[i]);
		      dicionario.insere (x);
		  }
		 
	     x = new MeuItem (56);
	     dicionario.insere(x);
	     
	     y = (MeuItem)dicionario.pesquisa(x);
	     assertEquals(x.recuperaChave(),y.recuperaChave());
	}
	
	public void test3_2() {
		dicionario = new ArvoreBinaria ();
		MeuItem x,y;
		 
	     x = new MeuItem (56);
	     dicionario.insere(x);
	     
	     y = (MeuItem)dicionario.pesquisa(x);
	     assertEquals(x.recuperaChave(),y.recuperaChave());
	}
	
	public void test3_4() {
		dicionario = new ArvoreBinaria ();
		MeuItem x,y;
		
		 int vetor[] = {32,324,54,23,5,2,342,32342,234,7};
		 for (int i = 0; i < max; i++) { 
		      x = new MeuItem (vetor[i]);
		      dicionario.insere (x);
		  }
		 
	     x = new MeuItem (23);
	     dicionario.insere(x);
	     
	     y = (MeuItem)dicionario.pesquisa(x);
	     assertEquals(x.recuperaChave(),y.recuperaChave());
	}
	
	public void test4_1e3() {
		dicionario = new ArvoreBinaria ();
		MeuItem x,y,z;
		
		 int vetor[] = {32,324,54,23,5,2,342,32342,234,7};
		 for (int i = 0; i < max; i++) { 
		      x = new MeuItem (vetor[i]);
		      dicionario.insere (x);
		  }
		 
	     x = new MeuItem (54);
	     
	     y = (MeuItem)dicionario.pesquisa(x);
	     dicionario.retira(x);
	     
	     z = (MeuItem)dicionario.pesquisa(x);
	     assertEquals(y != null && z == null ,true);
	}
	
	public void test4_2() {
		dicionario = new ArvoreBinaria ();
		MeuItem x,y;
		 
	     x = new MeuItem (56);
	     dicionario.retira(x);
	     
	     y = (MeuItem)dicionario.pesquisa(x);
	     assertEquals(y,null);
	}
	
	public void test4_4() {
		dicionario = new ArvoreBinaria ();
		MeuItem x;
		
		 int vetor[] = {32,324,54,23,5,2,342,32342,234,7};
		 for (int i = 0; i < max; i++) { 
		      x = new MeuItem (vetor[i]);
		      dicionario.insere (x);
		  }
		 
	     x = new MeuItem (26);
	     dicionario.retira(x);
	     
	   // verifica se erro foi impresso na saida padrao
	   //Erro: Registro nao encontrado   
	}
	
	public void test6_1() {
		dicionario = new ArvoreBinaria ();
		MeuItem x;
		
		 int vetor[] = {32,324,54,23,5,2,342,32342,234,7};
		 for (int i = 0; i < max; i++) { 
		      x = new MeuItem (vetor[i]);
		      dicionario.insere (x);
		  }
		 
		 dicionario.testa();
	     // verifica se nenhum erro foi encontrado
		 
	}
	

	/*AVL************************************************AVL***************************************************AVL*/
	
	public void test2_1_I() {
		dicionario = new ArvoreBinaria ();
		MeuItem x,y;
		
		 int vetor[] = {32,77,54,23,5,2,83,42,44,7};
		 /*						32
		  * 		23							77
		  *       5							54		83 
		  * 	2   7					42
		  * 							  44
		  */
		  
		 for (int i = 0; i < max; i++) { 
		      x = new MeuItem (vetor[i]);
		      dicionario.insere (x);
		  }
		 
		 x = new MeuItem (32);
	     y = (MeuItem)dicionario.pesquisa(x);
		 assertEquals(x.recuperaChave(),y.recuperaChave());
	}
	
	public void test2_1_S() {
		dicionario = new ArvoreBinaria ();
		MeuItem x,y;
		
		 int vetor[] = {32,77,54,23,5,2,83,42,44,7};
		 /*						32
		  * 		23							77
		  *       5							54		83 
		  * 	2   7					42
		  * 							  44
		  */
		  
		 for (int i = 0; i < max; i++) { 
		      x = new MeuItem (vetor[i]);
		      dicionario.insere (x);
		  }
		 
		 x = new MeuItem (7);
	     y = (MeuItem)dicionario.pesquisa(x);
		 assertEquals(x.recuperaChave(),y.recuperaChave());
	}
	
	
	public void test4_3_I() {
		dicionario = new ArvoreBinaria ();
		MeuItem x,y,z;
		
		 int vetor[] = {32,77,54,23,5,2,83,42,44,7};
		 /*						32
		  * 		23							77
		  *       5							54		83 
		  * 	2   7					42
		  * 							  44
		  */
		  
		 for (int i = 0; i < max; i++) { 
		      x = new MeuItem (vetor[i]);
		      dicionario.insere(x);
		  }
		 
		  x = new MeuItem (32);
		  y = (MeuItem)dicionario.pesquisa(x);
		  dicionario.retira(x);
		  z = (MeuItem)dicionario.pesquisa(x);
		  assertEquals(y != null && z == null ,true);
	}
	
	public void test4_3_S() {
		dicionario = new ArvoreBinaria ();
		MeuItem x,y,z;
		
		 int vetor[] = {32,77,54,23,5,2,83,42,44,7};
		 /*						32
		  * 		23							77
		  *       5							54		83 
		  * 	2   7					42
		  * 							  44
		  */
		  
		 for (int i = 0; i < max; i++) { 
		      x = new MeuItem (vetor[i]);
		      dicionario.insere (x);
		  }
		 
		  x = new MeuItem (7);
		  y = (MeuItem)dicionario.pesquisa(x);
		  dicionario.retira(x);
		  z = (MeuItem)dicionario.pesquisa(x);
		  assertEquals(y != null && z == null ,true);
	}
	
	
}
