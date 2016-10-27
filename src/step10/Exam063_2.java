package step10;

import java.util.Scanner;

public class Exam063_2 {
  static class MyType {
    static void m1() {
      System.out.println("스테틱 메서드 호출...");
    }

    void m2() {
      System.out.println("인스턴스 메서드 호출...");
    }
  }

  public static void main(String[] args) {
    MyType.m1();  // 스테틱 메서드 호출

    //MyType.m2();  // 컴파일 오류
                  // 인스턴스 메서드는 인스턴스 주소를 주지 않고 호출할 수 없다.

    MyType obj = new MyType();
    obj.m2(); // 인스턴스 주소가 있어야 호출할 수 있다.
              // 설사 인스턴스 안에 변수가 한 개도 없더라도 무조건
              // 인스턴스를 만들어야 한다.
  }
}
