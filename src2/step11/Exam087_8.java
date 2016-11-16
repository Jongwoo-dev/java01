package step11;

import java.io.File;
import java.io.FileInputStream;

public class Exam087_8 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("Exam087_5.dat");

    byte[] bytes = new byte[1024];
    
    int len = in.read(bytes);
    
    in.close();
    System.out.println("읽었습니다.");

    for (int x = 0; x < len; x++) {
      System.out.printf("%x ", bytes[x]);
    }
    System.out.println();
  }
}