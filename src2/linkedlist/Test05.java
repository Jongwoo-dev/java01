package linkedlist;

public class Test05 {
  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();
    list.add(100);
    list.add(200);
    list.add(300);
    list.add(400);
    list.add(500);
    list.add(600);
    list.add(700);

    System.out.println(list.get(4));
    System.out.println(list.get(0));
    System.out.println(list.get(6));
    System.out.println(list.size());
  }
}
