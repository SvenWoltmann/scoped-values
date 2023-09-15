package eu.happycoders.scopedvalues.foreign;

public class ForeignService {

  public void doSomethingForeign(Runnable callback) {
    // doing something
    callback.run();
    // doing something else
  }
}
