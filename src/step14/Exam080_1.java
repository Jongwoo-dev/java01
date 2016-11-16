/*주제: 예외 처리 - 호출한 쪽에 예외 상황을 알리는 방식의 한계
=> C 프로그래밍 시절에는 리턴값을 검사하여 예외를 처리하였다.
=> 리턴 값으로 호출한 쪽에 예외 상황을 알리는 방식의 한계
   - 예외 상황일 때 리턴하는 값이, 정상적인 작업에서 나올 수 있다.
     이런 경우를 처리할 수 없다.
   - 작업을 수행하는 명령과 오류를 처리하는 명령이 섞여 있어서
     유지보수가 힘들다.
     소스 코드를 봤을 때 어떤 일을 하는 코드인지 한 눈에 들어오지 않는다.

*/
package step14;

import java.util.Scanner;

public class Exam080_1 {
  static int m1(int a, int b) {
    if (b == 0) {
      //0으로 나누려 한다면 호출할 쪽에 오류 상황을 알려야 한다.
      //어떻게? 리턴값으로!
      return -111199999;  //계산값으로 나올 가능성이 있는 값을 리턴한다.
    }
    return a / b;
  }
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    int v1 = keyScan.nextInt();
    int v2 = keyScan.nextInt();


    int result = m1(v1, v2);
    if (result == -111199999)  {

    } else {
      System.out.println("0으로 나눌 수 없습니다. ");
    }
    System.out.println(result);
    System.out.println("안녕히 가세요!");
  }
}

/*
*/
