package eu.happycoders.scopedvalues.server.stage1;

import eu.happycoders.scopedvalues.model.Data;

public class DAO {

  private final Repository repository;

  public DAO(Repository repository) {
    this.repository = repository;
  }

  public void save(Data data) {
    // ...
    repository.persist(data);
    // ...
  }
}
