/* Quiz:
클래스 문법을 이용하여 교육센터의 한 명의 수강생 정보를 저장하고 출력하라!
*/
package step03.test;

public class Test04 {
  static class Student {
    String name;
    int age;
    int postno;
    String baseAddress;
    String detailAddress;
    String school;
    boolean working;
    String tel;
    String email;
  }
  public static void main(String[] args) {
    Student s1 = new Student();

    s1.name = "홍길동";
    s1.age = 20;
    s1.postno = 76271;
    s1.baseAddress = "경기도";
    s1.detailAddress = "상갈동";
    s1.school = "비트대학교";
    s1.working = false;
    s1.tel = "1111-1111";
    s1.email = "hong@test.com";

    System.out.println(s1.name);
    System.out.println(s1.age);
    System.out.println(s1.working);
  }
}
