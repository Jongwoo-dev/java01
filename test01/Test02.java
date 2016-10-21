public class Test02 {
  public static void main(String[] args) {
    int num = 0;
    int evenCount = 0, oddCount = 0;

    for (int i = 0; i < args.length; i++) {
      num = Integer.parseInt(args[i]);
      if (num % 2 == 0)
        evenCount++;
      else
        oddCount++;
    }

    System.out.printf("짝수: %d\n", evenCount);
    System.out.printf("홀수: %d\n", oddCount);
  }
}
