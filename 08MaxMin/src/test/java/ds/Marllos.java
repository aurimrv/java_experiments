package ds;

import ds.MaxMin4;
import junit.framework.TestCase;

public class Marllos extends TestCase {

	int v[] ;
	
	public void test1_1() {
		v = new int[10];
		v[0] = 5;  v[1] = 12;
		v[2] = 4;  v[3] = 1;
		v[4] = 15; v[5] = 22;
		v[6] = 3; v[7] = 11;
		v[8] = 9; v[9] = 17;
		int maxMin[] =  MaxMin4.maxMin4 (v, 2,7);
	
		assertEquals(maxMin[0]==22 && maxMin[1]==1,true);
	}

	/*AVL************************************************AVL***************************************************AVL*/ 
	public void test1_L1_I() {
		v = new int[10];
		v[0] = 4;  v[1] = 12;
		v[2] = 1;  v[3] = 5;
		v[4] = 15; v[5] = 22;
		v[6] = 3; v[7] = 11;
		v[8] = 9; v[9] = 17;
		int maxMin[] =  MaxMin4.maxMin4 (v, 2,7);
		
		assertEquals(maxMin[0]==22 && maxMin[1]==1,true);
	}

	public void test1_L1_S() {
		v = new int[10];
		v[0] = 5;  v[1] = 12;
		v[2] = 4;  v[3] = 4;
		v[4] = 15; v[5] = 22;
		v[6] = 3; v[7] = 1;
		v[8] = 9; v[9] = 11;
		int maxMin[] =  MaxMin4.maxMin4 (v, 2,7);
		
		assertEquals(maxMin[0]==22 && maxMin[1]==1,true);
	}

	
	public void test1_L2_I() {
		v = new int[10];
		v[0] = 4;  v[1] = 12;
		v[2] = 86;  v[3] = 5;
		v[4] = 15; v[5] = 22;
		v[6] = 3; v[7] = 11;
		v[8] = 9; v[9] = 17;
		int maxMin[] =  MaxMin4.maxMin4 (v, 2,7);
		
		assertEquals(maxMin[0]==86 && maxMin[1]==3,true);
	}

	public void test1_L2_S() {
		v = new int[10];
		v[0] = 5;  v[1] = 12;
		v[2] = 4;  v[3] = 4;
		v[4] = 15; v[5] = 22;
		v[6] = 3; v[7] = 34;
		v[8] = 9; v[9] = 11;
		int maxMin[] =  MaxMin4.maxMin4 (v, 2,7);
		
		assertEquals(maxMin[0]==34 && maxMin[1]==3,true);
	}

	public void test1_L3_I() {
		v = new int[10];
		v[0] = 86;  v[1] = 12;
		v[2] = 4;  v[3] = 5;
		v[4] = 15; v[5] = 22;
		v[6] = 3; v[7] = 11;
		v[8] = 9; v[9] = 17;
		int maxMin[] =  MaxMin4.maxMin4 (v, 5,5);
		
		assertEquals(maxMin[0]==22 && maxMin[1]==22,true);
	}

	public void test1_L3_S() {
		v = new int[10];
		v[0] = 5;  v[1] = 12;
		v[2] = 4;  v[3] = 4;
		v[4] = 15; v[5] = 22;
		v[6] = 3; v[7] = 11;
		v[8] = 9; v[9] = 34;
		int maxMin[] =  MaxMin4.maxMin4 (v, 0,9);
		
		assertEquals(maxMin[0]==34 && maxMin[1]==3,true);
	}

}
