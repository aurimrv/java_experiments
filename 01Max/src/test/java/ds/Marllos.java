package ds;

import ds.Max;
import ds.MeuItem;
import junit.framework.TestCase;

public class Marllos extends TestCase {
	
	public void test1_1e2() {
		MeuItem[] vet = new MeuItem[10];
		MeuItem retorno = null;
		
		vet[0] = new MeuItem(0);
		vet[1] = new MeuItem(4);
		vet[2] = new MeuItem(3);
		vet[3] = new MeuItem(2);
		vet[4] = new MeuItem(1);
		vet[5] = new MeuItem(0);
		vet[6] = new MeuItem(6);
		vet[7] = new MeuItem(78); //valor maximo
		vet[8] = new MeuItem(9);
		vet[9] = new MeuItem(3);
		//setup

		retorno = (MeuItem) Max.max(vet, 10);
		assertEquals(retorno.chave,78);
	}
	public void test1_2I() {
		MeuItem[] vet = new MeuItem[10];
		MeuItem retorno = null;
		
		vet[0] = new MeuItem(78);
		vet[1] = new MeuItem(4);
		vet[2] = new MeuItem(3);
		vet[3] = new MeuItem(2);
		vet[4] = new MeuItem(1);
		vet[5] = new MeuItem(0);
		vet[6] = new MeuItem(6);
		vet[7] = new MeuItem(0); //valor maximo
		vet[8] = new MeuItem(9);
		vet[9] = new MeuItem(3);
		//setup

		retorno = (MeuItem) Max.max(vet, 10);
		assertEquals(retorno.chave,78);
	}
	public void test1_2S() {
		MeuItem[] vet = new MeuItem[10];
		MeuItem retorno = null;
		
		vet[0] = new MeuItem(0);
		vet[1] = new MeuItem(4);
		vet[2] = new MeuItem(3);
		vet[3] = new MeuItem(2);
		vet[4] = new MeuItem(1);
		vet[5] = new MeuItem(0);
		vet[6] = new MeuItem(6);
		vet[7] = new MeuItem(0); //valor maximo
		vet[8] = new MeuItem(9);
		vet[9] = new MeuItem(78);
		//setup

		retorno = (MeuItem) Max.max(vet, 10);
		assertEquals(retorno.chave,78);
	}

}
