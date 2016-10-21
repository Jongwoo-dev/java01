package step06;

public class Exam053_4 {
  static String greeting(String name) {
    return "Hello, " + name;
  }

  public static void main(String[] args) {

    String message = greeting("홍길동"); // 문자열 "Hello, 홍길동" 를 리턴 받는다.
    System.out.println(message);

  }
}
