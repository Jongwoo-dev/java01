/* 람다 문법 사용
*/

package step18.ex3;

public class Test1 {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add("홍길동");
    list.add("임꺽정");
    list.add("유관순");
    list.add("안중근");
    list.add("윤봉길");

    class MyConsumer implements Consumer {
      public void execute(int index, Object value) {
        System.out.printf("%d => %s\n", index, (String)value);
      }
    }

/*
    class MyConsumer implements Consumer {
      public void execute(int index, Object value) {
        System.out.printf("%d => %s\n", index, value);
      }
    }

    list.forEach(new MyConsumer());
*/
    // lambda 문법을 이용하여 계약서를 준수하는 클래스및 인스턴스를 자동 생성하기
    // lambda 문법 -> 메소드가 한개짜리 인터페이스를 구현할 때 간단하게 쓰는 문법
    list.forEach((i, v) ->
      System.out.printf("%d *** %s\n", i, v));
  }
}