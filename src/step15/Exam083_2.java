/*상속 - super() : 수퍼 클래스의 생성자 호출 III
=> 
*/
package step15;

public class Exam083_2 {
  static class A {
    int v1;
    public A() {
      // super() 명령어가 없으면, 다음 코드를 자동으로 삽입한다.
      // 그래서 다음 코드를 생략해도 된다.
      //super();
      System.out.println("A()...");
      v1 = 100;
    }
  }

  static class B extends A {
    int v2;
    public B() {
      // 항상 첫 줄은 수퍼 클래스의 생성자 호출 명령어가 있어야 한다.
      super();
      System.out.println("B()...");
      v2 = 200;
    } 
  }

  static class C extends B {
    int v3;
    public C() {
      // 항상 첫 줄은 수퍼 클래스의 생성자 호출 명령어가 있어야 한다.
      super();
      System.out.println("C()...");
      v3 = 300;
    }
  }

  public static void main(String[] args){
    A obj1 = new A();
    System.out.println("----------------------------");

    B obj2 = new B();
    System.out.println("----------------------------");

    C obj3 = new C();
    System.out.println("----------------------------");
  }
}

/*
*/
