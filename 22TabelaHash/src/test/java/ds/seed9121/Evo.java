/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 05 20:20:20 GMT 2020
 */

package ds.seed9121;

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
      tabelaHash0.insere("kb|j)i", "kb|j)i");
      tabelaHash0.imprime();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("K", "K");
      tabelaHash0.retira("K");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("kb|j)i", "kb|j)i");
      Object object0 = new Object();
      tabelaHash0.insere("kb|j)i", object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", (Object) null);
      tabelaHash0.insere("[", (Object) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", (Object) null);
      tabelaHash0.retira("[");
  }
}
