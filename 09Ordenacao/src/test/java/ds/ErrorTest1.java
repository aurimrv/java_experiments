package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

  public static boolean debug = false;

  @Test(expected=java.lang.StackOverflowError.class)
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test001"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)' ');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test002"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'4');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)'a');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test003"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 100);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(byte)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test004"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 1, (-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), 10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test005"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)10);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(short)1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test006"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)10);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)'4');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test007"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(short)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)'#');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test008"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(byte)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test009"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)10);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(short)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test010"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(byte)10);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(byte)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test011"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)' ');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(short)1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test012"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test013"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'#');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test014"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'4');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(short)1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test015"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)'#');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test016"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(short)10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test017"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), 10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test018"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(short)10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test019"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(short)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test020"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(short)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test021"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'a');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(byte)10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test022"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)' ');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test023"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)' ');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)'#');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test024"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(short)1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test025"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)10);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)'#');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test026"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, 1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), 100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test027"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)'#');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test028"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(byte)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test029"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), 1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test030"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)'a');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test031"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), 100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test032"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'#');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), 100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test033"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(byte)10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test034"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)' ');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test035"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 100, 10);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)'4');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test036"); }


    int[] i_array0 = null;
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array0, (-1), (int)(byte)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test037"); }


    int[] i_array0 = null;
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array0, (int)(short)(-1), (int)(byte)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test038"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)' ');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test039"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, (int)(byte)0, (-1));
    ds.Ordenacao.mergeSort(i_array6, (int)(short)10, (int)(short)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array6, (int)(short)(-1), (int)(short)10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test040"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array6, (int)(byte)(-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test041"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 100);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test042"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test043"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)10);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)'4');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test044"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)' ');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test045"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(short)1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test046"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(short)10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test047"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 100, 1);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(short)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test048"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array6, (int)'4', (int)' ');
    ds.Ordenacao.mergeSort(i_array6, (int)(byte)10, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array6, 100, (int)(short)100);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array6, (int)(short)(-1), (int)(short)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test049"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 100);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(short)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test050"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)' ');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)'#');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test051"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 1);
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(byte)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test052"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(short)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(short)1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test053"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)' ');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(short)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test054"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(short)1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test055"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, 1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)'4');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test056"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(short)1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test057"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array6, (int)(short)0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array6, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, (int)' ', 0);
    ds.Ordenacao.mergeSort(i_array6, (int)'#', (int)(short)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array6, (int)(byte)(-1), (int)(byte)1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test058"); }


    int[] i_array0 = null;
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array0, (-1), (int)(short)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test059"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)10);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test060"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)' ');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test061"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test062"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(byte)1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test063"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)'#');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test064"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'4');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(short)1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test065"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test066"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)'4');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test067"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(byte)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test068"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)10);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(byte)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test069"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(short)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test070"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test071"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)10);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(short)10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test072"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)' ');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test073"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(short)1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test074"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 1);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)'a');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test075"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 10);
    ds.Ordenacao.mergeSort(i_array2, 100, 100);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(byte)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test076"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 1, (-1));
    ds.Ordenacao.mergeSort(i_array2, 0, (-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(byte)10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test077"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)10);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test078"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, 1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)'4');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test079"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(short)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test080"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(byte)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test081"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)'a');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test082"); }


    int[] i_array0 = null;
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array0, (int)(byte)(-1), (int)' ');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test083"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test084"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(short)1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test085"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (-1));
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test086"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test087"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(short)10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test088"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test089"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(short)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test090"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)' ');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test091"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)10);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test092"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(short)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test093"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(byte)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test094"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(byte)10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test095"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(short)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test096"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)' ');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test097"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array6, 10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array6, 1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array6, (int)(short)100, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array6, (int)'#', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array6, 1, (-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array6, (-1), (int)'4');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test098"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(byte)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test099"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 10, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)'#');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test100"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, 10);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), 1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test101"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test102"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(short)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test103"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 1);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 100, 10);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(short)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test104"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(short)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test105"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)'a');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test106"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)' ');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(byte)1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test107"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 1);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)100);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)'4');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test108"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, 10);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)'4');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test109"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)' ');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test110"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test111"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 1, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(byte)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test112"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)'4');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test113"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test114"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test115"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)100);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test116"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test117"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 100, 100);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)'#');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test118"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array6, 10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array6, 1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array6, (int)(short)100, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array6, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array6, (int)' ', (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array6, (int)(byte)100, 0);
    ds.Ordenacao.mergeSort(i_array6, (int)(byte)10, (int)(byte)1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array6, (-1), (int)(byte)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test119"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)'a');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test120"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), 10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test121"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 100, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test122"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), 1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test123"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test124"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 0);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(byte)1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test125"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(byte)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test126"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array6, (int)(byte)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array6, (int)(short)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array6, (int)(byte)0, (int)(short)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array6, (-1), (int)(byte)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test127"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(byte)10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test128"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)' ');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)' ');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test129"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(short)10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test130"); }


    int[] i_array0 = null;
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array0, (-1), 1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test131"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(short)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test132"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(short)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test133"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test134"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 0);
    ds.Ordenacao.mergeSort(i_array2, 10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(short)10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test135"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), 10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test136"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), 100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test137"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)'a');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test138"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(byte)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), 100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test139"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 10);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)'4');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test140"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test141"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(short)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test142"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 1, 1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)'a');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test143"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), 10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test144"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(short)10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test145"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test146"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 1, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(byte)10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test147"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 100);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)10);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)'a');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test148"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(short)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test149"); }


    int[] i_array0 = null;
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array0, (int)(byte)(-1), (int)(short)10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test150"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'#');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)'#');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test151"); }


    int[] i_array0 = null;
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array0, (int)(byte)(-1), 10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test152"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array6, (int)(short)0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array6, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array6, 0, (int)(byte)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array6, (int)(short)(-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test153"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)' ');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test154"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(short)10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test155"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)'#');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test156"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(byte)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test157"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), 100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test158"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), 10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test159"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, 100, 0);
    ds.Ordenacao.mergeSort(i_array6, (int)'a', (int)'#');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array6, (int)(byte)(-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test160"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)10);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)'4');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test161"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 100, 0);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(short)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test162"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test163"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)' ');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test164"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(short)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test165"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)' ');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test166"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, 10, 1);
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test167"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)10);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(byte)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test168"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)100);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(byte)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test169"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test170"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test171"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test172"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test173"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 100);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(short)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), 100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test174"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(byte)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test175"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(byte)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test176"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(short)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test177"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)'a');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test178"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)'#');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test179"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)'4');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test180"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)' ');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test181"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), 1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test182"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(short)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test183"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), 100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test184"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)'4');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test185"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)100);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(byte)10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test186"); }


    int[] i_array0 = null;
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array0, (int)(byte)(-1), (int)(short)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test187"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)100);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(byte)1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test188"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, 1, (-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)'a');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test189"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, 1, (-1));
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(short)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test190"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)10);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test191"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(byte)1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test192"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)'4');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test193"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(short)100);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test194"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), 10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test195"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)' ');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test196"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(byte)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test197"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), 10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test198"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)'4');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test199"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, 10);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test200"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), 0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test201"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)'#');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test202"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'#');
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(short)10);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test203"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)(-1));
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(short)0);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test204"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(byte)1);

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test205"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)'4');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test206"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 1);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)'a');

  }

  @Test(expected=java.lang.StackOverflowError.class)
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test207"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)0);

  }

}
