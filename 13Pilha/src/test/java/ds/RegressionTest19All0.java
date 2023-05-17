package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test01"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = (byte)(-1);
    boolean b11 = pilha0.vazia();
    int i12 = pilha0.topo;
    // The following exception was thrown during execution in test generation
    try {
    pilha0.empilha((java.lang.Object)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test02"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = (byte)(-1);
    boolean b11 = pilha0.vazia();
    int i12 = pilha0.topo;
    pilha0.topo = '4';
    // The following exception was thrown during execution in test generation
    try {
    pilha0.empilha((java.lang.Object)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = (byte)(-1);
    boolean b11 = pilha0.vazia();
    ds.Pilha pilha12 = new ds.Pilha();
    java.lang.Object[] obj_array19 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha12.item = obj_array19;
    java.lang.Object[] obj_array21 = pilha12.item;
    java.lang.Object[] obj_array22 = pilha12.item;
    pilha0.item = obj_array22;
    int i24 = pilha0.topo;
    ds.Pilha pilha25 = new ds.Pilha();
    java.lang.Object[] obj_array32 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha25.item = obj_array32;
    pilha25.topo = (byte)(-1);
    boolean b36 = pilha25.vazia();
    int i37 = pilha25.topo;
    pilha25.topo = '4';
    java.lang.Object[] obj_array41 = new java.lang.Object[] { 10.0f };
    pilha25.item = obj_array41;
    pilha0.item = obj_array41;
    java.lang.Object obj44 = null;
    // The following exception was thrown during execution in test generation
    try {
    pilha0.empilha(obj44);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    java.lang.Object[] obj_array9 = pilha0.item;
    java.lang.Object[] obj_array10 = pilha0.item;
    int i11 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = (byte)(-1);
    boolean b11 = pilha0.vazia();
    ds.Pilha pilha12 = new ds.Pilha();
    java.lang.Object[] obj_array19 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha12.item = obj_array19;
    java.lang.Object[] obj_array21 = pilha12.item;
    java.lang.Object[] obj_array22 = pilha12.item;
    pilha0.item = obj_array22;
    boolean b24 = pilha0.vazia();
    ds.Pilha pilha25 = new ds.Pilha();
    java.lang.Object[] obj_array32 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha25.item = obj_array32;
    pilha25.topo = (byte)(-1);
    boolean b36 = pilha25.vazia();
    int i37 = pilha25.topo;
    java.lang.Object[] obj_array38 = pilha25.item;
    pilha0.item = obj_array38;
    ds.Pilha pilha40 = new ds.Pilha();
    java.lang.Object[] obj_array47 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha40.item = obj_array47;
    pilha0.item = obj_array47;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj2 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    int i9 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = (byte)(-1);
    boolean b11 = pilha0.vazia();
    ds.Pilha pilha12 = new ds.Pilha();
    java.lang.Object[] obj_array19 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha12.item = obj_array19;
    java.lang.Object[] obj_array21 = pilha12.item;
    java.lang.Object[] obj_array22 = pilha12.item;
    pilha0.item = obj_array22;
    ds.Pilha pilha24 = new ds.Pilha();
    java.lang.Object[] obj_array31 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha24.item = obj_array31;
    pilha24.topo = (byte)(-1);
    boolean b35 = pilha24.vazia();
    int i36 = pilha24.topo;
    pilha24.topo = '4';
    java.lang.Object[] obj_array40 = new java.lang.Object[] { 10.0f };
    pilha24.item = obj_array40;
    // The following exception was thrown during execution in test generation
    try {
    pilha0.empilha((java.lang.Object)pilha24);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = (byte)(-1);
    boolean b11 = pilha0.vazia();
    ds.Pilha pilha12 = new ds.Pilha();
    java.lang.Object[] obj_array19 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha12.item = obj_array19;
    java.lang.Object[] obj_array21 = pilha12.item;
    java.lang.Object[] obj_array22 = pilha12.item;
    pilha0.item = obj_array22;
    int i24 = pilha0.topo;
    int i25 = pilha0.tamanho();
    int i26 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = (byte)(-1);
    boolean b11 = pilha0.vazia();
    int i12 = pilha0.topo;
    int i13 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = (byte)(-1);
    boolean b11 = pilha0.vazia();
    ds.Pilha pilha12 = new ds.Pilha();
    java.lang.Object[] obj_array19 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha12.item = obj_array19;
    java.lang.Object[] obj_array21 = pilha12.item;
    java.lang.Object[] obj_array22 = pilha12.item;
    pilha0.item = obj_array22;
    boolean b24 = pilha0.vazia();
    ds.Pilha pilha25 = new ds.Pilha();
    java.lang.Object[] obj_array32 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha25.item = obj_array32;
    pilha25.topo = (byte)(-1);
    boolean b36 = pilha25.vazia();
    int i37 = pilha25.topo;
    java.lang.Object[] obj_array38 = pilha25.item;
    pilha0.item = obj_array38;
    java.lang.Object[] obj_array40 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = (byte)(-1);
    boolean b11 = pilha0.vazia();
    int i12 = pilha0.topo;
    java.lang.Object[] obj_array13 = pilha0.item;
    boolean b14 = pilha0.vazia();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj15 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test13"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = 0;
    int i11 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = (byte)(-1);
    boolean b11 = pilha0.vazia();
    ds.Pilha pilha12 = new ds.Pilha();
    java.lang.Object[] obj_array19 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha12.item = obj_array19;
    java.lang.Object[] obj_array21 = pilha12.item;
    java.lang.Object[] obj_array22 = pilha12.item;
    pilha0.item = obj_array22;
    int i24 = pilha0.topo;
    ds.Pilha pilha25 = new ds.Pilha();
    java.lang.Object[] obj_array32 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha25.item = obj_array32;
    pilha25.topo = (byte)(-1);
    boolean b36 = pilha25.vazia();
    boolean b37 = pilha25.vazia();
    // The following exception was thrown during execution in test generation
    try {
    pilha0.empilha((java.lang.Object)b37);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test15"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = (byte)(-1);
    boolean b11 = pilha0.vazia();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj12 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test16"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    java.lang.Object[] obj_array9 = pilha0.item;
    java.lang.Object[] obj_array10 = pilha0.item;
    java.lang.Object[] obj_array11 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test17"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = (byte)(-1);
    boolean b11 = pilha0.vazia();
    ds.Pilha pilha12 = new ds.Pilha();
    java.lang.Object[] obj_array19 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha12.item = obj_array19;
    java.lang.Object[] obj_array21 = pilha12.item;
    java.lang.Object[] obj_array22 = pilha12.item;
    pilha0.item = obj_array22;
    boolean b24 = pilha0.vazia();
    ds.Pilha pilha25 = new ds.Pilha();
    java.lang.Object[] obj_array32 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha25.item = obj_array32;
    pilha25.topo = (byte)(-1);
    boolean b36 = pilha25.vazia();
    int i37 = pilha25.topo;
    java.lang.Object[] obj_array38 = pilha25.item;
    pilha0.item = obj_array38;
    // The following exception was thrown during execution in test generation
    try {
    pilha0.empilha((java.lang.Object)10.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test18"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = (byte)(-1);
    boolean b11 = pilha0.vazia();
    ds.Pilha pilha12 = new ds.Pilha();
    java.lang.Object[] obj_array19 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha12.item = obj_array19;
    java.lang.Object[] obj_array21 = pilha12.item;
    java.lang.Object[] obj_array22 = pilha12.item;
    pilha0.item = obj_array22;
    int i24 = pilha0.topo;
    int i25 = pilha0.tamanho();
    ds.Pilha pilha26 = new ds.Pilha();
    java.lang.Object[] obj_array33 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha26.item = obj_array33;
    pilha26.topo = (byte)(-1);
    boolean b37 = pilha26.vazia();
    int i38 = pilha26.topo;
    pilha26.topo = '4';
    java.lang.Object[] obj_array42 = new java.lang.Object[] { 10.0f };
    pilha26.item = obj_array42;
    java.lang.Object[] obj_array44 = pilha26.item;
    pilha0.item = obj_array44;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test19"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    boolean b2 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test20"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = (byte)(-1);
    boolean b11 = pilha0.vazia();
    int i12 = pilha0.topo;
    pilha0.topo = '4';
    boolean b15 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test21"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = (byte)(-1);
    boolean b11 = pilha0.vazia();
    int i12 = pilha0.topo;
    pilha0.topo = '4';
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0f };
    pilha0.item = obj_array16;
    int i18 = pilha0.tamanho();
    java.lang.Object[] obj_array19 = pilha0.item;
    boolean b20 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test22"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = (byte)(-1);
    boolean b11 = pilha0.vazia();
    int i12 = pilha0.topo;
    boolean b13 = pilha0.vazia();
    java.lang.Object[] obj_array14 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test23"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = (short)10;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj11 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test24"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = 0;
    java.lang.Object[] obj_array11 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test25"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = (short)10;
    ds.Pilha pilha11 = new ds.Pilha();
    java.lang.Object[] obj_array12 = pilha11.item;
    pilha0.item = obj_array12;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test26"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = 0;
    ds.Pilha pilha11 = new ds.Pilha();
    java.lang.Object[] obj_array18 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha11.item = obj_array18;
    pilha11.topo = (byte)(-1);
    boolean b22 = pilha11.vazia();
    ds.Pilha pilha23 = new ds.Pilha();
    java.lang.Object[] obj_array30 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha23.item = obj_array30;
    java.lang.Object[] obj_array32 = pilha23.item;
    java.lang.Object[] obj_array33 = pilha23.item;
    pilha11.item = obj_array33;
    int i35 = pilha11.topo;
    ds.Pilha pilha36 = new ds.Pilha();
    java.lang.Object[] obj_array43 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha36.item = obj_array43;
    pilha36.topo = (byte)(-1);
    boolean b47 = pilha36.vazia();
    int i48 = pilha36.topo;
    pilha36.topo = '4';
    java.lang.Object[] obj_array52 = new java.lang.Object[] { 10.0f };
    pilha36.item = obj_array52;
    pilha11.item = obj_array52;
    pilha0.item = obj_array52;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array52);

  }

}
