package step05.ex02;

public class Score2 {
  static float[] scores;

  static float sum() {
    float sum = 0;
    for (float score : scores) {
      sum += score;
    }
    return sum;
  }

  static float aver() {
    return sum() / scores.length;
  }

  static void addBonus(float bonus) {
    for (int i = 0; i < scores.length; i++) {
      scores[i] += bonus;
      if (scores[i] > 100f) {
        scores[i] = 100f;
      }
    }
  }
}
