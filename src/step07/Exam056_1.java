package step07;

public class Exam056_1 {
  public static void main(String[] args) {

    String s1;
    s1 = new String("홍길동");

    String s2 = s1;
    String s3 = s2;

    if (s1 == s2) {   //주소가 같은지 검사한다.
      System.out.println("s1 == s2");
    }

    if (s1 == s3) {
      System.out.println("s1 == s3");
    }

  }
}
