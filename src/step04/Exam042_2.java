package step04;

public class Exam042_2 {
  public static void main(String[] args) {
    //문제 : 이력서에 프로그래밍 가능한 항목을 입력 받기
    // 프로그래밍 보기:
    //  Java, JavaScript, HTML, CSS, C, C++, PHP, Python, Perl, VB,
    //  R, Groovy, XML, Scala, Ruby, Swift, Object-C, Pascal, C#, Go

    byte[] language = new byte[] {
      1, 1, 1, 1, 0, 1, 1, 1, 1, 1,
      0, 1, 1, 0, 0, 0, 1, 1, 0, 0
    };

    // Java, C, C++을 할 줄 아는 사람인지 검사하라!
    // 셋 다 할줄 알면 ok  아니면 no


    int v1 = language[0] + language[4] + language[5];
    String result = (v1 == 3) ? "Yes" : "No";
    System.out.println(result);
  }
}

/*

*/
