public class Test09 {
  public static void main(String[] args) {
    int inputNum = Integer.parseInt(args[0]);
    if (args[1].equals("역")) {
      for (int i = inputNum; i > 0; i--) {
        for (int j = 0; j < i; j++)
          System.out.printf("*");
        System.out.println();
      }
    } else {
      for (int i = 1; i <= inputNum; i++) {
        for (int j = 0; j < i; j++)
          System.out.printf("*");
        System.out.println();
      }
    }
  }
}
