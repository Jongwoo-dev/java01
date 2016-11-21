//강사님 클라이언트 테스트용 서버

package step20.ex4;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class GameServer {
  static class Item {
    String text;
    Item yes;
    Item no;


    public Item() {
    }
    public void setItem(String text, Item yes, Item no) {
      this.text = text;
      this.yes = yes;
      this.no = no;
    }
    @Override
    public String toString() {
      return text;
    }
  }

  static Item[] items;
  static Item cursor;

  public static void main(String[] args) throws Exception {
    InitItem();

    String recvMsg;
    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("서버 실행중...");

    Scanner keyScan = new Scanner(System.in);  //사용자로부터 입력 받기 위한 객체 준비

    while (true) {
      cursor = items[0];      
      System.out.println("클라이언트 대기중");
      // 클라이언트 중 한개의 접속 승인
      Socket socket = serverSocket.accept();

      // 데이터를 주고 받기 위한 입출력 스트림 객체 준비
      Scanner in = new Scanner(socket.getInputStream(), "UTF-8");
      PrintStream out = new PrintStream(socket.getOutputStream(), true, "UTF-8");

      System.out.println("클라이언트와 연결되었음");

      recvMsg = in.nextLine();
      out.println(recvMsg + "님 환영합니다");
      while (true) {

        if (cursor.yes == null) { //현재 커서가 결과노드면
          //결과를 출력하고 반복문 종료
          //out.println("quit");
          out.println("결과 : [ " + cursor + " ]");
          out.println("stop");
          break;
        }

        //out.println("text");
        out.println(cursor + "(y/n) "); //질문 보내기
        out.println("continue");
        loop:
          while (true) {  //제대로된 메시지를 받을때까지 반복
            recvMsg = in.nextLine();  //메시지를 받아서
            switch (recvMsg.toLowerCase()) {  //해당하는 노드로 커서를 이동
            case "y":
              cursor = cursor.yes;
              break loop;
            case "n":
              cursor = cursor.no;
              break loop;
            default:
              //out.println("text");
              out.println("잘못된 답변입니다.(y/n)");
              break;
            }
          } //while y/n
      } //while 질문
      out.close();
      in.close();
      socket.close();
    } //소켓 어셉트    
  }

  static void InitItem() {
    items = new Item[31];
    for (int i = 0; i < 31; i++) {
      items[i] = new Item();
    }
    
    items[0].setItem("정장보다는 캐주얼타입을 좋아한다.", items[5],items[1]);
    items[1].setItem("학교나 직장에서 선배들에게 귀여움을 받는 편이다.",items[6],items[2]);
    items[2].setItem("자기자신이 정신적으로 약하다고 느낄 때가 많다.",items[7],items[3]);
    items[3].setItem("서예나 바둑등 차분한 것을 좋아하거나 배우고있다.",items[8],items[4]);
    items[4].setItem("친구나 친지의 생일을 메모하고 있거나 기억하고 있는 편이다.",items[5],items[9]);

    items[5].setItem("경어사용에는 자신이 있다.",items[6],items[10]);
    items[6].setItem("결혼식은 될수있으면 하려하게 하고 싶다.",items[11],items[7]);
    items[7].setItem("친구에게 10만원이상 돈을 빌려준 적이 있다.",items[8],items[12]);
    items[8].setItem("운동하는 것을 싫어하고 심지어는 괴로워한다.",items[13],items[9]);
    items[9].setItem("판매원, 서비스업등의 아르바이트를 해본 경험이 있다.",items[10],items[14]);

    items[10].setItem("동호회, 클럽 등의 활동을 좋아한다.",items[15],items[11]);
    items[11].setItem("자기가 잘못을 하지 않았어도 분위기를 위하여 먼저 사과하는 적이 많다.",items[16],items[12]);
    items[12].setItem("웃는 모습에 대하여 칭찬받는 적이 있다.",items[17],items[13]);
    items[13].setItem("드라마, 영화, 만화 등에서 미스테리 장르를 즐긴다",items[14],items[18]);
    items[14].setItem("해외 어학연수를 생각해본 적이 있다.",items[15],items[18]);

    items[15].setItem("춤을 배운다면 어떤 춤을? 재즈댄스Yes / 사교댄스No",items[20],items[16]);
    items[16].setItem("자기 방에 있을 때 늘 TV나 MP3 등 뭔가를 틀어놓고 있다.",items[21],items[17]);
    items[17].setItem("신문은 거의 읽지 않는다.",items[22],items[18]);
    items[18].setItem("겨울스포츠로 하고 싶은 것 농구이면 Yes / 스키면 No",items[23],items[19]);
    items[19].setItem("자기와 같은 옷을 친구가 세일에서 샀다고 하면 다시는 그 옷을 입지 않는다.",items[20],items[24]);

    items[20].setItem("남의 말을 잘 들어주는 편이다.",items[21],items[25]);
    items[21].setItem("술자리에서 옆 사람의 잔이 비어있으면 곧바로 채워준다.",items[26],items[22]);
    items[22].setItem("죽이고 싶다고 생각할 정도로 미워하는 사람이 있다.",items[23],items[27]);
    items[23].setItem("모임에서 주로 리더가 되는 편이다.",items[24],items[28]);
    items[24].setItem("외로움을 잘 타고 사람을 그리워 하는 편이다.",items[30],items[29]);

    items[25].setItem("밝고 건강함이 당신의 매력",null,null);
    items[26].setItem("순진함이 당신의 매력",null,null);
    items[27].setItem("상냥함이 당신의 매력",null,null);
    items[28].setItem("여성스러움이 당신의 매력",null,null);
    items[29].setItem("신비스러움이 당신의 매력",null,null);
    items[30].setItem("지적인 분위기가 당신의 매력",null,null);

  }
}
