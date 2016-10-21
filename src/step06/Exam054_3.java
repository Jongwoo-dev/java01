package step06;

public class Exam054_3 {
  static void score(int[] values, String name) {
    int sum = 0;
    for (int value : values) {
      sum += value;
    }
    System.out.printf("%s님의 총점은 %d 입니다.\n", name, sum);

  }

  //가변 개수 아규먼트는 뒤에 다른 변수를 선언할 수 없다.
  //반드시 맨 마지막에 와야 한다.
  static void score2(String name, int... values) {
    int sum = 0;
    for (int value : values) {
      sum += value;
    }
    System.out.printf("%s님의 총점은 %d 입니다.\n", name, sum);
  }

  public static void main(String[] args) {
    score(new int[]{100, 90, 80}, "홍길동");
    score2("임꺽정", 100, 90, 80);

  }
}
