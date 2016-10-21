package step05.ex02;

public class Test01_2 {
  public static void main(String[] args) {
    int no = 1;
    float[] scores = {65f, 100f, 77.5f};

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

  static float aver(float[] scores) {
    return sum(scores) / scores.length;
  }

  static void addBonus(float[] scores, float bonus) {
    for (int i = 0; i < scores.length; i++) {
      scores[i] += bonus;
      if (scores[i] > 100f) {
        scores[i] = 100f;
      }
    }
  }
}
