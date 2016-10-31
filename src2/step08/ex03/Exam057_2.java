package step08.ex03;

public class Exam057_2 {
  public static void main(String[] args) {
    Calculator2 calc = new Calculator2();

    calc.plus(10);
    calc.plus(7);
    calc.minus(5);

    calc.multiple(2);
    
    System.out.println(calc.result);
  }
}
