package eu.happycoders.scopedvalues.simple;

import eu.happycoders.scopedvalues.foreign.ForeignService;
import eu.happycoders.scopedvalues.model.User;

public class Demo_Step2d_ScopedValue {

  private final ForeignService foreignService;

  public Demo_Step2d_ScopedValue(ForeignService foreignService) {
    this.foreignService = foreignService;
  }

  public static void main(String[] args) {
    new Demo_Step2d_ScopedValue(new ForeignService()).a();
  }

  private static final ScopedValue<User> userHolder = ScopedValue.newInstance();

  private void a() {
    User user = new User("Sven");
    ScopedValue.where(userHolder, user).run(this::b);
  }

  private void b() {
    foreignService.doSomethingForeign(this::e);
  }

  private void e() {
    User user = userHolder.get();
    System.out.println("e called, user = " + user);

    ScopedValue.where(userHolder, null).run(this::f);

    System.out.println("e called, user = " + user);
  }

  private void f() {
    User user = userHolder.get();
    System.out.println("f called, user = " + user);
  }
}
