package ds;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Tiago {
	Pilha pilha;
	
	@Before
	public void inicializa(){
		pilha = new Pilha();
	}

	@Test
	public void pilhaCheia() throws Exception {
		int cont=0;
		int obtido=0;
		String msgOriginal = "Erro: A pilha esta cheia";
		String msgObtida = "";
		while (cont < 1001) {
			try {
				pilha.empilha(new Integer(cont++));
			} catch(ArrayIndexOutOfBoundsException ae) {
				obtido = 1;
			} catch(Exception e) {
				obtido = 0;
				msgObtida = e.getMessage();
			}
		}
		assertEquals(0,obtido);
		assertEquals(msgOriginal, msgObtida);
	}
}
