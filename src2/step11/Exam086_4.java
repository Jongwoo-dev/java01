package step11;

import java.io.File;

public class Exam086_4 {
  public static void main(String[] args) throws Exception {
    File f2 = new File(".");
    
    File[] list = f2.listFiles();
    for (File item : list) {
      System.out.printf("%s %s\n",
          item.isDirectory() ? "d":"-",
          item.getName());
    }
  }
}