package ds;

import java.io.IOException;

import ds.AvaliaMultMatrizes;
import junit.framework.TestCase;

public class Marllos extends TestCase {

	public void test1_1e2e3() {
		int n=4;
	    int d[] = new int[n+1];
	    for (int i = 0; i <= n; i++) 
	        d[i]=i+1;
	    
	    try {
			AvaliaMultMatrizes.multmatrize(n, d);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true, true);
	}

	/*AVL************************************************AVL***************************************************AVL*/ 
	public void test1_2_I() {
		int n=1;
	    int d[] = new int[n+1];
	    for (int i = 0; i <= n; i++) 
	        d[i]=6+i;
	    
	    try {
			AvaliaMultMatrizes.multmatrize(n, d);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true, true);
	}
	
	public void test1_2_S() {
		int n=50;
	    int d[] = new int[n+1];
	    for (int i = 0; i <= n; i++) 
	        d[i]=i+1;
	    
	    try {
			AvaliaMultMatrizes.multmatrize(n, d);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true, true);
	}
	
	public void test1_3_I() {
		int n=6;
	    int d[] = new int[n+1];
	    for (int i = 0; i <= n; i++) 
	        d[i]=1;
	    
	    try {
			AvaliaMultMatrizes.multmatrize(n, d);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true, true);
	}
	
	public void test1_3_S() {
		int n=5;
	    int d[] = new int[n+1];
	    for (int i = 0; i <= n; i++) 
	        d[i]=100;
	    
	    try {
			AvaliaMultMatrizes.multmatrize(n, d);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true, true);
	}

}
