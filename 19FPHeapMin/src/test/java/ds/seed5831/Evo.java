/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 04 20:04:17 GMT 2020
 */

package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.FPHeapMin;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Evo extends FPHeapMin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(910);
      Item[] itemArray0 = new Item[6];
      fPHeapMin0.copia(itemArray0);
      assertEquals(6, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(2);
      MeuItem meuItem0 = new MeuItem((-5570));
      fPHeapMin0.insere(meuItem0);
      fPHeapMin0.imprime();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(0);
      MeuItem meuItem0 = new MeuItem(0);
      try { 
        fPHeapMin0.insere(meuItem0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: heap cheio
         //
         verifyException("ds.FPHeapMin", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(2);
      MeuItem meuItem0 = new MeuItem((-5570));
      fPHeapMin0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(0);
      fPHeapMin0.insere(meuItem1);
      assertFalse(meuItem1.equals((Object)meuItem0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(1);
      try { 
        fPHeapMin0.diminuiChave(1, (Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: chaveNova com valor null
         //
         verifyException("ds.FPHeapMin", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(2);
      MeuItem meuItem0 = new MeuItem((-5570));
      fPHeapMin0.insere(meuItem0);
      fPHeapMin0.insere(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(8);
      try { 
        fPHeapMin0.retiraMin();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: heap vazio
         //
         verifyException("ds.FPHeapMin", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(0);
      fPHeapMin0.constroi();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MeuItem meuItem0 = new MeuItem(0);
      MeuItem meuItem1 = new MeuItem(1);
      Item[] itemArray0 = new Item[9];
      itemArray0[2] = (Item) meuItem1;
      itemArray0[3] = (Item) meuItem0;
      itemArray0[8] = itemArray0[2];
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
      try { 
        fPHeapMin0.retiraMin();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.FPHeapMin", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MeuItem meuItem0 = new MeuItem(0);
      Item[] itemArray0 = new Item[9];
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
      try { 
        fPHeapMin0.retiraMin();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.FPHeapMin", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Item[] itemArray0 = new Item[9];
      MeuItem meuItem0 = new MeuItem(1738);
      itemArray0[4] = (Item) meuItem0;
      itemArray0[8] = (Item) meuItem0;
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
      // Undeclared exception!
      try { 
        fPHeapMin0.constroi();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.FPHeapMin", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Item[] itemArray0 = new Item[3];
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
      Item item0 = fPHeapMin0.retiraMin();
      assertNull(item0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(1);
      Item item0 = fPHeapMin0.min();
      assertNull(item0);
  }
}
