package ds;

import ds.*;
import junit.framework.TestCase;


	public class Marllos extends TestCase {

		private static final int tam = 20; 
		MeuItem a[] = new MeuItem[tam + 1];;

		protected void setUp() throws Exception {
			super.setUp();

			int v[] = {0, 450, 200, 1000, 700,54,23,563,34,654,6324,5,23,-2342,-3242,-2342,65857,123,34,53,6365};

			for (int i = 1; i <= tam; i++)
				a[i] = new MeuItem (v[i]);

		}
		
		public void setup2() {
			int v[] = {-3200, -2000, -1520, 0, 1, 5, 8, 15, 26, 29, 50, 192, 1200, 1569, 3006, 3520, 4000, 4005, 4008, 4020, 4050};

			for (int i = 1; i <= tam; i++)
				a[i] = new MeuItem (v[i]);

		}
		
		public void imprimeLista(Item[] v) {
			for (int i = 1; i <= tam; i++)
				System.out.println("a["+i+"] = " + v[i]);
		}		
		
		public void setup3()  {
			int v[] = {4050, 4020, 4008, 4005, 4000, 3520, 3006, 1569, 1200, 192, 50, 29, 26, 15, 8, 5, 1, 0, -1520, -2000, -3200};

			for (int i = 1; i <= tam; i++)
				a[i] = new MeuItem (v[i]);

		}

		protected void tearDown() throws Exception {
			super.tearDown();

			a = null;
		}

		public boolean testa(Item v[], int k)
		{
			for (int i = 2; i <= k; i++) {
				if (v[i].compara (v[i - 1]) < 0) {
					return false;
				}
			}
			return true;
		}
		public int menorElemento(Item v[],int n)
		{
			int indmin = 1;
			for (int i = 2; i <= n; i++) {
				if (v[i].compara (v[indmin]) < 0) {
					indmin = i;
				}
			}
			return indmin;
		}

		//operacao 1 CE
		public void test1_1() {
			OrdenacaoParcial.selecaoParcial (a, 20, 10);
			assertEquals(testa(a,10), true);		
		}
		
		public void test1_2_I() {
			setup2();
			OrdenacaoParcial.selecaoParcial (a, 0, 0);
			assertEquals(testa(a,0), true);		
		}
		
		public void test1_2_S() {
			setup3();
			OrdenacaoParcial.selecaoParcial (a, 0, 0);
			assertEquals(testa(a,0), true);		
		}
		
		//operacao 1 AVL
		public void test1_1_I() {
			OrdenacaoParcial.selecaoParcial (a, 20, 1);
			assertEquals(menorElemento(a,20), 1);		
		}
		
		public void test1_1_S() {
			OrdenacaoParcial.selecaoParcial (a, 20, 20);
			assertEquals(testa(a,20), true);	
		}
		
		//Operacao 2 CE
		public void test2_1() {
			OrdenacaoParcial.insercaoParcial (a, 20, 10);
			assertEquals(testa(a,10), true);		
		}
		
		public void test2_2_I() {
			setup2();
			OrdenacaoParcial.insercaoParcial (a, 0, 0);
			assertEquals(testa(a,0), true);		
		}
		
		public void test2_2_S() {
			setup3();
			OrdenacaoParcial.insercaoParcial (a, 0, 0);
			assertEquals(testa(a,0), true);		
		}
		
		//Operacao 2 AVL
		public void test2_1_I() {
			OrdenacaoParcial.insercaoParcial (a, 20, 1);
			assertEquals(menorElemento(a,20), 1);		
		}
		
		public void test2_1_S() {
			OrdenacaoParcial.insercaoParcial (a, 20, 20);
			assertEquals(testa(a,20), true);	
		}
		
		//Operacao 3 CE
		public void test3_1() {
			OrdenacaoParcial.insercaoParcial2 (a, 20, 10);
			assertEquals(testa(a,10), true);		
		}
		
		public void test3_2_I() {
			setup2();
			OrdenacaoParcial.insercaoParcial2 (a, 0, 0);
			assertEquals(testa(a,0), true);		
		}
		
		public void test3_2_S() {
			setup3();
			OrdenacaoParcial.insercaoParcial2 (a, 0, 0);
			assertEquals(testa(a,0), true);		
		}
		
		//Operacao 3 AVL
		public void test3_1_I() {
			OrdenacaoParcial.insercaoParcial2 (a, 20, 1);
			assertEquals(menorElemento(a,20), 1);		
		}
		
		public void test3_1_S() {
			OrdenacaoParcial.insercaoParcial2 (a, 20, 20);
			assertEquals(testa(a,20), true);	
		}
		
		//Operacao 4 CE
		public void test4_1() {
			OrdenacaoParcial.quicksortParcial (a, 20, 10);
			assertEquals(testa(a,10), true);		
		}
		
		public void test4_2_I() {
			setup2();
			OrdenacaoParcial.quicksortParcial (a, 15, 0);
			assertEquals(testa(a,0), true);		
		}
		
		public void test4_2_S() {
			setup3();
			OrdenacaoParcial.quicksortParcial (a, 15, 0);
			assertEquals(testa(a,0), true);		
		}
		
		//Operacao 4 AVL
		public void test4_1_I() {
			OrdenacaoParcial.quicksortParcial (a, 20, 1);
			assertEquals(menorElemento(a,20), 1);		
		}
		
		public void test4_1_S() {
			OrdenacaoParcial.quicksortParcial (a, 20, 20);
			assertEquals(testa(a,20), true);	
		}
		
		//Operacao 5 CE
		public void test5_1() {
			//imprimeLista(a);
			OrdenacaoParcial.heapsortParcial (a, 20, 10);
			//imprimeLista(a);
			assertEquals(testa(a,10), false);		
		}
		
		public void test5_2_I() {
			setup2();
			OrdenacaoParcial.heapsortParcial (a, 0, 0);
			
			assertEquals(testa(a,0), true);		
		}
		
		public void test5_2_S() {
			setup3();
			OrdenacaoParcial.heapsortParcial (a, 0, 0);
			
			assertEquals(testa(a,0), true);		
		}
		
		//Operacao 5 AVL
		public void test5_1_I() {
			//imprimeLista(a);
			OrdenacaoParcial.heapsortParcial (a, 20, 1);
			//imprimeLista(a);
			assertEquals(20,menorElemento(a,20));		
		}
		
		public void test5_1_S() {
			//imprimeLista(a);
			OrdenacaoParcial.heapsortParcial (a, 20, 20);
			//imprimeLista(a);
			assertEquals(false, testa(a,20));	
		}
	}

	

