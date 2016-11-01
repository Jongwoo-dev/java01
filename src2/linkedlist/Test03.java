package linkedlist;

public class Test03 {
  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();
    list.add(100);
    list.add(200);
    list.add(300);
    list.add(400);

    //추가 테스트
    System.out.println(list.size());
    list.print();
    System.out.println("-------------------");

    //삽입테스트
    list.insert(0, 8888);
    list.insert(list.size()-1, 9999);
    list.insert(2, 5555);
    System.out.println(list.size());
    list.print();
    System.out.println("-------------------");

    //삭제테스트
    System.out.println(list.remove(4)); //중간항목 삭제
    System.out.println(list.size());
    list.print();
    System.out.println("-------------------");

    System.out.println(list.remove(0));  //맨 앞의 항목 삭제
    System.out.println(list.size());
    list.print();
    System.out.println("-------------------");

    System.out.println(list.remove(4));
    System.out.println(list.size());
    list.print();
    System.out.println("-------------------");
  }
}
