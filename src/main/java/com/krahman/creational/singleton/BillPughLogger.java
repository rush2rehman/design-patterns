package com.krahman.creational.singleton;

public class BillPughLogger {

  private BillPughLogger()
  {

  }

  private static class Logger{
    public static BillPughLogger logger = new BillPughLogger();
  }

  public static BillPughLogger getLogger() {
    return Logger.logger;
  }

  public synchronized void writeToFile(String contentToAppend)
  {
    //
  }
}
