package com.krahman.creational.abstractfactory;

import com.krahman.creational.simplefactory.ICar;

public class BMWAbstractFactory implements ICarAbstractFactory {

  @Override
  public ICar getCar(String variant) {
    return (variant.equalsIgnoreCase("V1")? new BMWV1() :
        variant.equalsIgnoreCase("V2")?new BMWV2(): null );
  }
}
