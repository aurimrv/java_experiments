package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    int i2 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.pos = 100;
    lista0.insere((java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.primeiro = 10;
    lista0.pos = (short)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.pos = 100;
    boolean b4 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(short)0);
    lista0.pos = (short)10;
    int i5 = lista0.ultimo;
    lista0.ultimo = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

}
