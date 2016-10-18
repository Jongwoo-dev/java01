package step02;

public class Exam023 {
  public static void main(String[] args) {
    //println()에 넘겨주는 값이 어떤 진수로 표기했는지 상관없이
    //출력할 때는 무조건 10진수 표기법으로 출력한다.
    System.out.println(100);  //10진수
    System.out.println(0144); //8진수
    System.out.println(0x64); //16진수
    System.out.println(0X64); //16진수
    System.out.println(0b01100100); //2진수
    System.out.println(0B01100100); //2진수
  }
}
