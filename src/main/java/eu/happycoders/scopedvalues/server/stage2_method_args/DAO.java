package eu.happycoders.scopedvalues.server.stage2_method_args;

import eu.happycoders.scopedvalues.model.Data;
import eu.happycoders.scopedvalues.model.User;

public class DAO {

  private final Repository repository;

  public DAO(Repository repository) {
    this.repository = repository;
  }

  public void save(Data data, User user) {
    // ...
    repository.persist(data, user);
    // ...
  }
}
