package eu.happycoders.scopedvalues.server.stage2_method_args;

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

  private void serve(Request request) {
    // ...
    User user = new User("Sven");
    restController.handleRequest(request, user);
    // ...
  }
}
