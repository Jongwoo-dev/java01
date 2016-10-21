package step05;

public class Exam048_6 {
  public static void main(String[] args) {
    int count = 0;
    int starCount = 0;
    while (count < 5) {
      while (starCount++ < 5 - count) {
        System.out.print('*');
      }
      System.out.println();
      starCount = 0;
      count++;
    }
  }
}

/*
*/
