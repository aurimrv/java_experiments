package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test01"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(byte)0);
    lista0.insere((java.lang.Object)(-1.0d));
    java.lang.Object obj5 = null;
    lista0.insere(obj5);
    // The following exception was thrown during execution in test generation
    try {
    lista0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(byte)0);
    lista0.insere((java.lang.Object)(-1.0d));
    lista0.imprime();
    lista0.imprime();
    boolean b7 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(byte)0);
    lista0.insere((java.lang.Object)(-1.0d));
    java.lang.Object obj5 = null;
    lista0.insere(obj5);
    boolean b7 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(byte)0);
    lista0.insere((java.lang.Object)(-1.0d));
    lista0.imprime();
    lista0.insere((java.lang.Object)(short)1);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(short)100);
    lista0.insere((java.lang.Object)10.0f);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(byte)0);
    ds.Lista lista3 = new ds.Lista();
    lista3.insere((java.lang.Object)(byte)0);
    boolean b6 = lista3.vazia();
    lista0.insere((java.lang.Object)b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(byte)0);
    lista0.insere((java.lang.Object)(-1.0d));
    lista0.imprime();
    lista0.imprime();
    lista0.imprime();

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(short)100);
    boolean b3 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(byte)0);
    lista0.imprime();

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(short)100);
    boolean b3 = lista0.vazia();
    boolean b4 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(byte)0);
    lista0.insere((java.lang.Object)(-1.0d));
    lista0.insere((java.lang.Object)(byte)10);

  }

}
