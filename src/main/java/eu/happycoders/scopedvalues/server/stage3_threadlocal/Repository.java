package eu.happycoders.scopedvalues.server.stage3_threadlocal;

import static eu.happycoders.scopedvalues.server.stage3_threadlocal.Server.LOGGED_IN_USER;

import eu.happycoders.scopedvalues.model.Data;

public class Repository {

  public void persist(Data data) {
    // ...
    System.out.println("repository.persist() -- user = " + LOGGED_IN_USER.get());
    // ...
  }
}
