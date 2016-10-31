package step11;

import java.util.Scanner;

public class Exam068_2 {
  public static void main(String[] args) {
    MyCalculator calc = new MyCalculator();
    // 7 - 5 ** 4 % 3 = 1
    calc.plus(7);
    calc.multiple(5);
    calc.power(4);
    calc.remainder(3);
    System.out.println(calc.result);
  }
}

/*
#상속의 방법
1) Specialization (기능 특화)
  - 기존의 기능을 확장하여 서브 클래스를 만드는 것
2) Generalization (기능 일반화)
  - 기존의 클래스들의 공통점을 모아서 수퍼 클래스를 만드는 것
*/
