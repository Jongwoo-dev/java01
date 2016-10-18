/* Quiz:
자바 원시 타입과 String을 이용하여 인터넷 온라인 서점에서 판매하는 도서 정보 한 개를
메모리에 저장하고 출력하라!
*/
package step03.test;

public class Test01 {
  public static void main(String[] args) {

    /*
    boolean isTranslated;
    String bookName, writer, publisher, publicshingDate, originalTitle, translator;
    long isbn;
    double price;

    bookName = "낭만적 연애와 그 후의 일상";
    writer = "알랭 드 보통";
    publisher = "은행나무";
    publicshingDate = "2016.08.25";
    isTranslated = true;
    originalTitle = "The Course of Love";
    translator = "김한영";
    isbn = 9788956608846L;
    price = 12150;

    System.out.println("책 제목 : " + bookName);
    System.out.println("저자 : " + writer);
    if(isTranslated) {
      System.out.println("역자 : " + translator);
      System.out.println("원제 : " + originalTitle);
    }
    System.out.println("출판사 : " + publisher);
    System.out.println("출판일자 : " + publicshingDate);
    System.out.println("ISBN : " + isbn);
    System.out.println("가격 : " + price);

    */

    String title = "자바프로그래밍" ;
    String publisher = "비트출판사";
    int pageSize = 783;
    String language = "korea";
    String isbn = "11-123-11";
    String[] authors = {"홍길동","임꺽정"};
    float width = 7.4f;
    float height = 9.1f;
    float thick = 1.6f;
    double price = 83.33;
    boolean dvd = false;


    System.out.println(title);
    System.out.println(publisher);
    System.out.println(pageSize);
    System.out.println(language);
    System.out.println(isbn);
    for(String name : authors) {
      System.out.println(name);
    }

    System.out.println(width);
    System.out.println(height);
    System.out.println(thick);
    System.out.println(price);
    System.out.println(dvd);
  }
}
