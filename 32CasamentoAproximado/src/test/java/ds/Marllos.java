package ds;

import ds.CasamentoAproximado;
import junit.framework.TestCase;

public class Marllos extends TestCase {
	
	public void test1_1e3e4e5() {
		String T;
		String P;
		T = "Texto original para posterior comparação com casamento exato";
		P = "pari";
		int k = 1;
		
		CasamentoAproximado.shiftAndAproximado(T, T.length (), P, P.length (), k);
		

		assertTrue(true);
	}
	
	public void test1_2() {
		String T;
		String P;
		T = "Texto original para posterior comparação com casamento exato";
		P = "zuzu";
		int k = 1;
		
		CasamentoAproximado.shiftAndAproximado(T, T.length (), P, P.length (), k);
		

		assertTrue(true);
	}


/*AVL************************************************AVL***************************************************AVL*/	

	
	public void test1_1_I() {
		String T;
		String P;
		T = "Texto original para posterioz comparação com casamento exato";
		P = "zk";
		int k = 1;
		
		CasamentoAproximado.shiftAndAproximado(T, T.length (), P, P.length (), k);
		

		assertTrue(true);
	}
	
	public void test1_1_S() {
		String T;
		String P;
		T = "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm";
		P = "ma";
		int k = 1;
		
		CasamentoAproximado.shiftAndAproximado(T, T.length (), P, P.length (), k);
		

		assertTrue(true);
	}	
	
	public void test1_3_I() {
		String T;
		String P;
		T = "Texto original para posterior comparação com casamento exato";
		P = "T";
		int k = 1;
		
		CasamentoAproximado.shiftAndAproximado(T, T.length (), P, P.length (), k);
		

		assertTrue(true);
	}	

	public void test1_3_S() {
		String T;
		String P;
		T = "Texto original para posterior comparação com casamento exato";
		P = "Texto orig";
		int k = 1;
		
		CasamentoAproximado.shiftAndAproximado(T, T.length (), P, P.length (), k);
		

		assertTrue(true);
	}	
	
	public void test1_4_S() {
		String T;
		String P;
		T = "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm";
		P = "m";
		int k = 1;
		
		CasamentoAproximado.shiftAndAproximado(T, T.length (), P, P.length (), k);
		

		assertTrue(true);
	}

	public void test1_4_I() {
		String T;
		String P;
		T = "T";
		P = "T";
		int k = 1;
		
		CasamentoAproximado.shiftAndAproximado(T, T.length (), P, P.length (), k);
		

		assertTrue(true);
	}	

}
