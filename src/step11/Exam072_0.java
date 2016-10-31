package step11;

public class Exam072_0 {
  static class 포유류 {
    int v1;
    void m1() {
      System.out.println("A.m1()");
    }
  }
  static class 유인원 extends 포유류 {
    int v2;
    void m2() {
      System.out.println("B.m2()");
    }
  }
  static class 사람 extends 유인원 {
    int v3;
    void m3() {
      System.out.println("C.m3()");
    }
  }

  public static void main(String[] args) {
    포유류 a1 = new 포유류();
    포유류 a2 = new 유인원();
    포유류 a3 = new 사람();

    //B b1 = new 포유류(); //컴파일 오류!
    유인원 b2 = new 유인원();
    유인원 b3 = new 사람();

    //사람 c1 = new 포유류(); //컴파일 오류!
    //사람 c2 = new 유인원(); //컴파일 오류!
    사람 c3 = new 사람();
  }
}


/*
# 다형적 변수
- 레퍼런스 변수는 오직 한 개의 클래스 인스턴스만 저장하는 것이 아니다.
- 다양한 타입의 인스턴스를 저장할 수 있다.
- 단 같은 클래스이거나 하위 클래스의 인스턴스를 가리킬 수 있다.
*/
