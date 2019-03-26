package com.krahman.creational.singleton;
/*
Not thdread safe -  if multiple threads are invoking the getLogger simultaneously, we could end up in
    having more than instance
    */
public class LazyLoadLogger {

  private static LazyLoadLogger logger = null;

  private LazyLoadLogger()
  {

  }

  public static LazyLoadLogger getLogger() {
    if(logger == null)
    {
      logger = new LazyLoadLogger();
    }
    return logger;
  }
}
