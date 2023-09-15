package eu.happycoders.scopedvalues.simple;

import eu.happycoders.scopedvalues.foreign.ForeignService;
import eu.happycoders.scopedvalues.model.User;

public class Demo_Step2c_ThreadLocal {

  private final ForeignService foreignService;

  public Demo_Step2c_ThreadLocal(ForeignService foreignService) {
    this.foreignService = foreignService;
  }

  public static void main(String[] args) {
    new Demo_Step2c_ThreadLocal(new ForeignService()).a();
  }

  private static final ThreadLocal<User> userHolder = new ThreadLocal<>();

  private void a() {
    User user = new User("Sven");
    userHolder.set(user);
    b();
  }

  private void b() {
    foreignService.doSomethingForeign(this::e);
  }

  private void e() {
    User user = userHolder.get();
    userHolder.remove();
    System.out.println("e called, user = " + user);
  }
}
