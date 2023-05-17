package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test01"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)1.0f);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(short)(-1));
    lista0.insere((java.lang.Object)0.0d);
    lista0.insere((java.lang.Object)100.0f);
    lista0.imprime();

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista0.insere((java.lang.Object)lista1);
    lista1.imprime();

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(short)(-1));
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(short)(-1));
    lista0.insere((java.lang.Object)0.0d);
    lista0.insere((java.lang.Object)100.0f);
    lista0.insere((java.lang.Object)10);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(short)(-1));
    lista0.imprime();
    lista0.imprime();
    lista0.imprime();

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(short)(-1));
    lista0.insere((java.lang.Object)0.0d);
    lista0.imprime();

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)0L);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    boolean b2 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.insere((java.lang.Object)(short)10);

  }

}
