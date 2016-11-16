package step11;

import java.io.File;
import java.io.FileOutputStream;

public class Exam087_1 {
  public static void main(String[] args) throws Exception {
    File f = new File("Exam087_1.dat");
    FileOutputStream out = new FileOutputStream(f);

    out.write(100);
    out.write(256);
    out.write(180243);

    out.close();
    System.out.println("저장하였습니다.");
  }
}