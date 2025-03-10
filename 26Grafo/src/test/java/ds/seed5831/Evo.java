/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 04 20:51:42 GMT 2020
 */

package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Evo extends Grafo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(1, 1, 0);
      grafo0.imprime();
      assertEquals(1, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(6198);
      int[] intArray0 = new int[3];
      intArray0[0] = 6198;
      grafo0.insereAresta(6198, 1801, 6198);
      grafo0.cab = intArray0;
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(6198, 6198);
      assertNotNull(grafo_Aresta0);
      assertEquals(6198, grafo_Aresta0.v2());
      assertEquals(6198, grafo0.numVertices());
      assertEquals(0, grafo_Aresta0.peso());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(0);
      grafo0.insereAresta(4500, 2062, 4500);
      grafo0.prox = grafo0.cab;
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, (-1));
      assertNull(grafo_Aresta0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(1, 1, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 1);
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals(1, grafo_Aresta0.v2());
      assertEquals(0, grafo_Aresta0.peso());
      assertNotNull(grafo_Aresta0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(2);
      Grafo grafo1 = grafo0.grafoTransposto();
      assertEquals(2, grafo1.numVertices());
      assertNotSame(grafo1, grafo0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(1, 1, 0);
      boolean boolean0 = grafo0.existeAresta(0, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(2);
      grafo0.insereAresta(1333, 1333, 1333);
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(2);
      int[] intArray0 = new int[3];
      grafo0.cab = intArray0;
      grafo0.insereAresta(1, 1, 1);
      grafo0.insereAresta(813, 815, 1);
      assertEquals(2, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo(844);
      int int0 = grafo0.numVertices();
      assertEquals(844, int0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(1, 1, 0);
      Grafo grafo1 = grafo0.grafoTransposto();
      assertEquals(1, grafo0.numVertices());
      assertEquals(1, grafo1.numVertices());
  }
}
