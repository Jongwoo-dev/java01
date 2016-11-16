/*주제: 예외 처리 - Error 예외
=> 
*/
package step14;

import java.util.Scanner;

public class Exam080_4 {
  static int m1() {
    throw new Error("예외 발생!");
    
  }

  static int m2() throws Error {
    throw new Error("예외 발생!");
    
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
    // 1) Error 예외를 처리하지 않으면 메서드의 실행을 즉시 멈추고
    //    상위 호출자에게 예외 객체를 자동 전달한다.
    // => main() 메서드의 상위 호출자는? JVM이다.
    // => JVM은 예외를 받으면 그냥 예외 정보를 꺼내 출력한다.
    
    // 2) 상위 호출자에게 예외를 전달하기 싫다면,
    // try ~ catch ~ 를 사용하여 예외를 처리하라!
    // try { 
    //   m1();
    // } catch (Error e) { 
    //   System.out.println("오호라.. 예외 발생!"); 

    // }

    // 3) Error 객체를 던지는 경우, 메서드 선언부에 예외를 던진다고 되어 있거나
    // 되어 있지 않거나 동일하게 다룬다. 즉 m1()이나 m2()나 똑같다.
    // => 그럼에도 불구하고 개발자가 m2()를 정의할 때 메서드 선언부에 
    //    어떤 예외를 던지는지 추가했다면,
    //    그것은 다른 개발자에게 자신이 만든 메서드가 어떤 예외를 던진 수 있는지
    //    알려주기 위함이다.
    m2(); 
  }
}

/*
*/
