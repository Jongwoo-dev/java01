package step05.ex02;

public class Test01 {
  public static void main(String[] args) {
    int no = 1;
    float kor = 95f;
    float eng = 100f;
    float math = 97.5f;

    int bonusScore = 5;

    addBonus(scores, bonusScore);


    float sum = sum(scores);
    float aver = aver(scores);

    System.out.printf("총점: %f\n", sum);
    System.out.printf("평균: %f\n", aver);
  }

  static float sum(float[] scores) {
    float sum = 0;
    for (float score : scores) {
      sum += score;
    }
    return sum;
  }
}
