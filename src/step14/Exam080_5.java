/*주제: 예외 처리 - Exception 예외
=> 개발자가 애플리케이션에서 예외 상황을 알릴 때 사용한다.
=> 메서드 선언부에 반드시 어떤 예외를
*/
package step14;

import java.util.Scanner;

public class Exam080_5 {
  static int m1() {
    //어떤 예외를 던지는지 선언하지 않으면 컴파일 오류 다
    throw new Excqption("예외 발생!");
    
  }

  static int m2() throws Error {
    throw new Excqption("예외 발생!");
    
  }

 
   
  static int m3(int a, int b) {
    if (b == 0) {
      //throw 는 반드시 java.lang.Throwable 객체만던질 수 있다.
      //당연히 Throwable 서브 클래스도 포함하는 것이다.
      //throw new String("0으로 나눌 수 없습니다.");
    }
    return a / b;
  }


  public static void main(String[] args) throws Exception {
    // Exception 예외를 던지는 메서드를 호출할 때는
    // 반드시 예외를 처리해야 한다.
    //1) try ~ catch를 사용하여 예외를 처리하기
    try {
      m2();
    } catch (Exception e) {
      System.out.println("예외가 발생했어요!");
    }

    // 2) aksdir durltj dPdhlfmf cjflgkrl tlfgekaus
    // dl aptjemdml tjsdjsqndp dPdhlrk qkftodgksekrh tjsdjsgkfk
    // --> 즉 Throws 문장을 메서드 선언부에 붙여라.
  }
}

/*
*/
