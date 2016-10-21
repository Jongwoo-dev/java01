package step05.ex01;

public class Test02 {
  public static void main(String[] args) {
    int result = Calc.minus(3, 5);
    result = Calc.plus(result, 7);
    result = Calc.plus(result, 2);
    System.out.println(result);
  }
}
