public class Exam008 {
  public static void main(String[] args) {
    m1("홍길동"); //메서드 실행하기
    m2("전봉준");
  }

  static void m1(String name) {
    System.out.print(name);
    System.out.print("님 안녕하세요.\n");
  }

  private static void m2(String name) {
    System.out.print("Hello, ");
    System.out.print(name + "\n");
  }
}
