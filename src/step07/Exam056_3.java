package step07;

public class Exam056_3 {
  public static void main(String[] args) {

    String s1 = "홍길동";

    String s2 = "홍길동";
    String s3 = "홍길동";

    if (s1 == s2) {   //주소가 같은지 검사한다.
      System.out.println("s1 == s2");
    }

    if (s1 == s3) {
      System.out.println("s1 == s3");
    }

    if (s2 == s3) {
      System.out.println("s2 == s3");
    }
  }
}
