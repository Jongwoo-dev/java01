/* Quiz:
자바 원시 타입과 String을 이용하여 인터넷 온라인 서점에서 판매하는 도서 정보 한 개를
메모리에 저장하고 출력하라!
*/
package step03.test;

public class Test02 {
  static class BookInfo {
    String title, publisher, language, isbn;
    String[] authors;
    int pageSize;
    float width, height, thick;
    double price;
    boolean dvd;
  }
  public static void main(String[] args) {

    BookInfo b1 = new BookInfo();

    b1.title = "자바프로그래밍" ;
    b1.publisher = "비트출판사";
    b1.pageSize = 783;
    b1.language = "korean";
    b1.isbn = "11-123-11";
    b1.authors = new String[] {"홍길동","임꺽정"};
    b1.width = 7.4f;
    b1.height = 9.1f;
    b1.thick = 1.6f;
    b1.price = 83.33;
    b1.dvd = false;


    System.out.println(b1.title);
    System.out.println(b1.publisher);
    System.out.println(b1.pageSize);
    System.out.println(b1.language);
    System.out.println(b1.isbn);
    for(String name : b1.authors) {
      System.out.println(name);
    }

    System.out.println(b1.width);
    System.out.println(b1.height);
    System.out.println(b1.thick);
    System.out.println(b1.price);
    System.out.println(b1.dvd);
  }
}
