package com.krahman.creational.builder;

import com.krahman.creational.builder.Sandwich.BreadType;
import com.krahman.creational.builder.Sandwich.CheeseType;
import com.krahman.creational.builder.Sandwich.SandwichType;

public class CheeseSandwichBuilder extends SandwichBuilder {

  @Override
  protected void addVegetables() {

  }

  @Override
  protected void applyCheese() {
    sandwich.setCheeseType(CheeseType.MOZZRELLA);
  }

  @Override
  protected void prepareBread() {
    sandwich.setSandwichType(SandwichType.CHEESE);
    sandwich.setBreadType(BreadType.THINCRUST);
    sandwich.setRoasted(true);
  }
}
