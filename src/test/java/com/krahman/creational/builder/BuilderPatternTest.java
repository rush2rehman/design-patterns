package com.krahman.creational.builder;

import com.krahman.creational.builder.Sandwich.SandwichType;
import org.junit.Test;

public class BuilderPatternTest {

  @Test
  public void testBuilderPattern()
  {
    SandwichMaker sandwichDirector = new SandwichMaker(new VegSandwichBuilder());
    sandwichDirector.createSandwich();
    Sandwich sandwich = sandwichDirector.getSandwich();
    System.out.println(sandwich.getSandwichType()+" "+
        sandwich.getBreadType()+" "+sandwich.isRoasted()
        +" "+sandwich.getCheeseType()+" "+sandwich.getVegetableList());
    assert (SandwichType.VEG.equals(sandwich.getSandwichType()));

    SandwichMaker sandwichDirector1 = new SandwichMaker(new CheeseSandwichBuilder());
    sandwichDirector1.createSandwich();
    Sandwich sandwich1 = sandwichDirector1.getSandwich();
    System.out.println(sandwich1.getSandwichType()+" "+
        sandwich1.getBreadType()+" "+sandwich1.isRoasted()
        +" "+sandwich1.getCheeseType()+" "+sandwich1.getVegetableList());
    assert (SandwichType.CHEESE.equals(sandwich1.getSandwichType()));
  }

}
