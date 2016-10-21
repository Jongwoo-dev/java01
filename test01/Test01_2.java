public class Test01_2 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        System.out.printf("%d(짝수)\n", i);
      } else {
        System.out.printf("%d(홀수)\n", i);
      }
    }
  }
}
