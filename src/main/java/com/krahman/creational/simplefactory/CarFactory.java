package com.krahman.creational.simplefactory;

public class CarFactory {

  public ICar getCar(String manufacturer)
  {
    if(manufacturer.equalsIgnoreCase("BMW"))
    {
      return new BMW("BMW");
    }
    else if (manufacturer.equalsIgnoreCase("Audi") )
    {
      return new Audi("Audi");
    }
    else
      return null;
  }

}
