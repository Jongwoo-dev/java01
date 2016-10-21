public class Test03 {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    int evenCount = 0, oddCount = 0;

    while (num > 0) {
      if(num % 2 == 0)
        evenCount++;
      else
        oddCount++;
      num /= 10;
    }

    System.out.printf("짝수: %d\n", evenCount);
    System.out.printf("홀수: %d\n", oddCount);
  }
}
