package eu.happycoders.scopedvalues.server.stage4_scopedvalue;

import static eu.happycoders.scopedvalues.server.stage4_scopedvalue.Server.LOGGED_IN_USER;

import eu.happycoders.scopedvalues.model.Data;

public class Repository {

  public void persist(Data data) {
    // ...
    System.out.println("repository.persist() -- user = " + LOGGED_IN_USER.get());
    ScopedValue.where(LOGGED_IN_USER, null).run(() -> Logger.log("Data persisted"));
    System.out.println("repository.persist() -- user = " + LOGGED_IN_USER.get());
    // ...
  }
}
