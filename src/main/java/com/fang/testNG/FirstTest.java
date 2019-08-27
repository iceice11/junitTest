package com.fang.testNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class FirstTest {
  @Test
  public void f() {
	  
  }
  @BeforeClass
  public void beforeClass() {
	  new App();
	  Assert.assertEquals(App.add(1, 2), 3);
	  Assert.assertEquals(App.add(2, 2), 4);
	  Assert.assertEquals(App.add(1, 3), 4);
  }

  @AfterClass
  public void afterClass() {
  }

}
