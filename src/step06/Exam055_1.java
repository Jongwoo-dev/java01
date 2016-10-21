package step06;

public class Exam055_1 {
  static void square (int value) {
    value *= value;
    System.out.printf("square(): %d\n", value);
  }

  public static void main(String[] args) {
    int value = 3;
    square(value);  //call by value
                    //value 변수를 넘겨주는 것이 아니라, value의 값을
                    //넘겨 주는 것이다.
                    //따라서 square() 메서드에서는 main()의 value 변수에
                    //접근할 수 없다.
    System.out.printf("main(): %d\n", value);
  }
}
