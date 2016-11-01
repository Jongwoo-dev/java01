/* 값을 저장할 때 사용할 메모리를 정의한다.
*/
package step13.v2;

import java.util.Scanner;

public class BoxTest {
  static Scanner keyScan = new Scanner(System.in);
  static int count;
  static Box head;
  static Box tail;

  public static void main(String[] args) {
    count = 0;
    head = new Box();
    tail = head;

    loop:
    while (true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine().toLowerCase();

      switch (command) {
      case "add": doAdd(); break;
      case "list": doList(); break;
      case "get": doGet(); break;
      case "quit": System.out.println("Good bye!"); break loop;
      default:
        System.out.println("지원하지 않는 명령어입니다.");
      }
    }
  }

  static void doAdd() {
    System.out.print("입력할 값? ");
    String input = keyScan.nextLine();
    tail.value = Integer.parseInt(input);
    tail.next = new Box();
    tail = tail.next;
    count++;
  }

  static void doList() {
    Box cursor = head;
    if (cursor.next != null) {
      System.out.print(cursor);
      cursor = cursor.next;
    }
    while (cursor.next != null) {

      System.out.print(" - " + cursor);
      cursor = cursor.next;
    }
    System.out.println();
  }
  
  static void doGet() {
    System.out.print("인덱스? ");
    String input = keyScan.nextLine();
    int index = Integer.parseInt(input);
    if (index >= count) {
      System.out.println("인덱스 범위를 넘어섰습니다.");
      return;
    } else {
      Box cursor = head;
      for (int i = 0; i < index; i++) {
        cursor = cursor.next;
      }
      System.out.println(cursor);
    }
  }
}
