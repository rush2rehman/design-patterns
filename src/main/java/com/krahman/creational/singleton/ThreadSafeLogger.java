package com.krahman.creational.singleton;

public class ThreadSafeLogger {

  private static ThreadSafeLogger logger = null;

  private ThreadSafeLogger(){}

  synchronized public static ThreadSafeLogger getLogger()
  {
    if(logger == null)
    {
      logger = new ThreadSafeLogger();
    }
    return logger;
  }

  public synchronized void writeToFile(String conentToAppend)
  {
    //
  }

}
