package com.krahman.creational.abstractfactory;

import com.krahman.creational.simplefactory.ICar;

public interface ICarAbstractFactory {

  ICar getCar(String variant);

}
