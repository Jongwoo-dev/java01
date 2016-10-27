package step10;

import java.util.Scanner;

public class Exam063_6 {
  static class MyType {
    static int a;
    int b;
    static {  // 스태틱 초기화 블록
      System.out.println("스태틱 초기화 블록");
      a = 20;
    }


    { //인스턴스 초기화 블록
      System.out.println("인스턴스 초기화 블록");
      this.b = 20;
    }

    public MyType() {
      System.out.println("생성자 호출");
      this.b = 30;
    }
  }

  public static void main(String[] args) {
    System.out.println(MyType.a);
    MyType.a = 100;
    System.out.println(MyType.a);
    System.out.println("-----------------------------");

    MyType obj; //레퍼런스는 인스턴스 블록 실행하고 상관없다.
    obj = new MyType();
    System.out.println(obj.b);

    MyType obj2 = new MyType();
    System.out.println(obj2.b);

  }
}
