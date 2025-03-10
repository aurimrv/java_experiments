/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 04 19:42:44 GMT 2020
 */

package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Evo extends Lista_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Lista lista0 = new Lista();
      lista0.insere("ds.Lista");
      lista0.imprime();
      assertEquals(1, lista0.ultimo);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Lista lista0 = new Lista();
      boolean boolean0 = lista0.vazia();
      assertEquals(0, lista0.ultimo);
      assertTrue(boolean0);
      assertEquals((-1), lista0.pos);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Lista lista0 = new Lista();
      Object object0 = new Object();
      lista0.ultimo = 1698;
      try { 
        lista0.insere(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: A lista esta cheia
         //
         verifyException("ds.Lista", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Lista lista0 = new Lista();
      Object object0 = new Object();
      lista0.insere(object0);
      boolean boolean0 = lista0.vazia();
      assertEquals(1, lista0.ultimo);
      assertFalse(boolean0);
  }
}
