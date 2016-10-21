public class Test08 {
  public static void main(String[] args) {
    int inputNum = Integer.parseInt(args[0]);
    for (int i = inputNum; i > 0; i--) {
      for(int j = 0; j < i; j++)
        System.out.printf("*");
      System.out.println();
    }
  }
}
