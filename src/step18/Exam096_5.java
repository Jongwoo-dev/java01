/* 주제: FileInputStream 클래스 사용법 - read() 사용법 
=> 바이트 배열로 데이터를 읽어오기
*/
package step18;

import java.io.File;
import java.io.FileInputStream;

public class Exam096_5 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/Exam095_5.data");

    byte[] buf = new byte[1024];
    
    // 읽을 위치를 지정한다.
    // read(byte[], offset, length)
    // len? 반드시 그 크기 만큼 읽어라는 의미가 아니라,
    //      최대로 그 크기만큼 읽으라는 의미이다.
    //      만약 len 만큼 읽을 바이트가 없다면 그 만큼만 읽는다.
    int len = in.read(buf, 10, 100);
    
    for (int i = 10; i < 10 + len; i++) {
      System.out.printf("%x, ", buf[i]);
    }
    System.out.println();

    in.close();
  }
}