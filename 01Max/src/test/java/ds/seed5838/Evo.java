/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 04 19:06:04 GMT 2020
 */

package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Item;
import ds.Max;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Evo extends Max_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MeuItem meuItem0 = new MeuItem(2207);
      MeuItem meuItem1 = new MeuItem((-1454));
      Item[] itemArray0 = new Item[9];
      itemArray0[0] = (Item) meuItem1;
      itemArray0[1] = (Item) meuItem1;
      itemArray0[2] = (Item) meuItem0;
      // Undeclared exception!
      try { 
        Max.max(itemArray0, 2269);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Item[] itemArray0 = new Item[9];
      Item item0 = Max.max(itemArray0, 1);
      assertNull(item0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Max max0 = new Max();
  }
}
