package com.krahman.creational.simplefactory;

public class BMW implements ICar {

  public String name;

  public BMW(String name)
  {
    this.name = name;
  }

  @Override
  public void turnOff() {
    System.out.println("Turning ON BMW car");
  }

  @Override
  public void turnOn() {
    System.out.println("Turning OFF BMW car");
  }
}
