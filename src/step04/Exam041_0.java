package step04;

public class Exam041_0 {
  public static void main(String[] args) {
    int age = 10;

    //컴파일 오류
    //(age < 19) ? System.out.println("미성년") : System.out.println("성년");

    String result = (age < 19) ? "미성년" : "성년";
    System.out.println(result);
    
  }
}

/*

*/
