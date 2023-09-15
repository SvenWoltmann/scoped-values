package eu.happycoders.scopedvalues.simple;

import eu.happycoders.scopedvalues.model.User;

public class Demo_Step1b_MethodArgs {

  public static void main(String[] args) {
    new Demo_Step1b_MethodArgs().a();
  }

  private void a() {
    User user = new User("Sven");
    b(user);
  }

  private void b(User user) {
    c(user);
  }

  private void c(User user) {
    d(user);
  }

  private void d(User user) {
    e(user);
  }

  private void e(User user) {
    System.out.println("e called, user = " + user);
  }
}
