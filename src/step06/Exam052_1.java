//메서드 사용 후
package step06;

public class Exam052_1 {
  static void printStarsLine(int length) {
    int count = 0;
    while (count++ < length) {
      System.out.print("*");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int count = 6;
    while (--count > 0) {
      printStarsLine(count);  //정의된 메서드 호출
    }

    System.out.println("----------------------");
    count = 0;
    while (count++ < 5) {
      printStarsLine(count);
    }
  }
}
