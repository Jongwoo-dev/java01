package step05;

public class Exam046_8 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);


    if (age < 8)
      if (age < 2)
        System.out.println("아기입니다.");
    else  // <-- 이 else 문은 가장 가까운 if 문에 소속된다.
      System.out.println("어린이 입니다.");

  }
}
