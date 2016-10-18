/* Quiz:
클래스 문법을 이용하여 쇼핑몰의 한 개 제품 정보를 저장하고 출력하라!
*/
package step03.test;

public class Test03 {
  /*
  static class Product {
    String number;
    String name;
    int price;
    double discountRate;
    int discountPrice;
    String origin;
  }
  public static void main(String[] args) {
    Product product = new Product();

    product.number = "B350839617";
    product.name = "구운계란 30구";
    product.price = 14900;
    product.discountRate = 0.33;
    product.discountPrice = 9900;

    product.origin = "기타";

    System.out.println("상품번호 : " + product.number);
    System.out.println("상품이름 : " + product.name);
    System.out.println("상품가격 : " + product.price);
    System.out.println("할인율 : " + product.discountRate);
    System.out.println("할인적용가 : " + product.discountPrice);
    System.out.println("원산지 : " + product.origin);

  }
  */

  static class Product {
    String name;
    String maker;
    String description;
    int price;
    int quantity;
    boolean used;
  }

  public static void main(String[] args) {
    Product prod1 = new Product();

    prod1.name = "아이폰";
    prod1.maker = "애플";
    prod1.description = "스마트폰";
    prod1.price = 700000;
    prod1.quantity = 120;
    prod1.used = false;

    System.out.println(prod1.name);
    System.out.println(prod1.maker);
    System.out.println(prod1.description);
    System.out.println(prod1.price);
    System.out.println(prod1.quantity);
    System.out.println(prod1.used);
  }
}
