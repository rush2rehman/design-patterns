package com.krahman.creational.factorymethod;

import com.krahman.creational.simplefactory.Audi;
import com.krahman.creational.simplefactory.ICar;

public class AudiCarFactory implements ICarFactory {

  @Override
  public ICar getCar() {
    return new Audi("Audi");
  }
}
