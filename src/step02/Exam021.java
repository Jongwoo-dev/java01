package step02;

public class Exam021 {
  public static void main(String[] args) {
    System.out.println((char)44032);
    System.out.println((char)0xAC00);
    System.out.println((char)0xac00);
    System.out.println((char)0Xac00);
    System.out.println((char)0b1010110000000000);
    System.out.println((char)0B1010110000000000);
    System.out.println('홍');

    System.out.println((char)('홍' + 1));

    //물음표의 유니코드 값 출력하기
    System.out.println((int)'?'); //문자말고 숫자 값 출력하라!
    System.out.println((int)'"');
    System.out.println((int)'\'');
  }
}
