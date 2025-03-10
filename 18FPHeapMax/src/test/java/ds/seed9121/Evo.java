/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 04 20:02:26 GMT 2020
 */

package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.FPHeapMax;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Evo extends FPHeapMax_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(4);
      MeuItem meuItem0 = new MeuItem(456);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.imprime();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(4);
      Item[] itemArray0 = new Item[3];
      MeuItem meuItem0 = new MeuItem(1297);
      itemArray0[1] = (Item) meuItem0;
      fPHeapMax0.copia(itemArray0);
      MeuItem meuItem1 = new MeuItem(456);
      fPHeapMax0.insere(meuItem1);
      assertFalse(meuItem1.equals((Object)meuItem0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(1);
      try { 
        fPHeapMax0.aumentaChave(1, (Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: chaveNova com valor null
         //
         verifyException("ds.FPHeapMax", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(1159);
      try { 
        fPHeapMax0.retiraMax();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: heap vazio
         //
         verifyException("ds.FPHeapMax", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(1609);
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(1609);
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(0);
      itemArray0[5] = (Item) meuItem1;
      fPHeapMax0.copia(itemArray0);
      try { 
        fPHeapMax0.retiraMax();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(1609);
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(1609);
      MeuItem meuItem1 = new MeuItem(0);
      itemArray0[2] = (Item) meuItem1;
      itemArray0[3] = (Item) meuItem0;
      fPHeapMax0.copia(itemArray0);
      try { 
        fPHeapMax0.retiraMax();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.FPHeapMax", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(4);
      MeuItem meuItem0 = new MeuItem(456);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.constroi();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(1159);
      fPHeapMax0.refaz(1159, (-1));
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(1159);
      Item item0 = fPHeapMax0.max();
      assertNull(item0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(0);
      MeuItem meuItem0 = new MeuItem(1137);
      try { 
        fPHeapMax0.insere(meuItem0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: heap cheio
         //
         verifyException("ds.FPHeapMax", e);
      }
  }
}
