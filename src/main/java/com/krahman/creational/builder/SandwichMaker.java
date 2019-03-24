package com.krahman.creational.builder;

public class SandwichMaker {

  public SandwichBuilder sandwichBuilder;

  public SandwichMaker(SandwichBuilder sandwichBuilder)
  {
    this.sandwichBuilder = sandwichBuilder;
  }

  public void createSandwich()
  {
    sandwichBuilder.sandwich = new Sandwich();
    sandwichBuilder.prepareBread();
    sandwichBuilder.applyCheese();
    sandwichBuilder.addVegetables();
  }

  public Sandwich getSandwich()
  {
    return sandwichBuilder.sandwich;
  }

}
