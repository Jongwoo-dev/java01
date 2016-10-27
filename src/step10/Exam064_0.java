package step10;

import java.util.Scanner;

public class Exam064_0 {
  static {
    System.out.println("Exam064_0: 스태틱 블록 실행");
  }
  static class MyType {
    static int a;
    int b;
    static {
      System.out.println("MyType: 스태틱 초기화 블록");
    }

    static void m1() {
      System.out.println("MyType: m1()");
    }
  }

  public static void main(String[] args) {

    System.out.println("main()....");
    // 1) MyType 클래스 로딩 시키기: 스태틱 변수를 사용한다.
    //MyType.a = 100; //MyType 클래스 로딩 --> 스태틱 변수 생성 --> 스태틱 초기화 블록 실행

    // 2) MyType 클래스 로딩 시키기: 스태틱 메서드를 사용한다.
    //MyType.m1();

    // 3) MyType 클래스 로딩 시키기: new 명령을 사용한다.
    //new MyType();
    //new MyType(); // 한 번 클래스가 로딩되면 중복해서 로디오디지 않는다.

    // 4) 레퍼런스 변수 선언은 클래스를 로딩하지 않는다.
    MyType obj = null;

  }
}
