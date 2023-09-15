package eu.happycoders.scopedvalues.simple;

import eu.happycoders.scopedvalues.foreign.ForeignService;
import eu.happycoders.scopedvalues.model.User;

public class Demo_Step2b_MethodArgs {

  private final ForeignService foreignService;

  public Demo_Step2b_MethodArgs(ForeignService foreignService) {
    this.foreignService = foreignService;
  }

  public static void main(String[] args) {
    new Demo_Step2b_MethodArgs(new ForeignService()).a();
  }

  private void a() {
    User user = new User("Sven");
    b(user);
  }

  private void b(User user) {
    // ???
    foreignService.doSomethingForeign(this::e);
  }

  private void e() {
    System.out.println("e called");
  }
}
