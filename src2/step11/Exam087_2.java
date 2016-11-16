package step11;

import java.io.File;
import java.io.FileInputStream;

public class Exam087_2 {
  public static void main(String[] args) throws Exception {
    File f = new File("Exam087_1.dat");
    FileInputStream in = new FileInputStream(f);

    int b;

    b = in.read();
    System.out.println(Integer.toHexString(b));
    System.out.println(Integer.toHexString(in.read()));
    System.out.println(Integer.toHexString(in.read()));

    in.close();
    System.out.println("읽었습니다.");
  }
}