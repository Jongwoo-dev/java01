package step11;

import java.util.Scanner;

public class Exam072_1 {
  static class A {
    int v1;
    void m1() {
      System.out.println("A.m1()");
    }
  }
  static class B extends A {
    int v2;
    void m2() {
      this.v1 = 100;
      this.v2 = 200;
      System.out.println("B.m2()");
    }
  }
  static class C extends B {
    int v3;
    void m3() {
      this.v1 = 100;
      this.v2 = 200;
      this.v3 = 300;
      System.out.println("C.m3()");
    }
  }

  public static void main(String[] args) {
    A a1 = new A();
    A a2 = new B();
    A a3 = new C();

    //B b1 = new A(); //컴파일 오류!
    B b2 = new B();
    B b3 = new C();

    //C c1 = new A(); //컴파일 오류!
    //C c2 = new B(); //컴파일 오류!
    C c3 = new C();
  }
}


/*
# 다형적 변수
- 레퍼런스 변수는 오직 한 개의 클래스 인스턴스만 저장하는 것이 아니다.
- 다양한 타입의 인스턴스를 저장할 수 있다.
- 단 같은 클래스이거나 하위 클래스의 인스턴스를 가리킬 수 있다.

#ckarh
- 클래스이름, 변수이름, 메서드 이름은 유니코드에서 특수 문자나
  자바에서 사용하지 말라고
  사용할 수 있다.
*/
