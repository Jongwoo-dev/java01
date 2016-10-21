public class Test05 {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    int maxNum = num % 10,
        minNum = maxNum;
    num /= 10;
    int remainder = 0;
    while (num > 0) {
      remainder = num % 10;
      if (remainder > maxNum)
        maxNum = remainder;
      if (remainder < minNum)
        minNum = remainder;
      num /= 10;
    }

    System.out.printf("최대 값: %d\n", maxNum);
    System.out.printf("최소 값: %d\n", minNum);
  }
}
