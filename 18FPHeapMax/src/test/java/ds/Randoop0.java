package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test001"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item item2 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test002"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave(0, (java.lang.Object)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test003"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)100, (java.lang.Object)1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test004"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave(0, (java.lang.Object)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test005"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test006"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item3 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test007"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)10, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test008"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test009"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)10, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test010"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test011"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item3 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test012"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'#', (java.lang.Object)(-1.0d));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test013"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    java.lang.Object obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave(10, obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test014"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item2 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test015"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item3 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test016"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test017"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test018"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item4 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test019"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item item2 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item2);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test020"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item5 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test021"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item4 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test022"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)10, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test023"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item2 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test024"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item2 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test025"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'4', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test026"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item2 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test027"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item4 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test028"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.constroi();
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test029"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave(100, (java.lang.Object)100.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test030"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.Item item2 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test031"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item5 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test032"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test033"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)(-1), (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test034"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test035"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'#', (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test036"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.constroi();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item10 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test037"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(byte)(-1), (java.lang.Object)1L);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test038"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((-1), (java.lang.Object)"");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test039"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)' ', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test040"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test041"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(1, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test042"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'#', (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test043"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(10);
    fPHeapMax5.constroi();
    ds.Item item7 = fPHeapMax5.max();
    fPHeapMax5.constroi();
    ds.Item item9 = fPHeapMax5.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'a', (java.lang.Object)fPHeapMax5);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test044"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave(0, (java.lang.Object)(-1.0f));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test045"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test046"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave(1, (java.lang.Object)0.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test047"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(1, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test048"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((-1));
    fPHeapMax7.constroi();
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax7.copia(item_array9);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'4', (java.lang.Object)fPHeapMax7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test049"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)100, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test050"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(100, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test051"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'4', (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test052"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item8 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test053"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array7);
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test054"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)100);
    ds.Item item2 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test055"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'4', (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test056"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test057"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item9 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test058"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test059"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.imprime();
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test060"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test061"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)1, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test062"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item3 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test063"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item8 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test064"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test065"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item4 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test066"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item7 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test067"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    fPHeapMax6.constroi();
    fPHeapMax6.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave(10, (java.lang.Object)fPHeapMax6);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test068"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item4 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test069"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item5 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test070"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)10, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test071"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(100, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test072"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item3 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test073"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array7);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test074"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array10);
    fPHeapMax7.copia(item_array10);
    fPHeapMax7.imprime();
    ds.Item item14 = fPHeapMax7.max();
    fPHeapMax7.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'a', (java.lang.Object)fPHeapMax7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test075"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test076"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax4.copia(item_array7);
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array10);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((-1), (java.lang.Object)fPHeapMax4);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test077"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.constroi();
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test078"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item4 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test079"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(10);
    fPHeapMax5.constroi();
    fPHeapMax5.imprime();
    fPHeapMax5.constroi();
    fPHeapMax5.refaz(1, 0);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((-1), (java.lang.Object)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test080"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item4 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test081"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test082"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test083"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    fPHeapMax8.constroi();
    ds.Item item10 = fPHeapMax8.max();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax8.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item17 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test084"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item5 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test085"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.Item[] item_array4 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.copia(item_array4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test086"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test087"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item3 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test088"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test089"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test090"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test091"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test092"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(10, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test093"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax4.copia(item_array7);
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array10);
    fPHeapMax1.copia(item_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item13 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test094"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'4', (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test095"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax6.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array10);
    fPHeapMax6.copia(item_array10);
    fPHeapMax1.copia(item_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item14 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test096"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'a', (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test097"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    fPHeapMax4.constroi();
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    fPHeapMax4.copia(item_array12);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax17.constroi();
    fPHeapMax17.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    fPHeapMax21.constroi();
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array23);
    fPHeapMax17.copia(item_array23);
    fPHeapMax4.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(10);
    fPHeapMax36.constroi();
    ds.Item item38 = fPHeapMax36.max();
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax36.copia(item_array41);
    fPHeapMax29.copia(item_array41);
    fPHeapMax1.copia(item_array41);
    ds.Item item46 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item46);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test098"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array7);
    fPHeapMax1.constroi();
    java.lang.Object obj11 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave(10, obj11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test099"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item3 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test100"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item5 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test101"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array5);
    fPHeapMax1.copia(item_array5);
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test102"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test103"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(byte)100, (java.lang.Object)100.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test104"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item4 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test105"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax6.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array10);
    fPHeapMax6.copia(item_array10);
    fPHeapMax1.copia(item_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item14 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test106"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item6 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test107"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax8.constroi();
    fPHeapMax8.imprime();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    fPHeapMax12.constroi();
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array14);
    fPHeapMax8.copia(item_array14);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(byte)10, (java.lang.Object)item_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test108"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array7);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item10 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test109"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item4 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test110"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item5 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test111"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    ds.Item item2 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item3 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test112"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax4.copia(item_array7);
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array10);
    fPHeapMax1.copia(item_array10);
    ds.Item item13 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test113"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test114"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item[] item_array5 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.copia(item_array5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test115"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)' ', (java.lang.Object)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test116"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.constroi();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item10 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test117"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item[] item_array5 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.copia(item_array5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test118"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item13 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test119"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array6);
    fPHeapMax3.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    ds.Item item10 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test120"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    fPHeapMax15.constroi();
    ds.Item item17 = fPHeapMax15.max();
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array20 = new ds.Item[] {  };
    fPHeapMax19.copia(item_array20);
    fPHeapMax15.copia(item_array20);
    fPHeapMax1.copia(item_array20);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)'#');
    fPHeapMax26.refaz((int)(short)10, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)100, (java.lang.Object)fPHeapMax26);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test121"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item7 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test122"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.refaz((int)(short)10, (int)(short)(-1));
    ds.Item item5 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test123"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test124"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
    ds.Item item2 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test125"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item6 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test126"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test127"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item5 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    fPHeapMax8.constroi();
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMax16.copia(item_array17);
    fPHeapMax13.copia(item_array17);
    fPHeapMax8.copia(item_array17);
    fPHeapMax1.copia(item_array17);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)100, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test128"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.constroi();
    ds.Item item8 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item9 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test129"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)' ');
    ds.Item item2 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test130"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item4 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test131"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item3 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test132"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax6.imprime();
    ds.Item item13 = fPHeapMax6.max();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    fPHeapMax15.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((-1));
    fPHeapMax18.constroi();
    fPHeapMax18.constroi();
    fPHeapMax18.imprime();
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((-1));
    ds.Item[] item_array26 = new ds.Item[] {  };
    fPHeapMax25.copia(item_array26);
    fPHeapMax23.copia(item_array26);
    fPHeapMax18.copia(item_array26);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax31.constroi();
    fPHeapMax31.imprime();
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((-1));
    fPHeapMax35.constroi();
    ds.Item[] item_array37 = new ds.Item[] {  };
    fPHeapMax35.copia(item_array37);
    fPHeapMax31.copia(item_array37);
    fPHeapMax18.copia(item_array37);
    fPHeapMax15.copia(item_array37);
    ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array46 = new ds.Item[] {  };
    fPHeapMax45.copia(item_array46);
    fPHeapMax43.copia(item_array46);
    ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax(10);
    fPHeapMax50.constroi();
    ds.Item item52 = fPHeapMax50.max();
    ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array55 = new ds.Item[] {  };
    fPHeapMax54.copia(item_array55);
    fPHeapMax50.copia(item_array55);
    fPHeapMax43.copia(item_array55);
    fPHeapMax15.copia(item_array55);
    fPHeapMax6.copia(item_array55);
    fPHeapMax1.copia(item_array55);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item62 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array55);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test133"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.refaz(1, 0);
    ds.Item item8 = fPHeapMax1.max();
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test134"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item9 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test135"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'4', (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test136"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(1, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test137"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item4 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test138"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item2 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test139"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(100, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test140"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item5 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(byte)(-1));
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array19 = new ds.Item[] {  };
    fPHeapMax18.copia(item_array19);
    fPHeapMax16.copia(item_array19);
    fPHeapMax14.copia(item_array19);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((-1), (java.lang.Object)item_array19);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test141"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item11 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test142"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item9 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'4', (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test143"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax5.constroi();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    fPHeapMax9.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array11);
    fPHeapMax5.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item15 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test144"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'a', (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test145"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    fPHeapMax4.constroi();
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    fPHeapMax4.copia(item_array12);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax17.constroi();
    fPHeapMax17.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    fPHeapMax21.constroi();
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array23);
    fPHeapMax17.copia(item_array23);
    fPHeapMax4.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(10);
    fPHeapMax36.constroi();
    ds.Item item38 = fPHeapMax36.max();
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax36.copia(item_array41);
    fPHeapMax29.copia(item_array41);
    fPHeapMax1.copia(item_array41);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)' ', (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test146"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array10);
    fPHeapMax7.copia(item_array10);
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(10);
    fPHeapMax14.constroi();
    ds.Item item16 = fPHeapMax14.max();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array19 = new ds.Item[] {  };
    fPHeapMax18.copia(item_array19);
    fPHeapMax14.copia(item_array19);
    fPHeapMax7.copia(item_array19);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((-1), (java.lang.Object)item_array19);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test147"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item6 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test148"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test149"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test150"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item2 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test151"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item4 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test152"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.constroi();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)10, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test153"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array7);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)' ', 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test154"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.constroi();
    ds.Item item8 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item10 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test155"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item7 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test156"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item5 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test157"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test158"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)100, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test159"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array15);
    fPHeapMax1.copia(item_array15);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int)(short)1);
    ds.Item item21 = fPHeapMax20.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)1, (java.lang.Object)item21);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test160"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax5.constroi();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    fPHeapMax9.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array11);
    fPHeapMax5.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    java.lang.Object obj16 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)10, obj16);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test161"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax8.constroi();
    fPHeapMax8.imprime();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    fPHeapMax12.constroi();
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array14);
    fPHeapMax8.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    ds.Item item18 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test162"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    ds.Item item13 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item13);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test163"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMax1.copia(item_array5);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    fPHeapMax12.constroi();
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array14);
    fPHeapMax8.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)10, (java.lang.Object)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test164"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    fPHeapMax8.constroi();
    ds.Item item10 = fPHeapMax8.max();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax8.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    ds.Item item17 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test165"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    fPHeapMax3.constroi();
    fPHeapMax3.constroi();
    fPHeapMax3.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((-1));
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax10.copia(item_array11);
    fPHeapMax8.copia(item_array11);
    fPHeapMax3.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item16 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test166"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax4.copia(item_array7);
    fPHeapMax4.constroi();
    fPHeapMax4.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'4', (java.lang.Object)fPHeapMax4);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test167"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test168"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(0, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test169"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item4 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test170"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    fPHeapMax18.constroi();
    ds.Item item20 = fPHeapMax18.max();
    ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax22.copia(item_array23);
    fPHeapMax18.copia(item_array23);
    fPHeapMax11.copia(item_array23);
    fPHeapMax9.copia(item_array23);
    fPHeapMax9.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave(1, (java.lang.Object)fPHeapMax9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test171"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    ds.Item item20 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test172"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)(-1), (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test173"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMax1.copia(item_array5);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    fPHeapMax12.constroi();
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array14);
    fPHeapMax8.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    ds.Item item19 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test174"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    fPHeapMax15.constroi();
    ds.Item item17 = fPHeapMax15.max();
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array20 = new ds.Item[] {  };
    fPHeapMax19.copia(item_array20);
    fPHeapMax15.copia(item_array20);
    fPHeapMax1.copia(item_array20);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item24 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test175"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)(-1), (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test176"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    fPHeapMax8.constroi();
    ds.Item item10 = fPHeapMax8.max();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax8.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((-1));
    fPHeapMax19.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'a', (java.lang.Object)fPHeapMax19);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test177"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.refaz((int)(short)10, (int)(short)(-1));
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax6.imprime();
    ds.Item item13 = fPHeapMax6.max();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    fPHeapMax15.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((-1));
    fPHeapMax18.constroi();
    fPHeapMax18.constroi();
    fPHeapMax18.imprime();
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((-1));
    ds.Item[] item_array26 = new ds.Item[] {  };
    fPHeapMax25.copia(item_array26);
    fPHeapMax23.copia(item_array26);
    fPHeapMax18.copia(item_array26);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax31.constroi();
    fPHeapMax31.imprime();
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((-1));
    fPHeapMax35.constroi();
    ds.Item[] item_array37 = new ds.Item[] {  };
    fPHeapMax35.copia(item_array37);
    fPHeapMax31.copia(item_array37);
    fPHeapMax18.copia(item_array37);
    fPHeapMax15.copia(item_array37);
    ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array46 = new ds.Item[] {  };
    fPHeapMax45.copia(item_array46);
    fPHeapMax43.copia(item_array46);
    ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax(10);
    fPHeapMax50.constroi();
    ds.Item item52 = fPHeapMax50.max();
    ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array55 = new ds.Item[] {  };
    fPHeapMax54.copia(item_array55);
    fPHeapMax50.copia(item_array55);
    fPHeapMax43.copia(item_array55);
    fPHeapMax15.copia(item_array55);
    fPHeapMax6.copia(item_array55);
    fPHeapMax1.copia(item_array55);
    java.lang.Object obj63 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)1, obj63);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array55);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test178"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(10);
    fPHeapMax16.constroi();
    fPHeapMax16.constroi();
    fPHeapMax16.imprime();
    ds.Item item20 = fPHeapMax16.max();
    fPHeapMax16.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(byte)1, (java.lang.Object)fPHeapMax16);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test179"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.constroi();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    ds.Item[] item_array10 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.copia(item_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test180"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax15.imprime();
    fPHeapMax15.imprime();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((-1));
    fPHeapMax24.constroi();
    fPHeapMax24.constroi();
    fPHeapMax24.imprime();
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    fPHeapMax24.copia(item_array32);
    fPHeapMax15.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax6.copia(item_array32);
    fPHeapMax1.copia(item_array32);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(byte)100, (java.lang.Object)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test181"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array10);
    fPHeapMax7.copia(item_array10);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax7.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(0, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test182"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)1, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test183"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)(-1), 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test184"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array6);
    fPHeapMax3.copia(item_array6);
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.constroi();
    ds.Item item12 = fPHeapMax10.max();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax10.copia(item_array15);
    fPHeapMax3.copia(item_array15);
    fPHeapMax1.copia(item_array15);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item21 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test185"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item20 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test186"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax4.copia(item_array7);
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array10);
    fPHeapMax1.copia(item_array10);
    ds.Item[] item_array13 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.copia(item_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test187"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item6 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test188"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array7);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(byte)(-1), (java.lang.Object)item_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test189"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax21.imprime();
    fPHeapMax21.constroi();
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax25.constroi();
    fPHeapMax25.imprime();
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((-1));
    fPHeapMax29.constroi();
    ds.Item[] item_array31 = new ds.Item[] {  };
    fPHeapMax29.copia(item_array31);
    fPHeapMax25.copia(item_array31);
    fPHeapMax21.copia(item_array31);
    fPHeapMax1.copia(item_array31);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item36 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test190"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax9.constroi();
    fPHeapMax9.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array15);
    fPHeapMax9.copia(item_array15);
    fPHeapMax1.copia(item_array15);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)(-1), (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test191"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMax1.copia(item_array5);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    fPHeapMax12.constroi();
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array14);
    fPHeapMax8.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item18 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test192"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item2 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test193"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item14 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test194"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)0, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test195"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    fPHeapMax15.constroi();
    ds.Item item17 = fPHeapMax15.max();
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array20 = new ds.Item[] {  };
    fPHeapMax19.copia(item_array20);
    fPHeapMax15.copia(item_array20);
    fPHeapMax1.copia(item_array20);
    ds.Item item24 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test196"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax6.imprime();
    ds.Item item13 = fPHeapMax6.max();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    fPHeapMax15.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((-1));
    fPHeapMax18.constroi();
    fPHeapMax18.constroi();
    fPHeapMax18.imprime();
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((-1));
    ds.Item[] item_array26 = new ds.Item[] {  };
    fPHeapMax25.copia(item_array26);
    fPHeapMax23.copia(item_array26);
    fPHeapMax18.copia(item_array26);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax31.constroi();
    fPHeapMax31.imprime();
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((-1));
    fPHeapMax35.constroi();
    ds.Item[] item_array37 = new ds.Item[] {  };
    fPHeapMax35.copia(item_array37);
    fPHeapMax31.copia(item_array37);
    fPHeapMax18.copia(item_array37);
    fPHeapMax15.copia(item_array37);
    ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array46 = new ds.Item[] {  };
    fPHeapMax45.copia(item_array46);
    fPHeapMax43.copia(item_array46);
    ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax(10);
    fPHeapMax50.constroi();
    ds.Item item52 = fPHeapMax50.max();
    ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array55 = new ds.Item[] {  };
    fPHeapMax54.copia(item_array55);
    fPHeapMax50.copia(item_array55);
    fPHeapMax43.copia(item_array55);
    fPHeapMax15.copia(item_array55);
    fPHeapMax6.copia(item_array55);
    fPHeapMax1.copia(item_array55);
    ds.Item item62 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item62);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array55);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test197"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMax1.copia(item_array5);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item7 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test198"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array5);
    fPHeapMax1.copia(item_array5);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(10, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test199"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax4.copia(item_array7);
    ds.Item item10 = fPHeapMax4.max();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax12.copia(item_array15);
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array18);
    fPHeapMax4.copia(item_array18);
    fPHeapMax1.copia(item_array18);
    ds.Item item22 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item22);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test200"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(100, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test201"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item10 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test202"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item9 = fPHeapMax1.max();
    ds.Item item10 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item11 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test203"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax21.imprime();
    fPHeapMax21.constroi();
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax25.constroi();
    fPHeapMax25.imprime();
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((-1));
    fPHeapMax29.constroi();
    ds.Item[] item_array31 = new ds.Item[] {  };
    fPHeapMax29.copia(item_array31);
    fPHeapMax25.copia(item_array31);
    fPHeapMax21.copia(item_array31);
    fPHeapMax1.copia(item_array31);
    ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((-1));
    ds.Item[] item_array40 = new ds.Item[] {  };
    fPHeapMax39.copia(item_array40);
    fPHeapMax37.copia(item_array40);
    ds.Item item43 = fPHeapMax37.max();
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array48 = new ds.Item[] {  };
    fPHeapMax47.copia(item_array48);
    fPHeapMax45.copia(item_array48);
    ds.Item[] item_array51 = new ds.Item[] {  };
    fPHeapMax45.copia(item_array51);
    fPHeapMax37.copia(item_array51);
    fPHeapMax1.copia(item_array51);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'a', (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test204"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)100);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item3 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test205"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.Item item11 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'a', (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test206"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.refaz(1, 0);
    ds.Item item8 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item9 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test207"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax15.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    ds.Item item24 = fPHeapMax18.max();
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array29 = new ds.Item[] {  };
    fPHeapMax28.copia(item_array29);
    fPHeapMax26.copia(item_array29);
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax26.copia(item_array32);
    fPHeapMax18.copia(item_array32);
    fPHeapMax15.copia(item_array32);
    fPHeapMax1.copia(item_array32);
    ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int)(short)10);
    ds.Item item40 = fPHeapMax39.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave(10, (java.lang.Object)item40);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item40);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test208"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.constroi();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    fPHeapMax1.imprime();
    ds.Item item11 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item11);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test209"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test210"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMax1.copia(item_array5);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    fPHeapMax12.constroi();
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array14);
    fPHeapMax8.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((-1));
    fPHeapMax23.constroi();
    fPHeapMax23.constroi();
    fPHeapMax23.imprime();
    ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
    ds.Item[] item_array31 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array31);
    fPHeapMax28.copia(item_array31);
    fPHeapMax23.copia(item_array31);
    fPHeapMax21.copia(item_array31);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(byte)0, (java.lang.Object)fPHeapMax21);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test211"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item2 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test212"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    fPHeapMax1.constroi();
    ds.Item item14 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test213"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item9 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test214"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax5.imprime();
    fPHeapMax5.constroi();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax9.constroi();
    fPHeapMax9.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array15);
    fPHeapMax9.copia(item_array15);
    fPHeapMax5.copia(item_array15);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax22.copia(item_array23);
    fPHeapMax20.copia(item_array23);
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax(10);
    fPHeapMax27.constroi();
    ds.Item item29 = fPHeapMax27.max();
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax27.copia(item_array32);
    fPHeapMax20.copia(item_array32);
    fPHeapMax5.copia(item_array32);
    fPHeapMax1.copia(item_array32);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item38 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test215"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item9 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int)(byte)(-1));
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax13.copia(item_array18);
    fPHeapMax1.copia(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test216"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax4.copia(item_array7);
    ds.Item item10 = fPHeapMax4.max();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax12.copia(item_array15);
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array18);
    fPHeapMax4.copia(item_array18);
    fPHeapMax1.copia(item_array18);
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((-1));
    ds.Item[] item_array27 = new ds.Item[] {  };
    fPHeapMax26.copia(item_array27);
    fPHeapMax24.copia(item_array27);
    ds.Item item30 = fPHeapMax24.max();
    fPHeapMax24.constroi();
    ds.Item item32 = fPHeapMax24.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)10, (java.lang.Object)item32);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item32);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test217"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax5.constroi();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    fPHeapMax9.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array11);
    fPHeapMax5.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array19 = new ds.Item[] {  };
    fPHeapMax18.copia(item_array19);
    fPHeapMax16.copia(item_array19);
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(10);
    fPHeapMax23.constroi();
    ds.Item item25 = fPHeapMax23.max();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array28 = new ds.Item[] {  };
    fPHeapMax27.copia(item_array28);
    fPHeapMax23.copia(item_array28);
    fPHeapMax16.copia(item_array28);
    fPHeapMax1.copia(item_array28);
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax(10);
    fPHeapMax35.constroi();
    fPHeapMax35.constroi();
    fPHeapMax35.imprime();
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax40.constroi();
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((-1));
    ds.Item[] item_array48 = new ds.Item[] {  };
    fPHeapMax47.copia(item_array48);
    fPHeapMax45.copia(item_array48);
    fPHeapMax40.copia(item_array48);
    fPHeapMax35.copia(item_array48);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(byte)(-1), (java.lang.Object)item_array48);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array48);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test218"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax9.constroi();
    fPHeapMax9.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array15);
    fPHeapMax9.copia(item_array15);
    fPHeapMax1.copia(item_array15);
    ds.Item item19 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test219"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item5 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    fPHeapMax8.constroi();
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMax16.copia(item_array17);
    fPHeapMax13.copia(item_array17);
    fPHeapMax8.copia(item_array17);
    fPHeapMax1.copia(item_array17);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item22 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test220"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    fPHeapMax3.constroi();
    fPHeapMax3.constroi();
    fPHeapMax3.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((-1));
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax10.copia(item_array11);
    fPHeapMax8.copia(item_array11);
    fPHeapMax3.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item17 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test221"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(10);
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((-1));
    fPHeapMax7.constroi();
    fPHeapMax7.constroi();
    fPHeapMax7.imprime();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((-1));
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax12.copia(item_array15);
    fPHeapMax7.copia(item_array15);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax20.constroi();
    fPHeapMax20.imprime();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((-1));
    fPHeapMax24.constroi();
    ds.Item[] item_array26 = new ds.Item[] {  };
    fPHeapMax24.copia(item_array26);
    fPHeapMax20.copia(item_array26);
    fPHeapMax7.copia(item_array26);
    fPHeapMax4.copia(item_array26);
    fPHeapMax1.copia(item_array26);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)10, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test222"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)10, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test223"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)100, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test224"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(10);
    fPHeapMax5.constroi();
    fPHeapMax5.constroi();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    fPHeapMax9.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array11);
    fPHeapMax5.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)0, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test225"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item9 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'a', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test226"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMax1.copia(item_array5);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    fPHeapMax12.constroi();
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array14);
    fPHeapMax8.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)100, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test227"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    fPHeapMax3.constroi();
    fPHeapMax3.constroi();
    fPHeapMax3.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((-1));
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax10.copia(item_array11);
    fPHeapMax8.copia(item_array11);
    fPHeapMax3.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(1, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test228"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array6);
    fPHeapMax3.copia(item_array6);
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.constroi();
    ds.Item item12 = fPHeapMax10.max();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax10.copia(item_array15);
    fPHeapMax3.copia(item_array15);
    fPHeapMax1.copia(item_array15);
    ds.Item item20 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test229"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.refaz((int)(short)10, (int)(short)(-1));
    fPHeapMax1.constroi();
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test230"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    fPHeapMax4.constroi();
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    fPHeapMax4.copia(item_array12);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax17.constroi();
    fPHeapMax17.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    fPHeapMax21.constroi();
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array23);
    fPHeapMax17.copia(item_array23);
    fPHeapMax4.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    ds.Item item28 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test231"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax15.imprime();
    fPHeapMax15.imprime();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((-1));
    fPHeapMax24.constroi();
    fPHeapMax24.constroi();
    fPHeapMax24.imprime();
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    fPHeapMax24.copia(item_array32);
    fPHeapMax15.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax6.copia(item_array32);
    fPHeapMax1.copia(item_array32);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item40 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test232"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item5 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax7.imprime();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax10.copia(item_array11);
    fPHeapMax7.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    ds.Item item15 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test233"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(10);
    fPHeapMax4.imprime();
    ds.Item item6 = fPHeapMax4.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(byte)100, (java.lang.Object)fPHeapMax4);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test234"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array10);
    fPHeapMax7.copia(item_array10);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax7.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(100, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test235"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((-1));
    fPHeapMax14.constroi();
    ds.Item[] item_array16 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array16);
    fPHeapMax1.copia(item_array16);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item19 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test236"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test237"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.constroi();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax11.imprime();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax11.copia(item_array15);
    ds.Item item18 = fPHeapMax11.max();
    ds.Item item19 = fPHeapMax11.max();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(10);
    fPHeapMax21.constroi();
    fPHeapMax21.constroi();
    fPHeapMax21.imprime();
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((-1));
    ds.Item[] item_array29 = new ds.Item[] {  };
    fPHeapMax28.copia(item_array29);
    fPHeapMax26.copia(item_array29);
    fPHeapMax26.imprime();
    ds.Item item33 = fPHeapMax26.max();
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax(10);
    fPHeapMax35.imprime();
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((-1));
    fPHeapMax38.constroi();
    fPHeapMax38.constroi();
    fPHeapMax38.imprime();
    ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((-1));
    ds.Item[] item_array46 = new ds.Item[] {  };
    fPHeapMax45.copia(item_array46);
    fPHeapMax43.copia(item_array46);
    fPHeapMax38.copia(item_array46);
    ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax51.constroi();
    fPHeapMax51.imprime();
    ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((-1));
    fPHeapMax55.constroi();
    ds.Item[] item_array57 = new ds.Item[] {  };
    fPHeapMax55.copia(item_array57);
    fPHeapMax51.copia(item_array57);
    fPHeapMax38.copia(item_array57);
    fPHeapMax35.copia(item_array57);
    ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array66 = new ds.Item[] {  };
    fPHeapMax65.copia(item_array66);
    fPHeapMax63.copia(item_array66);
    ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax(10);
    fPHeapMax70.constroi();
    ds.Item item72 = fPHeapMax70.max();
    ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array75 = new ds.Item[] {  };
    fPHeapMax74.copia(item_array75);
    fPHeapMax70.copia(item_array75);
    fPHeapMax63.copia(item_array75);
    fPHeapMax35.copia(item_array75);
    fPHeapMax26.copia(item_array75);
    fPHeapMax21.copia(item_array75);
    fPHeapMax11.copia(item_array75);
    fPHeapMax1.copia(item_array75);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item84 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array75);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test238"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.refaz(0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)1, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test239"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.refaz((int)(short)1, (int)(byte)1);
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test240"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(0, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test241"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item5 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test242"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)1, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test243"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array5);
    fPHeapMax4.constroi();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    fPHeapMax4.copia(item_array12);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((-1));
    ds.Item[] item_array20 = new ds.Item[] {  };
    fPHeapMax19.copia(item_array20);
    fPHeapMax17.copia(item_array20);
    ds.Item item23 = fPHeapMax17.max();
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array28 = new ds.Item[] {  };
    fPHeapMax27.copia(item_array28);
    fPHeapMax25.copia(item_array28);
    ds.Item[] item_array31 = new ds.Item[] {  };
    fPHeapMax25.copia(item_array31);
    fPHeapMax17.copia(item_array31);
    fPHeapMax4.copia(item_array31);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'#', (java.lang.Object)item_array31);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test244"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item10 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test245"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array15);
    fPHeapMax1.copia(item_array15);
    ds.Item item18 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test246"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.constroi();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    ds.Item item10 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item10);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test247"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax5.constroi();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    fPHeapMax9.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array11);
    fPHeapMax5.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array19 = new ds.Item[] {  };
    fPHeapMax18.copia(item_array19);
    fPHeapMax16.copia(item_array19);
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(10);
    fPHeapMax23.constroi();
    ds.Item item25 = fPHeapMax23.max();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array28 = new ds.Item[] {  };
    fPHeapMax27.copia(item_array28);
    fPHeapMax23.copia(item_array28);
    fPHeapMax16.copia(item_array28);
    fPHeapMax1.copia(item_array28);
    ds.Item item33 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item33);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test248"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax5.constroi();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    fPHeapMax9.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array11);
    fPHeapMax5.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    ds.Item item15 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item15);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test249"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item9 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    fPHeapMax18.constroi();
    ds.Item item20 = fPHeapMax18.max();
    ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax22.copia(item_array23);
    fPHeapMax18.copia(item_array23);
    fPHeapMax11.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'a', (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test250"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.Item item6 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)' ', (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test251"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.refaz((int)(short)10, (-1));
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test252"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.Item item6 = fPHeapMax1.max();
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test253"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    fPHeapMax13.constroi();
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    fPHeapMax13.copia(item_array21);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax26.constroi();
    fPHeapMax26.imprime();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
    fPHeapMax30.constroi();
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array32);
    fPHeapMax26.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax10.copia(item_array32);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax38.copia(item_array41);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    fPHeapMax45.constroi();
    ds.Item item47 = fPHeapMax45.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array50);
    fPHeapMax45.copia(item_array50);
    fPHeapMax38.copia(item_array50);
    fPHeapMax10.copia(item_array50);
    fPHeapMax1.copia(item_array50);
    ds.Item item56 = fPHeapMax1.max();
    ds.Item item57 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item57);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item56);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test254"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item5 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test255"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)10, (java.lang.Object)item_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test256"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMax1.copia(item_array5);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    fPHeapMax12.constroi();
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array14);
    fPHeapMax8.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'a', (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test257"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    fPHeapMax13.constroi();
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    fPHeapMax13.copia(item_array21);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax26.constroi();
    fPHeapMax26.imprime();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
    fPHeapMax30.constroi();
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array32);
    fPHeapMax26.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax10.copia(item_array32);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax38.copia(item_array41);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    fPHeapMax45.constroi();
    ds.Item item47 = fPHeapMax45.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array50);
    fPHeapMax45.copia(item_array50);
    fPHeapMax38.copia(item_array50);
    fPHeapMax10.copia(item_array50);
    fPHeapMax1.copia(item_array50);
    ds.Item item56 = fPHeapMax1.max();
    ds.Item item57 = fPHeapMax1.max();
    ds.Item item58 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item59 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item58);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test258"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array5);
    fPHeapMax1.copia(item_array5);
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test259"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax21.imprime();
    fPHeapMax21.constroi();
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax25.constroi();
    fPHeapMax25.imprime();
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((-1));
    fPHeapMax29.constroi();
    ds.Item[] item_array31 = new ds.Item[] {  };
    fPHeapMax29.copia(item_array31);
    fPHeapMax25.copia(item_array31);
    fPHeapMax21.copia(item_array31);
    fPHeapMax1.copia(item_array31);
    fPHeapMax1.imprime();
    ds.Item item37 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item37);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test260"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item5 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test261"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item6 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test262"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax15.imprime();
    ds.Item item22 = fPHeapMax15.max();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(10);
    fPHeapMax24.imprime();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((-1));
    fPHeapMax27.constroi();
    fPHeapMax27.constroi();
    fPHeapMax27.imprime();
    ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((-1));
    ds.Item[] item_array35 = new ds.Item[] {  };
    fPHeapMax34.copia(item_array35);
    fPHeapMax32.copia(item_array35);
    fPHeapMax27.copia(item_array35);
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax40.constroi();
    fPHeapMax40.imprime();
    ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((-1));
    fPHeapMax44.constroi();
    ds.Item[] item_array46 = new ds.Item[] {  };
    fPHeapMax44.copia(item_array46);
    fPHeapMax40.copia(item_array46);
    fPHeapMax27.copia(item_array46);
    fPHeapMax24.copia(item_array46);
    ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array55 = new ds.Item[] {  };
    fPHeapMax54.copia(item_array55);
    fPHeapMax52.copia(item_array55);
    ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax(10);
    fPHeapMax59.constroi();
    ds.Item item61 = fPHeapMax59.max();
    ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array64 = new ds.Item[] {  };
    fPHeapMax63.copia(item_array64);
    fPHeapMax59.copia(item_array64);
    fPHeapMax52.copia(item_array64);
    fPHeapMax24.copia(item_array64);
    fPHeapMax15.copia(item_array64);
    fPHeapMax1.copia(item_array64);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(10, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array64);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test263"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax6.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array10);
    fPHeapMax6.copia(item_array10);
    fPHeapMax1.copia(item_array10);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test264"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.constroi();
    ds.Item item8 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    fPHeapMax11.imprime();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((-1));
    fPHeapMax14.constroi();
    fPHeapMax14.constroi();
    fPHeapMax14.imprime();
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    ds.Item[] item_array22 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array22);
    fPHeapMax19.copia(item_array22);
    fPHeapMax14.copia(item_array22);
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax27.constroi();
    fPHeapMax27.imprime();
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    fPHeapMax31.constroi();
    ds.Item[] item_array33 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array33);
    fPHeapMax27.copia(item_array33);
    fPHeapMax14.copia(item_array33);
    fPHeapMax11.copia(item_array33);
    ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array42 = new ds.Item[] {  };
    fPHeapMax41.copia(item_array42);
    fPHeapMax39.copia(item_array42);
    ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax(10);
    fPHeapMax46.constroi();
    ds.Item item48 = fPHeapMax46.max();
    ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array51 = new ds.Item[] {  };
    fPHeapMax50.copia(item_array51);
    fPHeapMax46.copia(item_array51);
    fPHeapMax39.copia(item_array51);
    fPHeapMax11.copia(item_array51);
    ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int)(short)1);
    ds.Item item58 = fPHeapMax57.max();
    ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((-1));
    ds.Item[] item_array61 = new ds.Item[] {  };
    fPHeapMax60.copia(item_array61);
    fPHeapMax57.copia(item_array61);
    fPHeapMax11.copia(item_array61);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)(-1), (java.lang.Object)fPHeapMax11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array61);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test265"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
    fPHeapMax6.constroi();
    fPHeapMax6.constroi();
    fPHeapMax6.imprime();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax4.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)100, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test266"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item5 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((-1));
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMax16.copia(item_array17);
    fPHeapMax14.copia(item_array17);
    fPHeapMax14.imprime();
    fPHeapMax14.imprime();
    fPHeapMax14.imprime();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int)(short)1);
    ds.Item item25 = fPHeapMax24.max();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array30 = new ds.Item[] {  };
    fPHeapMax29.copia(item_array30);
    fPHeapMax27.copia(item_array30);
    ds.Item[] item_array33 = new ds.Item[] {  };
    fPHeapMax27.copia(item_array33);
    fPHeapMax24.copia(item_array33);
    fPHeapMax14.copia(item_array33);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave(100, (java.lang.Object)item_array33);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test267"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test268"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.Item item11 = fPHeapMax1.max();
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test269"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    fPHeapMax8.constroi();
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array10);
    fPHeapMax4.copia(item_array10);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave(100, (java.lang.Object)fPHeapMax4);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test270"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item12 = fPHeapMax1.max();
    ds.Item item13 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test271"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax15.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    ds.Item item24 = fPHeapMax18.max();
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array29 = new ds.Item[] {  };
    fPHeapMax28.copia(item_array29);
    fPHeapMax26.copia(item_array29);
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax26.copia(item_array32);
    fPHeapMax18.copia(item_array32);
    fPHeapMax15.copia(item_array32);
    fPHeapMax1.copia(item_array32);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item37 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test272"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.constroi();
    fPHeapMax10.constroi();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((-1));
    fPHeapMax14.constroi();
    ds.Item[] item_array16 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array16);
    fPHeapMax10.copia(item_array16);
    fPHeapMax6.copia(item_array16);
    fPHeapMax1.copia(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test273"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item6 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test274"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax15.imprime();
    fPHeapMax15.imprime();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((-1));
    fPHeapMax24.constroi();
    fPHeapMax24.constroi();
    fPHeapMax24.imprime();
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    fPHeapMax24.copia(item_array32);
    fPHeapMax15.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax6.copia(item_array32);
    fPHeapMax1.copia(item_array32);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item42 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item42);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test275"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    fPHeapMax13.constroi();
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    fPHeapMax13.copia(item_array21);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax26.constroi();
    fPHeapMax26.imprime();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
    fPHeapMax30.constroi();
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array32);
    fPHeapMax26.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax10.copia(item_array32);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax38.copia(item_array41);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    fPHeapMax45.constroi();
    ds.Item item47 = fPHeapMax45.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array50);
    fPHeapMax45.copia(item_array50);
    fPHeapMax38.copia(item_array50);
    fPHeapMax10.copia(item_array50);
    fPHeapMax1.copia(item_array50);
    ds.Item item56 = fPHeapMax1.max();
    ds.Item item57 = fPHeapMax1.max();
    ds.Item item58 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int)(byte)(-1));
    fPHeapMax61.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'4', (java.lang.Object)fPHeapMax61);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item58);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test276"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.refaz(1, 0);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(100, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test277"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    ds.Item item15 = fPHeapMax9.max();
    fPHeapMax9.constroi();
    fPHeapMax9.refaz((int)(short)10, (-1));
    fPHeapMax9.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'a', (java.lang.Object)fPHeapMax9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test278"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item5 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'a', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test279"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    fPHeapMax3.constroi();
    fPHeapMax3.constroi();
    fPHeapMax3.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((-1));
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax10.copia(item_array11);
    fPHeapMax8.copia(item_array11);
    fPHeapMax3.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    java.lang.Object obj17 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)0, obj17);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test280"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)(-1));
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(byte)100, (java.lang.Object)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test281"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    fPHeapMax8.constroi();
    ds.Item item10 = fPHeapMax8.max();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax8.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item19 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test282"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.refaz((int)(short)10, (-1));
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)(-1), (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test283"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item7 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test284"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array6);
    fPHeapMax3.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item10 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test285"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item22 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test286"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    fPHeapMax13.constroi();
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    fPHeapMax13.copia(item_array21);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax26.constroi();
    fPHeapMax26.imprime();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
    fPHeapMax30.constroi();
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array32);
    fPHeapMax26.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax10.copia(item_array32);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax38.copia(item_array41);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    fPHeapMax45.constroi();
    ds.Item item47 = fPHeapMax45.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array50);
    fPHeapMax45.copia(item_array50);
    fPHeapMax38.copia(item_array50);
    fPHeapMax10.copia(item_array50);
    fPHeapMax1.copia(item_array50);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item56 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test287"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item5 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item6 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test288"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array5);
    fPHeapMax1.copia(item_array5);
    ds.Item item8 = fPHeapMax1.max();
    ds.Item item9 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    fPHeapMax11.constroi();
    fPHeapMax11.constroi();
    fPHeapMax11.imprime();
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((-1));
    ds.Item[] item_array19 = new ds.Item[] {  };
    fPHeapMax18.copia(item_array19);
    fPHeapMax16.copia(item_array19);
    fPHeapMax16.imprime();
    ds.Item item23 = fPHeapMax16.max();
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(10);
    fPHeapMax25.imprime();
    ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((-1));
    fPHeapMax28.constroi();
    fPHeapMax28.constroi();
    fPHeapMax28.imprime();
    ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((-1));
    ds.Item[] item_array36 = new ds.Item[] {  };
    fPHeapMax35.copia(item_array36);
    fPHeapMax33.copia(item_array36);
    fPHeapMax28.copia(item_array36);
    ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax41.constroi();
    fPHeapMax41.imprime();
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((-1));
    fPHeapMax45.constroi();
    ds.Item[] item_array47 = new ds.Item[] {  };
    fPHeapMax45.copia(item_array47);
    fPHeapMax41.copia(item_array47);
    fPHeapMax28.copia(item_array47);
    fPHeapMax25.copia(item_array47);
    ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array56 = new ds.Item[] {  };
    fPHeapMax55.copia(item_array56);
    fPHeapMax53.copia(item_array56);
    ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax(10);
    fPHeapMax60.constroi();
    ds.Item item62 = fPHeapMax60.max();
    ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array65 = new ds.Item[] {  };
    fPHeapMax64.copia(item_array65);
    fPHeapMax60.copia(item_array65);
    fPHeapMax53.copia(item_array65);
    fPHeapMax25.copia(item_array65);
    fPHeapMax16.copia(item_array65);
    fPHeapMax11.copia(item_array65);
    fPHeapMax1.copia(item_array65);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item73 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array65);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test289"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)100);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test290"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax3.constroi();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((-1));
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax10.copia(item_array11);
    fPHeapMax8.copia(item_array11);
    fPHeapMax3.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)100, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test291"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax3.constroi();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((-1));
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax10.copia(item_array11);
    fPHeapMax8.copia(item_array11);
    fPHeapMax3.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item16 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test292"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax5.constroi();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    fPHeapMax9.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array11);
    fPHeapMax5.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array19 = new ds.Item[] {  };
    fPHeapMax18.copia(item_array19);
    fPHeapMax16.copia(item_array19);
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(10);
    fPHeapMax23.constroi();
    ds.Item item25 = fPHeapMax23.max();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array28 = new ds.Item[] {  };
    fPHeapMax27.copia(item_array28);
    fPHeapMax23.copia(item_array28);
    fPHeapMax16.copia(item_array28);
    fPHeapMax1.copia(item_array28);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)(-1), (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test293"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)10, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test294"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test295"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.refaz(0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item8 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test296"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)100, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test297"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(100, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test298"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax15.imprime();
    fPHeapMax15.imprime();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((-1));
    fPHeapMax24.constroi();
    fPHeapMax24.constroi();
    fPHeapMax24.imprime();
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    fPHeapMax24.copia(item_array32);
    fPHeapMax15.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax6.copia(item_array32);
    fPHeapMax1.copia(item_array32);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item42 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test299"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item21 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test300"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)100, (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test301"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax5.constroi();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    fPHeapMax9.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array11);
    fPHeapMax5.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array19 = new ds.Item[] {  };
    fPHeapMax18.copia(item_array19);
    fPHeapMax16.copia(item_array19);
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(10);
    fPHeapMax23.constroi();
    ds.Item item25 = fPHeapMax23.max();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array28 = new ds.Item[] {  };
    fPHeapMax27.copia(item_array28);
    fPHeapMax23.copia(item_array28);
    fPHeapMax16.copia(item_array28);
    fPHeapMax1.copia(item_array28);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item34 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test302"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array6);
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    fPHeapMax9.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array11);
    fPHeapMax5.copia(item_array11);
    fPHeapMax5.constroi();
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((-1));
    fPHeapMax16.constroi();
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(10);
    fPHeapMax19.constroi();
    ds.Item item21 = fPHeapMax19.max();
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array24 = new ds.Item[] {  };
    fPHeapMax23.copia(item_array24);
    fPHeapMax19.copia(item_array24);
    fPHeapMax16.copia(item_array24);
    fPHeapMax5.copia(item_array24);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'4', (java.lang.Object)fPHeapMax5);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test303"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.refaz((int)(short)1, (int)(byte)1);
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test304"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(10);
    fPHeapMax5.constroi();
    ds.Item item7 = fPHeapMax5.max();
    fPHeapMax5.constroi();
    ds.Item item9 = fPHeapMax5.max();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax5.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item17 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test305"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item7 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test306"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test307"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax5.constroi();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    fPHeapMax9.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array11);
    fPHeapMax5.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item17 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test308"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)(-1), (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test309"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    fPHeapMax8.constroi();
    ds.Item item10 = fPHeapMax8.max();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax8.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)1, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test310"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)(short)1);
    ds.Item item8 = fPHeapMax7.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax10.copia(item_array13);
    ds.Item[] item_array16 = new ds.Item[] {  };
    fPHeapMax10.copia(item_array16);
    fPHeapMax7.copia(item_array16);
    ds.Item item19 = fPHeapMax7.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'#', (java.lang.Object)fPHeapMax7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test311"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array5);
    fPHeapMax1.copia(item_array5);
    ds.Item item8 = fPHeapMax1.max();
    ds.Item item9 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(10);
    fPHeapMax20.constroi();
    fPHeapMax20.imprime();
    fPHeapMax20.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'#', (java.lang.Object)fPHeapMax20);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test312"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item23 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test313"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)(-1));
    ds.Item item2 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test314"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    fPHeapMax4.constroi();
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    fPHeapMax4.copia(item_array12);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax17.constroi();
    fPHeapMax17.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    fPHeapMax21.constroi();
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array23);
    fPHeapMax17.copia(item_array23);
    fPHeapMax4.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(10);
    fPHeapMax36.constroi();
    ds.Item item38 = fPHeapMax36.max();
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax36.copia(item_array41);
    fPHeapMax29.copia(item_array41);
    fPHeapMax1.copia(item_array41);
    ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int)(short)1);
    ds.Item item49 = fPHeapMax48.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)1, (java.lang.Object)item49);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item49);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test315"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.constroi();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax11.constroi();
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((-1));
    ds.Item[] item_array19 = new ds.Item[] {  };
    fPHeapMax18.copia(item_array19);
    fPHeapMax16.copia(item_array19);
    fPHeapMax11.copia(item_array19);
    fPHeapMax1.copia(item_array19);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item24 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test316"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    ds.Item item9 = fPHeapMax1.max();
    ds.Item item10 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test317"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.constroi();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(10);
    fPHeapMax13.constroi();
    ds.Item item15 = fPHeapMax13.max();
    fPHeapMax13.constroi();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(0);
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((-1));
    ds.Item[] item_array30 = new ds.Item[] {  };
    fPHeapMax29.copia(item_array30);
    fPHeapMax27.copia(item_array30);
    fPHeapMax27.imprime();
    fPHeapMax27.imprime();
    ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((-1));
    fPHeapMax36.constroi();
    fPHeapMax36.constroi();
    fPHeapMax36.imprime();
    ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((-1));
    ds.Item[] item_array44 = new ds.Item[] {  };
    fPHeapMax43.copia(item_array44);
    fPHeapMax41.copia(item_array44);
    fPHeapMax36.copia(item_array44);
    fPHeapMax27.copia(item_array44);
    fPHeapMax25.copia(item_array44);
    fPHeapMax18.copia(item_array44);
    fPHeapMax13.copia(item_array44);
    fPHeapMax13.constroi();
    fPHeapMax13.constroi();
    ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax55.imprime();
    ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((-1));
    ds.Item[] item_array61 = new ds.Item[] {  };
    fPHeapMax60.copia(item_array61);
    fPHeapMax58.copia(item_array61);
    ds.Item item64 = fPHeapMax58.max();
    ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array69 = new ds.Item[] {  };
    fPHeapMax68.copia(item_array69);
    fPHeapMax66.copia(item_array69);
    ds.Item[] item_array72 = new ds.Item[] {  };
    fPHeapMax66.copia(item_array72);
    fPHeapMax58.copia(item_array72);
    fPHeapMax55.copia(item_array72);
    fPHeapMax13.copia(item_array72);
    fPHeapMax1.copia(item_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array72);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test318"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax10.copia(item_array13);
    fPHeapMax10.imprime();
    ds.Item item17 = fPHeapMax10.max();
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(10);
    fPHeapMax19.imprime();
    ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((-1));
    fPHeapMax22.constroi();
    fPHeapMax22.constroi();
    fPHeapMax22.imprime();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((-1));
    ds.Item[] item_array30 = new ds.Item[] {  };
    fPHeapMax29.copia(item_array30);
    fPHeapMax27.copia(item_array30);
    fPHeapMax22.copia(item_array30);
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax35.constroi();
    fPHeapMax35.imprime();
    ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((-1));
    fPHeapMax39.constroi();
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax39.copia(item_array41);
    fPHeapMax35.copia(item_array41);
    fPHeapMax22.copia(item_array41);
    fPHeapMax19.copia(item_array41);
    ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array50);
    fPHeapMax47.copia(item_array50);
    ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax(10);
    fPHeapMax54.constroi();
    ds.Item item56 = fPHeapMax54.max();
    ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array59 = new ds.Item[] {  };
    fPHeapMax58.copia(item_array59);
    fPHeapMax54.copia(item_array59);
    fPHeapMax47.copia(item_array59);
    fPHeapMax19.copia(item_array59);
    fPHeapMax10.copia(item_array59);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'a', (java.lang.Object)item_array59);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array59);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test319"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.constroi();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    fPHeapMax11.constroi();
    ds.Item item13 = fPHeapMax11.max();
    fPHeapMax11.constroi();
    ds.Item item15 = fPHeapMax11.max();
    fPHeapMax11.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((-1));
    fPHeapMax18.constroi();
    ds.Item[] item_array20 = new ds.Item[] {  };
    fPHeapMax18.copia(item_array20);
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax23.imprime();
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array27 = new ds.Item[] {  };
    fPHeapMax26.copia(item_array27);
    fPHeapMax23.copia(item_array27);
    fPHeapMax18.copia(item_array27);
    fPHeapMax11.copia(item_array27);
    fPHeapMax1.copia(item_array27);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item33 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test320"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(1, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test321"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax6.imprime();
    ds.Item item13 = fPHeapMax6.max();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    fPHeapMax15.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((-1));
    fPHeapMax18.constroi();
    fPHeapMax18.constroi();
    fPHeapMax18.imprime();
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((-1));
    ds.Item[] item_array26 = new ds.Item[] {  };
    fPHeapMax25.copia(item_array26);
    fPHeapMax23.copia(item_array26);
    fPHeapMax18.copia(item_array26);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax31.constroi();
    fPHeapMax31.imprime();
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((-1));
    fPHeapMax35.constroi();
    ds.Item[] item_array37 = new ds.Item[] {  };
    fPHeapMax35.copia(item_array37);
    fPHeapMax31.copia(item_array37);
    fPHeapMax18.copia(item_array37);
    fPHeapMax15.copia(item_array37);
    ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array46 = new ds.Item[] {  };
    fPHeapMax45.copia(item_array46);
    fPHeapMax43.copia(item_array46);
    ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax(10);
    fPHeapMax50.constroi();
    ds.Item item52 = fPHeapMax50.max();
    ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array55 = new ds.Item[] {  };
    fPHeapMax54.copia(item_array55);
    fPHeapMax50.copia(item_array55);
    fPHeapMax43.copia(item_array55);
    fPHeapMax15.copia(item_array55);
    fPHeapMax6.copia(item_array55);
    ds.Item item61 = fPHeapMax6.max();
    fPHeapMax6.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'a', (java.lang.Object)fPHeapMax6);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item61);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test322"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    fPHeapMax3.constroi();
    fPHeapMax3.constroi();
    fPHeapMax3.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((-1));
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax10.copia(item_array11);
    fPHeapMax8.copia(item_array11);
    fPHeapMax3.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item18 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test323"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item5 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item9 = fPHeapMax1.max();
    ds.Item item10 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)(-1), 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test324"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax4.copia(item_array7);
    ds.Item item10 = fPHeapMax4.max();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax12.copia(item_array15);
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array18);
    fPHeapMax4.copia(item_array18);
    fPHeapMax1.copia(item_array18);
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax23.imprime();
    fPHeapMax23.constroi();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax27.constroi();
    fPHeapMax27.imprime();
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    fPHeapMax31.constroi();
    ds.Item[] item_array33 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array33);
    fPHeapMax27.copia(item_array33);
    fPHeapMax23.copia(item_array33);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax38.copia(item_array41);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    fPHeapMax45.constroi();
    ds.Item item47 = fPHeapMax45.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array50);
    fPHeapMax45.copia(item_array50);
    fPHeapMax38.copia(item_array50);
    fPHeapMax23.copia(item_array50);
    fPHeapMax1.copia(item_array50);
    ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((-1));
    fPHeapMax57.constroi();
    ds.Item[] item_array59 = new ds.Item[] {  };
    fPHeapMax57.copia(item_array59);
    ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax62.imprime();
    ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array66 = new ds.Item[] {  };
    fPHeapMax65.copia(item_array66);
    fPHeapMax62.copia(item_array66);
    fPHeapMax57.copia(item_array66);
    fPHeapMax1.copia(item_array66);
    ds.FPHeapMax fPHeapMax73 = new ds.FPHeapMax((int)(short)1);
    ds.Item item74 = fPHeapMax73.max();
    ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((-1));
    ds.Item[] item_array77 = new ds.Item[] {  };
    fPHeapMax76.copia(item_array77);
    fPHeapMax73.copia(item_array77);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((-1), (java.lang.Object)fPHeapMax73);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array77);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test325"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item9 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    fPHeapMax18.constroi();
    ds.Item item20 = fPHeapMax18.max();
    ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax22.copia(item_array23);
    fPHeapMax18.copia(item_array23);
    fPHeapMax11.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)(-1), (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test326"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax15.imprime();
    ds.Item item22 = fPHeapMax15.max();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(10);
    fPHeapMax24.imprime();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((-1));
    fPHeapMax27.constroi();
    fPHeapMax27.constroi();
    fPHeapMax27.imprime();
    ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((-1));
    ds.Item[] item_array35 = new ds.Item[] {  };
    fPHeapMax34.copia(item_array35);
    fPHeapMax32.copia(item_array35);
    fPHeapMax27.copia(item_array35);
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax40.constroi();
    fPHeapMax40.imprime();
    ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((-1));
    fPHeapMax44.constroi();
    ds.Item[] item_array46 = new ds.Item[] {  };
    fPHeapMax44.copia(item_array46);
    fPHeapMax40.copia(item_array46);
    fPHeapMax27.copia(item_array46);
    fPHeapMax24.copia(item_array46);
    ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array55 = new ds.Item[] {  };
    fPHeapMax54.copia(item_array55);
    fPHeapMax52.copia(item_array55);
    ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax(10);
    fPHeapMax59.constroi();
    ds.Item item61 = fPHeapMax59.max();
    ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array64 = new ds.Item[] {  };
    fPHeapMax63.copia(item_array64);
    fPHeapMax59.copia(item_array64);
    fPHeapMax52.copia(item_array64);
    fPHeapMax24.copia(item_array64);
    fPHeapMax15.copia(item_array64);
    fPHeapMax1.copia(item_array64);
    ds.Item item71 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item71);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array64);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test327"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(10);
    fPHeapMax13.constroi();
    fPHeapMax13.constroi();
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    fPHeapMax17.constroi();
    ds.Item[] item_array19 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array19);
    fPHeapMax13.copia(item_array19);
    fPHeapMax9.copia(item_array19);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave(100, (java.lang.Object)fPHeapMax9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test328"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array6);
    fPHeapMax3.copia(item_array6);
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.constroi();
    ds.Item item12 = fPHeapMax10.max();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax10.copia(item_array15);
    fPHeapMax3.copia(item_array15);
    fPHeapMax1.copia(item_array15);
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int)'#');
    fPHeapMax21.refaz((int)(short)10, (int)(short)(-1));
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((-1));
    ds.Item[] item_array29 = new ds.Item[] {  };
    fPHeapMax28.copia(item_array29);
    fPHeapMax26.copia(item_array29);
    fPHeapMax26.imprime();
    ds.Item item33 = fPHeapMax26.max();
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax(10);
    fPHeapMax35.imprime();
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((-1));
    fPHeapMax38.constroi();
    fPHeapMax38.constroi();
    fPHeapMax38.imprime();
    ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((-1));
    ds.Item[] item_array46 = new ds.Item[] {  };
    fPHeapMax45.copia(item_array46);
    fPHeapMax43.copia(item_array46);
    fPHeapMax38.copia(item_array46);
    ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax51.constroi();
    fPHeapMax51.imprime();
    ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((-1));
    fPHeapMax55.constroi();
    ds.Item[] item_array57 = new ds.Item[] {  };
    fPHeapMax55.copia(item_array57);
    fPHeapMax51.copia(item_array57);
    fPHeapMax38.copia(item_array57);
    fPHeapMax35.copia(item_array57);
    ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array66 = new ds.Item[] {  };
    fPHeapMax65.copia(item_array66);
    fPHeapMax63.copia(item_array66);
    ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax(10);
    fPHeapMax70.constroi();
    ds.Item item72 = fPHeapMax70.max();
    ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array75 = new ds.Item[] {  };
    fPHeapMax74.copia(item_array75);
    fPHeapMax70.copia(item_array75);
    fPHeapMax63.copia(item_array75);
    fPHeapMax35.copia(item_array75);
    fPHeapMax26.copia(item_array75);
    fPHeapMax21.copia(item_array75);
    fPHeapMax1.copia(item_array75);
    ds.Item item83 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item83);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array75);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test329"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item3 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test330"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item7 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test331"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array6);
    fPHeapMax3.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item10 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test332"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    fPHeapMax1.imprime();
    ds.Item item14 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test333"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.refaz((int)(short)1, (int)(byte)1);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)'#');
    fPHeapMax8.refaz((int)(short)10, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)100, (java.lang.Object)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test334"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(100, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test335"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item9 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test336"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.constroi();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item12 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test337"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(10);
    fPHeapMax5.constroi();
    ds.Item item7 = fPHeapMax5.max();
    fPHeapMax5.constroi();
    ds.Item item9 = fPHeapMax5.max();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax5.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    ds.Item item17 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(100, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test338"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((-1));
    fPHeapMax10.constroi();
    fPHeapMax10.constroi();
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax10.copia(item_array18);
    fPHeapMax1.copia(item_array18);
    ds.Item item23 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test339"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.constroi();
    ds.Item item8 = fPHeapMax1.max();
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test340"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.constroi();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    fPHeapMax12.constroi();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    fPHeapMax15.constroi();
    ds.Item item17 = fPHeapMax15.max();
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array20 = new ds.Item[] {  };
    fPHeapMax19.copia(item_array20);
    fPHeapMax15.copia(item_array20);
    fPHeapMax12.copia(item_array20);
    fPHeapMax1.copia(item_array20);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)100, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test341"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax4.copia(item_array7);
    ds.Item item10 = fPHeapMax4.max();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax12.copia(item_array15);
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array18);
    fPHeapMax4.copia(item_array18);
    fPHeapMax1.copia(item_array18);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item23 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test342"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array7);
    fPHeapMax1.constroi();
    ds.Item item10 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test343"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)0, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test344"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    fPHeapMax4.constroi();
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    fPHeapMax4.copia(item_array12);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax17.constroi();
    fPHeapMax17.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    fPHeapMax21.constroi();
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array23);
    fPHeapMax17.copia(item_array23);
    fPHeapMax4.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    fPHeapMax1.copia(item_array32);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item36 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test345"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item2 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test346"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    fPHeapMax8.constroi();
    ds.Item item10 = fPHeapMax8.max();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax8.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(10);
    fPHeapMax20.constroi();
    ds.Item item22 = fPHeapMax20.max();
    fPHeapMax20.constroi();
    ds.Item item24 = fPHeapMax20.max();
    fPHeapMax20.imprime();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((-1));
    fPHeapMax27.constroi();
    ds.Item[] item_array29 = new ds.Item[] {  };
    fPHeapMax27.copia(item_array29);
    ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax32.imprime();
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array36 = new ds.Item[] {  };
    fPHeapMax35.copia(item_array36);
    fPHeapMax32.copia(item_array36);
    fPHeapMax27.copia(item_array36);
    fPHeapMax20.copia(item_array36);
    fPHeapMax1.copia(item_array36);
    ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax(10);
    fPHeapMax44.constroi();
    fPHeapMax44.constroi();
    fPHeapMax44.imprime();
    fPHeapMax44.constroi();
    fPHeapMax44.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)1, (java.lang.Object)fPHeapMax44);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array36);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test347"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave(100, (java.lang.Object)1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test348"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test349"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.constroi();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item11 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test350"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.refaz((int)(byte)0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'4', (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test351"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item9 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    fPHeapMax18.constroi();
    ds.Item item20 = fPHeapMax18.max();
    ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax22.copia(item_array23);
    fPHeapMax18.copia(item_array23);
    fPHeapMax11.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item28 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test352"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(100);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(byte)10, (java.lang.Object)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test353"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item14 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test354"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array6);
    fPHeapMax3.copia(item_array6);
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.constroi();
    ds.Item item12 = fPHeapMax10.max();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax10.copia(item_array15);
    fPHeapMax3.copia(item_array15);
    fPHeapMax1.copia(item_array15);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(0, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test355"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.constroi();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'4', (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test356"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax4.copia(item_array7);
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array10);
    fPHeapMax1.copia(item_array10);
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((-1));
    fPHeapMax15.constroi();
    fPHeapMax15.imprime();
    fPHeapMax15.imprime();
    fPHeapMax15.imprime();
    fPHeapMax15.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((-1), (java.lang.Object)fPHeapMax15);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test357"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test358"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax6.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array10);
    fPHeapMax6.copia(item_array10);
    fPHeapMax1.copia(item_array10);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test359"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax21.imprime();
    fPHeapMax21.constroi();
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax25.constroi();
    fPHeapMax25.imprime();
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((-1));
    fPHeapMax29.constroi();
    ds.Item[] item_array31 = new ds.Item[] {  };
    fPHeapMax29.copia(item_array31);
    fPHeapMax25.copia(item_array31);
    fPHeapMax21.copia(item_array31);
    fPHeapMax1.copia(item_array31);
    ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((-1));
    ds.Item[] item_array40 = new ds.Item[] {  };
    fPHeapMax39.copia(item_array40);
    fPHeapMax37.copia(item_array40);
    ds.Item item43 = fPHeapMax37.max();
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array48 = new ds.Item[] {  };
    fPHeapMax47.copia(item_array48);
    fPHeapMax45.copia(item_array48);
    ds.Item[] item_array51 = new ds.Item[] {  };
    fPHeapMax45.copia(item_array51);
    fPHeapMax37.copia(item_array51);
    fPHeapMax1.copia(item_array51);
    ds.Item item55 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item55);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test360"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(10, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test361"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(10);
    fPHeapMax5.constroi();
    fPHeapMax5.constroi();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    fPHeapMax9.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array11);
    fPHeapMax5.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    ds.Item item15 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item15);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test362"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item14 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test363"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    fPHeapMax6.constroi();
    fPHeapMax6.constroi();
    fPHeapMax6.imprime();
    ds.Item item10 = fPHeapMax6.max();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax12.imprime();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array16 = new ds.Item[] {  };
    fPHeapMax15.copia(item_array16);
    fPHeapMax12.copia(item_array16);
    fPHeapMax6.copia(item_array16);
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((-1));
    ds.Item[] item_array24 = new ds.Item[] {  };
    fPHeapMax23.copia(item_array24);
    fPHeapMax21.copia(item_array24);
    ds.Item item27 = fPHeapMax21.max();
    fPHeapMax21.constroi();
    ds.Item item29 = fPHeapMax21.max();
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array34 = new ds.Item[] {  };
    fPHeapMax33.copia(item_array34);
    fPHeapMax31.copia(item_array34);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax(10);
    fPHeapMax38.constroi();
    ds.Item item40 = fPHeapMax38.max();
    ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array43 = new ds.Item[] {  };
    fPHeapMax42.copia(item_array43);
    fPHeapMax38.copia(item_array43);
    fPHeapMax31.copia(item_array43);
    fPHeapMax21.copia(item_array43);
    fPHeapMax6.copia(item_array43);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)' ', (java.lang.Object)fPHeapMax6);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array43);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test364"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item9 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test365"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.refaz(0, (int)(byte)(-1));
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item8);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test366"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item2 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test367"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
    fPHeapMax6.constroi();
    fPHeapMax6.imprime();
    fPHeapMax6.imprime();
    fPHeapMax6.imprime();
    fPHeapMax6.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(byte)0, (java.lang.Object)fPHeapMax6);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test368"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax5.constroi();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    fPHeapMax9.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array11);
    fPHeapMax5.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array19 = new ds.Item[] {  };
    fPHeapMax18.copia(item_array19);
    fPHeapMax16.copia(item_array19);
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(10);
    fPHeapMax23.constroi();
    ds.Item item25 = fPHeapMax23.max();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array28 = new ds.Item[] {  };
    fPHeapMax27.copia(item_array28);
    fPHeapMax23.copia(item_array28);
    fPHeapMax16.copia(item_array28);
    fPHeapMax1.copia(item_array28);
    ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array35 = new ds.Item[] {  };
    fPHeapMax34.copia(item_array35);
    fPHeapMax34.constroi();
    ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((-1));
    ds.Item[] item_array42 = new ds.Item[] {  };
    fPHeapMax41.copia(item_array42);
    fPHeapMax39.copia(item_array42);
    fPHeapMax34.copia(item_array42);
    fPHeapMax1.copia(item_array42);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'a', (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test369"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    fPHeapMax4.constroi();
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    fPHeapMax4.copia(item_array12);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax17.constroi();
    fPHeapMax17.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    fPHeapMax21.constroi();
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array23);
    fPHeapMax17.copia(item_array23);
    fPHeapMax4.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(10);
    fPHeapMax31.constroi();
    fPHeapMax31.constroi();
    fPHeapMax31.imprime();
    fPHeapMax31.constroi();
    fPHeapMax31.imprime();
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax38.constroi();
    fPHeapMax38.imprime();
    ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((-1));
    fPHeapMax42.constroi();
    ds.Item[] item_array44 = new ds.Item[] {  };
    fPHeapMax42.copia(item_array44);
    fPHeapMax38.copia(item_array44);
    fPHeapMax31.copia(item_array44);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'#', (java.lang.Object)fPHeapMax31);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test370"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test371"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array6);
    fPHeapMax3.copia(item_array6);
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.constroi();
    ds.Item item12 = fPHeapMax10.max();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax10.copia(item_array15);
    fPHeapMax3.copia(item_array15);
    fPHeapMax1.copia(item_array15);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test372"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(10);
    fPHeapMax4.constroi();
    ds.Item item6 = fPHeapMax4.max();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax4.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((-1), (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test373"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)(-1), (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test374"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMax1.copia(item_array5);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    fPHeapMax12.constroi();
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array14);
    fPHeapMax8.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    fPHeapMax20.constroi();
    fPHeapMax20.constroi();
    ds.Item item23 = null;
    ds.Item[] item_array24 = new ds.Item[] { item23 };
    fPHeapMax20.copia(item_array24);
    fPHeapMax1.copia(item_array24);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item27 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test375"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(10);
    fPHeapMax5.constroi();
    ds.Item item7 = fPHeapMax5.max();
    fPHeapMax5.constroi();
    ds.Item item9 = fPHeapMax5.max();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax5.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    ds.Item item17 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'#', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test376"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.refaz(1, 0);
    ds.Item item8 = fPHeapMax1.max();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMax1.copia(item_array10);
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test377"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.imprime();
    ds.Item item3 = fPHeapMax1.max();
    ds.Item item4 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(100, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test378"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    fPHeapMax3.constroi();
    fPHeapMax3.constroi();
    fPHeapMax3.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((-1));
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax10.copia(item_array11);
    fPHeapMax8.copia(item_array11);
    fPHeapMax3.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(0, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test379"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item5 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test380"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.refaz((int)(short)10, (int)(short)(-1));
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item6 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test381"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
    fPHeapMax6.constroi();
    fPHeapMax6.constroi();
    fPHeapMax6.imprime();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax4.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item20 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test382"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'a', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test383"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(10);
    fPHeapMax4.constroi();
    ds.Item item6 = fPHeapMax4.max();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax4.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((-1));
    fPHeapMax14.constroi();
    fPHeapMax14.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMax14.copia(item_array18);
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array22 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array22);
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((-1));
    fPHeapMax25.constroi();
    ds.Item[] item_array27 = new ds.Item[] {  };
    fPHeapMax25.copia(item_array27);
    fPHeapMax21.copia(item_array27);
    fPHeapMax14.copia(item_array27);
    fPHeapMax1.copia(item_array27);
    ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array36 = new ds.Item[] {  };
    fPHeapMax35.copia(item_array36);
    fPHeapMax33.copia(item_array36);
    ds.Item[] item_array39 = new ds.Item[] {  };
    fPHeapMax33.copia(item_array39);
    fPHeapMax1.copia(item_array39);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'4', (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array39);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test384"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array5);
    fPHeapMax1.copia(item_array5);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item8 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test385"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.imprime();
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test386"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    fPHeapMax8.constroi();
    ds.Item item10 = fPHeapMax8.max();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax8.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test387"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(10);
    fPHeapMax4.constroi();
    ds.Item item6 = fPHeapMax4.max();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax4.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((-1));
    fPHeapMax14.constroi();
    fPHeapMax14.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMax14.copia(item_array18);
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array22 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array22);
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((-1));
    fPHeapMax25.constroi();
    ds.Item[] item_array27 = new ds.Item[] {  };
    fPHeapMax25.copia(item_array27);
    fPHeapMax21.copia(item_array27);
    fPHeapMax14.copia(item_array27);
    fPHeapMax1.copia(item_array27);
    ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array36 = new ds.Item[] {  };
    fPHeapMax35.copia(item_array36);
    fPHeapMax33.copia(item_array36);
    ds.Item[] item_array39 = new ds.Item[] {  };
    fPHeapMax33.copia(item_array39);
    fPHeapMax1.copia(item_array39);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)100, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array39);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test388"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    ds.Item item9 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item11 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test389"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item6 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test390"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    fPHeapMax4.constroi();
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    fPHeapMax4.copia(item_array12);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax17.constroi();
    fPHeapMax17.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    fPHeapMax21.constroi();
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array23);
    fPHeapMax17.copia(item_array23);
    fPHeapMax4.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(10);
    fPHeapMax36.constroi();
    ds.Item item38 = fPHeapMax36.max();
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax36.copia(item_array41);
    fPHeapMax29.copia(item_array41);
    fPHeapMax1.copia(item_array41);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item46 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test391"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.Item item11 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test392"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(10);
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    fPHeapMax4.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)100, (java.lang.Object)fPHeapMax4);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test393"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax15.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    ds.Item item24 = fPHeapMax18.max();
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array29 = new ds.Item[] {  };
    fPHeapMax28.copia(item_array29);
    fPHeapMax26.copia(item_array29);
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax26.copia(item_array32);
    fPHeapMax18.copia(item_array32);
    fPHeapMax15.copia(item_array32);
    fPHeapMax1.copia(item_array32);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item38 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test394"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item9 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.Item item11 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test395"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test396"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((-1));
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMax16.copia(item_array17);
    fPHeapMax14.copia(item_array17);
    ds.Item item20 = fPHeapMax14.max();
    ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array25 = new ds.Item[] {  };
    fPHeapMax24.copia(item_array25);
    fPHeapMax22.copia(item_array25);
    ds.Item[] item_array28 = new ds.Item[] {  };
    fPHeapMax22.copia(item_array28);
    fPHeapMax14.copia(item_array28);
    fPHeapMax1.copia(item_array28);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item32 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test397"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)100);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)'#');
    fPHeapMax3.constroi();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    fPHeapMax8.constroi();
    fPHeapMax8.constroi();
    fPHeapMax8.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((-1));
    ds.Item[] item_array16 = new ds.Item[] {  };
    fPHeapMax15.copia(item_array16);
    fPHeapMax13.copia(item_array16);
    fPHeapMax8.copia(item_array16);
    fPHeapMax6.copia(item_array16);
    fPHeapMax3.copia(item_array16);
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((-1));
    fPHeapMax23.constroi();
    fPHeapMax23.constroi();
    ds.Item item26 = null;
    ds.Item[] item_array27 = new ds.Item[] { item26 };
    fPHeapMax23.copia(item_array27);
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array31 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array31);
    ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((-1));
    fPHeapMax34.constroi();
    ds.Item[] item_array36 = new ds.Item[] {  };
    fPHeapMax34.copia(item_array36);
    fPHeapMax30.copia(item_array36);
    fPHeapMax23.copia(item_array36);
    fPHeapMax3.copia(item_array36);
    fPHeapMax1.copia(item_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array36);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test398"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(10);
    fPHeapMax5.constroi();
    fPHeapMax5.constroi();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    fPHeapMax9.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array11);
    fPHeapMax5.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item15 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test399"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test400"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)100, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test401"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax15.imprime();
    ds.Item item22 = fPHeapMax15.max();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(10);
    fPHeapMax24.imprime();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((-1));
    fPHeapMax27.constroi();
    fPHeapMax27.constroi();
    fPHeapMax27.imprime();
    ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((-1));
    ds.Item[] item_array35 = new ds.Item[] {  };
    fPHeapMax34.copia(item_array35);
    fPHeapMax32.copia(item_array35);
    fPHeapMax27.copia(item_array35);
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax40.constroi();
    fPHeapMax40.imprime();
    ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((-1));
    fPHeapMax44.constroi();
    ds.Item[] item_array46 = new ds.Item[] {  };
    fPHeapMax44.copia(item_array46);
    fPHeapMax40.copia(item_array46);
    fPHeapMax27.copia(item_array46);
    fPHeapMax24.copia(item_array46);
    ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array55 = new ds.Item[] {  };
    fPHeapMax54.copia(item_array55);
    fPHeapMax52.copia(item_array55);
    ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax(10);
    fPHeapMax59.constroi();
    ds.Item item61 = fPHeapMax59.max();
    ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array64 = new ds.Item[] {  };
    fPHeapMax63.copia(item_array64);
    fPHeapMax59.copia(item_array64);
    fPHeapMax52.copia(item_array64);
    fPHeapMax24.copia(item_array64);
    fPHeapMax15.copia(item_array64);
    fPHeapMax1.copia(item_array64);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)10, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array64);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test402"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(0, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test403"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item5 = fPHeapMax1.max();
    ds.Item item6 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test404"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax6.imprime();
    ds.Item item13 = fPHeapMax6.max();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    fPHeapMax15.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((-1));
    fPHeapMax18.constroi();
    fPHeapMax18.constroi();
    fPHeapMax18.imprime();
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((-1));
    ds.Item[] item_array26 = new ds.Item[] {  };
    fPHeapMax25.copia(item_array26);
    fPHeapMax23.copia(item_array26);
    fPHeapMax18.copia(item_array26);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax31.constroi();
    fPHeapMax31.imprime();
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((-1));
    fPHeapMax35.constroi();
    ds.Item[] item_array37 = new ds.Item[] {  };
    fPHeapMax35.copia(item_array37);
    fPHeapMax31.copia(item_array37);
    fPHeapMax18.copia(item_array37);
    fPHeapMax15.copia(item_array37);
    ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array46 = new ds.Item[] {  };
    fPHeapMax45.copia(item_array46);
    fPHeapMax43.copia(item_array46);
    ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax(10);
    fPHeapMax50.constroi();
    ds.Item item52 = fPHeapMax50.max();
    ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array55 = new ds.Item[] {  };
    fPHeapMax54.copia(item_array55);
    fPHeapMax50.copia(item_array55);
    fPHeapMax43.copia(item_array55);
    fPHeapMax15.copia(item_array55);
    fPHeapMax6.copia(item_array55);
    fPHeapMax1.copia(item_array55);
    ds.Item item62 = fPHeapMax1.max();
    ds.Item item63 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item63);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test405"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)0);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item3 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test406"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item23 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test407"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array6);
    fPHeapMax3.copia(item_array6);
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.constroi();
    ds.Item item12 = fPHeapMax10.max();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax10.copia(item_array15);
    fPHeapMax3.copia(item_array15);
    fPHeapMax1.copia(item_array15);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item20 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test408"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)1, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test409"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array5);
    fPHeapMax1.copia(item_array5);
    ds.Item item8 = fPHeapMax1.max();
    ds.Item item9 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item10 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test410"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.refaz(1, 0);
    ds.Item item8 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((-1));
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax12.constroi();
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(10);
    fPHeapMax17.constroi();
    ds.Item item19 = fPHeapMax17.max();
    fPHeapMax17.constroi();
    ds.Item item21 = fPHeapMax17.max();
    fPHeapMax17.imprime();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((-1));
    fPHeapMax24.constroi();
    ds.Item[] item_array26 = new ds.Item[] {  };
    fPHeapMax24.copia(item_array26);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax29.imprime();
    ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array33 = new ds.Item[] {  };
    fPHeapMax32.copia(item_array33);
    fPHeapMax29.copia(item_array33);
    fPHeapMax24.copia(item_array33);
    fPHeapMax17.copia(item_array33);
    fPHeapMax12.copia(item_array33);
    fPHeapMax10.copia(item_array33);
    fPHeapMax1.copia(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test411"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item5 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.Item item7 = fPHeapMax1.max();
    ds.Item item8 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax10.copia(item_array13);
    fPHeapMax10.imprime();
    fPHeapMax10.imprime();
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int)(short)1);
    ds.Item item21 = fPHeapMax20.max();
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array26 = new ds.Item[] {  };
    fPHeapMax25.copia(item_array26);
    fPHeapMax23.copia(item_array26);
    ds.Item[] item_array29 = new ds.Item[] {  };
    fPHeapMax23.copia(item_array29);
    fPHeapMax20.copia(item_array29);
    fPHeapMax10.copia(item_array29);
    fPHeapMax1.copia(item_array29);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item34 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test412"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item2 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test413"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((-1));
    fPHeapMax10.constroi();
    fPHeapMax10.constroi();
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax10.copia(item_array18);
    fPHeapMax1.copia(item_array18);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item23 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test414"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax4.copia(item_array7);
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array10);
    fPHeapMax1.copia(item_array10);
    ds.Item item13 = fPHeapMax1.max();
    ds.Item item14 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test415"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item5 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test416"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.refaz((int)(short)10, (int)(short)(-1));
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((-1));
    ds.Item[] item_array8 = new ds.Item[] {  };
    fPHeapMax7.copia(item_array8);
    fPHeapMax1.copia(item_array8);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item11 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test417"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test418"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array5);
    fPHeapMax1.copia(item_array5);
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test419"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    fPHeapMax4.constroi();
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    fPHeapMax4.copia(item_array12);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax17.constroi();
    fPHeapMax17.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    fPHeapMax21.constroi();
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array23);
    fPHeapMax17.copia(item_array23);
    fPHeapMax4.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(10);
    fPHeapMax36.constroi();
    ds.Item item38 = fPHeapMax36.max();
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax36.copia(item_array41);
    fPHeapMax29.copia(item_array41);
    fPHeapMax1.copia(item_array41);
    ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int)(short)1);
    ds.Item item48 = fPHeapMax47.max();
    ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((-1));
    ds.Item[] item_array51 = new ds.Item[] {  };
    fPHeapMax50.copia(item_array51);
    fPHeapMax47.copia(item_array51);
    fPHeapMax1.copia(item_array51);
    ds.Item item55 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item55);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test420"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test421"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item4 = fPHeapMax1.max();
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test422"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item23 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((-1));
    fPHeapMax27.constroi();
    ds.Item[] item_array29 = new ds.Item[] {  };
    fPHeapMax27.copia(item_array29);
    fPHeapMax27.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(byte)(-1), (java.lang.Object)fPHeapMax27);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test423"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax6.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array10);
    fPHeapMax6.copia(item_array10);
    fPHeapMax1.copia(item_array10);
    fPHeapMax1.constroi();
    ds.Item item15 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test424"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)' ', (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test425"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    fPHeapMax13.constroi();
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    fPHeapMax13.copia(item_array21);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax26.constroi();
    fPHeapMax26.imprime();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
    fPHeapMax30.constroi();
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array32);
    fPHeapMax26.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax10.copia(item_array32);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax38.copia(item_array41);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    fPHeapMax45.constroi();
    ds.Item item47 = fPHeapMax45.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array50);
    fPHeapMax45.copia(item_array50);
    fPHeapMax38.copia(item_array50);
    fPHeapMax10.copia(item_array50);
    fPHeapMax1.copia(item_array50);
    ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((-1));
    fPHeapMax57.constroi();
    fPHeapMax57.constroi();
    ds.Item item60 = null;
    ds.Item[] item_array61 = new ds.Item[] { item60 };
    fPHeapMax57.copia(item_array61);
    ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array65 = new ds.Item[] {  };
    fPHeapMax64.copia(item_array65);
    ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((-1));
    fPHeapMax68.constroi();
    ds.Item[] item_array70 = new ds.Item[] {  };
    fPHeapMax68.copia(item_array70);
    fPHeapMax64.copia(item_array70);
    fPHeapMax57.copia(item_array70);
    fPHeapMax57.imprime();
    ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((-1));
    fPHeapMax76.constroi();
    fPHeapMax76.constroi();
    ds.Item item79 = null;
    ds.Item[] item_array80 = new ds.Item[] { item79 };
    fPHeapMax76.copia(item_array80);
    fPHeapMax57.copia(item_array80);
    fPHeapMax1.copia(item_array80);
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array80);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test426"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    fPHeapMax13.constroi();
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    fPHeapMax13.copia(item_array21);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax26.constroi();
    fPHeapMax26.imprime();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
    fPHeapMax30.constroi();
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array32);
    fPHeapMax26.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax10.copia(item_array32);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax38.copia(item_array41);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    fPHeapMax45.constroi();
    ds.Item item47 = fPHeapMax45.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array50);
    fPHeapMax45.copia(item_array50);
    fPHeapMax38.copia(item_array50);
    fPHeapMax10.copia(item_array50);
    fPHeapMax1.copia(item_array50);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item58 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test427"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMax1.copia(item_array5);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    fPHeapMax12.constroi();
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array14);
    fPHeapMax8.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    ds.Item item18 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test428"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test429"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    fPHeapMax13.constroi();
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    fPHeapMax13.copia(item_array21);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax26.constroi();
    fPHeapMax26.imprime();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
    fPHeapMax30.constroi();
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array32);
    fPHeapMax26.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax10.copia(item_array32);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax38.copia(item_array41);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    fPHeapMax45.constroi();
    ds.Item item47 = fPHeapMax45.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array50);
    fPHeapMax45.copia(item_array50);
    fPHeapMax38.copia(item_array50);
    fPHeapMax10.copia(item_array50);
    fPHeapMax1.copia(item_array50);
    ds.Item item56 = fPHeapMax1.max();
    ds.Item item57 = fPHeapMax1.max();
    ds.Item item58 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array62 = new ds.Item[] {  };
    fPHeapMax61.copia(item_array62);
    fPHeapMax61.constroi();
    fPHeapMax61.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)100, (java.lang.Object)fPHeapMax61);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array62);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test430"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(10);
    fPHeapMax4.constroi();
    ds.Item item6 = fPHeapMax4.max();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax4.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)1, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test431"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(10);
    fPHeapMax5.constroi();
    fPHeapMax5.constroi();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax10.copia(item_array11);
    fPHeapMax10.constroi();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax10.copia(item_array18);
    fPHeapMax5.copia(item_array18);
    fPHeapMax5.constroi();
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax25.imprime();
    fPHeapMax25.constroi();
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax29.constroi();
    fPHeapMax29.imprime();
    ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((-1));
    fPHeapMax33.constroi();
    ds.Item[] item_array35 = new ds.Item[] {  };
    fPHeapMax33.copia(item_array35);
    fPHeapMax29.copia(item_array35);
    fPHeapMax25.copia(item_array35);
    fPHeapMax5.copia(item_array35);
    ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((-1));
    ds.Item[] item_array44 = new ds.Item[] {  };
    fPHeapMax43.copia(item_array44);
    fPHeapMax41.copia(item_array44);
    ds.Item item47 = fPHeapMax41.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array52 = new ds.Item[] {  };
    fPHeapMax51.copia(item_array52);
    fPHeapMax49.copia(item_array52);
    ds.Item[] item_array55 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array55);
    fPHeapMax41.copia(item_array55);
    fPHeapMax5.copia(item_array55);
    fPHeapMax1.copia(item_array55);
    ds.Item item60 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((-1));
    ds.Item[] item_array66 = new ds.Item[] {  };
    fPHeapMax65.copia(item_array66);
    fPHeapMax63.copia(item_array66);
    fPHeapMax63.imprime();
    ds.Item item70 = fPHeapMax63.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave(10, (java.lang.Object)item70);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item70);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test432"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((-1));
    fPHeapMax10.constroi();
    fPHeapMax10.constroi();
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax10.copia(item_array18);
    fPHeapMax1.copia(item_array18);
    fPHeapMax1.constroi();
    ds.Item item24 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test433"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((-1));
    fPHeapMax7.constroi();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.constroi();
    ds.Item item12 = fPHeapMax10.max();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax10.copia(item_array15);
    fPHeapMax7.copia(item_array15);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    fPHeapMax20.constroi();
    fPHeapMax20.constroi();
    ds.Item item23 = null;
    ds.Item[] item_array24 = new ds.Item[] { item23 };
    fPHeapMax20.copia(item_array24);
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array28 = new ds.Item[] {  };
    fPHeapMax27.copia(item_array28);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    fPHeapMax31.constroi();
    ds.Item[] item_array33 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array33);
    fPHeapMax27.copia(item_array33);
    fPHeapMax20.copia(item_array33);
    fPHeapMax7.copia(item_array33);
    ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array42 = new ds.Item[] {  };
    fPHeapMax41.copia(item_array42);
    fPHeapMax39.copia(item_array42);
    ds.Item[] item_array45 = new ds.Item[] {  };
    fPHeapMax39.copia(item_array45);
    fPHeapMax7.copia(item_array45);
    fPHeapMax1.copia(item_array45);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)' ', (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array45);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test434"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array6);
    fPHeapMax3.copia(item_array6);
    fPHeapMax3.imprime();
    fPHeapMax3.imprime();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    fPHeapMax12.constroi();
    fPHeapMax12.constroi();
    fPHeapMax12.imprime();
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((-1));
    ds.Item[] item_array20 = new ds.Item[] {  };
    fPHeapMax19.copia(item_array20);
    fPHeapMax17.copia(item_array20);
    fPHeapMax12.copia(item_array20);
    fPHeapMax3.copia(item_array20);
    fPHeapMax1.copia(item_array20);
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test435"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test436"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item5 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax7.imprime();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax10.copia(item_array11);
    fPHeapMax7.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((-1));
    ds.Item[] item_array19 = new ds.Item[] {  };
    fPHeapMax18.copia(item_array19);
    fPHeapMax16.copia(item_array19);
    ds.Item item22 = fPHeapMax16.max();
    fPHeapMax16.constroi();
    ds.Item item24 = fPHeapMax16.max();
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array29 = new ds.Item[] {  };
    fPHeapMax28.copia(item_array29);
    fPHeapMax26.copia(item_array29);
    ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(10);
    fPHeapMax33.constroi();
    ds.Item item35 = fPHeapMax33.max();
    ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array38 = new ds.Item[] {  };
    fPHeapMax37.copia(item_array38);
    fPHeapMax33.copia(item_array38);
    fPHeapMax26.copia(item_array38);
    fPHeapMax16.copia(item_array38);
    fPHeapMax1.copia(item_array38);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'#', (java.lang.Object)true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array38);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test437"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMax1.copia(item_array5);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    fPHeapMax12.constroi();
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array14);
    fPHeapMax8.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item19 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test438"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    fPHeapMax13.constroi();
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    fPHeapMax13.copia(item_array21);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax26.constroi();
    fPHeapMax26.imprime();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
    fPHeapMax30.constroi();
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array32);
    fPHeapMax26.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax10.copia(item_array32);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax38.copia(item_array41);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    fPHeapMax45.constroi();
    ds.Item item47 = fPHeapMax45.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array50);
    fPHeapMax45.copia(item_array50);
    fPHeapMax38.copia(item_array50);
    fPHeapMax10.copia(item_array50);
    fPHeapMax1.copia(item_array50);
    ds.Item item56 = fPHeapMax1.max();
    ds.Item item57 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((-1));
    ds.Item[] item_array60 = new ds.Item[] {  };
    fPHeapMax59.copia(item_array60);
    fPHeapMax1.copia(item_array60);
    ds.Item item63 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item63);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test439"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item5 = fPHeapMax1.max();
    ds.Item item6 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    fPHeapMax9.constroi();
    ds.Item item11 = fPHeapMax9.max();
    fPHeapMax9.constroi();
    ds.Item item13 = fPHeapMax9.max();
    fPHeapMax9.imprime();
    ds.Item item15 = fPHeapMax9.max();
    ds.Item item16 = fPHeapMax9.max();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    fPHeapMax18.imprime();
    fPHeapMax18.imprime();
    fPHeapMax18.imprime();
    ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int)(short)1);
    ds.Item item29 = fPHeapMax28.max();
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array34 = new ds.Item[] {  };
    fPHeapMax33.copia(item_array34);
    fPHeapMax31.copia(item_array34);
    ds.Item[] item_array37 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array37);
    fPHeapMax28.copia(item_array37);
    fPHeapMax18.copia(item_array37);
    fPHeapMax9.copia(item_array37);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((-1), (java.lang.Object)fPHeapMax9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test440"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item7 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test441"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    ds.Item item9 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test442"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array5);
    fPHeapMax1.copia(item_array5);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item8 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test443"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item13 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test444"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item5 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.Item item7 = fPHeapMax1.max();
    ds.Item item8 = fPHeapMax1.max();
    ds.Item item9 = fPHeapMax1.max();
    ds.Item item10 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test445"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item5 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((-1));
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMax16.copia(item_array17);
    fPHeapMax14.copia(item_array17);
    fPHeapMax14.imprime();
    ds.Item item21 = fPHeapMax14.max();
    fPHeapMax14.imprime();
    fPHeapMax14.constroi();
    ds.Item item24 = fPHeapMax14.max();
    fPHeapMax14.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(byte)100, (java.lang.Object)fPHeapMax14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test446"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.refaz(0, (int)(byte)(-1));
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item9 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test447"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    ds.Item item9 = fPHeapMax1.max();
    ds.Item item10 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax12.constroi();
    fPHeapMax12.imprime();
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((-1));
    fPHeapMax16.constroi();
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax16.copia(item_array18);
    fPHeapMax12.copia(item_array18);
    ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax22.imprime();
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array26 = new ds.Item[] {  };
    fPHeapMax25.copia(item_array26);
    fPHeapMax22.copia(item_array26);
    ds.Item item29 = fPHeapMax22.max();
    ds.Item item30 = fPHeapMax22.max();
    ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(10);
    fPHeapMax32.constroi();
    fPHeapMax32.constroi();
    fPHeapMax32.imprime();
    ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((-1));
    ds.Item[] item_array40 = new ds.Item[] {  };
    fPHeapMax39.copia(item_array40);
    fPHeapMax37.copia(item_array40);
    fPHeapMax37.imprime();
    ds.Item item44 = fPHeapMax37.max();
    ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax(10);
    fPHeapMax46.imprime();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((-1));
    fPHeapMax49.constroi();
    fPHeapMax49.constroi();
    fPHeapMax49.imprime();
    ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((-1));
    ds.Item[] item_array57 = new ds.Item[] {  };
    fPHeapMax56.copia(item_array57);
    fPHeapMax54.copia(item_array57);
    fPHeapMax49.copia(item_array57);
    ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax62.constroi();
    fPHeapMax62.imprime();
    ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((-1));
    fPHeapMax66.constroi();
    ds.Item[] item_array68 = new ds.Item[] {  };
    fPHeapMax66.copia(item_array68);
    fPHeapMax62.copia(item_array68);
    fPHeapMax49.copia(item_array68);
    fPHeapMax46.copia(item_array68);
    ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array77 = new ds.Item[] {  };
    fPHeapMax76.copia(item_array77);
    fPHeapMax74.copia(item_array77);
    ds.FPHeapMax fPHeapMax81 = new ds.FPHeapMax(10);
    fPHeapMax81.constroi();
    ds.Item item83 = fPHeapMax81.max();
    ds.FPHeapMax fPHeapMax85 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array86 = new ds.Item[] {  };
    fPHeapMax85.copia(item_array86);
    fPHeapMax81.copia(item_array86);
    fPHeapMax74.copia(item_array86);
    fPHeapMax46.copia(item_array86);
    fPHeapMax37.copia(item_array86);
    fPHeapMax32.copia(item_array86);
    fPHeapMax22.copia(item_array86);
    fPHeapMax12.copia(item_array86);
    fPHeapMax1.copia(item_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array86);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test448"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax14.constroi();
    fPHeapMax14.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((-1));
    fPHeapMax18.constroi();
    ds.Item[] item_array20 = new ds.Item[] {  };
    fPHeapMax18.copia(item_array20);
    fPHeapMax14.copia(item_array20);
    fPHeapMax1.copia(item_array20);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item24 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test449"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test450"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test451"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test452"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'#', 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test453"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    ds.Item item9 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.Item item11 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test454"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'4', (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test455"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMax1.copia(item_array5);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    fPHeapMax12.constroi();
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array14);
    fPHeapMax8.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(10);
    fPHeapMax21.constroi();
    fPHeapMax21.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave(0, (java.lang.Object)fPHeapMax21);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test456"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.constroi();
    ds.Item item12 = fPHeapMax10.max();
    fPHeapMax10.constroi();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(0);
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((-1));
    ds.Item[] item_array27 = new ds.Item[] {  };
    fPHeapMax26.copia(item_array27);
    fPHeapMax24.copia(item_array27);
    fPHeapMax24.imprime();
    fPHeapMax24.imprime();
    ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((-1));
    fPHeapMax33.constroi();
    fPHeapMax33.constroi();
    fPHeapMax33.imprime();
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((-1));
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax38.copia(item_array41);
    fPHeapMax33.copia(item_array41);
    fPHeapMax24.copia(item_array41);
    fPHeapMax22.copia(item_array41);
    fPHeapMax15.copia(item_array41);
    fPHeapMax10.copia(item_array41);
    fPHeapMax10.constroi();
    fPHeapMax10.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'#', (java.lang.Object)fPHeapMax10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test457"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array5);
    fPHeapMax1.copia(item_array5);
    ds.Item item8 = fPHeapMax1.max();
    ds.Item item9 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(100, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test458"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item5 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    fPHeapMax8.constroi();
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMax16.copia(item_array17);
    fPHeapMax13.copia(item_array17);
    fPHeapMax8.copia(item_array17);
    fPHeapMax1.copia(item_array17);
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test459"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax15.imprime();
    ds.Item item22 = fPHeapMax15.max();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(10);
    fPHeapMax24.imprime();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((-1));
    fPHeapMax27.constroi();
    fPHeapMax27.constroi();
    fPHeapMax27.imprime();
    ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((-1));
    ds.Item[] item_array35 = new ds.Item[] {  };
    fPHeapMax34.copia(item_array35);
    fPHeapMax32.copia(item_array35);
    fPHeapMax27.copia(item_array35);
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax40.constroi();
    fPHeapMax40.imprime();
    ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((-1));
    fPHeapMax44.constroi();
    ds.Item[] item_array46 = new ds.Item[] {  };
    fPHeapMax44.copia(item_array46);
    fPHeapMax40.copia(item_array46);
    fPHeapMax27.copia(item_array46);
    fPHeapMax24.copia(item_array46);
    ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array55 = new ds.Item[] {  };
    fPHeapMax54.copia(item_array55);
    fPHeapMax52.copia(item_array55);
    ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax(10);
    fPHeapMax59.constroi();
    ds.Item item61 = fPHeapMax59.max();
    ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array64 = new ds.Item[] {  };
    fPHeapMax63.copia(item_array64);
    fPHeapMax59.copia(item_array64);
    fPHeapMax52.copia(item_array64);
    fPHeapMax24.copia(item_array64);
    fPHeapMax15.copia(item_array64);
    fPHeapMax1.copia(item_array64);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array64);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test460"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array6);
    fPHeapMax3.copia(item_array6);
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.constroi();
    ds.Item item12 = fPHeapMax10.max();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax10.copia(item_array15);
    fPHeapMax3.copia(item_array15);
    fPHeapMax1.copia(item_array15);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item22 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test461"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item23 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(100, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test462"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMax1.copia(item_array5);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    fPHeapMax12.constroi();
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array14);
    fPHeapMax8.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    fPHeapMax20.constroi();
    fPHeapMax20.constroi();
    ds.Item item23 = null;
    ds.Item[] item_array24 = new ds.Item[] { item23 };
    fPHeapMax20.copia(item_array24);
    fPHeapMax1.copia(item_array24);
    ds.Item item27 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item27);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test463"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(10);
    fPHeapMax5.constroi();
    fPHeapMax5.constroi();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax10.copia(item_array11);
    fPHeapMax10.constroi();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax10.copia(item_array18);
    fPHeapMax5.copia(item_array18);
    fPHeapMax5.constroi();
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax25.imprime();
    fPHeapMax25.constroi();
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax29.constroi();
    fPHeapMax29.imprime();
    ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((-1));
    fPHeapMax33.constroi();
    ds.Item[] item_array35 = new ds.Item[] {  };
    fPHeapMax33.copia(item_array35);
    fPHeapMax29.copia(item_array35);
    fPHeapMax25.copia(item_array35);
    fPHeapMax5.copia(item_array35);
    ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((-1));
    ds.Item[] item_array44 = new ds.Item[] {  };
    fPHeapMax43.copia(item_array44);
    fPHeapMax41.copia(item_array44);
    ds.Item item47 = fPHeapMax41.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array52 = new ds.Item[] {  };
    fPHeapMax51.copia(item_array52);
    fPHeapMax49.copia(item_array52);
    ds.Item[] item_array55 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array55);
    fPHeapMax41.copia(item_array55);
    fPHeapMax5.copia(item_array55);
    fPHeapMax1.copia(item_array55);
    ds.Item item60 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item60);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test464"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    fPHeapMax1.imprime();
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test465"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.refaz((int)(short)10, (-1));
    ds.Item item12 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item14 = fPHeapMax1.max();
    ds.Item item15 = fPHeapMax1.max();
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test466"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item3 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test467"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test468"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
    fPHeapMax6.constroi();
    fPHeapMax6.constroi();
    fPHeapMax6.imprime();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)10, (java.lang.Object)item_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test469"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)10);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item4 = fPHeapMax1.max();
    ds.Item item5 = fPHeapMax1.max();
    fPHeapMax1.refaz((int)(byte)10, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test470"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax6.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array10);
    fPHeapMax6.copia(item_array10);
    fPHeapMax1.copia(item_array10);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)(-1), (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test471"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array5);
    fPHeapMax1.copia(item_array5);
    ds.Item item8 = fPHeapMax1.max();
    ds.Item item9 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item11 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test472"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(10);
    fPHeapMax7.constroi();
    fPHeapMax7.constroi();
    fPHeapMax7.imprime();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax12.constroi();
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((-1));
    ds.Item[] item_array20 = new ds.Item[] {  };
    fPHeapMax19.copia(item_array20);
    fPHeapMax17.copia(item_array20);
    fPHeapMax12.copia(item_array20);
    fPHeapMax7.copia(item_array20);
    fPHeapMax1.copia(item_array20);
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test473"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMax1.copia(item_array5);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item9 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test474"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array7);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(10, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test475"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax3.constroi();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    fPHeapMax8.constroi();
    ds.Item item10 = fPHeapMax8.max();
    fPHeapMax8.constroi();
    ds.Item item12 = fPHeapMax8.max();
    fPHeapMax8.imprime();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((-1));
    fPHeapMax15.constroi();
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMax15.copia(item_array17);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax20.imprime();
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array24 = new ds.Item[] {  };
    fPHeapMax23.copia(item_array24);
    fPHeapMax20.copia(item_array24);
    fPHeapMax15.copia(item_array24);
    fPHeapMax8.copia(item_array24);
    fPHeapMax3.copia(item_array24);
    fPHeapMax1.copia(item_array24);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item31 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test476"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(10);
    fPHeapMax7.imprime();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((-1));
    fPHeapMax10.constroi();
    fPHeapMax10.constroi();
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax10.copia(item_array18);
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax23.constroi();
    fPHeapMax23.imprime();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((-1));
    fPHeapMax27.constroi();
    ds.Item[] item_array29 = new ds.Item[] {  };
    fPHeapMax27.copia(item_array29);
    fPHeapMax23.copia(item_array29);
    fPHeapMax10.copia(item_array29);
    fPHeapMax7.copia(item_array29);
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((-1));
    ds.Item[] item_array38 = new ds.Item[] {  };
    fPHeapMax37.copia(item_array38);
    fPHeapMax35.copia(item_array38);
    fPHeapMax7.copia(item_array38);
    fPHeapMax1.copia(item_array38);
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array38);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test477"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.Item item13 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test478"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item5 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item9 = fPHeapMax1.max();
    ds.Item item10 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item12 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item13 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test479"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item5 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test480"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test481"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)10);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item4 = fPHeapMax1.max();
    ds.Item item5 = fPHeapMax1.max();
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test482"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item2 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test483"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)100, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test484"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    fPHeapMax9.constroi();
    fPHeapMax9.constroi();
    fPHeapMax9.imprime();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((-1));
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMax16.copia(item_array17);
    fPHeapMax14.copia(item_array17);
    fPHeapMax9.copia(item_array17);
    fPHeapMax9.constroi();
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(10);
    fPHeapMax23.constroi();
    ds.Item item25 = fPHeapMax23.max();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array28 = new ds.Item[] {  };
    fPHeapMax27.copia(item_array28);
    fPHeapMax23.copia(item_array28);
    fPHeapMax9.copia(item_array28);
    fPHeapMax1.copia(item_array28);
    java.lang.Object obj34 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)1, obj34);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test485"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array10);
    fPHeapMax7.copia(item_array10);
    fPHeapMax7.imprime();
    fPHeapMax7.imprime();
    fPHeapMax7.imprime();
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)(short)1);
    ds.Item item18 = fPHeapMax17.max();
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax22.copia(item_array23);
    fPHeapMax20.copia(item_array23);
    ds.Item[] item_array26 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array26);
    fPHeapMax17.copia(item_array26);
    fPHeapMax7.copia(item_array26);
    fPHeapMax1.copia(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test486"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.refaz((int)(short)10, (-1));
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    fPHeapMax15.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((-1));
    fPHeapMax18.constroi();
    fPHeapMax18.constroi();
    fPHeapMax18.imprime();
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((-1));
    ds.Item[] item_array26 = new ds.Item[] {  };
    fPHeapMax25.copia(item_array26);
    fPHeapMax23.copia(item_array26);
    fPHeapMax18.copia(item_array26);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax31.constroi();
    fPHeapMax31.imprime();
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((-1));
    fPHeapMax35.constroi();
    ds.Item[] item_array37 = new ds.Item[] {  };
    fPHeapMax35.copia(item_array37);
    fPHeapMax31.copia(item_array37);
    fPHeapMax18.copia(item_array37);
    fPHeapMax15.copia(item_array37);
    ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((-1));
    ds.Item[] item_array46 = new ds.Item[] {  };
    fPHeapMax45.copia(item_array46);
    fPHeapMax43.copia(item_array46);
    fPHeapMax15.copia(item_array46);
    fPHeapMax15.constroi();
    fPHeapMax15.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)100, (java.lang.Object)fPHeapMax15);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array46);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test487"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'4');
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test488"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    java.lang.Object obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(byte)10, obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test489"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(10, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test490"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.imprime();
    ds.Item item20 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test491"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array7);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave(0, (java.lang.Object)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test492"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.constroi();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax11.constroi();
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((-1));
    ds.Item[] item_array19 = new ds.Item[] {  };
    fPHeapMax18.copia(item_array19);
    fPHeapMax16.copia(item_array19);
    fPHeapMax11.copia(item_array19);
    fPHeapMax1.copia(item_array19);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item24 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test493"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax15.imprime();
    fPHeapMax15.imprime();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((-1));
    fPHeapMax24.constroi();
    fPHeapMax24.constroi();
    fPHeapMax24.imprime();
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    fPHeapMax24.copia(item_array32);
    fPHeapMax15.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax6.copia(item_array32);
    fPHeapMax1.copia(item_array32);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax43.imprime();
    ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((-1));
    ds.Item[] item_array49 = new ds.Item[] {  };
    fPHeapMax48.copia(item_array49);
    fPHeapMax46.copia(item_array49);
    ds.Item item52 = fPHeapMax46.max();
    ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array57 = new ds.Item[] {  };
    fPHeapMax56.copia(item_array57);
    fPHeapMax54.copia(item_array57);
    ds.Item[] item_array60 = new ds.Item[] {  };
    fPHeapMax54.copia(item_array60);
    fPHeapMax46.copia(item_array60);
    fPHeapMax43.copia(item_array60);
    fPHeapMax1.copia(item_array60);
    ds.Item item65 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.Item item67 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item67);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item65);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test494"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((-1));
    fPHeapMax10.constroi();
    fPHeapMax10.constroi();
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax10.copia(item_array18);
    fPHeapMax1.copia(item_array18);
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax25.imprime();
    ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array29 = new ds.Item[] {  };
    fPHeapMax28.copia(item_array29);
    fPHeapMax25.copia(item_array29);
    ds.Item item32 = fPHeapMax25.max();
    ds.Item item33 = fPHeapMax25.max();
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((-1));
    ds.Item[] item_array38 = new ds.Item[] {  };
    fPHeapMax37.copia(item_array38);
    fPHeapMax35.copia(item_array38);
    fPHeapMax25.copia(item_array38);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)' ', (java.lang.Object)item_array38);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array38);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test495"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    fPHeapMax8.constroi();
    ds.Item item10 = fPHeapMax8.max();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax8.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item18 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test496"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)(-1), 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test497"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.constroi();
    ds.Item item8 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item10 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(10);
    fPHeapMax12.constroi();
    ds.Item item14 = fPHeapMax12.max();
    fPHeapMax12.constroi();
    ds.Item item16 = fPHeapMax12.max();
    fPHeapMax12.imprime();
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array20 = new ds.Item[] {  };
    fPHeapMax19.copia(item_array20);
    fPHeapMax12.copia(item_array20);
    fPHeapMax1.copia(item_array20);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item24 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test498"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)100);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item4 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)(-1), 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test499"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array10);
    fPHeapMax7.copia(item_array10);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax7.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(10);
    fPHeapMax17.constroi();
    ds.Item item19 = fPHeapMax17.max();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array22 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array22);
    fPHeapMax17.copia(item_array22);
    fPHeapMax1.copia(item_array22);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item26 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test500"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item9 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    fPHeapMax18.constroi();
    ds.Item item20 = fPHeapMax18.max();
    ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax22.copia(item_array23);
    fPHeapMax18.copia(item_array23);
    fPHeapMax11.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    ds.Item item28 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);

  }

}
