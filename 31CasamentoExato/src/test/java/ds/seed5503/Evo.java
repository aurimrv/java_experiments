/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 04 21:28:46 GMT 2020
 */

package ds.seed5503;

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
        CasamentoExato.bmhs("30PU$ ?.0c8mwc<*0u", 225, "30PU$ ?.0c8mwc<*0u", 1);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CasamentoExato.bmhs("30PU$ ?.0c8mwc<*0u", 1, "30PU$ ?.0c8mwc<*0u", 1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CasamentoExato.bmh(" gbQGSU%b?_AdovHyLT", 1, "\"$$_CZ]7w5Q8Rb", 1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CasamentoExato.bmh("OB @1;#DiG,`c,D", 1, "OB @1;#DiG,`c,D", 1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.bmh("30PU$ ?.0c8mwc<*0u", 0, "30PU$ ?.0c8mwc<*0u", 370);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.shiftAndExato("{q", 190, "", 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CasamentoExato.shiftAndExato("OnC0pD99", 1, "OnC0pD99", 1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CasamentoExato.forcaBruta("ds.CasamentoExato", 0, "1e*O", 0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.forcaBruta("ds.CasamentoExato", 818, "ds.CasamentoExato", 818);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CasamentoExato.forcaBruta((String) null, (-1821), "Qpb*d(Mv#&!s", (-1821));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CasamentoExato.forcaBruta("tWa/yRkUW?s:?u``~|", 1, "GoQVvn$8<r", 1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CasamentoExato casamentoExato0 = new CasamentoExato();
  }
}
