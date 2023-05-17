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


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    fPHeapMin1.diminuiChave(0, (java.lang.Object)10L);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test2"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    ds.Item item2 = fPHeapMin1.min();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    fPHeapMin1.diminuiChave((int)(byte)1, (java.lang.Object)100.0f);

  }

}
