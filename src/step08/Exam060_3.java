package step08;

public class Exam060_3 {
  static class Book {
    String title;
    String author;
    String press;
    int price;
    int pages;

    Book(String title) {
      System.out.println("Book(String) 호출");
    }
  }

  public static void main(String[] args) {
    //Book b1 = new Book(); //컴파일 오류! 기본생성자가 없기 때문이다.
    Book b2 = new Book("하하하");

    //Book b3 = new Book; //컴파일 오류! 생성자 호출없이 인스턴스를 만들 수 없다.
  }
}
