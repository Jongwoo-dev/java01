public class Test04 {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    int maxNum = num,
        minNum = num;

    for (int i = 1; i < args.length; i++) {
      num = Integer.parseInt(args[i]);
      if (num > maxNum)
        maxNum = num;
      if (num < minNum)
        minNum = num;
    }

    System.out.printf("가장 큰 수: %d\n", maxNum);
    System.out.printf("가장 작은 수: %d\n", minNum);
  }
}
