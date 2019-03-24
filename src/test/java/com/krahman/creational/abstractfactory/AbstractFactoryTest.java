package com.krahman.creational.abstractfactory;

import com.krahman.creational.simplefactory.ICar;
import org.junit.Test;

public class AbstractFactoryTest {

  @Test
  public void testAbstractTest()
  {
    ICarAbstractFactory abstractFactory = new BMWAbstractFactory();
    ICar car1 = abstractFactory.getCar("V1");
    car1.turnOn();
    car1.turnOff();
    assert (car1 instanceof BMWV1);
    ICar car2 = abstractFactory.getCar("V2");
    car2.turnOn();
    car2.turnOff();
    assert (car2 instanceof BMWV2);

  }

}
