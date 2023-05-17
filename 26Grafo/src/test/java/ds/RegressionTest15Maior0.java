package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    int[] i_array8 = new int[] { (byte)(-1), (byte)10, ' ', (short)10, (byte)(-1), 100 };
    grafo1.cab = i_array8;
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((-1), (int)(short)1, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    int[] i_array8 = new int[] { (byte)(-1), (byte)10, ' ', (short)10, (byte)(-1), 100 };
    grafo1.cab = i_array8;
    int[] i_array10 = grafo1.prox;
    int i11 = grafo1.numVertices();
    int[] i_array12 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int[] i_array3 = grafo2.prox;
    int[] i_array4 = grafo2.cab;
    ds.Grafo grafo6 = new ds.Grafo((int)' ');
    ds.Grafo grafo7 = grafo6.grafoTransposto();
    int[] i_array8 = grafo7.prox;
    int[] i_array9 = grafo7.cab;
    grafo2.cab = i_array9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int[] i_array3 = grafo2.prox;
    ds.Grafo.Aresta aresta6 = grafo2.retiraAresta(10, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    int[] i_array8 = new int[] { (byte)(-1), (byte)10, ' ', (short)10, (byte)(-1), 100 };
    grafo1.cab = i_array8;
    int[] i_array10 = grafo1.prox;
    int i11 = grafo1.numVertices();
    ds.Grafo grafo13 = new ds.Grafo((int)' ');
    ds.Grafo grafo14 = grafo13.grafoTransposto();
    int[] i_array20 = new int[] { ' ', 100, (short)100, ' ', '#' };
    grafo13.cab = i_array20;
    ds.Grafo grafo23 = new ds.Grafo((int)' ');
    ds.Grafo grafo24 = grafo23.grafoTransposto();
    ds.Grafo grafo26 = new ds.Grafo((int)' ');
    ds.Grafo grafo27 = grafo26.grafoTransposto();
    int[] i_array33 = new int[] { 10, (byte)(-1), (short)1, (byte)1, 10 };
    grafo26.cab = i_array33;
    grafo24.cab = i_array33;
    grafo13.prox = i_array33;
    grafo1.prox = i_array33;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    int[] i_array8 = new int[] { (byte)(-1), (byte)10, ' ', (short)10, (byte)(-1), 100 };
    grafo1.cab = i_array8;
    ds.Grafo grafo11 = new ds.Grafo((int)' ');
    int[] i_array18 = new int[] { (byte)(-1), (byte)10, ' ', (short)10, (byte)(-1), 100 };
    grafo11.cab = i_array18;
    int[] i_array20 = grafo11.prox;
    grafo1.peso = i_array20;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b4 = grafo1.existeAresta(1, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo grafo4 = new ds.Grafo((int)' ');
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    int[] i_array11 = new int[] { 10, (byte)(-1), (short)1, (byte)1, 10 };
    grafo4.cab = i_array11;
    grafo2.cab = i_array11;
    // The following exception was thrown during execution in test generation
    try {
    grafo2.insereAresta(10, (int)(short)1, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

}
