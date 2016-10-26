package step07;

public class Exam059_5 {
  public static void main(String[] args) {
    //1)레퍼런스 변수 3개 준비
    Student2[] arr = new Student2[3]; //레퍼런스 배열을 3개 준비한다.
                                    //Student 인스턴스가 아니다.

    arr[0] = new Student2();
    arr[1] = new Student2();
    arr[2] = new Student2();

    Student2.init(arr[0], "홍길동", "hong@test.com", "111-1111", 20, true);
    Student2.init(arr[1], "임꺽정", "leem@test.com", "111-1112", 30, false);
    Student2.init(arr[2], "유관순", "yoo@test.com", "111-1113", 40, true);

    //4)각 배열 레퍼런스가 가리키는 인스턴스의 값을 출력한다.
    for (Student2 student : arr) {
      Student2.printStudent(student);
    }
  }
}
