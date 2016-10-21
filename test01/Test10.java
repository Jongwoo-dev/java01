public class Test10 {
  public static void main(String[] args) {
    int inputNum = Integer.parseInt(args[0]);
    if (inputNum % 2 == 0)
        inputNum++;

    int divideNum = inputNum / 2;

    for (int i = 0; i <= divideNum; i++){
      for (int j = 0; j < divideNum - i; j++){
        System.out.printf(" ");
      }

      for (int j = 0; j < i * 2 + 1; j++) {
        System.out.printf("*");
      }
      System.out.println();
    }
  }
}
