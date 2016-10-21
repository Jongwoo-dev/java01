package step04;

public class Exam040_0 {
  public static void main(String[] args) {
    //boolean v = 10 && 20;   //컴파일 오류!
    boolean v = true && true;
    System.out.println(v);
    System.out.println(true && false);
    System.out.println(false && true);
    System.out.println(false && false);

    System.out.println("------------------------");

    System.out.println(true || true);
    System.out.println(true || false);
    System.out.println(false || true);
    System.out.println(false || false);
  }
}

/*

*/
