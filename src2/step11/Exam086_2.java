package step11;

import java.io.File;

public class Exam086_2 {
  public static void main(String[] args) throws Exception {
    File f = new File("");

    System.out.println(f.exists());
    System.out.println(f.isDirectory());
    System.out.println(f.isFile());
    System.out.println(f.getCanonicalPath());
    System.out.println(f.getAbsolutePath());
    System.out.println("------------------------------");

    File f2 = new File(".");
    System.out.println(f2.exists());
    System.out.println(f2.isDirectory());
    System.out.println(f2.isFile());
    System.out.println(f2.getCanonicalPath());
    System.out.println(f2.getAbsolutePath());
  }
}