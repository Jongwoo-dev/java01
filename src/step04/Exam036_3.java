package step04;

public class Exam036_3 {
  public static void main(String[] args) {
    int a = 10, b = 7;

    //명시적 형 변환 전
    float result = (float)a / b;
    System.out.println(result);

    //명시적 형 변환 후
    result = a / (float)b;
    System.out.println(result);

    //암시적 형변환 확인
    int v1 = 100;
    long v2 = 200;
    //int result2 = v1 + v2;  //컴파일 오류
  }
}

/*
# 연산은 반드시 같은 종류의 데이터에 대해서만 수행할 수 있다.
- 만약 피연산자의 종류가 다르다면,
  자바는 다음 규칙에 따라 자동 형변환을 수행한다.
  byte, short --> int --> long --> float(주의) --> double
*/
