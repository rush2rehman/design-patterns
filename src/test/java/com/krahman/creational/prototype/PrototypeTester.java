package com.krahman.creational.prototype;

import org.junit.Test;

public class PrototypeTester {

  @Test
  public void testPrototype() throws CloneNotSupportedException {
    ColorPrototypeManager colorPrototypeManager = new ColorPrototypeManager();
    BlueColor blue = (BlueColor)colorPrototypeManager.getClonedObject("blue");
    blue.addColor();
    GreenColor green = (GreenColor)colorPrototypeManager.getClonedObject("green");
    green.addColor();
    assert (200 == green.shade.shadeCode);
  }

}
