package com.krahman.creational.builder;

import com.krahman.creational.builder.Sandwich.BreadType;
import com.krahman.creational.builder.Sandwich.CheeseType;
import com.krahman.creational.builder.Sandwich.SandwichType;
import com.krahman.creational.builder.Sandwich.Vegetables;
import java.util.Arrays;

public class VegSandwichBuilder extends SandwichBuilder {

  @Override
  protected void addVegetables() {
    sandwich.setVegetableList(Arrays.asList(Vegetables.ONION));
  }

  @Override
  protected void applyCheese() {
    sandwich.setCheeseType(CheeseType.CHEDDAR);
  }

  @Override
  protected void prepareBread() {
    sandwich.setSandwichType(SandwichType.VEG);
    sandwich.setBreadType(BreadType.SOFT);
    sandwich.setRoasted(true);
  }
}
