package step11;

public class Exam075_1 /*extends Object*/ {
  static class A /*extends Object*/ {}
  static class B extends A {}

  public static void main(String[] args) {
    // 어떤 클래스의 인스턴스 또는 자손인지 확인하는 방법
    // => instanceof 연산자 사용
    // => [인스턴스 주소] instanceof [클래스명] => boolean 리턴
    A obj1 = new A();

    String str = obj1.toString(); //수퍼 클래스 Object의 toString() 메서드.
    System.out.println(str);
  }
}

/*
# java.lang.Object 클래스
- 자바 클래스는 반드시 수퍼 클래스가 있어야 한다.
- 만약 개발자가 수퍼클래스를 지정하지 않으면,
  자동으로 Object를 상속 받는다.
- 따라서 모든 자바 클래스는 Object의 자손이다.
*/
