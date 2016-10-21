/* 퀴즈
1) 0 ~ 9 까지 숫자를 출력한다
2) 각 숫자가 홀수인지 짝수인지 출력한다.
출력 예:
0(짝수)
1(홀수)
2(짝수)
*/

package test;

public class Test01 {
  public static void main(String[] args) {
    String s;
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0)
        s = "짝수";
      else
        s = "홀수";

      System.out.printf("%d(%s)\n", i, s);
    }
  }
}
