package ds;

import ds.Ordenacao;
import junit.framework.TestCase;

public class Marllos extends TestCase {

	public void test1_1e2e3() {
		int[] vet = new int[10];
		int cont;
		boolean passou = true;

		vet[0] = 2;
		vet[1] = 4;
		vet[2] = 3;
		vet[3] = 2;
		vet[4] = 1;
		vet[5] = 0;
		vet[6] = 6;
		vet[7] = 78;
		vet[8] = 9;
		vet[9] = 3;
		

		Ordenacao.ordena(vet,10);

		for(cont = 0; cont < 9; cont++){
			if(vet[cont]>vet[cont+1]){
				passou = false;
			}
		}
		assertTrue(passou);
	}
	

	public void test1_2_l1() {
		int[] vet = new int[10];
		int cont;
		boolean passou = true;

		vet[0] = 78;
		vet[1] = 9;
		vet[2] = 7;
		vet[3] = 6;
		vet[4] = 5;
		vet[5] = 4;
		vet[6] = 3;
		vet[7] = 2;
		vet[8] = 1;
		vet[9] = 0;
		

		Ordenacao.ordena(vet,10);

		for(cont = 0; cont < 9; cont++){
			if(vet[cont]>vet[cont+1]){
				passou = false;
			}
		}
		assertTrue(passou);
	}

/*	
	public void test1_2_l2() {
		int[] vet = new int[10];
		int cont;
		boolean passou = true;

		vet[0] = 2;
		vet[1] = 4;
		vet[2] = 3;
		vet[3] = 2;
		vet[4] = 1;
		vet[5] = 0;
		vet[6] = 6;
		vet[7] = 78;
		vet[8] = 9;
		vet[9] = 3;
		

		Ordenacao.ordena(vet,10);

		for(cont = 0; cont < 9; cont++){
			if(vet[cont]>vet[cont+1]){
				passou = false;
			}
		}
		assertTrue(passou);
	}
*/
	public void test1_2_l3() {
		int[] vet = new int[10];
		int cont;
		boolean passou = true;

		vet[0] = 0;
		vet[1] = 1;
		vet[2] = 2;
		vet[3] = 3;
		vet[4] = 4;
		vet[5] = 5;
		vet[6] = 6;
		vet[7] = 7;
		vet[8] = 9;
		vet[9] = 78;
		

		Ordenacao.ordena(vet,10);

		for(cont = 0; cont < 9; cont++){
			if(vet[cont]>vet[cont+1]){
				passou = false;
			}
		}
		assertTrue(passou);
	}
	
}
