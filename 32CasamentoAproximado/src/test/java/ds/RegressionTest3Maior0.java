package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test01"); }


    ds.CasamentoAproximado casamentoAproximado0 = new ds.CasamentoAproximado();

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test02"); }


    ds.CasamentoAproximado.shiftAndAproximado("hi!", (int)(short)0, "", (-1), (int)'a');

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test03"); }


    // The following exception was thrown during execution in test generation
    try {
    ds.CasamentoAproximado.shiftAndAproximado("", 1, "hi!", (int)'a', (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test04"); }


    // The following exception was thrown during execution in test generation
    try {
    ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int)(byte)100, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test05"); }


    // The following exception was thrown during execution in test generation
    try {
    ds.CasamentoAproximado.shiftAndAproximado("", (int)(short)10, "", (int)'#', 10);
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test06"); }


    // The following exception was thrown during execution in test generation
    try {
    ds.CasamentoAproximado.shiftAndAproximado("", (int)(byte)10, "hi!", 10, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test07"); }


    // The following exception was thrown during execution in test generation
    try {
    ds.CasamentoAproximado.shiftAndAproximado("", (int)'a', "", (int)'a', (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test08"); }


    ds.CasamentoAproximado.shiftAndAproximado("", (int)(byte)(-1), "hi!", 0, (int)(byte)100);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test09"); }


    ds.CasamentoAproximado.shiftAndAproximado("hi!", (int)(byte)(-1), "hi!", 0, (int)(short)1);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test10"); }


    ds.CasamentoAproximado.shiftAndAproximado("", (int)(short)0, "hi!", (int)(short)1, (int)(short)0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test11"); }


    // The following exception was thrown during execution in test generation
    try {
    ds.CasamentoAproximado.shiftAndAproximado("", (int)'#', "", (int)(short)(-1), (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test12"); }


    ds.CasamentoAproximado.shiftAndAproximado("", (int)(byte)0, "hi!", 0, (int)(short)1);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test13"); }


    // The following exception was thrown during execution in test generation
    try {
    ds.CasamentoAproximado.shiftAndAproximado("hi!", (int)(short)10, "hi!", 100, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test14"); }


    ds.CasamentoAproximado.shiftAndAproximado("", (int)(short)(-1), "hi!", (-1), (int)'#');

  }

}
