package testing;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  assertEquals(new testmaven.TestClass().fun(), "Hello");
  }
}
