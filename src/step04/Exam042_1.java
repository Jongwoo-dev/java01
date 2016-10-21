package step04;

public class Exam042_1 {
  public static void main(String[] args) {
    //문제 : 이력서에 프로그래밍 가능한 항목을 입력 받기
    // 프로그래밍 보기:
    //  Java, JavaScript, HTML, CSS, C, C++, PHP, Python, Perl, VB,
    //  R, Groovy, XML, Scala, Ruby, Swift, Object-C, Pascal, C#, Go

    boolean[] language = new boolean[] {
      true, true, true, true, true, true, true, true, true, true,
      false, true, true, false, false, false, true, true, false, false
    };

    // Java, C, C++을 할 줄 아는 사람인지 검사하라!
    // 셋 다 할줄 알면 ok  아니면 no

    String result = (language[0] && language[4] && language[5]) ? "ok" : "no";
    System.out.println(result);

    int v1 = (language[0]) ? 1 : 0;
    v1 = v1 + ((language[4]) ? 1 : 0);
    v1 = v1 + ((language[5]) ? 1 : 0);
    result = (v1 == 3) ? "Yes" : "No";
    System.out.println(result);
  }
}

/*

*/
