package step10;

import java.util.Scanner;

public class Exam063_0 {
  static class MyType {
    static int a;
    int b;
  }
  public static void main(String[] args) {
    // 1) tmxoxlr qustn tkdydqjq
    MyType.a = 100; // 스태틱 변수는 클래스 이름(주소)로 접근한다.
    System.out.println(MyType.a);

    //MyType.b = 100; // 컴파일 오류!
                      // non-static 변수(인스턴스 변수)는 인스턴스 주소가 있어야 한다.

    // 2) 인스턴스 변수 사용법
    // => 인스턴스를 먼저 만든다.
    MyType obj = new MyType();
    // => 인스턴스 주소를 토앻 인스턴스 변수에 접근한다.
    obj.b = 200;

    // => 또 다른 인스턴스 만들기
    MyType obj2 = new MyType();
    obj2.b = 300;

    System.out.println(obj.b);
    System.out.println(obj2.b);
  }
}
