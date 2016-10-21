public class Test06 {
  public static void main(String[] args) {
    int inputNum = Integer.parseInt(args[0]);
    int randomNum = (int)(Math.random() * 10);
    int count = 0;
    while (inputNum > 0) {
      if ((inputNum % 10) == randomNum)
        count++;
      inputNum /= 10;
    }

    System.out.printf("난수: %d\n", randomNum);
    System.out.printf("포함 개수: %d\n", count);
  }
}
