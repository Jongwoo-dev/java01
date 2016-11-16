package step11;

import java.io.File;
import java.io.FileOutputStream;

public class Exam087_5 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("Exam087_5.dat");

    byte[] bytes = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

    for (int i = 0;i < bytes.length; i++) {
      out.write(bytes[i]);
    }

    out.close();
    System.out.println("저장하였습니다.");
  }
}