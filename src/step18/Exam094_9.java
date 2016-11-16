/* 주제: File 클래스 사용법 - FileFilter를 사용하기
=>   
*/
package step18;

import java.io.File;
import java.io.FilenameFilter;
import java.io.FileFilter;

public class Exam094_9 {
  public static void main(String[] args) throws Exception {
    if (args.length == 0) {
      System.out.println("사용법: java -cp bin step18.Exam094_9 디렉토리명");
      return;
    }

    File f1 = new File(args[0]);
    if (!f1.isDirectory()) {
      System.out.println("디렉토리가 아닙니다.");
      return;
    }

    // FileFilter 계약서를 준수하는 클래스를 만든다.
    // => .java 파일만 목록으로 만든다.
    class MyFileFilter implements FileFilter {
      public boolean accept(File pathname) {
        if (pathname.getName().endsWith(".java")){
          return true;
        }
        return false;
      }
    }

    File[] files = f1.listFiles(new MyFileFilter());
    for (File file : files) {      
      System.out.println(file.getName());
    }
  }
}