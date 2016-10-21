package step05.ex01;

public class Test04 {
  public static void main(String[] args) {
    Calc2.plus(3);
    Calc2.minus(5);
    Calc2.plus(7);
    Calc2.plus(2);
    System.out.println(Calc2.result);

    Calc2.result = 0;
    Calc2.plus(7);
    Calc2.plus(3);
    Calc2.minus(2);
    Calc2.minus(1);
    System.out.println(Calc2.result);
  }
}
