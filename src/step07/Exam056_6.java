package step07;

public class Exam056_6 {

  public static void main(String[] args) {

    String s1 = new String("홍길동");
    String s2 = new String("홍길동");

    if (s1 == s2) {
      System.out.println("s1과 s2가 같은 인스턴스이다. 즉 주소가 같다.")
    }

    if (s1.equals(s2)) {
      System.out.println("s1 인스턴스에 저장된 값과 s2 인스턴스에 저장된 값이 같다.")
    }

  }
}
