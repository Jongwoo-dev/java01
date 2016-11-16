package step11;

import java.io.File;

public class Exam086_1 {
  public static void main(String[] args) throws Exception {
    File f = new File("board.dat");

    System.out.println(f.exists());
    System.out.println(f.isDirectory());
    System.out.println(f.isFile());
    System.out.println(f.getCanonicalPath());
    System.out.println(f.getAbsolutePath());
    System.out.println("------------------------------");

    File f2 = new File("../java01/test01/test53.java");
    System.out.println(f2.getCanonicalPath());
  }
}