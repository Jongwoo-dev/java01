package step05.ex02;

public class Score {
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
