package step11;

import java.util.Scanner;

public class Exam069_2 {
  static class A {
    int v1;
    void m1() {
      System.out.println("A.m1()");
    }
  }
  static class B extends A {
    int v2;
    void m2() {
      System.out.println("B.m2()");
    }
  }
  static class C extends B {
    int v3;
    void m3() {
      System.out.println("C.m3()");
    }
  }

  public static void main(String[] args) {
    C obj = new C();
    obj.m1();

  }
}

/*
- 서브 클래스는 수퍼 클래스의 정보를 갖고 있다.
- 주의!
  상속의 의미는 서브 클래스가 수퍼 클래스의 코드를 사용할 수 있다는 뜻이다.
  그래서 서브 클래스는 수퍼 클래스의 코드를 포함하지 않는다.
  다만 수퍼 클래스에 대한 연결 정보만 갖고 있다.
- 결론
  서브 클래스를 컴파일하거나 실행하려면 반드시 수퍼 클래스가 있어야 한다.
*/
