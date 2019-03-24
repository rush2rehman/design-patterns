package com.krahman.creational.abstractfactory;

public class BMWV1 implements BMWBase {

  @Override
  public void turnOn() {
    System.out.println("Turning ON BMW variant 1");
  }

  @Override
  public void turnOff() {
    System.out.println("Turning OFF BMW variant 1");
  }
}
