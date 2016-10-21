package step04;

public class Exam040_1 {
  public static void main(String[] args) {

    System.out.println(true & true);
    System.out.println(true & false);
    System.out.println(false & true);
    System.out.println(false & false);

    System.out.println("------------------------");

    System.out.println(true | true);
    System.out.println(true | false);
    System.out.println(false | true);
    System.out.println(false | false);

    //&& 와 & 의 차이
    boolean a = false;
    boolean b = true;
    boolean c = a && (b = false);   //앞쪽이 false 이므로 뒤는 실행안함
    System.out.printf("a=%b, b=%b, c = %b\n",a,b,c);

    a = false;
    b = true;
    c = a & (b = false);            //앞쪾이 false 이지만 뒤도 마저 실행함
    System.out.printf("a=%b, b=%b, c = %b\n",a,b,c);

    //||와 |의 차이
    a = true;
    b = true;
    c = a || (b = false);   //&& 연산자와 같은 원리
    System.out.printf("a=%b, b=%b, c=%b\n", a, b, c);

    a = true;
    b = true;
    c = a | (b = false);   //&& 연산자와 같은 원리
    System.out.printf("a=%b, b=%b, c=%b\n", a, b, c);

  }
}

/*

*/
