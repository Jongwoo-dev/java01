package step05;

public class Exam045_2 {
  public static void main(String[] args) {
    int a = 10;
    {
      int b = 20;
      a = 20;

      //int a = 30; //컴파일 오류
      //Sring a = "헐..."; //컴파일 오류
    }

    {
      int b = 300;
    }

  }
}
