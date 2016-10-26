package step08;

public class Exam061_6 {
  static class Calculator {
    int sum = 0;

    void plus(int a) {this.sum += a;}
    void minus(int a) {this.sum -= a;}
    void multiple(int a) {this.sum *= a;}
    void divide(int a) {this.sum /= a;}
  }

  public static void main(String[] args) {
    //계산 수행(연산자 우선순위 고려하지 않는다.)
    //만약에 두 개의 계산을 동시에 실행한다면?
    //=> 3 + 2 * 3 - 1 = 14
    //=> 4 * 5 - 7 / 2 = 6

    //두 개의 계산식의 결과를 저장할 메모리를 따로 따로 준비한다.
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    c1.plus(3);
    c2.plus(4);

    c1.plus(2);
    c2.multiple(5);

    c1.multiple(3);
    c2.minus(7);

    c1.minus(1);
    c2.divide(2);

    System.out.println(c1.sum);
    System.out.println(c2.sum);
  }

}
