package step05.ex01;

public class Calc3{
  int result;

  static void plus(Calc3 instanceAddress, int a) {
    instanceAddress.result += a;
  }

  static void minus(Calc3 instanceAddress, int a) {
    instanceAddress.result -= a;
  }
}
