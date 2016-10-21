package step05.ex01;

public class Test05 {
  public static void main(String[] args) {
    Calc4 calcA = new Calc4();
    Calc4 calcB = new Calc4();

    calcA.plus(3);
    calcB.plus(7);
    calcA.minus(5);
    calcB.plus(3);
    calcA.plus(7);
    calcB.minus(2);
    calcA.plus(2);
    calcB.minus(1);
    System.out.println(calcA.result);
    System.out.println(calcB.result);

    Calc4 calcX = null;

  }
}
