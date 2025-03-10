/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 05 20:13:14 GMT 2020
 */

package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.TabelaHash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Evo extends TabelaHash_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", "");
      tabelaHash0.imprime();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", "");
      tabelaHash0.retira("2?yC1[");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("n/Pzv", "n/Pzv");
      tabelaHash0.retira("n/Pzv");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", "");
      tabelaHash0.insere("", "");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("2?yC1[", "2?yC1[");
      Object object0 = tabelaHash0.pesquisa("");
      assertNull(object0);
  }
}
