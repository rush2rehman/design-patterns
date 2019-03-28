package com.krahman.creational.prototype;

public class GreenColor extends Color {

  public void setShade(Shade shade) {
    this.shade = shade;
  }

  public Shade shade;

  public GreenColor()
  {
    shade = new Shade(100);
  }

  @Override
  void addColor() {
    System.out.println("Green Color Added!! "+"Shade ->"+ shade.shadeCode);
  }

  @Override
  public Object clone() throws CloneNotSupportedException
  {
    Shade newShade = new Shade(200);
    Object clone = super.clone();
    ((GreenColor)clone).setShade(newShade);
    return clone;
  }
}
