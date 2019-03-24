package com.krahman.creational.builder;

public abstract class SandwichBuilder {

  protected Sandwich sandwich;


  protected abstract void addVegetables();

  protected abstract void applyCheese();

  protected abstract void prepareBread();

}
