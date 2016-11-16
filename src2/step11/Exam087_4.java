package step11;

import java.io.File;
import java.io.FileInputStream;

public class Exam087_4 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("Exam087_3.dat");

    int b;

    b = in.read();
    System.out.println(Integer.toHexString(b));
    System.out.println(Integer.toHexString(in.read()));
    System.out.println(Integer.toHexString(in.read()));

    in.close();
    System.out.println("읽었습니다.");
  }
}