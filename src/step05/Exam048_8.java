package step05;

public class Exam048_8 {
  public static void main(String[] args) {
    int x = 1;
    int y = 0;
    while (x++ < 9 ) {
      while (y++ < 9) {
        System.out.printf("%d * %d = %d\n", x, y, x * y);
      }
      System.out.println();
      y = 0;
    }
  }
}

/*
*/
