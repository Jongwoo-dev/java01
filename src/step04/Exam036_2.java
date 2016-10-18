package step04;

public class Exam036_2 {
  public static void main(String[] args) {
    int a = 10, b = 7;

    //명시적 형 변환 전
    float result = a / b;
    System.out.println(result);

    //명시적 형 변환 후
    result = (float)a / (float)b;
    System.out.println(result);
  }
}

/*
명시적 형 변환(explict type conversion)
 => (변경할 타입)값
 => 기존 메모리의 종류가 바뀌는 것이 아니다.
 => 변경할 타입의 메모리가 내부적으로 몰래 생성된다.
    그리고 변경한 값이 저장된다. 
암시적 형 변환(implict type conversion)
 => java에서 정한 규칙에 따라 자동으로 형 변환이 일어난다.
*/
