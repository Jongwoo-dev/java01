/*주제: String 클래스 - Immutalble(불변의) 객체와 Mutable(변경가능) 객체
=> String 인스턴스의 값은 한번 생성되면 변경되지 않는다.
=>
*/
package step12;

public class Exam078_4 {
  public static void main(String[] args) throws Exception {
    // Immutable의 예
    String s1 = "Hello, world!";
    String s2 = s1.replace('o', 'x'); //기존 스트링을 가지고 문자'o'를 문자'x'로 rycpgks
                                      //새 스트링 인스턴스를 만든다.
    System.out.println(s1);
    System.out.println(s2);

    //Mutalble의 예
    StringBuffer buf1 = new StringBuffer("Hello, world");
    buf1.replace(2, 4, "xx");
    System.out.println(buf1);
  }
}

/*
*/
