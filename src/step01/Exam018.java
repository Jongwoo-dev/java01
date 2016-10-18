package step01;

public class Exam018 {
  public static void main(String[] args) {
    String name = "홍길동";
    int age = 20;

    //서식이 없는 문자열 출력
    System.out.println("이름: "+ name + ", 나이: " + age);

    //서식이 있는 문자열 출력
    System.out.printf("이름: %s, 나이: %d\n", name, age);

  }
}
