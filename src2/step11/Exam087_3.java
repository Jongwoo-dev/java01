package step11;

import java.io.File;
import java.io.FileOutputStream;

public class Exam087_3 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("Exam087_3.dat");

    out.write('A');
    out.write('가');
    out.write('9');

    out.close();
    System.out.println("저장하였습니다.");
  }
}