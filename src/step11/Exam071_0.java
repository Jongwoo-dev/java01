package step11;

import java.util.Scanner;

public class Exam071_0 {
  static class A {
    int v1;
    void m1() {
      System.out.printf("A.m1(): %d\n", this.v1);
    }
  }
  static class B extends A {
    int v2;
    void m2() {
      System.out.printf("B.m2(): %d\n", this.v1);
      System.out.printf("B.m2(): %d\n", this.v2);
    }
  }

  public static void main(String[] args) {
    A obj = new A();
    obj.v1 = 100;
    obj.m1();

    B obj2 = new B();
    obj2.v2 = 100;
    obj2.m2();

    obj2.v1 = 200;
    obj2.m1();
  }
}
