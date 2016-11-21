package step20.ex4;

import java.io.PrintStream;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class GameClient {
  public static void main(String[] args) {
    try (
        //PrintStream out = null;

        //사용자로부터 입력 받기 위한 객체 준비
        Scanner keyScan = new Scanner(System.in);) {

      System.out.print("서버주소?> ");
      String addr = keyScan.nextLine();

      //소켓 준비
      Socket socket = new Socket(addr, 8888);

      //입출력 스트림 객체 준비
      Scanner in = new Scanner(socket.getInputStream(), "UTF-8");
      PrintStream out = new PrintStream(socket.getOutputStream(), true, "UTF-8");
      System.out.println("서버와 연결되었음");

      System.out.print("이름? ");
      out.println(keyScan.nextLine());
      System.out.println(in.nextLine());  //환영메시지


      while (true) {
        
        String recvMsg = in.nextLine();

        //recvMsg = in.nextLine();
        System.out.print(recvMsg + " ");    //받은 질문 출력
        
        if(in.nextLine().equals("stop")) {
          System.out.println();
          break;
        }
        
        out.println(keyScan.nextLine());
      } //loop while

      out.close();
      in.close();
      socket.close();

    } catch (NoSuchElementException e) {
      // 결과받은이후?
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
