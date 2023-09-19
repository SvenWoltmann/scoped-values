package eu.happycoders.scopedvalues.server.stage2_method_args;

import eu.happycoders.scopedvalues.model.Data;
import eu.happycoders.scopedvalues.model.User;

public class Repository {

  public void persist(Data data, User user) {
    // ...
    System.out.println("repository.persist() -- user = " + user);
    // ...
  }
}
