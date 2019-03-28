package com.krahman.creational.prototype;

public abstract class Color implements Cloneable {

  protected String colorName;

  abstract void addColor();

  public Object clone() throws CloneNotSupportedException
  {
    return super.clone();

  }

}
