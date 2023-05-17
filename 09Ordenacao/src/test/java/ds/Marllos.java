package ds;

import ds.Ordenacao;
import junit.framework.TestCase;

public class Marllos extends TestCase {

	public void test1_1e2e3e4() {
		int[] vet = new int[10];
		int cont;
		boolean passou = true;

		//setup

			vet[0] = 8;
			vet[1] = 4;
			vet[2] = 3;
			vet[3] = 2;
			vet[4] = 1;
			vet[5] = 0;
			vet[6] = 6;
			vet[7] = 78;
			vet[8] = 9;
			vet[9] = 5;
		//setup
			
		Ordenacao.mergeSort(vet,0,9);

		for(cont = 0; cont < 9; cont++){
			if(vet[cont]>vet[cont+1]){
				passou = false;
			}
		}

		assertTrue(passou);
	}

/*AVL************************************************AVL***************************************************AVL*/
	
	public void test1_2_l1() {
		int[] vet = new int[10];
		int cont;
		boolean passou = true;

		//setup

		vet[0] = 0;
		vet[1] = 1;
		vet[2] = 2;
		vet[3] = 3;
		vet[4] = 4;
		vet[5] = 5;
		vet[6] = 6;
		vet[7] = 8;
		vet[8] = 9;
		vet[9] = 78;
		//setup
			
		Ordenacao.mergeSort(vet,2,7);

		for(cont = 2; cont < 7; cont++){
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

		//setup

			vet[0] = 8;
			vet[1] = 4;
			vet[2] = 3;
			vet[3] = 2;
			vet[4] = 1;
			vet[5] = 0;
			vet[6] = 6;
			vet[7] = 78;
			vet[8] = 9;
			vet[9] = 5;
		//setup
			
		Ordenacao.mergeSort(vet,0,9);

		for(cont = 0; cont < 9; cont++){
			if(vet[cont]>vet[cont+1]){
				passou = false;
			}
		}

		assertTrue(passou);
	}*/
	
	public void test1_2_l3() {
		int[] vet = new int[10];
		int cont;
		boolean passou = true;

		//setup

		vet[0] = 78;
		vet[1] = 9;
		vet[2] = 8;
		vet[3] = 6;
		vet[4] = 5;
		vet[5] = 4;
		vet[6] = 3;
		vet[7] = 2;
		vet[8] = 1;
		vet[9] = 0;
		//setup
			
		Ordenacao.mergeSort(vet,2,7);

		for(cont = 2; cont < 7; cont++){
			if(vet[cont]>vet[cont+1]){
				passou = false;
			}
		}

		assertTrue(passou);
	}
	
	public void test1_3_S() {
		int[] vet = new int[10];
		int cont;
		boolean passou = true;

		//setup

		vet[0] = 8;
		vet[1] = 4;
		vet[2] = 3;
		vet[3] = 2;
		vet[4] = 1;
		vet[5] = 0;
		vet[6] = 6;
		vet[7] = 78;
		vet[8] = 9;
		vet[9] = 5;
		//setup
			
		Ordenacao.mergeSort(vet,8,9);

		for(cont = 8; cont < 9; cont++){
			if(vet[cont]>vet[cont+1]){
				passou = false;
			}
		}

		assertTrue(passou);
	}
	
	public void test1_4_I() {
		int[] vet = new int[10];
		int cont;
		boolean passou = true;

		//setup

		vet[0] = 8;
		vet[1] = 4;
		vet[2] = 3;
		vet[3] = 2;
		vet[4] = 1;
		vet[5] = 0;
		vet[6] = 6;
		vet[7] = 78;
		vet[8] = 9;
		vet[9] = 5;
		//setup
			
		Ordenacao.mergeSort(vet,0,1);

		for(cont = 0; cont < 1; cont++){
			if(vet[cont]>vet[cont+1]){
				passou = false;
			}
		}

		assertTrue(passou);
	}
	
	public void test1_4_S() {
		int[] vet = new int[10];
		int cont;
		boolean passou = true;

		//setup

		vet[0] = 8;
		vet[1] = 4;
		vet[2] = 3;
		vet[3] = 2;
		vet[4] = 1;
		vet[5] = 0;
		vet[6] = 6;
		vet[7] = 78;
		vet[8] = 9;
		vet[9] = 5;
		//setup
			
		Ordenacao.mergeSort(vet,2,9);

		for(cont = 2; cont < 9; cont++){
			if(vet[cont]>vet[cont+1]){
				passou = false;
			}
		}

		assertTrue(passou);
	}
}
