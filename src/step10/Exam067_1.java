package step10;

import java.util.Scanner;

public class Exam067_1 {
  static class Book {
    String title;
    String author;
    String press;
    int pages;
    boolean local;

    public Book() {}

    public Book(String title) {
      this.title = title;
      System.out.println("Book(String)");
    }

    public Book(String title, String press) {
      this(title);
      this.press = press;
      System.out.println("Book(String, String)");
    }

    public Book(String title, String press, String author, int pages) {
      this(title, press);
      this.author = author;
      this.pages = pages;
      System.out.println("Book(String, String, String, int)");
    }
  }

  public static void main(String[] args) {
    Book book1 = new Book();
    System.out.println("--------------------");

    Book book2 = new Book("자바프로그래밍");
    System.out.println("--------------------");

    Book book3 = new Book("자바프로그래밍", "비트출판사.");
    System.out.println("--------------------");

    Book book4 = new Book("자바프로그래밍", "비트출판사.", "홍길동", 780);
    System.out.println("--------------------");

  }
}
