/* 주제: FileOutputStream 클래스 사용법 - write() 사용법  
=> 바이트 배열 출력하기
*/
package step18;

import java.io.File;
import java.io.FileOutputStream;

public class Exam095_5 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam095_5.data");

    byte[] buf = {0x11, 0x22, 0x33, 0x44, 0x55, 0x66, 0x77, 0x78, 0x79, 0x7a};

    // 바이트 배열을 일부분만 출력하기
    //write(byte[] buffer, int offset, int length)
    out.write(buf, 3, 4);

    out.close();
  }
}