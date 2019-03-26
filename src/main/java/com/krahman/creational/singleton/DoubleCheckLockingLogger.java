package com.krahman.creational.singleton;

public class DoubleCheckLockingLogger {

  private static DoubleCheckLockingLogger logger = null;

  private DoubleCheckLockingLogger()
  {}

  public static DoubleCheckLockingLogger getLogger() {
    if(logger == null)
    {
      synchronized (DoubleCheckLockingLogger.class)
      {
        if (logger == null) {
          logger = new DoubleCheckLockingLogger();
        }
      }
    }
    return logger;
  }

  public synchronized void writeToFile(String conentToAppend)
  {
    //
  }
}
