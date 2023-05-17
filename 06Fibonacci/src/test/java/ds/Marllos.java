package ds;

import ds.Fibonacci;
import junit.framework.TestCase;

public class Marllos extends TestCase {

	public void test1_1() {

		int retorno = 0;
		retorno = Fibonacci.fibIter(7);
		assertEquals(retorno,13);

	}

/*AVL************************************************AVL***************************************************AVL*/	
	
	public void test1_1_I() {

		int retorno = 0;
		retorno = Fibonacci.fibIter(0);
		assertEquals(retorno,0);

	}
	

// Oraculo: http://home.att.net/~blair.kelly/mathematics/fibonacci/f100.txt
	
	public void test1_1_S() {

		int retorno = 0;
		retorno = Fibonacci.fibIter(46);
		assertEquals(retorno,1836311903);

	}

	
}
