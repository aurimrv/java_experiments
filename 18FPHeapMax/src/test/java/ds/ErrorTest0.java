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


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    fPHeapMax1.refaz((int)(short)1, (int)' ');

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test2"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    fPHeapMax1.aumentaChave((int)(byte)1, (java.lang.Object)1L);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test3"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    fPHeapMax1.aumentaChave(0, (java.lang.Object)fPHeapMax4);

  }

}
