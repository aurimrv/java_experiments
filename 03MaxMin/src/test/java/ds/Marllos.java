package ds;

import ds.MaxMin2;
import junit.framework.TestCase;

public class Marllos extends TestCase {

	public void test1_1e2e3 (){
		int[] vet = new int[10];
	
		int[] retornoMaxMin = new int[2];
	
		vet[0] = 2;
		vet[1] = 4;
		vet[2] = 3;
		vet[3] = 2;
		vet[4] = 1;
		vet[5] = 0;
		vet[6] = 6;
		vet[7] = 78; //valor maximo
		vet[8] = 9;
		vet[9] = 3;
	

		retornoMaxMin = MaxMin2.maxMin2(vet, 10);
		assertEquals(retornoMaxMin[0],78);
		assertEquals(retornoMaxMin[1],0);
	}	
	
/*AVL************************************************AVL***************************************************AVL*/
	
	public void test1_2_I (){
		int[] vet = new int[10];
	
		int[] retornoMaxMin = new int[2];
	
		vet[0] = 0;
		vet[1] = 4;
		vet[2] = 3;
		vet[3] = 2;
		vet[4] = 1;
		vet[5] = 2;
		vet[6] = 6;
		vet[7] = 78; //valor maximo
		vet[8] = 9;
		vet[9] = 3;
	

		retornoMaxMin = MaxMin2.maxMin2(vet, 10);
		assertEquals(retornoMaxMin[0],78);
		assertEquals(retornoMaxMin[1],0);
	}	
	
	public void test1_2_S (){
		int[] vet = new int[10];
	
		int[] retornoMaxMin = new int[2];
	
		vet[0] = 2;
		vet[1] = 4;
		vet[2] = 3;
		vet[3] = 2;
		vet[4] = 1;
		vet[5] = 2;
		vet[6] = 6;
		vet[7] = 78; //valor maximo
		vet[8] = 9;
		vet[9] = 0;
	

		retornoMaxMin = MaxMin2.maxMin2(vet, 10);
		assertEquals(retornoMaxMin[0],78);
		assertEquals(retornoMaxMin[1],0);
	}
	
	public void test1_3_I (){
		int[] vet = new int[10];
	
		int[] retornoMaxMin = new int[2];
	
		vet[0] = 78;
		vet[1] = 4;
		vet[2] = 3;
		vet[3] = 2;
		vet[4] = 1;
		vet[5] = 2;
		vet[6] = 6;
		vet[7] = 0; //valor maximo
		vet[8] = 9;
		vet[9] = 3;
	

		retornoMaxMin = MaxMin2.maxMin2(vet, 10);
		assertEquals(retornoMaxMin[0],78);
		assertEquals(retornoMaxMin[1],0);
	}	
	
	public void test1_3_S (){
		int[] vet = new int[10];
	
		int[] retornoMaxMin = new int[2];
	
		vet[0] = 2;
		vet[1] = 4;
		vet[2] = 3;
		vet[3] = 2;
		vet[4] = 1;
		vet[5] = 2;
		vet[6] = 6;
		vet[7] = 0; //valor maximo
		vet[8] = 9;
		vet[9] = 78;
	

		retornoMaxMin = MaxMin2.maxMin2(vet, 10);
		assertEquals(retornoMaxMin[0],78);
		assertEquals(retornoMaxMin[1],0);
	}	

}