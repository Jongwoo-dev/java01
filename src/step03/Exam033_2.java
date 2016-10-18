package step03;

public class Exam033_2 {
  public static void main(String[] args) {
    //1) 배열에 값 저장하기
    int[] scores = new int[3];
    scores[0] = 100;
    scores[1] = 100;
    scores[2] = 100;

    //배열의 인덱스 범위를 벗어나면 실행 오류를 발생
    //scores[3] = 100;  //배열의 인덱스 범위는 0 ~ (length-1)

    //주의!
    //배열을 만들지 않고 단지 배열 이름 변수만 선언한 다음에 사용하면 오류!
    //int[] scores2;
    //scores2[0] = 100;

    int[] scores3 = new int[]{80,81,82};
    System.out.println(scores3[2]);

    int[] scores4;
    scores4 = new int[] {80,81,82};

    int[] scores5 = {80,81,82};
    System.out.println(scores5[1]);

    //주의1) 배열 변수 따로 초기화 명령 따로 작성할 수 없다.
    int[] scores6;
    //scores6 = {80,81,82}; //컴파일 오류!
    scores6 = new int[] {80,81,82};

    //주의2) 배열 선언할 떄 값을 초기화시키는 명령이 있으면 배열 개수를 지정할 수 없다.
    //int[] scores7 = new int[3]{100,100,100}   //컴파일 오류!

  }
}
