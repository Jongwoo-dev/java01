package step04;

public class Exam042_3 {
  public static void main(String[] args) {
    //문제 : 이력서에 프로그래밍 가능한 항목을 입력 받기
    // 프로그래밍 보기:
    //  Java, JavaScript, HTML, CSS, C, C++, PHP, Python, Perl, VB,
    //  R, Groovy, XML, Scala, Ruby, Swift, Object-C, Pascal, C#, Go

    int language = 0b00000000_00001111_11111101_10001100;
    //             0b00000000_00001000_00000000_00000000; <--Java
    //             0b00000000_00000100_00000000_00000000; <--JavaScript
    //             0b00000000_00000010_00000000_00000000; <--HTML
    //             0b00000000_00000001_00000000_00000000; <--CSS
    //             0b00000000_00000000_10000000_00000000; <--C
    //             0b00000000_00000000_01000000_00000000; <--C++
    // Java, C, C++을 할 줄 아는 사람인지 검사하라!
    // 셋 다 할줄 알면 ok  아니면 no


    String result = ((language & 0x8C000) == 0x8C000) ? "Yes" : "No";
    System.out.println(result);
  }
}

/*

*/
