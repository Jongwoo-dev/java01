package step08;

public class Exam061_4 {
  static class Calculator {
    static int sum = 0;

    static void plus(int a) {sum += a;}
    static void minus(int a) {sum -= a;}
    static void multiple(int a) {sum *= a;}
    static void divide(int a) {sum /= a;}
  }

  public static void main(String[] args) {
    //계산 수행(연산자 우선순위 고려하지 않는다.)
    //만약에 두 개의 계산을 동시에 실행한다면?
    //=> 3 + 2 * 3 - 1 = 14
    //=> 4 * 5 - 7 / 2 = 6

    Calculator.plus(3);
    Calculator.plus(2);
    Calculator.multiple(3);
    Calculator.minus(1);
    System.out.println(Calculator.sum);

    Calculator.sum = 0;
    Calculator.plus(4);
    Calculator.multiple(5);
    Calculator.minus(7);
    Calculator.divide(2);
    System.out.println(Calculator.sum);
  }

}
