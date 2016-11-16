package step11;

import java.io.File;
import java.io.FileOutputStream;

public class Exam087_7 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("Exam087_7.dat");

    byte[] bytes = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

    
    out.write(bytes);
    

    out.close();
    System.out.println("저장하였습니다.");
  }
}