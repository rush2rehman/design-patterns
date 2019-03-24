package com.krahman.creational.simplefactory;

import org.junit.Test;

public class SimpleFactoryTest {

  @Test
  public void testSimpleFactor()
  {
    CarFactory carFactory = new CarFactory();
    ICar car = carFactory.getCar("BMW");
    car.turnOn();
    car.turnOff();
    assert(car instanceof BMW);
    car = carFactory.getCar("Audi");
    car.turnOn();
    car.turnOff();
    assert(car instanceof Audi);

  }

}
