package step02;

public class Exam022 {
  public static void main(String[] args) {
    System.out.println(100);  //실행할 때 4바이트 메모리 차지
    System.out.println(1);    //실행할 때 4바이트 메모리 차지
    System.out.println(100L); //실행할 때 8바이트 메모리 차지
    System.out.println(1l);   //실행할 때 8바이트 메모리 차지
  }
}
