package ds;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tiago {

	@Test
	public void test() {
		MeuItem item01 = new MeuItem(10);
		MeuItem item02 = new MeuItem(1);
		
		assertEquals(1, item01.compara(item02));
	}

}
