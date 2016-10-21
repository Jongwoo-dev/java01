package step06;
// varargs(가변 개수 아규먼트) 사용하기

public class Exam054_1 {
  static void greeting(String... names) {
    System.out.print("Hello, ");
    for (String name : names) {   //가변 개수 아규먼트는 배열처럼 사용한다.
      System.out.print(name + ",");
    }
    System.out.println();
  }

  public static void main(String[] args) {


    greeting("홍길동");  //컴파일 오류!
    greeting("홍길동", "임꺽정");
    greeting("홍길동", "임꺽정", "유관순");
    greeting("홍길동", "임꺽정", "유관순", "안중근");
  }
}
