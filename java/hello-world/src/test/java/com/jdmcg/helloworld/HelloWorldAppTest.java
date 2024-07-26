package com.jdmcg.helloworld;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * * Unit tests for simple HelloWorldApp. * *
 *
 * <p>Simply exercises the unit testing capabilities of Java.
 */
public class HelloWorldAppTest {
  /** Rigorous Test :-) */
  @Test
  public void outputStringIsHelloWorld() {
    assertTrue(HelloWorldApp.output == "hello, world");
  }
}
