package com.krahman.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ColorPrototypeManager {
  private static Map<String,Color> protoTypeMap = new HashMap<>();

  static{
    BlueColor blueColor = new BlueColor();
    GreenColor greenColor = new GreenColor();
    protoTypeMap.put("blue",blueColor);
    protoTypeMap.put("green",greenColor);

  }

  public Color getClonedObject(String type) throws CloneNotSupportedException
  {
    return (Color)protoTypeMap.get(type).clone();
  }



}
