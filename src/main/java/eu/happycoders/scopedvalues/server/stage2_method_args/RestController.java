package eu.happycoders.scopedvalues.server.stage2_method_args;

import eu.happycoders.scopedvalues.model.Data;
import eu.happycoders.scopedvalues.model.Request;
import eu.happycoders.scopedvalues.model.User;

public class RestController {

  private final UseCase useCase;

  public RestController(UseCase useCase) {
    this.useCase = useCase;
  }

  public void handleRequest(Request request, User user) {
    // ...
    Data data = extractData(request);
    useCase.invoke(data, user);
    // ...
  }

  private Data extractData(Request request) {
    return new Data();
  }
}
