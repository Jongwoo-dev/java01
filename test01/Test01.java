public class Test01 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.printf("%d(%s)\n", i, (i % 2 == 0) ? "짝수" : "홀수");
    }

    System.out.print("0(짝수)");
    System.out.print("1(홀수)");
    System.out.print("2(짝수)");
    System.out.print("3(홀수)");
  }
}
