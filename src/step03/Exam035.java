//주제 : 변수 선언 - 다른 종류의 메모리를 여러 개 묶어서 준비하기

package step03;

public class Exam035 {
  static class Score {    //4 종류의 메모리를 묶어 새 데이터 타입을 만든다.
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }

  public static void main(String[] args) {
    Score s1 = new Score();

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 100;
    s1.math = 100;
    s1.sum = s1.kor + s1.eng + s1.math;
    s1.aver = s1.sum / 3;

    System.out.println(s1.name);
    System.out.println(s1.kor);
    System.out.println(s1.eng);
    System.out.println(s1.math);
    System.out.println(s1.sum);
    System.out.println(s1.aver);
  }
}
