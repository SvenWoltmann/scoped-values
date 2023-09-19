package eu.happycoders.scopedvalues.server.stage1;

import eu.happycoders.scopedvalues.model.Data;

public class UseCase {

  private final DAO dao;

  public UseCase(DAO dao) {
    this.dao = dao;
  }

  public void invoke(Data data) {
    // ...
    process(data);
    dao.save(data);
    // ...
  }

  private void process(Data data) {}
}
