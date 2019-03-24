package com.krahman.creational.factorymethod;

import com.krahman.creational.simplefactory.Audi;
import com.krahman.creational.simplefactory.BMW;
import com.krahman.creational.simplefactory.ICar;
import org.junit.Test;

public class FactorymethodTest {

  @Test
  public void testFactoryMethod()
  {
    ICarFactory carFactory = new BMWCarFactory();
    ICar car1 = carFactory.getCar();
    car1.turnOn();
    car1.turnOff();
    assert (car1 instanceof BMW);
    carFactory = new AudiCarFactory();
    ICar car2 = carFactory.getCar();
    car2.turnOn();
    car2.turnOff();
    assert (car2 instanceof Audi);


  }

}
