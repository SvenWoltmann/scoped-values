package eu.happycoders.scopedvalues.server.stage4_scopedvalue;

import static eu.happycoders.scopedvalues.server.stage4_scopedvalue.Server.LOGGED_IN_USER;

public class Logger {

  public static void log(String message) {
    System.out.println("Logger.log()         -- user = " + LOGGED_IN_USER.get());
  }
}
