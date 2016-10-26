package step07;

public class Exam059_6 {
  public static void main(String[] args) {
    //1)레퍼런스 변수 3개 준비
    Student3[] arr = new Student3[3]; //레퍼런스 배열을 3개 준비한다.
                                    //Student 인스턴스가 아니다.

    arr[0] = new Student3();
    arr[1] = new Student3();
    arr[2] = new Student3();

    arr[0].init("홍길동", "hong@test.com", "111-1111", 20, true);
    arr[1].init("임꺽정", "leem@test.com", "111-1112", 30, false);
    arr[2].init("유관순", "yoo@test.com", "111-1113", 40, true);

    //4)각 배열 레퍼런스가 가리키는 인스턴스의 값을 출력한다.
    for (Student3 student : arr) {
      student.printStudent();
    }
  }
}
