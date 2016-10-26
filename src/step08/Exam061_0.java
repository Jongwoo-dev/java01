package step08;

public class Exam061_0 {
  //학생의 정보를 다루기 위한 새 데이터 타입 정의
  //=>여러 타입의 메모리로 이루어진 복합 데이터이다.
  static class Student {
    //인스턴스 변수:
    //=>Student 메모리를 준비할 때 만들 메모리 종류
    //=>일종의 메모리 설계도
    String name;
    String email;
    String tel;
    int age;
    boolean working;

    //인스턴스 메서드:
    //=>인스턴스의 값을 다루는 모든 메서드는 그 데이터 타입의 연산자라 할 수 있다.
    //=>인스턴스 생성할 때 최초로 자동으로 호출되는 메서드를 "생성자"라 한다.
    Student(String name, String email, String tel, int age, boolean working) {
      this.name = name;
      this.email = email;
      this.tel = tel;
      this.age = age;
      this.working = working;
    }

    void printStudent() {
      System.out.printf("%s, %s, %s, %d, %b\n",
        this.name, this.email, this.tel, this.age, this.working);
    }
  }

  public static void main(String[] args) {
    Student[] arr = new Student[3];

    arr[0] = new Student("홍길동", "hong@test.com", "111-1111", 20, true);
    arr[1] = new Student("임꺽정", "leem@test.com", "111-1112", 30, false);
    arr[2] = new Student("유관순", "yoo@test.com", "111-1113", 40, true);

    for (Student student : arr) {
      student.printStudent();
    }
  }
}
