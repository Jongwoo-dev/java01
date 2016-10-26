package step08;

public class Exam061_5 {
  static class Calculator {
    int sum = 0;

    static void plus(Calculator that, int a) {that.sum += a;}
    static void minus(Calculator that, int a) {that.sum -= a;}
    static void multiple(Calculator that, int a) {that.sum *= a;}
    static void divide(Calculator that, int a) {that.sum /= a;}
  }

  public static void main(String[] args) {
    //계산 수행(연산자 우선순위 고려하지 않는다.)
    //만약에 두 개의 계산을 동시에 실행한다면?
    //=> 3 + 2 * 3 - 1 = 14
    //=> 4 * 5 - 7 / 2 = 6

    //두 개의 계산식의 결과를 저장할 메모리를 따로 따로 준비한다.
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    Calculator.plus(c1, 3);
    Calculator.plus(c2, 4);

    Calculator.plus(c1, 2);
    Calculator.multiple(c2, 5);

    Calculator.minus(c2, 7);
    Calculator.multiple(c1, 3);

    Calculator.divide(c2, 2);
    Calculator.minus(c1, 1);

    System.out.println(c1.sum);
    System.out.println(c2.sum);
  }

}
