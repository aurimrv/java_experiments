/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 04 21:46:33 GMT 2020
 */

package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Identifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Evo extends Identifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.valid_f('!');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.valid_s('{');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.valid_s('L');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("6S389:`G");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("ggYLD*");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("i");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("dc}=5XIyS");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier((String) null);
      assertFalse(boolean0);
  }
}
