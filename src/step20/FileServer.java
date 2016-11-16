package step20;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {

  public static void main(String[] args) throws Exception {
    //클라이언트 요청을 기다리는 랜카드 접속 객체 준비
    ServerSocket ss = new ServerSocket(8888);
    System.out.println("파일 서버 시작!");
    
    //파일정보저장변수
    long fileSize = 0;
    String fileName = null;
    
    while (true) {
      try {
        // 대기열에서 기다리고 있는 클라이언트들 중에서 한 개의 클라이언트 접속을 승인한다.
        Socket socket = ss.accept();
        System.out.println("클라이언트와 연결되었습니다. -----------------------------");
        
        DataInputStream in = new DataInputStream(socket.getInputStream());
        
        // 파일 정보를 읽어온다.
        fileSize = in.readLong();
        fileName = "d_"+ in.readUTF();
        System.out.println("파일 다운로드 시작. 받을 파일이름 : " + fileName);
        
        // 파일 쓰기 도구 준비
        FileOutputStream out = new FileOutputStream(fileName);

        byte[] bytes = new byte[(int)fileSize];
        in.readFully(bytes);
        out.write(bytes);
        
        System.out.println("파일 다운로드 완료.");
        
        out.close();
        in.close();
        socket.close();
      } catch (Exception e) {
        // 예외 무시? 일단 네트워킹 프로그래밍 테스트
      } // try
    } // while
  } // main()
}
