package step11;

import java.io.File;
import java.io.FileFilter;

public class Exam086_5 {
  public static void main(String[] args) throws Exception {
    File f2 = new File(".");
    
    File[] list = f2.listFiles(new FileFilter() {
      @Override
      public boolean accept(File pathname) {
        if (pathname.isDirectory())
          return true;
        return false;
      }
    });

    for (File item : list) {
      System.out.printf("%s %s\n",
          item.isDirectory() ? "d":"-",
          item.getName());
    }
  }
}