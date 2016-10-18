//주제 : Literal - 부동 소수점을 메모리에 저장하는 방법(2진수로 변환)

package step02;

public class Exam029 {
  public static final String name = "hello";
  public static final float ok = 12.375f;

  public static void main(String[] args) {
    //가수부 크기를 넘어가는 수는 짤린다.
    System.out.println(987.654321234567f);  //6자리까지 정확하게 저장됨
    System.out.println(987.654321234567);   //15자리까지 정확하게 저장됨.

    //부동소수점은 유효자릿수로 표현
    //4byte 유효자릿수 : 6자리
    //8byte 유효자릿수 : 15자리
  }
}
