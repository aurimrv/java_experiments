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


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    ds.Grafo.Aresta aresta3 = grafo0.proxAdj((int)'a');

  }

}
