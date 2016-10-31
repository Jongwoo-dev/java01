package step11;

import java.util.Scanner;

public class Exam071_1 {
  static class A {
    void m1() {
      System.out.printf("A.m1()\n");
    }
  }
  static class B extends A {
    void m1() {
      System.out.printf("B.m1()\n");
    }
    void m2() {
      System.out.printf("B.m2()\n");
    }
  }

  public static void main(String[] args) {
    A obj = new A();
    obj.m1();

    B obj2 = new B();
    obj2.m2();
    obj2.m1();  // 수퍼 클래스가 아닌 레퍼런스 타입(클래스)에 정의되어 있는
                // m1()을 호출한다.
  }
}
