/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 04 21:29:17 GMT 2020
 */

package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.CasamentoExato;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Evo extends CasamentoExato_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.bmhs((String) null, 0, (String) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.CasamentoExato", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CasamentoExato.bmhs("O;;%iN}B+p;;", 1, "j>y`+<;", 1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CasamentoExato.bmhs(":3`mFu7EiR", 1, ":3`mFu7EiR", 1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CasamentoExato.bmh("d=DqwuF", 1, "|R$~R6ZN", 1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CasamentoExato.bmh("ds.CasamentoExato", 1, "ds.CasamentoExato", 1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.bmh((String) null, 156, "bF!x7", 156);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CasamentoExato.shiftAndExato("el,,LT$!wJ<SQ$o ", 1, "3<Mu", 1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CasamentoExato.shiftAndExato("ds.CasamentoExato", 1, "ds.CasamentoExato", 1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.forcaBruta("ds.CasamentoExato", 837, "ds.CasamentoExato", 837);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CasamentoExato.forcaBruta("jsuU|`2!0#", 1, "ds.CasamentoExato", 1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CasamentoExato.forcaBruta("^x:xB", 0, "A,oV]LGA!o;.I24TI", 0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CasamentoExato casamentoExato0 = new CasamentoExato();
  }
}
