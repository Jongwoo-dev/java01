/*주제: 예외 처리 - Exception 예외의 불편함
=> Exception 을 던지는 메서드를 호출하는 경우
   반드시 예외 처리를 해야 한다. 
*/
package step14;

import java.util.Scanner;

public class Exam080_6 {
  static void m1() throws Exception {
    m2();
  }
  static void m2() throws Exception {
    m3();
  }
  static void m3() throws Exception {
    m4();
  }
  static void m4() throws Exception {
    throw new Exception("예외발생!");
  }
  public static void main(String[] args) {
    try {
      m1();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
  }
}

/*
nextInt()
=> 사용자가 입력한 문자열에서 공백 또는 줄바꿈 코드를 만나면
   그 문자열을 끊어서 숫자로 바꾼 다음 리턴한다.
   단 한 개 문자열만 끊어서 숫자로 바꾼다.
*/
