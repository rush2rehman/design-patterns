package com.krahman.creational.builder;

import java.util.List;

public class Sandwich {

  public enum BreadType {SOFT, THINCRUST};
  public enum CheeseType {CHEDDAR, MOZZRELLA};
  public enum Vegetables {ONION, TOMOTO};
  public enum SandwichType{VEG, CHEESE};
  private boolean isRoasted;
  private BreadType breadType;
  private CheeseType cheeseType;
  private SandwichType sandwichType;
  private List<Vegetables> vegetableList;

  public boolean isRoasted() {
    return isRoasted;
  }

  public void setRoasted(boolean roasted) {
    isRoasted = roasted;
  }

  public BreadType getBreadType() {
    return breadType;
  }

  public void setBreadType(BreadType breadType) {
    this.breadType = breadType;
  }

  public CheeseType getCheeseType() {
    return cheeseType;
  }

  public void setCheeseType(CheeseType cheeseType) {
    this.cheeseType = cheeseType;
  }

  public List<Vegetables> getVegetableList() {
    return vegetableList;
  }

  public void setVegetableList(
      List<Vegetables> vegetableList) {
    this.vegetableList = vegetableList;
  }

  public SandwichType getSandwichType() {
    return sandwichType;
  }

  public void setSandwichType(SandwichType sandwichType) {
    this.sandwichType = sandwichType;
  }
}
