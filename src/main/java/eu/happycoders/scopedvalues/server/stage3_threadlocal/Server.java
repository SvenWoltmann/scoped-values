package eu.happycoders.scopedvalues.server.stage3_threadlocal;

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

  public static final ThreadLocal<User> LOGGED_IN_USER = new ThreadLocal<>();

  private void serve(Request request) {
    // ...
    User user = new User("Sven");
    LOGGED_IN_USER.set(user);
    restController.handleRequest(request);
    // ...
  }
}
