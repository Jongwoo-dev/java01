/* 주제: FileOutputStream 클래스 사용법 - write() 사용법  
=> 4바이트 출력하기
*/
package step18;

import java.io.File;
import java.io.FileOutputStream;

public class Exam095_9 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam095_9.data");
    
    out.write(136);
    out.write(153);
    out.write(170);
    out.write(197);
    out.write(204);

    out.close();
  }
}