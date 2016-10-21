//
package step06;

public class Exam052_2 {
  static void printStarsLine(int length) {
    int count = 0;
    while (count++ < length) {
      System.out.print("*");
    }
    System.out.println();
  }

  static void printCenterStarsLine(int lineSize, int starLength) {
    //lineSize와 starLength가 짝수이면 1을 더한다.(홀수로 만들어준다.)
    //별 개수 <= 라인 크기
    //별 개수가 라인크기보다 클 경우 별 갯수를 라인크기 만큼만 찍는다.
    if (lineSize % 2 == 0) {
      lineSize++;
    }

    if (starLength % 2 == 0) {
      starLength++;
    }

    if (starLength > lineSize) {
      starLength = lineSize;
    }

    int count = 0;
    int spaceLength = (lineSize - starLength) / 2;

    while (count++ < spaceLength) {
      System.out.print(" ");
    }

    count = 0;
    while (count++ < starLength) {
      System.out.print("*");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int count = 6;
    /*
    while (--count > 0) {
      printStarsLine(count);  //정의된 메서드 호출
    }
    */

    System.out.println("----------------------");
    count = 1;

    while (count <= 9) {
      printCenterStarsLine(9, count);
      count += 2;
    }

    //printCenterStarsLine(9, 3);
  }
}
