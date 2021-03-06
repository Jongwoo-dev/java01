/* 주제: 네트워킹 프로그래밍 - echo server 만들기 
 */
package step20.ex2;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
  public static void main(String[] args) throws Exception {
    // 클라이언트 요청을 기다리는 랜카드 접속 객체 준비
    ServerSocket ss = new ServerSocket(8888);
    System.out.println("에코 서버 시작!");
    while (true) {
      try {
        // 대기열에서 기다리고 있는 클라이언트들 중에서 한 개의 클라이언트 접속을 승인한다.
        Socket socket = ss.accept();
        System.out.println("클라이언트와 연결되었습니다. -----------------------------");
        
        Scanner in = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());
        
        // 클라이언트가 보낸 메시지를 읽는다.
        String message = null;
        do {
          message = in.nextLine();  // 클라이언트가 보낸 메시지를 읽는다.
          out.println("신종우: " + message + " ^^");  // 클라이언트에게 메시지를 그대로 돌려준다.
        } while (!message.toLowerCase().equals("quit"));
        
        out.close();
        in.close();
        socket.close();
      } catch (Exception e) {
        // 예외 무시? 일단 네트워킹 프로그래밍 테스트
      } // try
    } //while
  } // main()
} // class