package eu.happycoders.scopedvalues.server.stage2_method_args;

import eu.happycoders.scopedvalues.model.Data;
import eu.happycoders.scopedvalues.model.User;

public class UseCase {

  private final DAO dao;

  public UseCase(DAO dao) {
    this.dao = dao;
  }

  public void invoke(Data data, User user) {
    // ...
    process(data);
    dao.save(data, user);
    // ...
  }

  private void process(Data data) {}
}
