/* 주제: 네트워킹 프로그래밍 - echo server 만들기(스레드 적용) 
 */
package step20.ex7;

import java.io.IOException;
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
      new MyThread(ss.accept()).start();
    } //while
  } // main()

  static class MyThread extends Thread {
    Socket socket;

    public MyThread(Socket socket) {
      this.socket = socket;
    }
    @Override
    public void run() {
      try {
        System.out.println("클라이언트와 연결되었습니다. - " + socket.getInetAddress().getHostAddress());

        Scanner in = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());

        // 클라이언트가 보낸 메시지를 읽는다.
        String message = null;
        do {
          message = in.nextLine();  // 클라이언트가 보낸 메시지를 읽는다.
          out.println("신종우: " + message + " ^^");  // 클라이언트에게 메시지를 그대로 돌려준다.
        } while (!message.toLowerCase().equals("quit"));
        System.out.println(socket.getInetAddress().getHostName() + " - 접속 종료");
        out.close();
        in.close();

      } catch (Exception e) {

      }

      try {
        socket.close();
      } catch (IOException e) {
        //e.printStackTrace();
      }
    }
  }
} // class