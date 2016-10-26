package step07;

public class Exam056_4 {
  static void m1(String p1) {
    String s = "홍길동";

    if (p1 == s) {   //주소가 같은지 검사한다.
      System.out.println("p1 == s");
    }
  }

  public static void main(String[] args) {

    String s1 = "홍길동";
    m1(s1);

  }
}
