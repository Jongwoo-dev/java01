/* 값을 저장할 때 사용할 메모리를 정의한다.
*/
package step13.v2;

import java.util.Scanner;

public class BoxTest {
  static Scanner keyScan;
  static int length;
  static Box head;
  static Box tail;

  static {
    keyScan = new Scanner(System.in);
    length = 0;
    head = new Box();
    tail = head;
  }

  public static void main(String[] args) {

    loop:
    while (true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine().toLowerCase();

      switch (command) {
      case "add": doAdd(); break;
      case "list": doList(); break;
      case "get": doGet(); break;
      case "delete": doDelete(); break;
      case "quit": System.out.println("Good bye!"); break loop;
      default:
        System.out.println("지원하지 않는 명령어입니다.");
      }
    }
  }

  static void doAdd() {
    System.out.print("입력할 값? ");
    int value = Integer.parseInt(keyScan.nextLine());
    tail.value = value;
    tail.next = new Box();
    tail = tail.next;
    length++;
  }

  static void doList() {
    Box cursor = head;
    while (cursor.next != null) {
      if (cursor == head) {
        System.out.print(cursor);
      } else {
        System.out.print(" - " + cursor);
      }
      cursor = cursor.next;
    }
    System.out.println();
  }

  static void doGet() {
    System.out.print("인덱스? ");
    int index = Integer.parseInt(keyScan.nextLine());
    if (index < 0 || index >= length) {
      System.out.println("인덱스가 유효하지 않습니다.");
      return;
    }

    Box cursor = head;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    System.out.println(cursor);

  }

  static void doDelete() {
    System.out.print("삭제할 값의 인덱스? ");
    int index = Integer.parseInt(keyScan.nextLine());
    if (index < 0 || index >= length) {
      System.out.println("인덱스가 유효하지 않습니다.");
      return;
    }

    if (index == 0) {
      head = head.next;
      length--;
      return;
    }

    Box cursor = head;
    for (int i = 0; i < (index - 1); i++) {
      cursor = cursor.next;
    }

    cursor.next = cursor.next.next;
    length--;
  }
}
