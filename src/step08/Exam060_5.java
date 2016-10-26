package step08;

public class Exam060_5 {
  static class Book {
    String title;
    String author;
    String press;
    int price;
    int pages;

    Book() {}

    Book(String title) {
      System.out.println("Book(String) 호출");
      //this.title = title;
    }

    Book(String title, String author) {
      System.out.println("Book(String, String) 호출");
      this.title = title;
      this.author = author;
    }

    Book(String title, String press) {
      System.out.println("Book(String, String) 호출");
      this.title = title;
      this.press = press;
    }

    Book(String title, String press, int price) {
      System.out.println("Book(String, String, int) 호출");
      this.title = title;
      this.press = press;
      this.price = price;
    }
  }

  public static void main(String[] args) {
    Book b3 = new Book("자바 프로그래밍", "홍길동");
    Book b4 = new Book("자바 프로그래밍", "비트 출판사");
  }
}
