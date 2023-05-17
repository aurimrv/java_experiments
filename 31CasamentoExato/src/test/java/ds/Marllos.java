package ds;

import ds.CasamentoExato;
import junit.framework.TestCase;

public class Marllos extends TestCase {

	String T,P;
		
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

		
	public void test1_1()
	{
		T = "Texto original para posterior comparação com casamento exato";
		P = "original pa";
			
		CasamentoExato.forcaBruta(T, T.length (), P, P.length ()); // Casamento na posição 6
	}
	public void test2_1()
	{
		T = "Texto original para posterior comparação com casamento exato";
		P = "original pa";
		
		CasamentoExato.shiftAndExato(T, T.length (), P, P.length ()); // Casamento na posição 6
	}
	public void test3_1()
	{
		T = "Texto original para posterior comparação com casamento exato";
		P = "original pa";
			
		CasamentoExato.bmh(T, T.length (), P, P.length ()); // Casamento na posição 6
	}
	public void test4_1()
	{
		T = "Texto original para posterior comparação com casamento exato";
		P = "original pa";
			
		CasamentoExato.bmhs(T, T.length (), P, P.length ()); // Casamento na posição 6
	}
	
	public void test1_2()
	{
		T = "Texto original para posterior comparação com casamento exato";
		P = "teste";
		
		CasamentoExato.forcaBruta(T, T.length (), P, P.length ()); //nada impresso
	}	
	public void test2_2()
	{
		T = "Texto original para posterior comparação com casamento exato";
		P = "teste";
			
		CasamentoExato.shiftAndExato(T, T.length (), P, P.length ()); //nada impresso
	}
	public void test3_2()
	{
		T = "Texto original para posterior comparação com casamento exato";
		P = "teste";
			
		CasamentoExato.bmh(T, T.length (), P, P.length ()); //nada impresso
	}
	public void test4_2()
	{
		T = "Texto original para posterior comparação com casamento exato";
		P = "teste";
		
		CasamentoExato.bmhs(T, T.length (), P, P.length ()); //nada impresso
	}
	
	public void test1_1_I()
	{
		T = "Texto original para posterior comparação com casamento exato";
		P = "g";
			
		CasamentoExato.forcaBruta(T, T.length (), P, P.length ()); // Casamento na posição 9
	}
	public void test2_1_I()
	{
		T = "Texto original para posterior comparação com casamento exato";
		P = "g";
		
		CasamentoExato.shiftAndExato(T, T.length (), P, P.length ()); // Casamento na posição 9
	}
	public void test3_1_I()
	{
		T = "Texto original para posterior comparação com casamento exato";
		P = "g";
			
		CasamentoExato.bmh(T, T.length (), P, P.length ()); // Casamento na posição 9
	}
	public void test4_1_I()
	{
		T = "Texto original para posterior comparação com casamento exato";
		P = "g";
		
		CasamentoExato.bmhs(T, T.length (), P, P.length ()); // Casamento na posição 9
	}
		
	public void test1_1_S()
	{
		T = "Texto";
		P = "Texto";
			
		CasamentoExato.forcaBruta(T, T.length (), P, P.length ()); // Casamento na posição 0
	}
	public void test2_1_S()
	{
		T = "Texto";
		P = "Texto";
			
		CasamentoExato.shiftAndExato(T, T.length (), P, P.length ()); // Casamento na posição 0
	}
	public void test3_1_S()
	{
		T = "Texto";
		P = "Texto";
		
		CasamentoExato.bmh(T, T.length (), P, P.length ()); // Casamento na posição 0
	}
	public void test4_1_S()
	{
		T = "Texto";
		P = "Texto";
			
		CasamentoExato.bmhs(T, T.length (), P, P.length ()); // Casamento na posição 0
	}
}

	

