package step04;

public class Exam042_0 {
  public static void main(String[] args) {
    int a = 0b0110_1100;
    int b = 0b0011_0001;
    int c = a & b;

    System.out.println(c);

    System.out.println(Integer.toString(c, 2));

    c = a | b;
    System.out.println(c);
    System.out.println(Integer.toString(c, 2));

    c = a ^ b;
    System.out.println(c);
    System.out.println(Integer.toString(c, 2));

    long c2 = ~a;
    System.out.println(c2);

  }
}

/*

*/
