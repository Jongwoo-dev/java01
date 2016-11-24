package patterns.command.v2;

public class Calculator {
  Operator cmd;
  public int plus(int a, int b) {
    return a + b;
  }
  
  public int minus(int a, int b) {
    return a - b;
  }
  
  public int multiple(int a, int b) {
    return a * b;
  }
}
