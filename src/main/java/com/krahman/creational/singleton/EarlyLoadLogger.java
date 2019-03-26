package com.krahman.creational.singleton;

/* fine if the class loading operation is not a heavy process
Not thdread safe - static members are initialized when the class is referred first.
So if multiple threads are invoking the getLogger simultaneously, we could end up in
having more than instance
 */

public class EarlyLoadLogger {

  private static final EarlyLoadLogger logger = new EarlyLoadLogger();

  private EarlyLoadLogger(){}

  public static EarlyLoadLogger getLogger() {
    return logger;
  }
}
