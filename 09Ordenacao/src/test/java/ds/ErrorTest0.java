package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test1"); }


    int[] i_array2 = new int[] { (short)(-1), (short)(-1) };
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(short)1);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test2"); }


    int[] i_array1 = new int[] { (short)(-1) };
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    ds.Ordenacao.mergeSort(i_array1, (int)(byte)(-1), (int)' ');

  }

}
