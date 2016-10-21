package step05.ex01;

public class Test04_2 {
  public static void main(String[] args) {
    Calc3 calcA = new Calc3();
    Calc3 calcB = new Calc3();

    Calc3.plus(calcA, 3);
    Calc3.plus(calcB, 7);
    Calc3.minus(calcA, 5);
    Calc3.plus(calcB, 3);
    Calc3.plus(calcA, 7);
    Calc3.minus(calcB, 2);
    Calc3.plus(calcA, 2);
    Calc3.minus(calcB, 1);
    System.out.println(calcA.result);
    System.out.println(calcB.result);

  }
}
