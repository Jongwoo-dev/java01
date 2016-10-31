package step11;

import java.util.Scanner;

public class Exam071_2 {
  static class A {
    void m1() {System.out.printf("A.m1()\n");}
    void m2() {System.out.printf("A.m2()\n");}
  }
  static class B extends A {
    void m1() {System.out.printf("B.m1()\n");}
    void m3() {System.out.printf("B.m3()\n");}
    void test1() {
      this.m1();
      this.m2();
    }
    void test2() {
      super.m1(); // 오버라이딩 하기 전의 메서드 호출
      //super.m3(); // 만약 오버라이딩 메서드가 아니라면?
                  // 재정의하기 전의 메서드를 찾을 수 없다고 컴파일 오류 발생!
      this.m3();  // ok!
      super.m2(); // 무조건 수퍼 클래스 부터 찾는다.
    }
  }

  public static void main(String[] args) {
    B obj = new B();
    obj.test1();
    System.out.println("---------------------------");
    obj.test2();

  }
}
