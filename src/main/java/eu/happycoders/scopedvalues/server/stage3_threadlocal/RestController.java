package eu.happycoders.scopedvalues.server.stage3_threadlocal;

import eu.happycoders.scopedvalues.model.Data;
import eu.happycoders.scopedvalues.model.Request;

public class RestController {

  private final UseCase useCase;

  public RestController(UseCase useCase) {
    this.useCase = useCase;
  }

  public void handleRequest(Request request) {
    // ...
    Data data = extractData(request);
    useCase.invoke(data);
    // ...
  }

  private Data extractData(Request request) {
    return new Data();
  }
}
