package com.krahman.creational.simplefactory;

public class Audi implements ICar {

  public String name;

  public Audi(String name)
  {
    this.name = name;
  }

  @Override
  public void turnOff() {
    System.out.println("Turning ON Audi car");
  }

  @Override
  public void turnOn() {
    System.out.println("Turning OFF Audi car");
  }
}
