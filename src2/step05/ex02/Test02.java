package step05.ex02;

public class Test02 {
  public static void main(String[] args) {
    int no = 1;
    float[] scores = {65f, 100f, 77.5f};

    int bonusScore = 5;

    Score.addBonus(scores, bonusScore);

    float sum = Score.sum(scores);
    float aver = Score.aver(scores);

    System.out.printf("총점: %f\n", sum);
    System.out.printf("평균: %f\n", aver);
  }
}
