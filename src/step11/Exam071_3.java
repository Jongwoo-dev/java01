package step11;

import java.util.Scanner;

public class Exam071_3 {
  static class A {
    void m1() {System.out.printf("A.m1()\n");}
    void m2() {System.out.printf("A.m2()\n");}
  }
  static class B extends A {
    void m2() {System.out.printf("B.m2()\n");}
    void m3() {System.out.printf("B.m3()\n");}
  }
  static class C extends B {
    void m1() {System.out.printf("C.m1()\n");}
    void m2() {System.out.printf("C.m2()\n");}
    void m4() {System.out.printf("C.m4()\n");}
    void test1() {
      //super.m4(); // 컴파일 오류! 조상 클래스 중에 m4() 메서드가 없다.
      super.m1(); // ok! A.m1()
      super.m2(); // ok! B.m2()
      super.m3(); // ok! B.m3()
      //super.super.m2(); // 컴파일 오류! 이런 문법은 없다.
    }
  }

  public static void main(String[] args) {
    C obj = new C();
    obj.test1();

  }
}
