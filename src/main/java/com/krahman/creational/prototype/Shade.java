package com.krahman.creational.prototype;

public class Shade implements Cloneable{

  public int shadeCode;

  public Shade(int shadeCode)
  {
    this.shadeCode = shadeCode;
  }

  public Object clone() throws CloneNotSupportedException
  {
    return super.clone();
  }

}
