package step20;

import java.io.PrintStream;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PsyTestClient {
  public static void main(String[] args) {
    try (
        //PrintStream out = null;
        //소켓 준비
        Socket socket = new Socket("localhost", 8888);
        
        //입출력 스트림 객체 준비
        Scanner in = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());
        
        //사용자로부터 입력 받기 위한 객체 준비
        Scanner keyScan = new Scanner(System.in);) {
      
      System.out.println("서버와 연결되었음");
      
      System.out.print("이름? ");
      out.println(keyScan.nextLine());
      System.out.println(in.nextLine());  //환영메시지
      while (true) {
        String recvMsg = in.nextLine();
        if (recvMsg.toLowerCase().equals("quit")) {
          //quit 받으면 종료
          break;
        }
        System.out.print(recvMsg + " ");    //받은 질문 출력
        out.println(keyScan.nextLine());
        
      }
      
    } catch (NoSuchElementException e) {
      // 결과받은이후?
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
