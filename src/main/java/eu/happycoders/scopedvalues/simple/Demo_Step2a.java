package eu.happycoders.scopedvalues.simple;

import eu.happycoders.scopedvalues.foreign.ForeignService;

public class Demo_Step2a {

  private final ForeignService foreignService;

  public Demo_Step2a(ForeignService foreignService) {
    this.foreignService = foreignService;
  }

  public static void main(String[] args) {
    new Demo_Step2a(new ForeignService()).a();
  }

  private void a() {
    b();
  }

  private void b() {
    foreignService.doSomethingForeign(this::e);
  }

  private void e() {
    System.out.println("e called");
  }
}
