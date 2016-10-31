package step08.ex03;

public class Exam057_1 {
  public static void main(String[] args) {
    Calculator calc = null;

    calc = new Calculator();
    calc.plus(10);
    calc.plus(7);
    calc.minus(5);
    System.out.println(calc.result);
  }
}
