//주제 : 변수 선언 - 값의 종류(data type)와 메모리 크기

package step03;

public class Exam034 {
  public static void main(String[] args) {
    //1)정수
    byte b = 127;   //1바이트
    short s = 3_2767;   //2바이트
    int i = 21_4748_3647;   //4바이트
    long l = 922_3372_0368_5477_5807L;    //8바이트

    //2) 부동 소수점
    float f = 3.14159f;   //4바이트
    double d = 3.14159;   //8바이트

    //3) 논리값
    boolean bool = true;
    boolean bool2 = false;
    //boolean bool3 = 0;  //컴파일 오류!

    //4) 문자
    char c = 0xAC00;
    char c2 = 44032;
    char c3 = '\uAC00';
    char c4 = '가';

    //5) 문자열(primitive 타입이 아니다. 객체 타입이다. 공식적으로 레퍼런스라 부름)
    String str = "홍길동";
  }
}
