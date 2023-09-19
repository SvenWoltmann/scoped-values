package eu.happycoders.scopedvalues.server.stage4_scopedvalue;

import eu.happycoders.scopedvalues.model.Request;
import eu.happycoders.scopedvalues.model.User;

public class Server {

  private final RestController restController;

  public Server(RestController restController) {
    this.restController = restController;
  }

  public static void main(String[] args) {
    Repository repository = new Repository();
    DAO dao = new DAO(repository);
    UseCase useCase = new UseCase(dao);
    RestController restController = new RestController(useCase);
    new Server(restController).serve(new Request());
  }

  public static final ScopedValue<User> LOGGED_IN_USER = ScopedValue.newInstance();

  private void serve(Request request) {
    // ...
    User user = new User("Sven");
    ScopedValue.where(LOGGED_IN_USER, user).run(() -> restController.handleRequest(request));
    // ...
  }
}
