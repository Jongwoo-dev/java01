/* 주제: 버퍼의 사용 - 버퍼 사용 전, 읽은 데 걸린 시간
=>
*/
package step18;

import java.io.File;
import java.io.FileInputStream;

public class Exam097_0 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/jls8.pdf");

    //1) 읽기 전 시각 측정
    //=> 1970년 1월 1일 0시 0분 0초부터 지금까지 경과된 밀리초
    long startMillis = System.currentTimeMillis();

    int count = 0;
    while (in.read() != -1) count++;
    
    //2) 읽은 후 시각 측정
    long endMillis = System.currentTimeMillis();

    System.out.printf("%d: %d\n", count, endMillis - startMillis);

    in.close();
  }
}