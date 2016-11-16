package step11;

import java.io.File;

public class Exam086_3 {
  public static void main(String[] args) throws Exception {
    File f2 = new File(".");
    
    String[] list = f2.list();
    for (String item : list) {
      System.out.println(item);
    }
  }
}