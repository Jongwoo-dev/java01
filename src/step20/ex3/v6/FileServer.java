/* ver 6: 클라이언트가 보낸 파일을 서버에서 저장하라!
 * - 실행 결과
 * 전송받은 파일명: jls8.pdf
 * 전송받은 파일크기: 3,980,659
 * 파일을 저장하였습니다.
 * 
 */
package step20.ex3.v6;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("서버 실행 중...");
    
    while (true) {
      Socket socket = serverSocket.accept();
      printClientInfo(socket);
      
      long startMillis = System.currentTimeMillis();
      
      DataInputStream socketIn = new DataInputStream(socket.getInputStream());
      PrintStream socketOut = new PrintStream(socket.getOutputStream());
      
      String filename = socketIn.readUTF();
      long filesize = socketIn.readLong();
      System.out.printf("파일명: %s\n", filename);
      System.out.printf("파일크기: %d\n", filesize);
      
      FileOutputStream fileOut = new FileOutputStream("upload/" + filename); 
      for (long i = 0; i < filesize; i++) {
        fileOut.write(socketIn.read());
      }
      System.out.println("파일을 저장하였습니다.");
      
      fileOut.close();
      socketOut.println("OK");
      
      socketIn.close();
      socketOut.close();
      socket.close();
      long endMillis = System.currentTimeMillis();
      System.out.printf("요청 처리시간: %d\n", endMillis - startMillis);
    }
  }

  private static void printClientInfo(Socket socket) {
    InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
    System.out.printf("클라이언트 IP: %s\n", socketAddress.getAddress());
    
  }
}
