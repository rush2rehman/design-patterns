package com.krahman.creational.factorymethod;

import com.krahman.creational.simplefactory.BMW;
import com.krahman.creational.simplefactory.ICar;

public class BMWCarFactory implements ICarFactory {

  @Override
  public ICar getCar() {
    return new BMW("BMW");
  }
}
