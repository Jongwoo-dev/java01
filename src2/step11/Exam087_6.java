package step11;

import java.io.File;
import java.io.FileInputStream;

public class Exam087_6 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("Exam087_5.dat");

    byte[] bytes = new byte[1024];
    int i = 0;

    int b;

    while (true) {
      b = in.read();
      if (b == -1) {
        break;
      }
      bytes[i++] = (byte)b;
    }
    
    in.close();
    System.out.println("읽었습니다.");

    for (int x = 0; x < i; x++) {
      System.out.printf("%x ", bytes[x]);
    }
    System.out.println();
  }
}