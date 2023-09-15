package eu.happycoders.scopedvalues.simple;

public class Demo_Step1a {

  public static void main(String[] args) {
    new Demo_Step1a().a();
  }

  private void a() {
    b();
  }

  private void b() {
    c();
  }

  private void c() {
    d();
  }

  private void d() {
    e();
  }

  private void e() {
    System.out.println("e called");
  }
}
