package step10;

import java.util.Scanner;

public class Exam063_1 {
  static class MyType {
    static int a;
    int b;
  }

  public static void main(String[] args) {
    MyType.a = 100;
    System.out.println(MyType.a);

    MyType obj1 = new MyType();
    MyType obj2 = new MyType();

    obj1.b = 200;
    obj2.b = 300;
    System.out.printf("MyType.a=%d, obj1.b=%d, obj2.b=%d\n",
                      MyType.a, obj1.b, obj2.b);

    obj1.a = 500;
    System.out.printf("MyType.a=%d, obj1.b=%d, obj2.b=%d\n",
                      MyType.a, obj1.b, obj2.b);

    obj2.a = 600;
    System.out.printf("MyType.a=%d, obj1.b=%d, obj2.b=%d\n",
                      MyType.a, obj1.b, obj2.b);
  }
}
